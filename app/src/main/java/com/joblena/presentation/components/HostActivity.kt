package com.joblena.presentation.components

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import com.google.firebase.FirebaseApp
import com.joblena.R
import com.joblena.app.ext.contentView
import com.joblena.databinding.ActivityHostBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HostActivity : AppCompatActivity(), NavController.OnDestinationChangedListener{

    val binding: ActivityHostBinding by contentView(R.layout.activity_host)


    private val currentNavigationFragment: Fragment?
        get() = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_id)
            ?.childFragmentManager
            ?.fragments
            ?.first()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        navController = findNavController(R.id.nav_host_fragment_id)

        // Wrap binding.run to ensure ContentViewBindingDelegate is calling this Activity's
        // setContentView before accessing views
        binding.run {
            findNavController(R.id.nav_host_fragment_id).addOnDestinationChangedListener(
                    this@HostActivity
            )
        }
    }



    // NavController.OnDestinationChangedListener
    override fun onDestinationChanged(
        controller: NavController,
        destination: NavDestination,
        arguments: Bundle?
    ) {
        // Set the currentEmail being viewed so when the FAB is pressed, the correct email
        // reply is created. In a real app, this should be ic_done in a ViewModel but is ic_done
        // here to keep things simple. Here we're also setting the configuration of the
        // BottomAppBar and FAB based on the current destination.
//        when (destination.id) {
//            R.id.home_Fragment_id -> {
////                currentEmailId =
////                    if (arguments == null) -1 else EmailFragmentArgs.fromBundle(arguments).emailId
////                setBottomAppBarForEmail(getBottomAppBarMenuForDestination(destination))
//            }
//
//        }
    }






}