package pissuti.nathalia.threebuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_PHRASE = "pissuti.nathalia.threebuttons.extra.PHRASE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showText(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        switch(view.getId()) {
            case R.id.button_1:
                intent.putExtra(EXTRA_PHRASE, "Frase 1");
                break;
            case R.id.button_2:
                intent.putExtra(EXTRA_PHRASE, "Frase 2");
                break;
            case R.id.button_3:
                intent.putExtra(EXTRA_PHRASE, "Frase 3");
                break;
        }

        startActivity(intent);
    }
}
