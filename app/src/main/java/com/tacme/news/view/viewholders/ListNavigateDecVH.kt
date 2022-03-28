package com.tacme.Navigate.view.viewholders

//import android.media.MediaPlayer.OnPreparedListener

import android.content.Intent
import android.net.Uri
import androidx.core.content.ContextCompat.startActivity
import androidx.databinding.ViewDataBinding
import com.apprikot.listable.interfaces.Listable
import com.squareup.picasso.Picasso

import com.tacme.news.R
import com.tacme.news.databinding.ListNavigateItemMvvmBinding
import com.tacme.news.model.mvvm.DestinationsListDec
import com.tacme.news.view.adapters.BaseRecyclerAdapter


/**
 * Created by Murad Adnan on 2020-01-14.
 */
class ListNavigateDecVH : BaseRecyclerAdapter.BaseViewHolder {

    constructor(binding: ViewDataBinding) : super(binding)

    override fun onBindView(listableItem: Listable) {

        super.onBindView(listableItem)
//        ListImportDecItemBinding
        (binding as ListNavigateItemMvvmBinding).newsListDec =
            (listableItem as DestinationsListDec)

            (binding as ListNavigateItemMvvmBinding).mainLinearLayout.setBackgroundResource(R.drawable.button_rectangle_accent);





        binding?.executePendingBindings()

        binding?.root?.let {
            Picasso.get().load((listableItem as DestinationsListDec).thumbnail?.image_url).into((binding as ListNavigateItemMvvmBinding).statusCircleImageView)
            if((listableItem as DestinationsListDec).destinationVideo!=null) {
                val videoview = (binding as ListNavigateItemMvvmBinding).videoView
                videoview.setOnClickListener {

                    val uri = Uri.parse((listableItem as DestinationsListDec).destinationVideo?.url
                        ?: "")
                    val intent = Intent(Intent.ACTION_VIEW, uri)

                    (binding as ListNavigateItemMvvmBinding).root.context.startActivity(intent)

                }
            }
            attachClickListener(
                it,
//                (binding as ListAppointmentDecItemBinding).editAppointmentLinearLayout,
                (binding as ListNavigateItemMvvmBinding).viewLinearLayout,
                (binding as ListNavigateItemMvvmBinding).mainLinearLayout
            )
        }
    }
}