package com.coroutines.sample.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coroutines.sample.R
import com.coroutines.sample.ui.fragments.ListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(
                    R.id.container_login,
                    ListFragment.newInstance(),
                    ListFragment::class.java.toString()
                )
                .commit()
        }
    }
}
