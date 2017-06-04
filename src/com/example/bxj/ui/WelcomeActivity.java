package com.example.bxj.ui;

import com.example.bxj.utils.SharedUtils;
import com.example.bxj.R;
import com.example.bxj.R.layout;
import com.example.bxj.R.menu;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.content.Intent;

//�´��ڵ�����ӭҳ��  //ͼƬ�ز����԰汾7.9.1
public class WelcomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		new Handler(new Handler.Callback(){

			@Override
			public boolean handleMessage(Message arg0) {
				// TODO Auto-generated method stub\
				//�ǵ�һ������
				if(SharedUtils.isFirstStart(getBaseContext()))
				{
					startActivity(new Intent(getApplicationContext(), WelcomeGuideActivity.class));
					//�޸ĳɲ��ǵ�һ������
					SharedUtils.putIsFirstStart(getBaseContext(), false);	
				}
				else
				{
					startActivity(new Intent(getApplicationContext(), MainActivity.class));
				}
				finish();
				return false;
			}
			
		}).sendEmptyMessageDelayed(0, 1500);
	}
}
