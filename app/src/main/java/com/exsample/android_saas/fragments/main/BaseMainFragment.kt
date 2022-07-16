package com.exsample.android_saas.fragments.main

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.annotation.LayoutRes
import androidx.core.view.isGone
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.exsample.android_saas.R
import java.lang.RuntimeException

open class BaseMainFragment(@LayoutRes layoutId: Int) : Fragment(layoutId) {
    private lateinit var navController: NavController


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment)

      //  showAndHideBottomNavView()
    }

//    private fun showAndHideBottomNavView() {
//        navController.addOnDestinationChangedListener { _, destination, _ ->
//            Log.d("TAG", "showAndHideBottomNavView: ${destination.navigatorName}")
//            when (destination.id) {
//                R.id.mainFlowFragment -> {
//                    showBottomNav()
//                }
//                R.id.navigation_home -> {
//                    showBottomNav()
//                }
//                R.id.navigation_book -> {
//                    showBottomNav()
//                }
//                R.id.navigation_history -> {
//                    showBottomNav()
//                }
//                R.id.navigation_profile -> {
//                    showBottomNav()
//                }
//                R.id.navigation_favourites -> {
//                    showBottomNav()
//                }
//                else -> hideBottomNav()
//            }
//        }
//    }
//
//    private fun showBottomNav() {
//
//        visibleBottom?.showBottomNav(true)
//        Log.d("TAG", "showBottomNav: true")
//
//    }
//
//    private fun hideBottomNav() {
//        visibleBottom?.showBottomNav(false)
//        Log.d("TAG", "showBottomNav: false")
//
//        //   binding.bottomNavigation.visibility = View.GONE
////        navController.navigate(R.id.bottom_navigation)
//
//    }

}
