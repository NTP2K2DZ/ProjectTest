package tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.projecttest.R;

public class Tuan22MainActivity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan22_main);
        lv = findViewById(R.id.tuan22Listview);

        String[] array = new String[]{"Mon1", "Mon2", "Mon3", "Mon4", "Mon5", "Mon6", "Phucdz"};
        //adapter

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, array);
        lv.setAdapter(adapter);
    }
}