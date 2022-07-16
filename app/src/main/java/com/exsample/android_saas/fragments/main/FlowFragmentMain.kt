package com.exsample.android_saas.fragments.main

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.exsample.android_saas.R
import com.exsample.android_saas.databinding.FragmentFlowMainBinding
import com.exsample.android_saas.fragments.BaseFlowFragment
import com.exsample.android_saas.fragments.main.home.HomeFragment

class FlowFragmentMain : BaseFlowFragment(R.layout.fragment_flow_main, R.id.nav_host_fragment_main),
    HomeFragment.ShowBottom {

    private lateinit var navController: NavController
    private val binding by viewBinding(FragmentFlowMainBinding::bind)

    override fun setupNavigation(navController: NavController) {
        binding.bottomNavigation.setupWithNavController(navController)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("TAG", "onDestroyView: ss")
    }


    override fun showBottomNav(visible: Boolean) {
        Log.d("TAG", "showBottomNav: $visible  override")
        if (!visible){
            binding.bottomNavigation.visibility = View.GONE
        }else{
            binding.bottomNavigation.visibility = View.VISIBLE
        }
    }
}

