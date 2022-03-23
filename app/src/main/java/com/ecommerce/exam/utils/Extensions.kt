package com.ecommerce.exam.utils

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.graphics.Color
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
import android.view.WindowManager
import android.widget.TextView
import com.ecommerce.exam.R

fun Activity.fullScreen(isDark: Boolean = false) {


    if (!isDark) {
        window.decorView.setSystemUiVisibility(window.decorView.getSystemUiVisibility() and View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR.inv())
    } else {
        window.decorView.setSystemUiVisibility(window.decorView.getSystemUiVisibility() or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR)
    }



    setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false)
    window.statusBarColor = Color.TRANSPARENT


}

fun setWindowFlag(activity: Activity, bits: Int, on: Boolean) {
    val win = activity.window
    val winParams = win.getAttributes()
    if (on) {
        winParams.flags = winParams.flags or bits
    } else {
        winParams.flags = winParams.flags and bits.inv()
    }
    win.setAttributes(winParams)
}

fun Context.showLoginInfoDialog(message: String, title: String) {

    val dialog: AlertDialog.Builder = AlertDialog.Builder(this)

    dialog.setIcon(R.drawable.login_error)
        .setTitle(title)
        .setMessage(message)
        .setPositiveButton("Tamam", null)
        .setCancelable(false)

    dialog.show()


}

fun Context.showLoadingDialog(message: String, title: String): AlertDialog {


    val view = LayoutInflater.from(this).inflate(R.layout.loading_progress_design, null)

    val dialog = AlertDialog.Builder(this).setView(view)

    dialog.setCancelable(false)


    view.findViewById<TextView>(R.id.messageLoading).text = message
    view.findViewById<TextView>(R.id.titleLoading).text = title

    return dialog.show()


}

