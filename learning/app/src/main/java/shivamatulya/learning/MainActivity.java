package shivamatulya.learning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button5);
        editText=findViewById(R.id.editTextNumber);
        textView=findViewById(R.id.textenter);
        button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "Finally working", Toast.LENGTH_SHORT).show();
               String s=editText.toString();
               int kg=Integer.parseInt(s);
               double pound = kg*2.205;
               textView.setText("The corresponding pound is "+pound );
           }
       });
    }


}