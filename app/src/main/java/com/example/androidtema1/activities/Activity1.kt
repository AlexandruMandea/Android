package com.example.androidtema1.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidtema1.R
import com.example.androidtema1.interfaces.ActivityFragmentCommunication

class Activity1 : AppCompatActivity(), ActivityFragmentCommunication {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)
    }

    override fun openActivity2() {
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
        this.finish()
    }

    override fun killActivity2() {
        TODO("Not yet implemented")
    }

    override fun replaceWithF3A2() {
        TODO("Not yet implemented")
    }

    override fun goBackToF1A2() {
        TODO("Not yet implemented")
    }

    override fun addFragmentF2A2() {
        TODO("Not yet implemented")
    }
}