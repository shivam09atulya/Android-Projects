package shivamatulya.Scrollapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        textView=findViewById(R.id.textView2);
        String name;
        name = intent.getStringExtra(MainActivity.EXTRA_NAME);
        textView.setText("Your name is :"+name);
    }
}