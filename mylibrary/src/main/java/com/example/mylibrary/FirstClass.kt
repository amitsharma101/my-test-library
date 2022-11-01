package com.example.mylibrary

import android.content.Context
import android.widget.Toast

class FirstClass {
    fun showToast(context:Context, text: String){
        Toast.makeText(context,text,Toast.LENGTH_SHORT).show();
    }
}