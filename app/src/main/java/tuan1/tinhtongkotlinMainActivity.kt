package tuan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.projecttest.R

class tinhtongkotlinMainActivity : AppCompatActivity() {
    var txt1:EditText? = null
    var txt2:EditText? = null
    var btn1:Button? = null
    var tv1:TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tinhtongjava_main)

        txt1 = findViewById(R.id.demotxt1)
        txt2 = findViewById(R.id.demotxt2)
        btn1 = findViewById(R.id.demobtn1)
        tv1 = findViewById(R.id.demotv1)

        btn1!!.setOnClickListener(View.OnClickListener{
            ketqua();
        })
    }

    private fun ketqua() {
        val str1 = txt1!!.text.toString();
        val so1 = str1.toFloat();
        val str2 = txt2!!.text.toString();
        val so2 = str2.toFloat();
        val tong = so1 + so2;
        tv1!!.text = tong.toString();
    }

}