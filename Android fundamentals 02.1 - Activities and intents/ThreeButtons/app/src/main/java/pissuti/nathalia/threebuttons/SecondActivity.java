package pissuti.nathalia.threebuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String phrase = intent.getStringExtra(MainActivity.EXTRA_PHRASE);

        TextView textViewPhrase = findViewById(R.id.phrase);
        textViewPhrase.setText(phrase);
    }
}
