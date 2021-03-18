package com.example.androidtema1.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.example.androidtema1.R
import com.example.androidtema1.fragments.F1A2
import com.example.androidtema1.fragments.F2A2
import com.example.androidtema1.fragments.F3A2
import com.example.androidtema1.interfaces.ActivityFragmentCommunication
import kotlin.system.exitProcess

class Activity2 : AppCompatActivity(), ActivityFragmentCommunication {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        addFragmentF1A2()
    }

    private fun addFragmentF1A2() {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val tag = F1A2::class.java.name
        val addTransaction = transaction.add(
                R.id.a2_frame_layout, F1A2.newInstance(), tag
        )
        addTransaction.commit()
    }

    override fun addFragmentF2A2() {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val tag = F2A2::class.java.name
        val addTransaction = transaction.add(
                R.id.a2_frame_layout, F2A2.newInstance(), tag
        )
        addTransaction.addToBackStack(tag)
        addTransaction.commit()
    }

    override fun replaceWithF3A2() {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val tag = F3A2::class.java.name
        val replaceTransaction = transaction.replace(
                R.id.a2_frame_layout, F3A2.newInstance("", ""), tag
        )
        replaceTransaction.addToBackStack(tag)
        replaceTransaction.commit()
    }

    override fun goBackToF1A2() {
        this.onBackPressed()
        /*val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        val tag = F1A2::class.java.name
        val replaceTransaction = transaction.replace(
                R.id.a2_frame_layout, F1A2.newInstance("", ""), tag
        )
        //replaceTransaction.addToBackStack(tag)
        replaceTransaction.commit()*/
    }

    /*override fun onBackPressed() {
        exitProcess(1)//daca decomentez, nu mai e nev sa inchid activity1 cand o desc pe activ2 sau sa o desc din button3
    }*/

    override fun killActivity2() {
        val intent = Intent(this, Activity1::class.java)
        startActivity(intent)
        this.finish()
    }

    override fun openActivity2() {
        TODO("Not yet implemented")
    }
}