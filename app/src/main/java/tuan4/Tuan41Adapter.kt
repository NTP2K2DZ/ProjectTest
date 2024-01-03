package tuan4

import android.widget.BaseAdapter
import  android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.projecttest.R

class Tuan41Adapter(context: Context, ls:ArrayList<Tuan41Contact>):BaseAdapter(){
    var ls:ArrayList<Tuan41Contact> = ls
    var context: Context = context
    override fun getCount(): Int {
        return ls.size
    }

    override fun getItem(position: Int): Any {
        return ls.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var c = convertView
        var vax: ViewAx
        if(convertView == null) {
            vax = ViewAx()
            c = LayoutInflater.from(context).inflate(R.layout.tuan41_item_view, null)
            vax. img_hinh = c.findViewById(R.id.tuan41ItemHinh)
            vax. tv_ten = c.findViewById(R.id.tuan41IteamTen)
            vax. tv_tuoi = c.findViewById(R.id.tuan41IteamTuoi)
            c.tag = vax
        }
        else{
            vax = c!!.tag as ViewAx
        }
        vax.img_hinh!!.setImageResource(ls[position].hinh!!)
        vax.tv_ten!!.text = ls[position].ten!!
        vax.tv_tuoi!!.text = ls[position].tuoi!!
        return c!!

    }
    inner class ViewAx {
        var img_hinh:ImageView? = null
        var tv_ten: TextView? = null
        var tv_tuoi: TextView? = null
    }

}