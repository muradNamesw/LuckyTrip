package com.tacme.news.databinding;
import com.tacme.news.R;
import com.tacme.news.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListNavigateItemMvvmBindingImpl extends ListNavigateItemMvvmBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewLinearLayout, 6);
    }
    // views
    @NonNull
    private final com.tacme.news.components.custom.CustomTextView mboundView3;
    @NonNull
    private final com.tacme.news.components.custom.CustomTextView mboundView4;
    @NonNull
    private final com.tacme.news.components.custom.CustomTextView mboundView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListNavigateItemMvvmBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ListNavigateItemMvvmBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.LinearLayout) bindings[6]
            );
        this.mainLinearLayout.setTag(null);
        this.mboundView3 = (com.tacme.news.components.custom.CustomTextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (com.tacme.news.components.custom.CustomTextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (com.tacme.news.components.custom.CustomTextView) bindings[5];
        this.mboundView5.setTag(null);
        this.statusCircleImageView.setTag(null);
        this.videoView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.newsListDec == variableId) {
            setNewsListDec((com.tacme.news.model.mvvm.DestinationsListDec) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNewsListDec(@Nullable com.tacme.news.model.mvvm.DestinationsListDec NewsListDec) {
        this.mNewsListDec = NewsListDec;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.newsListDec);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String newsListDecAirportNameJavaLangStringNullJavaLangStringNewsListDecAirportName = null;
        java.lang.String newsListDecCountryName = null;
        boolean newsListDecCityJavaLangStringNull = false;
        boolean newsListDecAirportNameJavaLangStringNull = false;
        com.tacme.news.model.mvvm.DestinationVideoDec newsListDecDestinationVideo = null;
        int newsListDecDestinationVideoJavaLangObjectNullAndroidViewViewVISIBLEAndroidViewViewGONE = 0;
        java.lang.String newsListDecCountryNameJavaLangStringNullJavaLangStringNewsListDecCountryName = null;
        java.lang.String newsListDecAirportName = null;
        java.lang.String newsListDecCity = null;
        java.lang.String newsListDecCityJavaLangStringNullJavaLangStringNewsListDecCity = null;
        boolean newsListDecCountryNameJavaLangStringNull = false;
        com.tacme.news.model.mvvm.DestinationsListDec newsListDec = mNewsListDec;
        boolean newsListDecDestinationVideoJavaLangObjectNull = false;
        int newsListDecDestinationVideoJavaLangObjectNullAndroidViewViewGONEAndroidViewViewVISIBLE = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (newsListDec != null) {
                    // read newsListDec.country_name
                    newsListDecCountryName = newsListDec.getCountry_name();
                    // read newsListDec.destinationVideo
                    newsListDecDestinationVideo = newsListDec.getDestinationVideo();
                    // read newsListDec.airport_name
                    newsListDecAirportName = newsListDec.getAirport_name();
                    // read newsListDec.city
                    newsListDecCity = newsListDec.getCity();
                }


                // read newsListDec.country_name == "null"
                newsListDecCountryNameJavaLangStringNull = (newsListDecCountryName) == ("null");
                // read newsListDec.destinationVideo == null
                newsListDecDestinationVideoJavaLangObjectNull = (newsListDecDestinationVideo) == (null);
                // read newsListDec.airport_name == "null"
                newsListDecAirportNameJavaLangStringNull = (newsListDecAirportName) == ("null");
                // read newsListDec.city == "null"
                newsListDecCityJavaLangStringNull = (newsListDecCity) == ("null");
            if((dirtyFlags & 0x3L) != 0) {
                if(newsListDecCountryNameJavaLangStringNull) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(newsListDecDestinationVideoJavaLangObjectNull) {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x400L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(newsListDecAirportNameJavaLangStringNull) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(newsListDecCityJavaLangStringNull) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }


                // read newsListDec.destinationVideo == null ? android.view.View.VISIBLE : android.view.View.GONE
                newsListDecDestinationVideoJavaLangObjectNullAndroidViewViewVISIBLEAndroidViewViewGONE = ((newsListDecDestinationVideoJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read newsListDec.destinationVideo == null ? android.view.View.GONE : android.view.View.VISIBLE
                newsListDecDestinationVideoJavaLangObjectNullAndroidViewViewGONEAndroidViewViewVISIBLE = ((newsListDecDestinationVideoJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished

        if ((dirtyFlags & 0x3L) != 0) {

                // read newsListDec.airport_name == "null" ? "-" : newsListDec.airport_name
                newsListDecAirportNameJavaLangStringNullJavaLangStringNewsListDecAirportName = ((newsListDecAirportNameJavaLangStringNull) ? ("-") : (newsListDecAirportName));
                // read newsListDec.country_name == "null" ? "-" : newsListDec.country_name
                newsListDecCountryNameJavaLangStringNullJavaLangStringNewsListDecCountryName = ((newsListDecCountryNameJavaLangStringNull) ? ("-") : (newsListDecCountryName));
                // read newsListDec.city == "null" ? "-" : newsListDec.city
                newsListDecCityJavaLangStringNullJavaLangStringNewsListDecCity = ((newsListDecCityJavaLangStringNull) ? ("-") : (newsListDecCity));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, newsListDecCityJavaLangStringNullJavaLangStringNewsListDecCity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, newsListDecAirportNameJavaLangStringNullJavaLangStringNewsListDecAirportName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, newsListDecCountryNameJavaLangStringNullJavaLangStringNewsListDecCountryName);
            this.statusCircleImageView.setVisibility(newsListDecDestinationVideoJavaLangObjectNullAndroidViewViewVISIBLEAndroidViewViewGONE);
            this.videoView.setVisibility(newsListDecDestinationVideoJavaLangObjectNullAndroidViewViewGONEAndroidViewViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): newsListDec
        flag 1 (0x2L): null
        flag 2 (0x3L): newsListDec.airport_name == "null" ? "-" : newsListDec.airport_name
        flag 3 (0x4L): newsListDec.airport_name == "null" ? "-" : newsListDec.airport_name
        flag 4 (0x5L): newsListDec.destinationVideo == null ? android.view.View.VISIBLE : android.view.View.GONE
        flag 5 (0x6L): newsListDec.destinationVideo == null ? android.view.View.VISIBLE : android.view.View.GONE
        flag 6 (0x7L): newsListDec.country_name == "null" ? "-" : newsListDec.country_name
        flag 7 (0x8L): newsListDec.country_name == "null" ? "-" : newsListDec.country_name
        flag 8 (0x9L): newsListDec.city == "null" ? "-" : newsListDec.city
        flag 9 (0xaL): newsListDec.city == "null" ? "-" : newsListDec.city
        flag 10 (0xbL): newsListDec.destinationVideo == null ? android.view.View.GONE : android.view.View.VISIBLE
        flag 11 (0xcL): newsListDec.destinationVideo == null ? android.view.View.GONE : android.view.View.VISIBLE
    flag mapping end*/
    //end
}