package com.exsample.android_saas.fragments.auth.signup

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.exsample.android_saas.R
import com.exsample.android_saas.databinding.FragmentSignupBinding

class SignupFragment : Fragment(R.layout.fragment_signup) {
    private val binding by viewBinding(FragmentSignupBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
    }

    private fun initViews() {
        binding.bSignup.setOnClickListener {
            requireActivity().onBackPressed()
        }

        binding.tvSignin.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }

}