package pissuti.nathalia.shoppinglistchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ShoppingItemsActivity extends AppCompatActivity {

    public static final String EXTRA_ITEM_ADDED = "pissuti.nathalia.shoppinglistchallenge.extra.ITEM_ADDED";
    public static final String LOG_TAG = ShoppingItemsActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_items);
    }

    public void addItem(View view) {
        Button buttonItemAdded = findViewById(view.getId());

        Intent intent = new Intent();
        intent.putExtra(EXTRA_ITEM_ADDED, buttonItemAdded.getText());

        setResult(RESULT_OK, intent);

        finish();
    }
}
