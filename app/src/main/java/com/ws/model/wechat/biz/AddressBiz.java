package com.ws.model.wechat.biz;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.ws.model.wechat.MyAdapter.AddressAdapter;
import com.ws.model.wechat.MyReicerver.AddressReicerver;
import com.ws.model.wechat.dao.AddressDao;
import com.ws.model.wechat.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017-07-10.
 */

public class AddressBiz {

    private AddressDao addressDao=new AddressDao();
    public void initAddress(Context context,ListView lv_address,Context context2){
        AddressReicerver.lv_address=lv_address;
        AddressReicerver.context=context;
        addressDao.getFriend(context);
    }

}
