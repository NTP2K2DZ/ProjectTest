package tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.projecttest.R;

public class tinhtongjavaMainActivity extends AppCompatActivity {
    EditText txt1, txt2;
    Button btn1;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinhtongjava_main);
        txt1 = findViewById(R.id.demotxt1);
        txt2 = findViewById(R.id.demotxt2);
        btn1 = findViewById(R.id.demobtn1);
        tv1 = findViewById(R.id.demotv1);
        btn1.setOnClickListener(v->{
            ketqua();
        });
    }

    private void ketqua() {
        String str1 = txt1.getText().toString();
        float so1 = Float.parseFloat(str1);

        String str2 = txt2.getText().toString();
        float so2 = Float.parseFloat(str2);

        float tong = so1 + so2;
        tv1.setText(String.valueOf(tong));
    }
}