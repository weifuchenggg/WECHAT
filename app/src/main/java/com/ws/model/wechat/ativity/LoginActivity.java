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

public class LoginActivity extends AppCompatActivity {

    EditText et_password,et_username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {
        et_password=(EditText)findViewById(R.id.et_password);
        et_username=(EditText)findViewById(R.id.et_username);
        if(et_password.getText()!=null && et_username.getText()!=null){
            OkHttpUtils<String> utils=new OkHttpUtils<>(getApplicationContext());
            String url=DD.url;
            utils.url(url+"username="+et_username.getText()+"&password="+et_password.getText()).
                    targetClass(String.class).execute(new OkHttpUtils.OnCompleteListener<String>() {
                @Override
                public void onSuccess(String result) {
                    if(result.trim().equals("true")){
                        Log.e("main","密码正确");
                        Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                        startActivity(intent);
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
        }
    }
}
