package com.tacme.news.model.mvvm


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.json.JSONException
import org.json.JSONObject
import com.tacme.news.helpers.toMapDictionary
import com.tacme.news.utils.ParseException

class ThumbnailtDec {


    @SerializedName(value = "image_type")
    @Expose(deserialize = false)
    var image_type: String? = null

    @SerializedName(value = "image_url")
    @Expose(deserialize = false)
    var image_url: String? = null


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


            this.image_type = dictionary?.get("image_type") as? String ?: ""
            this.image_url = dictionary?.get("image_url") as? String ?: ""


        } catch (ex: JSONException) {
            ex.printStackTrace()
            throw ParseException("Error in parsing object")
        }

    }

    companion object {

        @Throws(ParseException::class)
        fun fromJson(jsonObject: JSONObject): ThumbnailtDec {

//

            return ThumbnailtDec(jsonObject)
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

