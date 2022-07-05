package ru.samitin.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*
import ru.samitin.newsapp.databinding.ActivityMainBinding
import ru.samitin.newsapp.databinding.FragmentDetailsBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding?=null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.fragment_splash)

        Handler(Looper.myLooper()!!).postDelayed({
            setContentView(binding.root)
            bottom_nav_menu.setupWithNavController(navController = nav_host_fragment.findNavController())
        },1500)

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}