package com.apprikot.listable.fragments

//import com.apprikot.listable.components.ModelUtils.getNoDuplicated
//import com.apprikot.listable.components.LoadingMore.release
import android.content.DialogInterface
import android.widget.Toast
//import com.apprikot.listable.fragments.BaseFragment
import android.os.Bundle
import android.util.TypedValue
import com.apprikot.listable.listeners.FragmentStackManager
import com.apprikot.listable.R
import android.view.animation.Animation
import android.os.Parcelable
import android.util.Log
import android.view.View
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import java.io.Serializable
import java.lang.Exception

open class BaseFragment : Fragment(), DialogInterface.OnCancelListener,
    DialogInterface.OnDismissListener {
    public var root: View? = null
    public var toolbar: Toolbar? = null
    public var mPendingRequest = false
    public var hasBeenSelected = false
    public var visible = false
    public var viewCreated = false
    public var extraLong: Long = 0
    private var toolbarHeight = 0
    private var toast: Toast? = null
    var appBarOffset = 0
    var haveError = false
    public val baseFragment: BaseFragment
        public get() = this@BaseFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TypedValue()
        if (activity!!.theme.resolveAttribute(android.R.attr.actionBarSize, tv, true)) {
            toolbarHeight =
                TypedValue.complexToDimensionPixelSize(tv.data, resources.displayMetrics)
        }
        if (arguments != null) {
            extraLong = arguments!!.getLong(EXTRA_LONG, -1)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewCreated = true
        root = view
        //        initLoadingUtils();
    }

    fun moveToFragment(fragment: Fragment?, containerId: Int, addToBackStack: Boolean) {
        val fragmentTransaction = activity!!.supportFragmentManager
            .beginTransaction()
        fragmentTransaction.replace(containerId, fragment!!, null)
        if (addToBackStack) fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

    fun moveToChildFragment(fragment: Fragment?, containerId: Int, addToBackStack: Boolean) {
        if (activity is FragmentStackManager) {
            val fragmentStackManager = activity as FragmentStackManager?
            if (fragmentStackManager!!.currentTabFragment == null) {
                Log.e(TAG, "getCurrentTabFragment is null! this shouldn't happen")
                return
            }
            val fragmentTransaction = fragmentStackManager.currentTabFragment
                ?.childFragmentManager!!
                .beginTransaction()
            fragmentTransaction.replace(containerId, fragment!!, null)
            if (addToBackStack) fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
    }

    override fun onDestroyView() {
        visible = false
        viewCreated = false
        hasBeenSelected = false
        super.onDestroyView()
    }

    fun showToast(textResId: Int) {
        if (isDetached || !isAdded) {
            return
        }
        showToast(getString(textResId))
    }

    fun showToast(text: String?) {
        if (isDetached || !isAdded) {
            return
        }
        if (toast == null) {
            toast = Toast.makeText(activity, R.string.app_name, Toast.LENGTH_SHORT)
        }
        toast!!.setText(text)
        toast!!.show()
    }

    override fun onCreateAnimation(transit: Int, enter: Boolean, nextAnim: Int): Animation? {
        if (isAnimationDisabled) {
            val a: Animation = object : Animation() {}
            a.duration = 0
            return a
        }
        var animation = super.onCreateAnimation(transit, enter, nextAnim)
        if (root == null || !root!!.isHardwareAccelerated) {
            return animation
        }
        if (animation == null && nextAnim != 0) {
            animation = AnimationUtils.loadAnimation(activity, nextAnim)
        }
        if (animation != null) {
            root!!.setLayerType(View.LAYER_TYPE_HARDWARE, null)
            animation.setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation) {}
                override fun onAnimationEnd(animation: Animation) {
                    root!!.setLayerType(View.LAYER_TYPE_NONE, null)
                }

                override fun onAnimationRepeat(animation: Animation) {}
            })
        }
        return animation
    }

    /***
     * Loading-Dialog-Stuff
     */
    override fun onCancel(dialog: DialogInterface) {
        Log.i("Dialog", "Canceled")
    }

    override fun onDismiss(dialog: DialogInterface) {
        Log.i("Dialog", "Dismissed")
    }

    public val tabFragmentManager: FragmentManager?
        public get() {
            if (activity is FragmentStackManager) {
                val fragmentStackManager = activity as FragmentStackManager?
                return fragmentStackManager!!.currentTabFragment!!.childFragmentManager
            }
            return null
        }

    public fun showQDialog(
        message: Int, positiveTitle: Int, negativeTitle: Int,
        positiveOnClickListener: DialogInterface.OnClickListener
    ) {
        val alertDialogBuilder = AlertDialog.Builder(
            activity!!
        )
        alertDialogBuilder.setMessage(message)
        alertDialogBuilder.setPositiveButton(positiveTitle) { dialog, arg1 ->
            dialog.dismiss()
            positiveOnClickListener.onClick(dialog, arg1)
        }
        alertDialogBuilder.setNegativeButton(negativeTitle) { dialog, which -> dialog.dismiss() }
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }

    companion object {
        const val DIRECTION_UP = -1
        const val DIRECTION_DOWN = 1
        val TAG = BaseFragment::class.java.simpleName
        const val EXTRA_PARCELABLE = "PARCELABLE"
        const val EXTRA_SERIALIZABLE = "EXTRA_SERIALIZABLE"
        const val EXTRA_LONG = "INTEGER"
        const val EXTRA_LIST_PARCELABLE = "LIST_PARCELABLE"
        const val EXTRA_AD = "AD"
        const val EXTRA_TYPE = "EXTRA_TYPE"
        const val EXTRA_ID = "EXTRA_ID"
        var isAnimationDisabled = false
        fun newInstance(fragmentClass: Class<*>, parcelable: Serializable?): Fragment {
            try {
                val fragment = fragmentClass.newInstance() as Fragment
                val data = Bundle()
                data.putSerializable(EXTRA_PARCELABLE, parcelable)
                fragment.arguments = data
                return fragment
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return Fragment()
        }

        fun newInstance(fragmentClass: Class<*>, parcelable: Parcelable?): Fragment {
            try {
                val fragment = fragmentClass.newInstance() as Fragment
                val data = Bundle()
                data.putParcelable(EXTRA_PARCELABLE, parcelable)
                fragment.arguments = data
                return fragment
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return Fragment()
        }

        fun newInstance(fragmentClass: Class<*>, extraLong: Long): Fragment {
            try {
                val fragment = fragmentClass.newInstance() as Fragment
                val data = Bundle()
                data.putLong(EXTRA_LONG, extraLong)
                fragment.arguments = data
                return fragment
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return Fragment()
        }

        fun newInstance(fragmentClass: Class<*>, extraString: String?): Fragment {
            try {
                val fragment = fragmentClass.newInstance() as Fragment
                val data = Bundle()
                data.putString(EXTRA_ID, extraString)
                fragment.arguments = data
                return fragment
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return Fragment()
        }

        fun newInstance(
            fragmentClass: Class<*>,
            parcelable: Parcelable?,
            extraLong: Long
        ): Fragment {
            try {
                val fragment = fragmentClass.newInstance() as Fragment
                val data = Bundle()
                data.putParcelable(EXTRA_PARCELABLE, parcelable)
                data.putLong(EXTRA_LONG, extraLong)
                fragment.arguments = data
                return fragment
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return Fragment()
        }
    }
}