package edu.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Ankit on 18/10/16.
 */
public class HomeActivity extends AppCompatActivity {
   private TextView txtView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtView = (TextView) findViewById(R.id.txtView);
        Intent intent = new Intent();
        String user = intent.getStringExtra("username");
        String pass = intent.getStringExtra("password");
        txtView.setText(user+" and "+pass);
    }
}
