package tuan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.projecttest.R;

import java.util.List;

public class CustomerAdapter extends ArrayAdapter<Contact> {
    private Context context;
    private int resource;

    private List<Contact> objects;
    private LayoutInflater inflater;
    public CustomerAdapter(Context context, int resource, List<Contact> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }
    @Override
    public View getView(int posittion, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        if(convertView == null) {
            convertView = inflater.inflate(R.layout.iteam_listview, null);
            holder.tvAvartar = (TextView)convertView.findViewById(R.id.tvAvatar);
            holder.tvName = (TextView)convertView.findViewById(R.id.tvAvatar);
            holder.tvPhone = (TextView)convertView.findViewById(R.id.tvPhone);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder)convertView.getTag();
        }

        Contact contact = objects.get(posittion);
        holder.tvAvartar.setText(String.valueOf(posittion));
        holder.tvName.setText(contact.getName());
        holder.tvPhone.setText(contact.getPhone());
        return convertView;
    }

    public class ViewHolder {
        TextView tvAvartar, tvName, tvPhone;
    }

}
