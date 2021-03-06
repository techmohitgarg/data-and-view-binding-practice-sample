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

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.mohit.viewbindingsamplepractice.databinding.FragmentInflateBinding

/**
 * View Binding example with a fragment that uses the alternate constructor for inflation and
 * [onViewCreated] for binding.
 * Bind - > When Layout has already inflated with fragment after that we 'bind' for binding the view
 */
class ViewBindingBindFragment : Fragment(R.layout.fragment_inflate) {

    // Scoped to the lifecycle of the fragment's view (between onCreateView and onDestroyView)
    private var fragmentBlankBinding: FragmentInflateBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentInflateBinding.bind(view)
        fragmentBlankBinding = binding

        binding.txtFragmentInfo.text =
            "Here we are updating text data using binding object in Bind Fragment"
    }

    override fun onDestroyView() {
        // Consider not storing the binding instance in a field, if not needed.
        fragmentBlankBinding = null
        super.onDestroyView()
    }
}
