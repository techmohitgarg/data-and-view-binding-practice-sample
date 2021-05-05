package com.mohit.viewbindingsamplepractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mohit.viewbindingsamplepractice.databinding.FragmentInflateBinding


class InflateUsingViewBindingFragment : Fragment() {


    private var _binding: FragmentInflateBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentInflateBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        updateTextUsingBinding()
    }

    private fun updateTextUsingBinding() {
        binding.let {
            it.txtFragmentInfo.text =
                "Here we are updating text data using binding object in fragment"
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}