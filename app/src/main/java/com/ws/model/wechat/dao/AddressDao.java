package com.ws.model.wechat.dao;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ws.model.wechat.Utils.DD;
import com.ws.model.wechat.Utils.OkHttpUtils;
import com.ws.model.wechat.Utils.USER;
import com.ws.model.wechat.ativity.LoginActivity;
import com.ws.model.wechat.ativity.MainActivity;
import com.ws.model.wechat.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017-07-10.
 */

public class AddressDao {
    public void getFriend(Context context){
        String id= USER.user.getUsername();
       OkHttpUtils<String> utils=new OkHttpUtils<>(context);
        String url= DD.url+"friend/getFriend?";
        utils.url(url+"id="+id).
                targetClass(String.class).execute(new OkHttpUtils.OnCompleteListener<String>() {
            @Override
            public void onSuccess(String result) {
                Gson gson=new Gson();
                List<User> users=gson.fromJson(result,new TypeToken<List<User>>(){}.getType());
                for (User user:users){
                    Log.e("main",user.toString());
                }
            }

            @Override
            public void onError(String error) {

            }
        });

    }
}
