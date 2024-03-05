package com.sample.cutomsnackbar

import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar

object CustomSnackBar {

    fun SnackSg(view:View,Value:String,viewplace:String){

        var snackData = Snackbar.make(view,Value,Toast.LENGTH_SHORT)
        val text = snackData.view.findViewById(com.google.android.material.R.id.snackbar_text) as TextView?
        text?.setTextColor(ContextCompat.getColor(view.context,android.R.color.white))
        var params = snackData.view.layoutParams as FrameLayout.LayoutParams

        if(viewplace.equals("TOP")){
            params.gravity =Gravity.TOP
        }else if(viewplace.equals("BOTTOM")){
            params.gravity =Gravity.BOTTOM
        }else{
            params.gravity =Gravity.BOTTOM

        }
        snackData.view.layoutParams =params
        snackData.show()
    }
}