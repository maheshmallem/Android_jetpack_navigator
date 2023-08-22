package com.example.navigatorandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import java.security.AccessController

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController;
    private lateinit var drawerLayout: DrawerLayout;
    private lateinit var appBarConfiguration: AppBarConfiguration;
    private lateinit var listner: NavController.OnDestinationChangedListener;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = findNavController(R.id.fragment);
        drawerLayout = findViewById(R.id.drawer_layout);
        findViewById<NavigationView>(R.id.navigationView).setupWithNavController(navController)

        appBarConfiguration = AppBarConfiguration(navController.graph, drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration);

    }

    override fun onSupportNavigateUp(): Boolean {
        Log.d("MAHESH", "ON CLICKED");
        val navController = findNavController(R.id.fragment);

        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }


}