package tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.projecttest.R;

public class Tuan21MainActivity<Tuan21MainActivityActivity> extends AppCompatActivity {
    EditText txt1, txt2;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan21_main);
        txt1 = findViewById(R.id.tuan21txt1);
        txt2 = findViewById(R.id.tuan21txt2);
        btn1 = findViewById(R.id.tuan21btn1);

        btn1.setOnClickListener(v->{
            //Huong di chuyen
            Intent i = new Intent(Tuan21MainActivity.this,Tuan21SecondActivity.class);
            //input du lieu
            i.putExtra("number1",txt1.getText().toString());
            i.putExtra("number2", txt2.getText().toString());
            startActivity(i);
        });
    }
}