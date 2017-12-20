package demo.gesturepsd.gesturepsd_android;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button mBtnSetLock;
    private Button mBtnVerifyLock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpView();
        setUpListener();
    }

    private void setUpView() {
        mBtnSetLock = (Button) findViewById(R.id.btn_set_lockpattern);
        mBtnVerifyLock = (Button) findViewById(R.id.btn_verify_lockpattern);
    }

    private void setUpListener() {
        mBtnSetLock.setOnClickListener(this);
        mBtnVerifyLock.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_set_lockpattern:
                startSetLockPattern();
                break;
            case R.id.btn_verify_lockpattern:
                startVerifyLockPattern();
                break;
            default:
                break;
        }
    }

    private void startSetLockPattern() {
        Intent intent = new Intent(MainActivity.this, GestureEditActivity.class);
        startActivity(intent);
    }

    private void startVerifyLockPattern() {
        Intent intent = new Intent(MainActivity.this, GestureVerifyActivity.class);
        startActivity(intent);
    }
}
