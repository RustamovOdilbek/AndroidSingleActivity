package com.exsample.android_saas.fragments.main.home

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.fragmentViewBinding
import by.kirich1409.viewbindingdelegate.viewBinding
import com.exsample.android_saas.R
import com.exsample.android_saas.databinding.FragmentFlowMainBinding
import com.exsample.android_saas.databinding.FragmentHomeBinding
import com.exsample.android_saas.fragments.main.BaseMainFragment
import com.exsample.android_saas.fragments.main.FlowFragmentMain
import java.lang.RuntimeException

class HomeFragment : BaseMainFragment(R.layout.fragment_home) {
    private var visibleBottom: ShowBottom? = null

    private val binding by viewBinding(FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
    }

    private fun initViews() {
        binding.tvText.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_home_to_detailFragment)
            visibleBottom?.showBottomNav(false)
        }
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is ShowBottom){
            visibleBottom = context
        }else {
            throw RuntimeException(context.toString() + " must implement FirstListner")
        }
    }

    public override fun onDetach() {
        super.onDetach()
        visibleBottom = null
    }
    interface ShowBottom{
        fun showBottomNav(visible: Boolean)
    }
}


