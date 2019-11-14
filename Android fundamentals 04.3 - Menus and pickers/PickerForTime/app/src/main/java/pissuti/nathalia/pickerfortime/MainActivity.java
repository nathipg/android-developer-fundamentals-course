package pissuti.nathalia.pickerfortime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showTimePicker(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(),getString(R.string.time_picker));
    }

    public void processTimePickerResult(int hour, int minute) {
        Toast.makeText(this, getString(R.string.time_picker) + ": " + Integer.toString(hour) + ":" + Integer.toString(minute), Toast.LENGTH_SHORT).show();
    }
}
