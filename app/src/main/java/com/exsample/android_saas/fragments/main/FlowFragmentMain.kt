package com.exsample.android_saas.fragments.main

import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.exsample.android_saas.R
import com.exsample.android_saas.databinding.FragmentFlowMainBinding
import com.exsample.android_saas.fragments.BaseFlowFragment

class FlowFragmentMain : BaseFlowFragment(R.layout.fragment_flow_main, R.id.nav_host_fragment_main) {

    private lateinit var navController: NavController
    private val binding by viewBinding(FragmentFlowMainBinding::bind)

    override fun setupNavigation(navController: NavController) {
        binding.bottomNavigation.setupWithNavController(navController)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment)
        showAndHideBottomNavView()
    }


    private fun showAndHideBottomNavView() {
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.mainFlowFragment -> {
                    showBottomNav()
                }
                R.id.navigation_home -> {
                    showBottomNav()
                }
                R.id.navigation_book -> {
                    showBottomNav()
                }
                R.id.navigation_history -> {
                    showBottomNav()
                }
                R.id.navigation_profile -> {
                    showBottomNav()
                }
                R.id.navigation_favourites -> {
                    showBottomNav()
                }
                else -> hideBottomNav()
            }
        }
    }

    private fun showBottomNav() {
        binding.bottomNavigation.visibility = View.VISIBLE

    }

    private fun hideBottomNav() {
        binding.bottomNavigation.visibility = View.GONE
    }

}