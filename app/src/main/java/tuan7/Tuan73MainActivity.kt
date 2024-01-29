package tuan7

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.android.volley.toolbox.Volley
import com.example.projecttest.R

class Tuan73MainActivity : AppCompatActivity() {
    var btn:Button? = null
    var tvKQ:TextView? = null
    var context: Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan72_main)
        btn = findViewById(R.id.tuan72Btn)
        tvKQ = findViewById(R.id.tuan72TvQK)
        val fn = Volleyfn()
        btn!!.setOnClickListener{
            fn.getJSONArrayObjects(context, tvKQ!!)
        }
    }
}