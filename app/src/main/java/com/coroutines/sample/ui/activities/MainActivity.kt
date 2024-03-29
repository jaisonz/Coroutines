package com.coroutines.sample.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coroutines.sample.R
import com.coroutines.sample.ui.fragments.ListFragment

/**
 * Launcher activity class of the application
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(
                    R.id.container_list,
                    ListFragment.newInstance(),
                    ListFragment::class.java.toString()
                )
                .commit()
        }
    }
}
