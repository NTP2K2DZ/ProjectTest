package tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.projecttest.R;

import java.util.ArrayList;

public class Tuan31MainActivity extends AppCompatActivity {
    ListView lvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan31_main);
        lvContact = findViewById(R.id.lv);
        ArrayList<Contact> arrContact = new ArrayList<>();
        Contact contact1 = new Contact("Nguyen Thai Phuc","0333948660", "RED");
        Contact contact2 = new Contact("Tran Van Bro","0333948660", "RED");
        arrContact.add(contact1);
        arrContact.add(contact2);
        CustomerAdapter adapter = new CustomerAdapter(this, R.layout.iteam_listview, arrContact);
        lvContact.setAdapter(adapter);
    }
}