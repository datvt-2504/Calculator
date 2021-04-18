package com.example.calculator.utils

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.calculator.R

fun AppCompatActivity.replaceFragmentInActivity(
    fragment: Fragment,
    tag: String = fragment.javaClass.name,
    addToBackStack: Boolean = false
) {
    supportFragmentManager.beginTransaction()
        .apply {
            if (addToBackStack) addToBackStack(tag)
        }
        .replace(R.id.frameMain, fragment, tag)
        .commit()
}
