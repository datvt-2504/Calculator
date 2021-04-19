package com.example.calculator.base

import android.content.Context
import android.content.Intent
import com.example.calculator.R
import com.example.calculator.utils.replaceFragmentInActivity
import com.example.calculator.view.calculator.CalculatorFragment

class MainActivity : BaseActivity(R.layout.activity_main) {

    override fun onCreatedView() {
        replaceFragmentInActivity(CalculatorFragment())
    }

    companion object {
        fun getIntent(context: Context): Intent = Intent(context, MainActivity::class.java)
    }
}
