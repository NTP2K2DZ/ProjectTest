package tuan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.projecttest.R

class Tuan21KotlinMainActivity : AppCompatActivity() {
    var txt1: EditText? = null
    var txt2: EditText? = null
    var btn1: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan21_main)
        txt1 = findViewById(R.id.tuan21txt1)
        txt2 = findViewById(R.id.tuan21txt2)
        btn1 = findViewById(R.id.tuan21btn1)

        btn1!!.setOnClickListener {
            // Huong di chuyen
            var i = Intent(this@Tuan21KotlinMainActivity, Tuan21KotlinSecondActivity::class.java)
            // Input du lieu
            i.putExtra("number1", txt1!!.text.toString())
            i.putExtra("number2", txt2!!.text.toString())
            startActivity(i)
        }
    }
}