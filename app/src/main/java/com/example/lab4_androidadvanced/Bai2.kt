package com.example.lab4_androidadvanced

import android.net.ConnectivityManager
import android.net.NetworkInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab4_androidadvanced.databinding.ActivityBai2Binding

class Bai2 : AppCompatActivity() {
    private lateinit var binding: ActivityBai2Binding
    private lateinit var connectivityManager:ConnectivityManager
    private lateinit var mobileDataState:NetworkInfo
    private lateinit var wifiState:NetworkInfo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBai2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        connectivityManager = getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
        mobileDataState = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE)!!
        wifiState = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI)!!

        if(mobileDataState.isConnected) {
            binding.txtConnectionType.text = "Connection type: Mobile data"
        } else if(wifiState.isConnected) {
            binding.txtConnectionType.text = "Connection type: Wifi"
        } else {
            binding.txtConnectionType.text = "No connection available!"
        }
    }
}