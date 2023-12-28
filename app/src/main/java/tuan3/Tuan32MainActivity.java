package tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.projecttest.R;

import java.util.ArrayList;

public class Tuan32MainActivity extends AppCompatActivity {
    ListView lv;
    T32Adapter adapter;
    ArrayList<Tuan32Contact> ls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan32_main);
        lv = findViewById(R.id.tuan32Lv);

        ls.add(new Tuan32Contact("Nguyen Thai Phuc", "20", R.drawable.android));
        ls.add(new Tuan32Contact("Nguyen Van Thien", "21", R.drawable.blogger));
        ls.add(new Tuan32Contact("Vu Hoang Anh", "24", R.drawable.apple));
        ls.add(new Tuan32Contact("Bro", "210", R.drawable.chrome));
        ls.add(new Tuan32Contact("Tieu Viem", "18", R.drawable.facebook));
        ls.add(new Tuan32Contact("My Do Toa", "300", R.drawable.hancock));
        ls.add(new Tuan32Contact("Han Lap", "31", R.drawable.border));
        adapter = new T32Adapter(ls, this);
        lv.setAdapter(adapter);

    }
}