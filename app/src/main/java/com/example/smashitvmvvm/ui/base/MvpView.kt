package com.example.smashitvmvvm.ui.base

import androidx.annotation.StringRes
import okhttp3.ResponseBody
import retrofit2.Response

/**
 * Created by karanjeet on 22/10/19
 */
interface MvpView {
    fun showToast(message : String)
    fun showLongToast(message : String)
    fun showToast(@StringRes resId : Int)
    fun showLongToast(@StringRes resId : Int)
    fun showProgressBar()
    fun showProgressBar(message : String)
    fun showProgressBar(@StringRes resId : Int)
    fun hideProgressBar()
    fun isNetworkConnected():Boolean
    fun showKeyboard()
    fun hideKeyboard()
    fun showNativeDialog(messageTitle : String, messageContent : String)
    fun performLogout()
}