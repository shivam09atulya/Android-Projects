package shivamatulya.Scrollapp;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button ;
    public static final String EXTRA_NAME="shivamatulya.Scrollapp.extra.NAME";
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
    }
         public void openActivity(View view)
         {
//             Toast.makeText(this, "Logged in", Toast.LENGTH_SHORT).show();
             name=findViewById(R.id.editText);
//             Toast.makeText(this,""+name,Toast.LENGTH_LONG).show();
             String nameText=name.getText().toString();
             Intent intent=new Intent(this,MainActivity2.class);
             intent.putExtra(EXTRA_NAME,nameText);
             startActivity(intent);


         }
    }




