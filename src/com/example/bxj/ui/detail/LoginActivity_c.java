package com.example.bxj.ui.detail;

import java.io.IOException;

import com.alibaba.fastjson.JSON;
import com.example.bxj.R;
import com.example.bxj.meijie;
import com.example.bxj.model.Customer;
import com.example.bxj.ui.MainActivity;
import com.example.bxj.ui.fragment.HomeFragment;
import android.support.v4.app.Fragment;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import android.net.MailTo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity_c extends Activity {
	@ViewInject(R.id.login_phone)
	// �˺������
	EditText et_phone;
	@ViewInject(R.id.login_password)
	// �˺������
	EditText et_password;
	EditText et_cname;
	@ViewInject(R.id.login)
	// ��¼��ť
	Button login;
	private String wz = "yaohaozhe.com";
	// ע��
	@ViewInject(R.id.zhuce)
	private TextView zhuce;
	// private FragmentManager manager;
	// private FragmentTransaction transaction;
	int type = 1;
	private Handler handler = new Handler() {
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case 1:
				Toast.makeText(LoginActivity_c.this, "��¼�ɹ�", Toast.LENGTH_LONG)
						.show();
				int result = (Integer) msg.obj;
				Intent intent = new Intent(LoginActivity_c.this,
						MainActivity.class);

				intent.putExtra("cid", String.valueOf(result));

				startActivity(intent);
				break;
			case 2:
				Toast.makeText(LoginActivity_c.this, "�˺Ż��������������",
						Toast.LENGTH_LONG).show();
				break;
			}
		}
	};
	private Message msg = new Message();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_c);
		ViewUtils.inject(this);
		// manager = getFragmentManager();
		// transaction = manager.beginTransaction();
		//
		// // transaction.add(R.id.contents, new HomeFragment());
		// transaction.commit();
		et_phone.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				// TODO Auto-generated method stub
				if (et_phone.getText().toString().length() >= 1) {
					login.setEnabled(true);
					Log.e("jhd1", "login-set-true");
				} else {
					login.setEnabled(false);
					Log.e("jhd1", "login-set-false");
				}
			}

			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1,
					int arg2, int arg3) {
				// TODO Auto-generated method stub

			}

			@Override
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub

			}
		});
	}

	@OnClick(R.id.zhuce)
	public void onClick(View view) {
		Intent intent = new Intent();
		intent.setClass(LoginActivity_c.this, SignupActivity_c.class);
		startActivity(intent);
	}

	@OnClick(R.id.login)
	public void onClick1(View view) {

		if (type == 1) {
			String url = "http://" + wz + "/logincustomer?phone="
					+ et_phone.getText().toString() + "&pass="
					+ et_password.getText().toString();
			OkHttpClient client = new OkHttpClient();
			Request request = new Request.Builder().url(url).get().build();
			client.newCall(request).enqueue(new Callback() {

				public void onResponse(Response arg0) throws IOException {
					String string = arg0.body().string();
					System.out.println(string);
					if (string.equals("null")) {
						msg.what = 2;
						msg.obj = 1;
						handler.sendMessage(msg);
					} else {
						Customer customer = (Customer) JSON.parseObject(string,
								Customer.class);
						if (customer.getCphone().length() > 0
								&& customer.getCpass().length() > 0) {
							System.out.println("name=" + customer.getCphone()
									+ "password:" + customer.getCpass());
							msg.what = 1;
							msg.obj = customer.getCid();
							handler.sendMessage(msg);

							// HomeFragment HomeFragment = new HomeFragment();
							// Bundle bundle = new Bundle();
							// int result = (Integer) msg.obj;
							// bundle.putString("cid", String.valueOf(result));
							// HomeFragment.setArguments(bundle);
							// // ���transaction commit������ ��ô����Ҫ���µõ�transaction
							//
							// //getSupportFragmentManager().beginTransaction()
							// //.replace(R.id.frame_layout, leftFragment)
							// // .commit();

						}

					}

				}

				public void onFailure(Request arg0, IOException arg1) {
					// TODO Auto-generated method stub

				}
			});

		}

	}
}
