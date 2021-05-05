package com.mohit.viewbindingsamplepractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.mohit.viewbindingsamplepractice.databinding.ActivityMainBinding

/**
 * This is Activity class which help us to communicate with view using View Binding
 * Here is the example of activity class view binding
 */
class MainActivity : AppCompatActivity() {

    /**
     * View binding generates a binding object for every layout in your module
     *
     * xml file name is "activity_main.xml" and generated file name would be "ActivityMainBinding"
     *
     */
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        updateTextUsingBinding()

        addFragment()
    }

    private fun updateTextUsingBinding() {

        binding.txtInfo.text = "Here we are updating text data using binding object"

    }

    private fun addFragment() {
        supportFragmentManager.commit {
            add(R.id.frameFragmentContainer, InflateUsingViewBindingFragment())
            setReorderingAllowed(true)
            addToBackStack(null)
        }
    }
}