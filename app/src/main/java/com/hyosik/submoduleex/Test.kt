package com.hyosik.submoduleex

import android.content.Context
import android.widget.Toast

object Test {

    @JvmStatic
    fun test(context: Context, text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }

    @JvmStatic
    fun plus(x: Int, y: Int) = x.plus(y)

}