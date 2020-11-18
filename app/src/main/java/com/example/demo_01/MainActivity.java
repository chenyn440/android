package com.example.demo_01;
//package com.example.phone;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.provider.AlarmClock;
import android.provider.CalendarContract;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    private WebView webview;
    private String url = "https://pro.m.jd.com/mall/active/2HsSHBSBW6KZGkxPHh9o2qL8QYB/index.html";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webview = (WebView) findViewById(R.id.webView);
        fillWebView(url);
    }

    private void fillWebView(String url) {
        WebSettings webSettings = webview.getSettings();
        webSettings.setSavePassword(false);
        webSettings.setSaveFormData(false);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(false);
        webview.setWebChromeClient(new WebChromeClient());
        webview.loadUrl(url);
    }
//    private EditText edit;
//    private Button bt;
//    private Button bt_alarm;
//    private Button time_btn;
//    private Button image_btn;
//    private Button contact_btn;
//    static final int REQUEST_IMAGE_CAPTURE = 1;
//    static final Uri locationForPhotos = null;
//    static final int REQUEST_SELECT_CONTACT = 1;
//    private WebView webView;
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
////        bt = (Button) findViewById(R.id.button);
////        bt.setOnClickListener(new Click());
////
////        bt_alarm = (Button) findViewById(R.id.alarm_btn);
////        bt_alarm.setOnClickListener(new OnClickListener()
////        {
////            @Override
////            public void onClick(View v) {
////                Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
////                        .putExtra(AlarmClock.EXTRA_MESSAGE, "该起床了")
////                        .putExtra(AlarmClock.EXTRA_HOUR, 1)
////                        .putExtra(AlarmClock.EXTRA_MINUTES, 1);
////                if (intent.resolveActivity(getPackageManager()) != null) {
////                    startActivity(intent);
////                }
////            }
////        });
////
////        time_btn = (Button) findViewById(R.id.time_btn);
////        time_btn.setOnClickListener(new OnClickListener()
////        {
////            @Override
////            public void onClick(View v) {
////                Intent intent = new Intent(Intent.ACTION_INSERT)
////                        .setData(CalendarContract.Events.CONTENT_URI)
////                        .putExtra(CalendarContract.Events.TITLE, "加油")
////                        .putExtra(CalendarContract.Events.EVENT_LOCATION, "海南")
////                        .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, 1000000)
////                        .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, 10000000);
////                if (intent.resolveActivity(getPackageManager()) != null) {
////                    startActivity(intent);
////                }
////            }
////        });
////
////        image_btn = (Button) findViewById(R.id.time_btn);
////        image_btn.setOnClickListener(new OnClickListener()
////        {
////            @Override
////            public void onClick(View v) {
////                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
////                intent.putExtra(MediaStore.EXTRA_OUTPUT,
////                        Uri.withAppendedPath(locationForPhotos, "image_01"));
////                if (intent.resolveActivity(getPackageManager()) != null) {
////                    startActivityForResult(intent, REQUEST_IMAGE_CAPTURE);
////                }
////            }
////        });
//
//       // contact_btn = (Button) findViewById(R.id.contact_btn);
////        contact_btn.setOnClickListener(new OnClickListener()
////        {
////            @Override
////            public void onClick(View v) {
////                Intent intent = new Intent(Intent.ACTION_PICK);
////                intent.setType(ContactsContract.Contacts.CONTENT_TYPE);
////                if (intent.resolveActivity(getPackageManager()) != null) {
////                    startActivityForResult(intent, REQUEST_SELECT_CONTACT);
////                }
////            }
////        });
////        contact_btn = (Button) findViewById(R.id.open_h5);
////        contact_btn.setOnClickListener(new OnClickListener()
////        {
////            @Override
////            public void onClick(View v) {
////                WebView webView = (WebView) findViewById(R.id.webView);
////
////                //覆盖WebView默认使用第三方或系统默认浏览器打开网页的行为，使网页用WebView打开
////                webView.setWebViewClient(new WebViewClient(){
////                    @Override
////                    public boolean shouldOverrideUrlLoading(WebView view, String url) {
////                        view.loadUrl(url);
////                        return true;
////                    }
////                });
////
////                webView.loadUrl("https://pro.m.jd.com/mall/active/2HsSHBSBW6KZGkxPHh9o2qL8QYB/index.html");
////            }
////        });
//        webView = (WebView) findViewById(R.id.webView);
//        webView.setWebViewClient(new WebViewClient() {
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                return false;
//            }
//        });
//        //将屏幕设置为全屏
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        loadLocalUrl("http://blog.sina.com.cn/s/blog_407686c20101mpk0.html");
//    }
//    private void loadLocalUrl(String url) {
//        WebSettings ws = webView.getSettings();
//        //如果访问的页面中有javastripts,则webview必须支持javascripts.
//        ws.setJavaScriptEnabled(true);
//
//        ws.setSavePassword(false);
//        ws.setSaveFormData(false);
//        ws.setJavaScriptEnabled(true);
//        ws.setSupportZoom(false);
//        // ws.setWebChromeClient(new WebChromeClient());
//        webView.loadUrl(url);
//
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
//            Bitmap thumbnail = data.getParcelableExtra("data");
//            // Do other work with full size photo saved in locationForPhotos
////        ...
//        }
//    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

