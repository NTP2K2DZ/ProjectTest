package tuan4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.projecttest.R

class Tuan41MainActivity : AppCompatActivity() {
    var adap: Tuan41Adapter? = null
    var ls:ArrayList<Tuan41Contact> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan41_main)

        var lv = findViewById<ListView>(R.id.tuan41lv)

        ls.add(Tuan41Contact("Nguyen Thai Phuc", "22", R.drawable.android))
        ls.add(Tuan41Contact("Nguyen Thai Thien", "21", R.drawable.facebook))
        ls.add(Tuan41Contact("Nguyen The Anh", "18", R.drawable.blogger))
        ls.add(Tuan41Contact("Nguyen Minh Nhat", "29", R.drawable.border))
        ls.add(Tuan41Contact("Pham Van Huy", "11", R.drawable.apple))
        adap = Tuan41Adapter(this, ls)
        lv.adapter = adap
    }
}