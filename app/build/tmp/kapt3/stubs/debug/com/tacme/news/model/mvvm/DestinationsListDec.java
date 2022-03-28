package com.tacme.news.model.mvvm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 @2\u00020\u0001:\u0001@B\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010<\u001a\u00020=H\u0016J\u000e\u0010>\u001a\u00020?2\u0006\u0010\u0002\u001a\u00020\u0003R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR \u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR \u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR \u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\fR \u0010\u001f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\fR \u0010\"\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\n\"\u0004\b$\u0010\fR \u0010%\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\n\"\u0004\b&\u0010\fR \u0010\'\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\n\"\u0004\b)\u0010\fR \u0010*\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\n\"\u0004\b,\u0010\fR \u0010-\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\n\"\u0004\b/\u0010\fR \u00100\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\n\"\u0004\b2\u0010\fR \u00103\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R \u00109\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\n\"\u0004\b;\u0010\f\u00a8\u0006A"}, d2 = {"Lcom/tacme/news/model/mvvm/DestinationsListDec;", "Lcom/apprikot/listable/interfaces/Listable;", "jsonObject", "Lorg/json/JSONObject;", "isList", "", "(Lorg/json/JSONObject;Z)V", "airport_name", "", "getAirport_name", "()Ljava/lang/String;", "setAirport_name", "(Ljava/lang/String;)V", "city", "getCity", "setCity", "country_code", "getCountry_code", "setCountry_code", "country_name", "getCountry_name", "setCountry_name", "destinationVideo", "Lcom/tacme/news/model/mvvm/DestinationVideoDec;", "getDestinationVideo", "()Lcom/tacme/news/model/mvvm/DestinationVideoDec;", "setDestinationVideo", "(Lcom/tacme/news/model/mvvm/DestinationVideoDec;)V", "iata_code", "getIata_code", "setIata_code", "iata_parent_id", "getIata_parent_id", "setIata_parent_id", "id", "getId", "setId", "is_enabled", "set_enabled", "latitude", "getLatitude", "setLatitude", "longitude", "getLongitude", "setLongitude", "original_destination_id", "getOriginal_destination_id", "setOriginal_destination_id", "temperature", "getTemperature", "setTemperature", "thumbnail", "Lcom/tacme/news/model/mvvm/ThumbnailtDec;", "getThumbnail", "()Lcom/tacme/news/model/mvvm/ThumbnailtDec;", "setThumbnail", "(Lcom/tacme/news/model/mvvm/ThumbnailtDec;)V", "thumbnailString", "getThumbnailString", "setThumbnailString", "getListItemType", "Lcom/apprikot/listable/model/HolderClass;", "parseAsList", "", "Companion", "app_debug"})
public final class DestinationsListDec implements com.apprikot.listable.interfaces.Listable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose(deserialize = false)
    @com.google.gson.annotations.SerializedName(value = "id")
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose(deserialize = false)
    @com.google.gson.annotations.SerializedName(value = "city")
    private java.lang.String city;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose(deserialize = false)
    @com.google.gson.annotations.SerializedName(value = "country_name")
    private java.lang.String country_name;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose(deserialize = false)
    @com.google.gson.annotations.SerializedName(value = "airport_name")
    private java.lang.String airport_name;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose(deserialize = false)
    @com.google.gson.annotations.SerializedName(value = "country_code")
    private java.lang.String country_code;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose(deserialize = false)
    @com.google.gson.annotations.SerializedName(value = "latitude")
    private java.lang.String latitude;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose(deserialize = false)
    @com.google.gson.annotations.SerializedName(value = "longitude")
    private java.lang.String longitude;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose(deserialize = false)
    @com.google.gson.annotations.SerializedName(value = "iata_code")
    private java.lang.String iata_code;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose(deserialize = false)
    @com.google.gson.annotations.SerializedName(value = "iata_parent_id")
    private java.lang.String iata_parent_id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose(deserialize = false)
    @com.google.gson.annotations.SerializedName(value = "is_enabled")
    private java.lang.String is_enabled;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose(deserialize = false)
    @com.google.gson.annotations.SerializedName(value = "temperature")
    private java.lang.String temperature;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose(deserialize = false)
    @com.google.gson.annotations.SerializedName(value = "original_destination_id")
    private java.lang.String original_destination_id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose(deserialize = false)
    @com.google.gson.annotations.SerializedName(value = "thumbnail")
    private java.lang.String thumbnailString;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose(deserialize = false)
    @com.google.gson.annotations.SerializedName(value = "thumbnail")
    private com.tacme.news.model.mvvm.ThumbnailtDec thumbnail;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose(deserialize = false)
    @com.google.gson.annotations.SerializedName(value = "destination_video")
    private com.tacme.news.model.mvvm.DestinationVideoDec destinationVideo;
    public static final com.tacme.news.model.mvvm.DestinationsListDec.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountry_name() {
        return null;
    }
    
    public final void setCountry_name(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAirport_name() {
        return null;
    }
    
    public final void setAirport_name(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountry_code() {
        return null;
    }
    
    public final void setCountry_code(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLatitude() {
        return null;
    }
    
    public final void setLatitude(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLongitude() {
        return null;
    }
    
    public final void setLongitude(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIata_code() {
        return null;
    }
    
    public final void setIata_code(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIata_parent_id() {
        return null;
    }
    
    public final void setIata_parent_id(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String is_enabled() {
        return null;
    }
    
    public final void set_enabled(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTemperature() {
        return null;
    }
    
    public final void setTemperature(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginal_destination_id() {
        return null;
    }
    
    public final void setOriginal_destination_id(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getThumbnailString() {
        return null;
    }
    
    public final void setThumbnailString(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tacme.news.model.mvvm.ThumbnailtDec getThumbnail() {
        return null;
    }
    
    public final void setThumbnail(@org.jetbrains.annotations.Nullable()
    com.tacme.news.model.mvvm.ThumbnailtDec p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tacme.news.model.mvvm.DestinationVideoDec getDestinationVideo() {
        return null;
    }
    
    public final void setDestinationVideo(@org.jetbrains.annotations.Nullable()
    com.tacme.news.model.mvvm.DestinationVideoDec p0) {
    }
    
    public final void parseAsList(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject jsonObject) throws com.tacme.news.utils.ParseException {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.apprikot.listable.model.HolderClass getListItemType() {
        return null;
    }
    
    public DestinationsListDec(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject jsonObject, boolean isList) throws com.tacme.news.utils.ParseException {
        super();
    }
    
    public DestinationsListDec(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject jsonObject) throws com.tacme.news.utils.ParseException {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/tacme/news/model/mvvm/DestinationsListDec$Companion;", "", "()V", "fromJson", "Ljava/util/ArrayList;", "Lcom/tacme/news/model/mvvm/DestinationsListDec;", "jsonArray", "Lorg/json/JSONArray;", "isList", "", "(Lorg/json/JSONArray;Ljava/lang/Boolean;)Ljava/util/ArrayList;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.tacme.news.model.mvvm.DestinationsListDec> fromJson(@org.jetbrains.annotations.NotNull()
        org.json.JSONArray jsonArray, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isList) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}