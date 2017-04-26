package com.example.bluesky.android_hw4_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

    EditText et_msg;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //要習慣對物件 findViewById
        btn = (Button)findViewById(R.id.btn_notification);
        et_msg = (EditText)findViewById(R.id.editText);
        btn.setOnClickListener(rec_notification);

    }

    private OnClickListener rec_notification = new OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setAction("bluesky.NOTIFICATION");
            String msg = et_msg.getEditableText().toString();
            intent.putExtra("KEY_MSG", msg);
            sendBroadcast(intent);
        }
    };
}
