package tuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.projecttest.R

class Tuan21KotlinSecondActivity : AppCompatActivity() {
    var tv1: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan21_second)
        tv1 = findViewById(R.id.tuan21tv1)
        var i1 = intent
        val string1 = i1.extras!!.getString("number1")
        val string2 = i1.extras!!.getString("number2")

        val number1 = string1!!.toFloat()
        val number2 = string2!!.toFloat()

        val result = number1 + number2
        tv1!!.text = result.toString()
    }
}