package com.ws.model.wechat.ativity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.ws.model.wechat.R;
import com.ws.model.wechat.Utils.DD;
import com.ws.model.wechat.Utils.OkHttpUtils;
import com.ws.model.wechat.Utils.USER;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class LoginActivity extends AppCompatActivity {

    EditText et_password,et_username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view){
        et_password=(EditText)findViewById(R.id.et_password);
        et_username=(EditText)findViewById(R.id.et_username);
        if(et_password.getText()!=null && et_username.getText()!=null){
            OkHttpUtils<String> utils=new OkHttpUtils<>(getApplicationContext());
            String url=DD.url+"user/login?";
            utils.url(url+"username="+et_username.getText()+"&password="+et_password.getText()).
                    targetClass(String.class).execute(new OkHttpUtils.OnCompleteListener<String>() {
                @Override
                public void onSuccess(String result) {
                    if(result.trim().equals("true")){
                        USER.user.setUsername( et_username.getText().toString());
                        USER.user.setPasswrod(et_password.getText().toString());
                        Log.e("main","密码正确"+USER.user.toString());
                        Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }else{
                        Toast.makeText(LoginActivity.this,"帐号或者密码错误",Toast.LENGTH_SHORT).show();
                    }
                    Log.e("main","!!"+result);
                }

                @Override
                public void onError(String error) {
                    Log.e("main","网络错误");
                }
            });


            //1, 导包
            // 2, 的到客户端
            /*OkHttpClient client = new OkHttpClient();
             //3, 发起新的请求,获取返回信息
            RequestBody body = new FormBody.Builder()
            .add("username", "weifucheng")//添加键值对
            .add("password", "123456").build();
            Request request = new Request.Builder() .url("http://192.168.1.100:8080/WeChat/user/login")
             .post(body)  .build();
            try {
                Response response = client.newCall(request).execute();
                //.newCall(request).execute();
                if(response.isSuccessful())
                {
                    String str = response.body().string();
                    System.out.println("服务器响应为: " + str);
                }
            }catch (Exception e){

            }*/


        }
    }
}
