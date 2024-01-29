package tuan7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.projecttest.R;

public class Tuan72MainActivity extends AppCompatActivity {
    Button btnGetData;
    TextView tvKQ;
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan72_main);
        Tuan71VolleyFn volleyFn = new Tuan71VolleyFn();
        tvKQ = findViewById(R.id.tuan72TvQK);
        btnGetData = findViewById(R.id.tuan72Btn);
        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volleyFn.getJsonArrayOfObject(context, tvKQ);
            }
        });
    }
}