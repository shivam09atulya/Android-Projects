package shivamatulya.multiscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.Image;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class SpeechRec extends AppCompatActivity {

    ImageButton imageButton;
    TextView textView;
    int count=0;

    SpeechRecognizer speechRecognizer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.RECORD_AUDIO}, 1);
        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if(requestCode==1)
        {
            if(grantResults[0]==PackageManager.PERMISSION_GRANTED)
            {
                Toast.makeText(this,"Permission Granted",Toast.LENGTH_SHORT).show();
            }
            else
            {

                Toast.makeText(this,"Permission Denied",Toast.LENGTH_SHORT).show();
            }
            speechRecognizer=SpeechRecognizer.createSpeechRecognizer(this);

            final Intent speechRecognizer=new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(count==0)
                    {
                        imageButton.setImageDrawable(getDrawable(R.drawable.ic_baseline_mic_off_24));
                        //Listening
                        
                        count=1;

                    }
                    else
                    {
                        imageButton.setImageDrawable(getDrawable(R.drawable.ic_baseline_mic_24));
                        //Stop listening
                        count=0;
                    }
                }
            });
        }
    }
}


