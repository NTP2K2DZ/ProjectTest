package tuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.projecttest.R

class Tuan22KotlinMainActivity : AppCompatActivity() {
    var lv: ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22_main)
        lv = findViewById(R.id.tuan22Listview)
        val array = arrayOf("Mon1", "Mon2", "Mon3", "Mon4", "Mon5", "Mon6", "Phucdz")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, array)
        lv!!.adapter = adapter

    }
}