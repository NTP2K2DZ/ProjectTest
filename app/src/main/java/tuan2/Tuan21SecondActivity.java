package tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.projecttest.R;

public class Tuan21SecondActivity extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan21_second);
        tv1 = findViewById(R.id.tuan21tv1);
        Intent i1 = getIntent();

        String string1 = i1.getExtras().getString("number1");
        String string2 = i1.getExtras().getString("number2");
        float number1 = Float.parseFloat(string1);
        float number2 = Float.parseFloat(string2);
        float result = number1 + number2;
        tv1.setText(String.valueOf(result));
    }
}