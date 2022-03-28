package com.tacme.news.utils

import android.content.Context
import android.content.SharedPreferences
import com.tacme.news.utils.PrefHelp
import java.util.*

object PrefHelp {
    private var prefs: SharedPreferences? = null
    private const val LANG = "lang"
    private const val USER = "USER"
    private const val UDID = "UDID"
    private const val LAST_CHECK_IN = "LAST_CHECK_IN"
    private const val QUERIES_HISTORY = "QUERIES_HISTORY"
    private fun getPrefs(context: Context): SharedPreferences? {
        if (prefs == null) {
            prefs = context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)
        }
        return prefs
    }

    fun getLang(context: Context): String {
        return getPrefs(context)!!.getString(LANG, "en")
    }

    fun getLocale(context: Context): Locale {
        return if (getLang(context) == "en") Locale.ENGLISH else Locale("ar")
    }

    fun setLang(context: Context, lang: String?) {
        val prefEditor = getPrefs(context)!!.edit()
        prefEditor.putString(LANG, lang).apply()
    }

    fun isEnglish(context: Context): Boolean {
        return getLang(context) == "en"
    }

    fun getAppLang(context: Context): String {
        return if (getPrefs(context)!!.getString(LANG, "en") == "en") "en" else "ar"
    }

    fun logout(context: Context) {
        getPrefs(context)!!.edit().remove(USER).apply()
    }

    fun setUdid(context: Context, udid: String?) {
        val prefEditor = getPrefs(context)!!.edit()
        prefEditor.putString(UDID, udid).apply()
    }

    fun getUdid(context: Context): String {
        return getPrefs(context)!!.getString(UDID, null)
    }
}