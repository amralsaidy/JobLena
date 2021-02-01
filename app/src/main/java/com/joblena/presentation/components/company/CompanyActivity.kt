package com.joblena.presentation.components.company

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.joblena.R
import com.joblena.app.common.Event
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

class CompanyActivity : AppCompatActivity() {


    override fun onStop() {
        EventBus.getDefault().unregister(this)
        super.onStop()
    }

    override fun onStart() {
        EventBus.getDefault().register(this)
        super.onStart()
    }

    private lateinit var appBarConfigurationDrawer: AppBarConfiguration
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navViewDrawer: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_company)


        /*
         bottom navigation view
         */
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        navView.setupWithNavController(navController)

        /*
         navigation view drawer
         */
        drawerLayout = findViewById(R.id.drawer_layout)
        navViewDrawer = findViewById(R.id.drawer_view)
        val navControllerDrawer = this.findNavController(R.id.nav_host_fragment_drawer)
        appBarConfigurationDrawer = AppBarConfiguration(navControllerDrawer.graph, drawerLayout)
        NavigationUI.setupWithNavController(navViewDrawer, navControllerDrawer)
        /*
        check if drawer is open or not
         */
        drawerLayout.closeDrawers();


    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.nav_host_fragment_drawer)
        return NavigationUI.navigateUp(navController, appBarConfigurationDrawer)
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    fun showDrawer(event: Event) {
        if (event.isClick) {
            drawerLayout.openDrawer(GravityCompat.START)
            event.isClick=false
        }
    }
}