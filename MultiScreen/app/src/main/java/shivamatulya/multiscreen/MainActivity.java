package shivamatulya.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

        public void show1(View view)
        {
            Toast.makeText(this,"Speech Recognition is opening...",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,SpeechRec.class);
            startActivity(intent);
        }

        public void show2(View view)
        {
            Toast.makeText(this,"KeyBoard is opening...",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,keyboard.class);
            startActivity(intent);
        }

}