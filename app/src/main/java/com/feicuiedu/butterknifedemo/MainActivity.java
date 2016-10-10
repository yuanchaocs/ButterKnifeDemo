package com.feicuiedu.butterknifedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView) TextView mTextView;
    @BindString(R.string.app_name)String appName;
    @BindColor(R.color.colorPrimary)int colorPrimary;

    private Unbinder mUnbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUnbinder = ButterKnife.bind(this);
    }

    @Override protected void onDestroy() {
        super.onDestroy();
        mUnbinder.unbind();

    }

    public boolean isOpen(){
        return true;
    }

    @OnClick({R.id.button,R.id.button2})
    public void click(Button button){
        switch (button.getId()){
            case R.id.button:
                Toast.makeText(this,"click1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this,"click2",Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this,"无效操作",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}