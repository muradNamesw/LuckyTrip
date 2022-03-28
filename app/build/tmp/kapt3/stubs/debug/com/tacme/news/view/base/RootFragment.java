package com.tacme.news.view.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\f"}, d2 = {"Lcom/tacme/news/view/base/RootFragment;", "Landroidx/fragment/app/Fragment;", "()V", "showQDialog", "", "message", "", "positiveTitle", "negativeTitle", "positiveOnClickListener", "Landroid/content/DialogInterface$OnClickListener;", "Companion", "app_debug"})
public class RootFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LIST_PARCELABLE = "LIST_PARCELABLE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARCELABLE = "PARCELABLE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SERIALIZABLE = "SERIALIZABLE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARCELABLE_2 = "PARCELABLE_2";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARCELABLE_ARRAY = "PARCELABLE_ARRAY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARCELABLE_ARRAY_2 = "PARCELABLE_ARRAY_2";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_IS_REJECTED_KEY = "rejected";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_REF_NO_KEY = "refNo";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_MESSAGE_ID_KEY = "MESSAGE_ID_KEY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_AUTH_DEC = "authDec";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_EXCISE_DETAILS = "exciseDetails";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_PLEDGE_ITEM_FROM_DATE = "PLEDGE_ITEM_FROM_DATE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_PLEDGE_ITEM_TO_DATE = "PLEDGE_ITEM_TO_DATE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_PLEDGE_ITEM_PORT = "PLEDGE_ITEM_PORT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_PLEDGE_ITEM_TYPE = "PLEDGE_ITEM_TYPE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_PLEDGE_ITEM_DETAILS_OBJ = "PLEDGE_ITEM_DETAILS_OBJ";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_TAX_DETAILS_OBJ = "TAX_DETAILS_OBJ";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_EXEMPTION_TYPE = "EXEMPTION_TYPE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_FINE_DETAILS_WAIVERS = "FINE_DETAILS_WAIVERS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_FINE_DETAILS_CASES = "FINE_DETAILS_CASES";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_FINE_DETAILS_COLL_ORDERS = "FINE_DETAILS_COLL_ORDERS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_APPOINTMENT_DETAILS_APPOINTMENT_NO = "APPOINTMENT_DETAILS_APPOINTMENT_NO";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_DRIVER_DETAILS_DRIVER_ID = "DRIVER_DETAILS_DRIVER_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_TRUCK_DETAILS_PLATE_NO = "TRUCK_DETAILS_PLATE_NO";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_TRANS_ORDER_DETAILS_TRANS_OBJ = "TRANS_ORDER_DETAILS_TRANS_OBJ";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_TRANS_ORDER_DETAILS_TRANS_ORDER_NO = "TRANS_ORDER_DETAILS_TRANS_ORDER_NO";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_PLEDGE_NOT_TO_ACT_DEC_DATE = "PLEDGE_NOT_TO_ACT_DEC_DATE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_PLEDGE_NOT_TO_ACT_DEC_TYPE = "PLEDGE_NOT_TO_ACT_DEC_TYPE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_PLEDGE_NOT_TO_ACT_DEC_NUMBER = "PLEDGE_NOT_TO_ACT_DEC_NUMBER";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_PLEDGE_NOT_TO_ACT_PORT = "PLEDGE_NOT_TO_ACT_PORT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_PLEDGE_NOT_TO_ACT_DEC_TYPE_NAME = "PLEDGE_NOT_TO_ACT_DEC_TYPE_NAME";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_PLEDGE_NOT_TO_ACT_PORT_NAME = "PLEDGE_NOT_TO_ACT_PORT_NAME";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_RESULT_MESSAGE = "RESULT_MESSAGE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLEDGE_NOT_TO_ACT_DEC_NUMBER = "PLEDGE_NOT_TO_ACT_DEC_NUMBER";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLEDGE_NOT_TO_ACT_DEC_DATE = "PLEDGE_NOT_TO_ACT_DEC_DATE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLEDGE_NOT_TO_ACT_DEC_TYPE = "PLEDGE_NOT_TO_ACT_DEC_TYPE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLEDGE_NOT_TO_ACT_PORT = "PLEDGE_NOT_TO_ACT_PORT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLEDGE_NOT_TO_ACT_DEC_TYPE_NAME = "PLEDGE_NOT_TO_ACT_DEC_TYPE_NAME";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLEDGE_NOT_TO_ACT_PORT_NAME = "PLEDGE_NOT_TO_ACT_PORT_NAME";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLEDGE_NOT_TO_ACT_LATITUDE = "PLEDGE_NOT_TO_ACT_LATITUDE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLEDGE_NOT_TO_ACT_LONGITUDE = "PLEDGE_NOT_TO_ACT_LONGITUDE";
    public static final com.tacme.news.view.base.RootFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public void showQDialog(int message, int positiveTitle, int negativeTitle, @org.jetbrains.annotations.NotNull()
    android.content.DialogInterface.OnClickListener positiveOnClickListener) {
    }
    
    public RootFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b)\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/tacme/news/view/base/RootFragment$Companion;", "", "()V", "LIST_PARCELABLE", "", "PARAM_APPOINTMENT_DETAILS_APPOINTMENT_NO", "PARAM_AUTH_DEC", "PARAM_DRIVER_DETAILS_DRIVER_ID", "PARAM_EXCISE_DETAILS", "PARAM_EXEMPTION_TYPE", "PARAM_FINE_DETAILS_CASES", "PARAM_FINE_DETAILS_COLL_ORDERS", "PARAM_FINE_DETAILS_WAIVERS", "PARAM_IS_REJECTED_KEY", "PARAM_MESSAGE_ID_KEY", "PARAM_PLEDGE_ITEM_DETAILS_OBJ", "PARAM_PLEDGE_ITEM_FROM_DATE", "PARAM_PLEDGE_ITEM_PORT", "PARAM_PLEDGE_ITEM_TO_DATE", "PARAM_PLEDGE_ITEM_TYPE", "PARAM_PLEDGE_NOT_TO_ACT_DEC_DATE", "PARAM_PLEDGE_NOT_TO_ACT_DEC_NUMBER", "PARAM_PLEDGE_NOT_TO_ACT_DEC_TYPE", "PARAM_PLEDGE_NOT_TO_ACT_DEC_TYPE_NAME", "PARAM_PLEDGE_NOT_TO_ACT_PORT", "PARAM_PLEDGE_NOT_TO_ACT_PORT_NAME", "PARAM_REF_NO_KEY", "PARAM_RESULT_MESSAGE", "PARAM_TAX_DETAILS_OBJ", "PARAM_TRANS_ORDER_DETAILS_TRANS_OBJ", "PARAM_TRANS_ORDER_DETAILS_TRANS_ORDER_NO", "PARAM_TRUCK_DETAILS_PLATE_NO", "PARCELABLE", "PARCELABLE_2", "PARCELABLE_ARRAY", "PARCELABLE_ARRAY_2", "PLEDGE_NOT_TO_ACT_DEC_DATE", "PLEDGE_NOT_TO_ACT_DEC_NUMBER", "PLEDGE_NOT_TO_ACT_DEC_TYPE", "PLEDGE_NOT_TO_ACT_DEC_TYPE_NAME", "PLEDGE_NOT_TO_ACT_LATITUDE", "PLEDGE_NOT_TO_ACT_LONGITUDE", "PLEDGE_NOT_TO_ACT_PORT", "PLEDGE_NOT_TO_ACT_PORT_NAME", "SERIALIZABLE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}