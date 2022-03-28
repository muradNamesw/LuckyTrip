package com.tacme.news.model.mvvm


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.json.JSONException
import org.json.JSONObject
import com.tacme.news.helpers.toMapDictionary
import com.tacme.news.utils.ParseException

class DestinationVideoDec {


    @SerializedName(value = "url")
    @Expose(deserialize = false)
    var url: String? = null

//    @SerializedName(value = "image_url")
//    @Expose(deserialize = false)
//    var image_url: String? = null


//    @Throws(ParseException::class)
//    @JvmOverloads
//    constructor(jsonObject: JSONObject) {
//
//        parseAsList(jsonObject)
//
//    }


    @Throws(ParseException::class)
    @JvmOverloads
    constructor(jsonObject: JSONObject) {

        try {

            val dictionary = jsonObject.toMapDictionary()


            this.url = dictionary?.get("url") as? String ?: ""
//            this.image_url = dictionary?.get("image_url") as? String ?: ""


        } catch (ex: JSONException) {
            ex.printStackTrace()
            throw ParseException("Error in parsing object")
        }

    }

    companion object {

        @Throws(ParseException::class)
        fun fromJson(jsonObject: JSONObject): DestinationVideoDec {

//

            return DestinationVideoDec(jsonObject)
//            return ThumbnailtDec(jsonObject.toString())
        }
    }

}


//    companion object {

//        @Throws(ParseException::class)
//        fun fromJson(jsonArray: JSONArray, isList: Boolean?): ArrayList<ThumbnailtDec> {
//
//            val list = ArrayList<ThumbnailtDec>()
//
//            for (i in 0 until jsonArray.length()) {
//
//                try {
//
//                    list.add(ThumbnailtDec(jsonArray.getJSONObject(i), (isList ?: false)))
//
//                } catch (e: Exception) {
//                    throw ParseException("Error in parsing list")
//                }
//
//            }
//
//            return list
//        }
//    }

//}

