/*
 * Copyright (C) 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mohit.viewbindingsamplepractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.mohit.viewbindingsamplepractice.databinding.ActivityMainBinding

/**
 * This is Activity class which help us to communicate with view using View Binding
 * Here is the example of activity class view binding
 */
class ViewBindingMainActivity : AppCompatActivity() {

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
            add(R.id.frameFragmentOne, ViewBindingInflateFragment())
            setReorderingAllowed(true)
            addToBackStack(null)
        }
        supportFragmentManager.commit {
            add(R.id.frameFragmentTwo, ViewBindingBindFragment())
            setReorderingAllowed(true)
            addToBackStack(null)
        }
    }
}