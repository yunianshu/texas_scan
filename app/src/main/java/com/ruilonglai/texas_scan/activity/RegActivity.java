package com.ruilonglai.texas_scan.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ruilonglai.texas_scan.R;
import com.ruilonglai.texas_scan.entity.JsonBean;
import com.ruilonglai.texas_scan.entity.PokerUser;
import com.ruilonglai.texas_scan.util.HttpUtil;

import java.io.IOException;
import java.lang.reflect.Type;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

import static com.ruilonglai.texas_scan.util.HttpUtil.networkConnected;

public class RegActivity extends AppCompatActivity {
    @BindView(R.id.back)
    TextView back;
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.right)
    TextView right;
    @BindView(R.id.phone)
    EditText phone;
    @BindView(R.id.etpwd)
    EditText etpwd;
    @BindView(R.id.btreg)
    Button btreg;
    public static final String mob_APPKEY = "154edf2c734e2";
    public static final String mob_APPSECRET = "9dbe04e99b9c24f73f4a2c631031f852";
    private String number, name, pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        ButterKnife.bind(this);
        back.setVisibility(View.VISIBLE);
        back.setText("返回");
        back.setTextColor(Color.WHITE);
        title.setText("新用户注册");
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Register();
    }


    /*  注册按钮 */
    public void Register() {
        if (networkConnected(this))
            btreg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    number = phone.getText().toString().trim();
//                    if (number.length() != 11) {
//                        Toast.makeText(getApplicationContext(), "电话号码不足11位", Toast.LENGTH_SHORT).show();
//                        return;
//                    }
                    pwd = etpwd.getText().toString().trim();
                    if (pwd.isEmpty()) {
                        Toast.makeText(RegActivity.this, "密码不能为空", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    PokerUser pu = new PokerUser();
                    pu.id = number;
                    pu.nick = "";
                    pu.passwd = pwd;
                    pu.license = 10;
                    Gson gson = new Gson();
                    String jsonstr = gson.toJson(pu);
                    HttpUtil.sendPostRequestData("register", jsonstr, new Callback() {
                        @Override
                        public void onFailure(Call call, IOException e) {
                            Log.d("失败：", "111" + e);
                            runOnUiThread(new Runnable() {
                                public void run() {
                                    Toast.makeText(getApplicationContext(), "注册失败！", Toast.LENGTH_SHORT).show();
                                }
                            });
                        }

                        @Override
                        public void onResponse(Call call, Response response) throws IOException {
                            String responseDate = response.body().string();
                            Gson gson = new Gson();
                            Type type = new TypeToken<JsonBean>() {
                            }.getType();
                            final JsonBean jsonBean = gson.fromJson(responseDate, type);
                            String resp = jsonBean.result;
                            if (resp.equals("true")) {
                                runOnUiThread(new Runnable() {
                                    public void run() {
                                        Toast.makeText(getApplicationContext(), jsonBean.msg, Toast.LENGTH_SHORT).show();
                                    }
                                });
                                Intent intent = new Intent();
                                intent.setClass(RegActivity.this, LoginActivity.class);
                                startActivity(intent);
                                finish();
                            } else {
                                runOnUiThread(new Runnable() {
                                    public void run() {
                                        Toast.makeText(getApplicationContext(), jsonBean.msg, Toast.LENGTH_SHORT).show();
                                    }
                                });
                            }
                        }
                    });
                }
            });
        else {
            Toast.makeText(getApplicationContext(), "请检查网络！", Toast.LENGTH_SHORT).show();
        }
    }
}

