package kr.or.dgit.it.hellowandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mBtnClick(View view) {

        Toast.makeText(this,"버튼을 클릭하였습니다.하드코딩",Toast.LENGTH_LONG).show();
        Toast.makeText(this,R.string.btnClickMsg,Toast.LENGTH_LONG).show();


        startActivity(new Intent(getApplicationContext(),SubActivity.class));

    }
}
