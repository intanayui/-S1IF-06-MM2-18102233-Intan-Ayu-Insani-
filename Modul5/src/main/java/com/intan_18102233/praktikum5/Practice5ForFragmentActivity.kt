package com.intan_18102233.praktikum5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Practice5ForFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice5_for_fragment)

        val mFragmentManager = supportFragmentManager
        val mFirstFragment = Practice5FirstFragment()
        val fragment = mFragmentManager.findFragmentByTag(Practice5FirstFragment::class.java.simpleName)
        if (fragment !is Practice5FirstFragment) {
            mFragmentManager.beginTransaction()
                .add(R.id.frame_container, mFirstFragment, Practice5FirstFragment::class.java.simpleName)
                .commit()
        }
    }
}