package com.z.sanbottest;

import android.util.Log;
import android.widget.Toast;

import com.sanbot.opensdk.base.BindBaseService;

/**
 * 三宝端使用的
 * 语音功能 服务
 */

public class AiService extends BindBaseService {

    private String TAG = "zhu";

    @Override
    public void onCreate() {
        register(AiService.class);
        super.onCreate();
    }

    @Override
    protected void onMainServiceConnected() {

        Log.d(TAG,"连接完毕 。 。 。 "+System.currentTimeMillis());

        Toast.makeText(this, "机器人连接完毕 . . . . ", Toast.LENGTH_SHORT).show();

    }


}