package pissuti.nathalia.shoppinglistchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final int REQUEST_CODE = 1;

    TextView cartItemsTitle;
    TextView cartItem1;
    TextView cartItem2;
    TextView cartItem3;
    TextView cartItem4;
    TextView cartItem5;
    TextView cartItem6;
    TextView cartItem7;
    TextView cartItem8;
    TextView cartItem9;
    TextView cartItem10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cartItemsTitle = findViewById(R.id.cart_items_title);
        cartItem1 = findViewById(R.id.cart_item_1);
        cartItem2 = findViewById(R.id.cart_item_2);
        cartItem3 = findViewById(R.id.cart_item_3);
        cartItem4 = findViewById(R.id.cart_item_4);
        cartItem5 = findViewById(R.id.cart_item_5);
        cartItem6 = findViewById(R.id.cart_item_6);
        cartItem7 = findViewById(R.id.cart_item_7);
        cartItem8 = findViewById(R.id.cart_item_8);
        cartItem9 = findViewById(R.id.cart_item_9);
        cartItem10 = findViewById(R.id.cart_item_10);

        boolean cartItemsVisible = false;
        if (savedInstanceState != null) {
            cartItemsVisible = savedInstanceState.getBoolean("cart_items_title_visible");
        }

        if(cartItemsVisible) {
            cartItemsTitle.setVisibility(View.VISIBLE);
            cartItem1.setText(savedInstanceState.getString("cart_item_1"));
            cartItem2.setText(savedInstanceState.getString("cart_item_2"));
            cartItem3.setText(savedInstanceState.getString("cart_item_3"));
            cartItem4.setText(savedInstanceState.getString("cart_item_4"));
            cartItem5.setText(savedInstanceState.getString("cart_item_5"));
            cartItem6.setText(savedInstanceState.getString("cart_item_6"));
            cartItem7.setText(savedInstanceState.getString("cart_item_7"));
            cartItem8.setText(savedInstanceState.getString("cart_item_8"));
            cartItem9.setText(savedInstanceState.getString("cart_item_9"));
            cartItem10.setText(savedInstanceState.getString("cart_item_10"));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        if (cartItemsTitle.getVisibility() == View.VISIBLE) {
            outState.putBoolean("cart_items_title_visible", true);
            outState.putString("cart_item_1", cartItem1.getText().toString());
            outState.putString("cart_item_2", cartItem2.getText().toString());
            outState.putString("cart_item_3", cartItem3.getText().toString());
            outState.putString("cart_item_4", cartItem4.getText().toString());
            outState.putString("cart_item_5", cartItem5.getText().toString());
            outState.putString("cart_item_6", cartItem6.getText().toString());
            outState.putString("cart_item_7", cartItem7.getText().toString());
            outState.putString("cart_item_8", cartItem8.getText().toString());
            outState.putString("cart_item_9", cartItem9.getText().toString());
            outState.putString("cart_item_10", cartItem10.getText().toString());
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Log.d(LOG_TAG, "onActivityResult");

        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                String itemAdded = data.getStringExtra(ShoppingItemsActivity.EXTRA_ITEM_ADDED);

                cartItemsTitle.setVisibility(View.VISIBLE);

                if(cartItem1.getText().toString().isEmpty()) {
                    cartItem1.setText(itemAdded);
                } else if(cartItem2.getText().toString().isEmpty()) {
                    cartItem2.setText(itemAdded);
                } else if(cartItem3.getText().toString().isEmpty()) {
                    cartItem3.setText(itemAdded);
                } else if(cartItem4.getText().toString().isEmpty()) {
                    cartItem4.setText(itemAdded);
                } else if(cartItem5.getText().toString().isEmpty()) {
                    cartItem5.setText(itemAdded);
                } else if(cartItem6.getText().toString().isEmpty()) {
                    cartItem6.setText(itemAdded);
                } else if(cartItem7.getText().toString().isEmpty()) {
                    cartItem7.setText(itemAdded);
                } else if(cartItem8.getText().toString().isEmpty()) {
                    cartItem8.setText(itemAdded);
                } else if(cartItem9.getText().toString().isEmpty()) {
                    cartItem9.setText(itemAdded);
                } else if(cartItem10.getText().toString().isEmpty()) {
                    cartItem10.setText(itemAdded);
                } else {
                    Toast toast = Toast.makeText(this, "Cart is full", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        }
    }

    public void callShoppingItems(View view) {
        Intent intent = new Intent(this, ShoppingItemsActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
    }

}
