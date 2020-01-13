package com.z.sanbottest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.sanbot.opensdk.base.BindBaseActivity;

public class MainActivity extends BindBaseActivity {

    private String TAG = MyTAG.FLAG;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        register(MainActivity.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        findViewById(R.id.btn_finish).setOnClickListener(v->{
//            finish();
//        });

//        intent = new Intent(this, AiService.class);
//        startService(intent);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        stopService(intent);
    }

    @Override
    protected void onMainServiceConnected() {
        Log.i(TAG, "onMainServiceConnected: ");
        Toast.makeText(this, "连接完毕 . . .", Toast.LENGTH_SHORT).show();
    }

}
