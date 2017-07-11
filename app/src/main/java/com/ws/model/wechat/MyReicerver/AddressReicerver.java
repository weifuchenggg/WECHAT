package com.ws.model.wechat.MyReicerver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.ListView;

import com.ws.model.wechat.MyAdapter.AddressAdapter;
import com.ws.model.wechat.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017-07-11.
 */

public class AddressReicerver extends BroadcastReceiver{

    public static ListView lv_address;
    public static Context context;
    public static List<User> users;
    @Override
    public void onReceive(Context context, Intent intent) {
        String s=intent.getStringExtra("aa");
        Log.e("main",s);
        AddressAdapter addressAdapter=new AddressAdapter(AddressReicerver.context,AddressReicerver.users);
        AddressReicerver.lv_address.setAdapter(addressAdapter);
    }
}