//    class Click implements OnClickListener {
//
//        public void onClick(View v) {
//            edit = (EditText) findViewById(R.id.mobile);
//            // TODO Auto-generated method stub
//            Intent intent = new Intent();// 创建一个意图
//            intent.setAction(Intent.ACTION_CALL);// 指定其动作为拨打电话
//            intent.setData(Uri.parse("tel:" + edit.getText().toString()));// 指定将要拨出的号码
//            startActivity(intent);// 执行这个动作
//        }
//
//    }


//    class ClickAlarm implements OnClickListener {
//        public void createAlarm() {
//            Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
//                    .putExtra(AlarmClock.EXTRA_MESSAGE, "该起床了")
//                    .putExtra(AlarmClock.EXTRA_HOUR, 1)
//                    .putExtra(AlarmClock.EXTRA_MINUTES, 1);
//            if (intent.resolveActivity(getPackageManager()) != null) {
//                startActivity(intent);
//            }
//        }
//
//    }
}

//    public void createAlarm(String message, int hour, int minutes) {
//        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
//                .putExtra(AlarmClock.EXTRA_MESSAGE, message)
//                .putExtra(AlarmClock.EXTRA_HOUR, hour)
//                .putExtra(AlarmClock.EXTRA_MINUTES, minutes);
//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
//        }
//    }
//}

//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.fragment.app.FragmentManager;
//import androidx.fragment.app.FragmentTransaction;
//
//import android.content.Intent;
//import android.net.Uri;
//import android.os.Bundle;
//import android.telephony.SmsManager;
//import android.view.View;
//
//import java.util.ArrayList;
//
////public class MainActivity extends AppCompatActivity implements SelectFragment.Callback {
////////
////////    @Override
////////    protected void onCreate(Bundle savedInstanceState) {
////////        super.onCreate(savedInstanceState);
////////        setContentView(R.layout.activity_main);
////////    }
////////
////////    @Override
////////    public void onItemSelected(int id) {
////////        ResultFragment resultFragment = (ResultFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_result);
////////        resultFragment.showResult(id);
////////    }
////////
////////
////////}
//public class MainActivity extends AppCompatActivity {
//
//    // 用来标志当前Fragment
//    private int tag = 1;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//
//    public void replaceFragment(View view) {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        BlankFragment blankFragment = new BlankFragment();
//        Bundle bundle = new Bundle();
//        String param = String.valueOf(tag++);
//        bundle.putString("Key", param);
//        blankFragment.setArguments(bundle);
//        fragmentTransaction.replace(R.id.fragment_content, blankFragment, param);
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
//    }
//
//    public void addFragment(View view) {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        BlankFragment blankFragment = new BlankFragment();
//        Bundle bundle = new Bundle();
//        String param = String.valueOf(tag++);
//        bundle.putString("Key", param);
//        blankFragment.setArguments(bundle);
//        // 在添加新的Fragment之前需要先隐藏前一个Fragment，否则会造成前后层叠
//        if (fragmentManager.findFragmentByTag(String.valueOf(tag - 2)) != null) {
//            fragmentTransaction.hide(fragmentManager.findFragmentByTag(String.valueOf(tag - 2)));
//        }
//        fragmentTransaction.add(R.id.fragment_content, blankFragment, param);
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
//    }
//
//    public void removeFragment(View view) {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        fragmentManager.popBackStack();
//        tag--;
//    }
//
//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        tag--;
//    }
//
//    public void sendMessPerson() {
//        SmsManager smsManager = SmsManager.getDefault();
//        String content = "Hello World!";
//        ArrayList<String> list = smsManager.divideMessage(content);
//        for (int i = 0; i < list.size(); i++) {
//            smsManager.sendTextMessage("15500948440", null, list.get(i), null, null);
//        }
////        Uri uri = Uri.parse("smsto:15500948440");
////        Intent it = new Intent(Intent.ACTION_SENDTO, uri);
////        it.putExtra("sms_body", "The SMS text");
////        startActivity(it);
////        String body="this is sms demo";
////        Intent mmsintent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("smsto", "15500948440", null));
////        mmsintent.putExtra(Messaging.KEY_ACTION_SENDTO_MESSAGE_BODY, body);
////        mmsintent.putExtra(Messaging.KEY_ACTION_SENDTO_COMPOSE_MODE, true);
////        mmsintent.putExtra(Messaging.KEY_ACTION_SENDTO_EXIT_ON_SENT, true);
////        startActivity(mmsintent);
//    }
//}