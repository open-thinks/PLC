package com.tdo1szh.scanning.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.tdo1szh.scanning.R;
import com.tdo1szh.scanning.beans.ShipListDataBean;

import java.util.ArrayList;

public class SpinnerAdapter extends BaseAdapter {

    private ArrayList<ShipListDataBean> datas;
    private Context mContext;

    public SpinnerAdapter(Context context) {
        mContext = context;
        this.datas = new ArrayList<>();
    }

    public void add(ArrayList<ShipListDataBean> data) {
        if (datas != null)
            datas.addAll(data);
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public ShipListDataBean getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder ;
        if(convertView==null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_text, parent, false);
            holder = new ViewHolder();
            holder.itemText= (TextView) convertView.findViewById(R.id.item_text);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        ShipListDataBean dataBean = datas.get(position);
        holder.itemText.setText(dataBean.getId());
        return convertView;
    }

    class ViewHolder {
        TextView itemText;
    }
}
