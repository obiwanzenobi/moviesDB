package com.wmariusz.moviesdb.presentation.navigation

import android.os.Bundle
import androidx.navigation.Navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.wmariusz.moviesdb.R
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_navigation.mainBottomNavigation

class NavigationActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        val navController = findNavController(this, R.id.mainNavigation)

        mainBottomNavigation.setupWithNavController(navController)
        mainBottomNavigation.setOnNavigationItemReselectedListener {
            // intentionally empty to prevent fragment stack reset on reselect of a navigation item
        }
    }

    override fun onSupportNavigateUp() = findNavController(this, R.id.mainNavigation).navigateUp()
}
