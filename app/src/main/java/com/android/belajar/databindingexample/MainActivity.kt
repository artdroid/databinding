package com.android.belajar.databindingexample

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.android.belajar.databindingexample.databinding.ActivityMainBinding
import javax.security.auth.login.LoginException

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.activity = this

        // 1St Attemp (using data class)
        val book = Book("Belajar-Android", "Penulis lepas")
        binding.setVariable(BR.book, book)
        binding.executePendingBindings()
    }

    fun onClickTitle(x: Book){
        Log.e("Click", "onClick!!")
        Toast.makeText(this, "Book title: ${x.title} Book author: ${x.author}", Toast.LENGTH_LONG).show()
    }
}
