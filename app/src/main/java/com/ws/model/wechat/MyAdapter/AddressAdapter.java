package com.ws.model.wechat.MyAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ws.model.wechat.R;
import com.ws.model.wechat.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017-07-10.
 */

public class AddressAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflator;
    List<User> users;
    public AddressAdapter(Context context, List<User> users) {
        this.context = context;
        this.users = users;
        inflator = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return users.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflator.inflate(R.layout.address_listitem, null);//每次将一个布局xml映射到一项中
        TextView tv_id=(TextView) convertView.findViewById(R.id.tv_id);
        tv_id.setText(users.get(position).getId().toString());//

        TextView tv_username=(TextView) convertView.findViewById(R.id.tv_username);
        tv_username.setText(users.get(position).getUsername());

        return convertView;
    }
}
