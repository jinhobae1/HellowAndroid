package kr.or.dgit.it.hellowandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.subactivity);
        TextView tv = new TextView(SubActivity.this);
        tv.setText(R.string.subactivity);
        setContentView(tv);

    }
}