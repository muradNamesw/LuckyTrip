package com.tacme.news.model.mvvm


import com.apprikot.listable.interfaces.Listable
import com.apprikot.listable.model.HolderClass
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.tacme.Navigate.view.viewholders.ListNavigateDecVH
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import com.tacme.news.R
import com.tacme.news.helpers.toMapDictionary
import com.tacme.news.utils.ParseException
//import com.tacme.news.view.viewiewholders.ListNavigateDecVH
import java.util.*

class DestinationsListDec : Listable {


    @SerializedName(value = "id")
    @Expose(deserialize = false)
    var id: String? = null

    @SerializedName(value = "city")
    @Expose(deserialize = false)
    var city: String? = null



    @SerializedName(value = "country_name")
    @Expose(deserialize = false)
    var country_name: String? = null

    @SerializedName(value = "airport_name")
    @Expose(deserialize = false)
    var airport_name: String? = null

    @SerializedName(value = "country_code")
    @Expose(deserialize = false)
    var country_code: String? = null

    @SerializedName(value = "latitude")
    @Expose(deserialize = false)
    var latitude: String? = null

    @SerializedName(value = "longitude")
    @Expose(deserialize = false)
    var longitude: String? = null

    @SerializedName(value = "iata_code")
    @Expose(deserialize = false)
    var iata_code: String? = null

    @SerializedName(value = "iata_parent_id")
    @Expose(deserialize = false)
    var iata_parent_id: String? = null

    @SerializedName(value = "is_enabled")
    @Expose(deserialize = false)
    var is_enabled: String? = null

    @SerializedName(value = "temperature")
    @Expose(deserialize = false)
    var temperature: String? = null

    @SerializedName(value = "original_destination_id")
    @Expose(deserialize = false)
    var original_destination_id: String? = null

    @SerializedName(value = "thumbnail")
    @Expose(deserialize = false)
    var thumbnailString: String? = null

    @SerializedName(value = "thumbnail")
    @Expose(deserialize = false)
    var thumbnail: ThumbnailtDec? = null

    @SerializedName(value = "destination_video")
    @Expose(deserialize = false)
    var destinationVideo: DestinationVideoDec? = null












    @Throws(ParseException::class)
    @JvmOverloads
    constructor(jsonObject: JSONObject, isList: Boolean = true) {

        if (isList) {
            this.parseAsList(jsonObject)
        }

    }

    @Throws(ParseException::class)
    fun parseAsList(jsonObject: JSONObject) {

        try {

            val dictionary = jsonObject.toMapDictionary()


            this.id = dictionary?.get("id") as? String ?: ""
            this.city = dictionary?.get("city") as? String ?: ""
            this.country_name = dictionary?.get("country_name") as? String ?: ""
            this.airport_name = dictionary?.get("airport_name") as? String ?: ""
            this.country_code = dictionary?.get("country_code") as? String ?: ""
            this.latitude = dictionary?.get("latitude") as? String ?: ""
            this.longitude = dictionary?.get("longitude") as? String ?: ""
            this.iata_code = dictionary?.get("iata_code") as? String ?: ""
            this.iata_parent_id = dictionary?.get("iata_parent_id") as? String ?: ""
            this.is_enabled = dictionary?.get("is_enabled") as? String ?: ""
            this.temperature = dictionary?.get("temperature") as? String ?: ""
            this.original_destination_id = dictionary?.get("original_destination_id") as? String ?: ""
            this.thumbnailString = dictionary?.get("thumbnail") as? String ?: ""
//            this.thumbnail = dictionary?.get("thumbnail") as? ThumbnailtDec.fromJson() ?:null
//            ThumbnailtDec(dictionary?.get("thumbnail") as JSONObject)
            this.thumbnail = ThumbnailtDec.fromJson(jsonObject?.getJSONObject("thumbnail"))
            if(jsonObject.toString().contains("destination_video"))
            this.destinationVideo = DestinationVideoDec.fromJson(jsonObject?.getJSONObject("destination_video"))




        } catch (ex: JSONException) {
            ex.printStackTrace()
            throw ParseException("Error in parsing object")
        }

    }



    companion object {

        @Throws(ParseException::class)
        fun fromJson(jsonArray: JSONArray, isList: Boolean?): ArrayList<DestinationsListDec> {

            val list = ArrayList<DestinationsListDec>()

            for (i in 0 until jsonArray.length()) {

                try {

                    list.add(DestinationsListDec(jsonArray.getJSONObject(i), (isList ?: false)))

                } catch (e: Exception) {
                    throw ParseException("Error in parsing list")
                }

            }

            return list
        }
    }

    override val listItemTypeAll: HolderClass?
        get() = HolderClass(ListNavigateDecVH::class.java, R.layout.list_navigate_item_mvvm)

//    fun getListItemTypeAll(): HolderClass {
//        return HolderClass(ListNavigateDecVH::class.java, R.layout.list_navigate_item_mvvm)
//    }
}

