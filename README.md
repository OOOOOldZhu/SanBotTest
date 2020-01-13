# SanBotTest
集成三宝SDK，最纯净、最简单的demo。

1,第一步倒入.aar文件，在app的build.gradle中加入：
 //三宝 sdk
 implementation(name: 'SanbotOpenSDK_2.0.1.7', ext: 'aar')
 implementation 'com.google.code.gson:gson:2.8.5'

2，在app的build.gradle中加入：
    android {
        repositories {
            flatDir {
                dirs 'libs'
            }
        }
    }

3，清单文件中：
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
            <!-- 此应用申请麦克风 -->
            <meta-data
                android:name="CONFIG_RECORD"
                android:value="true" />
            <!-- 触发头部无响应 -->
            <meta-data
                android:name="FORBID_TOUCH"
                android:value="true" />
            <!-- 背部PIR触发无响应 -->
            <meta-data
                android:name="FORBID_PIR"
                android:value="true" />
            <!-- 语音唤醒无响应 -->
            <meta-data
                android:name="FORBID_WAKE_RESPONSE"
                android:value="true" />
        </activity>
        <service
            android:name="AiService"
            android:enabled="true"
            android:exported="true"
            android:persistent="false">

            <!-- 此应用申请麦克风 -->
            <meta-data
                android:name="CONFIG_RECORD"
                android:value="true" />
            <!-- 触发头部无响应 -->
            <meta-data
                android:name="FORBID_TOUCH"
                android:value="true" />
            <!-- 背部PIR触发无响应 -->
            <meta-data
                android:name="FORBID_PIR"
                android:value="true" />
            <!-- 语音唤醒无响应 -->
            <meta-data
                android:name="FORBID_WAKE_RESPONSE"
                android:value="true" />
        </service>

4，activity或者service中：

public class MainActivity extends BindBaseActivity {
    private String TAG = "zhu";
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // * * * * * * * *此处为第1处* * * * * * * *
        register(MainActivity.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // * * * * * * * *此处为第2处* * * * * * * *
    @Override
    protected void onMainServiceConnected() {
        Log.i(TAG, "onMainServiceConnected: ");
        Toast.makeText(this, "连接完毕 . . .", Toast.LENGTH_SHORT).show();
    }

}