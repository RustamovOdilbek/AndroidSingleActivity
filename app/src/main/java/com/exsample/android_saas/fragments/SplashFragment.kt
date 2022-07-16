package com.exsample.android_saas.fragments

import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.fragment.app.Fragment
import com.exsample.android_saas.R
import com.exsample.android_saas.extension.activityNavController
import com.exsample.android_saas.extension.navigateSafely
import com.exsample.android_saas.manager.AuthManager


class SplashFragment : Fragment(R.layout.fragment_splash) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Handler().postDelayed(Runnable {
            initViews()
        }, 5000)

    }

    private fun initViews() {
        when{
            AuthManager.isAuthorized -> {
                activityNavController().navigateSafely(R.id.action_global_mainFlowFragment)
            }
            !AuthManager.isAuthorized ->{
                activityNavController().navigateSafely(R.id.action_global_loginFlowFragment)
            }
        }
    }

}