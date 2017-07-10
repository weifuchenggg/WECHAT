package com.ws.model.wechat.biz;

import android.content.Context;
import android.widget.ListView;

import com.ws.model.wechat.MyAdapter.AddressAdapter;
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
        addressDao.getFriend(context2);
        List<User> users=new ArrayList<User>();
        User user1,user2,user3;
        user1=new User();user2=new User();user3=new User();
        user1.setId(1);user1.setUsername("张三");user1.setPasswrod("123");
        user2.setId(1);user2.setUsername("李四");user2.setPasswrod("123");
        user3.setId(1);user3.setUsername("王五");user3.setPasswrod("123");
        users.add(user1);users.add(user2);users.add(user3);
        AddressAdapter addressAdapter=new AddressAdapter(context,users);
        lv_address.setAdapter(addressAdapter);
    }

}
