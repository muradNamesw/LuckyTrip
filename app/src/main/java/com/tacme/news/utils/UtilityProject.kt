package com.tacme.news.utils

import android.app.Activity
import android.app.AlertDialog
import com.tacme.news.R
import android.content.DialogInterface
import com.tacme.news.utils.UtilityProject

/**
 * Created by Eng Murad Ibraheim on 3/20/17.
 */
object UtilityProject {
    const val LANGUAGE = "LANGUAGE_PROJECT_TACME_SA"
    const val USER_NAME = "USER_NAME_TACME_SA"
    const val NAME = "NAME_LOGIN_TACME_SA"
    const val TOKEN_LOGIN = "TOKEN_LOGIN_TACME_SA"
    const val LAST_NO = "LAST_NO_TACME_SA"
    const val TYPE_LOGIN = "TYPE_LOGIN_TACME_SA"
    var LANGUAGE_PAGE = "LANGUAGE_PAGE"
    var FIRST_TIME = "FIRST_TIME"
    const val USER_TYPE = "USER_APP_TACME_SA"
    const val USER_ROLES = "USER_ROLES_TACME_SA"
    const val arabic = "\u06f0\u06f1\u06f2\u06f3\u06f4\u06f5\u06f6\u06f7\u06f8\u06f9"
    fun showMessage(mActivity: Activity, message: String?) {
//        Toast.makeText(applicationContext.getApplicationContext(), message, Toast.LENGTH_LONG).show();
//        Cue.init()
//                .with(applicationContext)
//                .setMessage(message)
//                .setType(Type.PRIMARY)
//                .show();
//        CookieBar.build(applicationContext)
//                .setTitle(applicationContext.getString(R.string.error))         // String resources are also supported
//                .setMessage(message)     // i.e. R.string.message
//                .setCookiePosition(CookieBar.TOP)
//                .setIcon(R.drawable.ic_settings_white_48dp)
//                .setIconAnimation(R.animator.iconspin)
//                .show();
        val builder = AlertDialog.Builder(mActivity)
        builder.setTitle(mActivity.getString(R.string.error))
        builder.setMessage(message)
        builder.setCancelable(false)
        builder.setPositiveButton(mActivity.getString(R.string.ok)) { dialog, which ->
            //                builder.dim
        }
        builder.show()
    }

    fun showMessage(mActivity: Activity, message: String?, tittle: String?) {
//        Toast.makeText(applicationContext.getApplicationContext(), message, Toast.LENGTH_LONG).show();
//        Cue.init()
//                .with(applicationContext)
//                .setMessage(message)
//                .setType(Type.PRIMARY)
//                .show();
        val builder = AlertDialog.Builder(mActivity)
        builder.setTitle(tittle)
        builder.setMessage(message)
        builder.setCancelable(false)
        builder.setPositiveButton(mActivity.getString(R.string.done)) { dialog, which ->
            //                builder.dim
        }
        builder.show()
        //        CookieBar.build(applicationContext)
//                .setTitle(tittle)         // String resources are also supported
//                .setMessage(message)     // i.e. R.string.message
//                .setCookiePosition(CookieBar.TOP)
//                .setBackgroundColor(R.color.colorSignUp)
//                .setIcon(R.drawable.ic_i)
//                .setIconAnimation(R.animator.iconspin)
//                .show();
    }

    fun showMessageCorrect(mActivity: Activity, message: String?) {
//        Toast.makeText(applicationContext.getApplicationContext(), message, Toast.LENGTH_LONG).show();
        val builder = AlertDialog.Builder(mActivity)
        //        builder.setTitle(mActivity.getString(R.string.info));
        builder.setMessage(message)
        builder.setCancelable(false)
        builder.setPositiveButton(mActivity.getString(R.string.ok)) { dialog, which ->
            //                builder.dim
        }
        builder.show()
        //        Cue.init()
//                .with(applicationContext)
//                .setMessage(message)
//                .setType(Type.SUCCESS)
//                .show();
//        CookieBar.build(applicationContext)
//                .setTitle(applicationContext.getString(R.string.info))         // String resources are also supported
//                .setMessage(message)     // i.e. R.string.message
//                .setCookiePosition(CookieBar.TOP)
//                .setBackgroundColor(R.color.green_circle)
//                .setIcon(R.drawable.ic_correct)
//                .setIconAnimation(R.animator.iconspin)
//                .show();
    }

    fun isEmptyString(value: String?): Boolean {
        var check = false
        if (value == null || value.toLowerCase()
                .contains("null") || value.isEmpty() || value.toLowerCase() == "-9"
        ) {
            check = true
        }
        return check
    }

//    fun isEmptyList(list: List<*>?): Boolean {
//        var check = false
//        if (list == null && list!!.si == 0) {
//            check = true
//        }
//        return check
//    }

    fun speed(distance: Double, min: Int): Int {
        return (distance.toFloat() / minToHour(min).toFloat()).toInt()
    }

    fun minToHour(min: Int): Double {
        return (min / 60).toDouble()
    }

    fun distance(lat1: Double, lon1: Double, lat2: Double, lon2: Double, unit: Char): Double {
        val theta = lon1 - lon2
        var dist =
            Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(
                deg2rad(lat2)
            ) * Math.cos(deg2rad(theta))
        dist = Math.acos(dist)
        dist = rad2deg(dist)
        dist = dist * 60 * 1.1515
        if (unit == 'K') {
            dist = dist * 1.609344
        } else if (unit == 'N') {
            dist = dist * 0.8684
        }
        return dist
    }

    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/ /*::  This function converts decimal degrees to radians             :*/ /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    fun deg2rad(deg: Double): Double {
        return deg * Math.PI / 180.0
    }

    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/ /*::  This function converts radians to decimal degrees             :*/ /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    fun rad2deg(rad: Double): Double {
        return rad * 180.0 / Math.PI
    }

//    fun arabicToDecimal(number: String): String {
//        val chars = CharArray(number.length)
//        for (i in 0 until number.length) {
//            var ch = number[i]
//            if (ch.toInt() >= 0x0660 && ch.toInt() <= 0x0669) (ch -= (0x0660 - '0'.toInt()).toChar()).toChar() else if (ch.toInt() >= 0x06f0 && ch.toInt() <= 0x06F9) (ch -= (0x06f0 - '0'.toInt()).toChar()).toChar()
//            chars[i] = ch
//        }
//        return String(chars)
//    }
}