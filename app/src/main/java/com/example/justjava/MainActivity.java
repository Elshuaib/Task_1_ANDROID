package com.example.justjava;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

import androidx.appcompat.app.AppCompatActivity;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 0;
    int price = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view)
    {
        String priceMessage = "$" + (quantity * price);
        displayMessage(priceMessage);
    }

    /**
     * This method will increase the quantity of coffee ordered.
     */
    public void increment(View view){
        quantity++;
        display(quantity);
    }

    /**
     * This method decreases the quantity of coffee ordered.
     */
    public void decrement(View view){
        quantity--;
        if(quantity<0){
            quantity=0;
        }
        display(quantity);
        }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    /**
     * This method resets the number of quantity
     */
    public void resetQuantity(View view) {
        quantity = 0;
        display(quantity);
    }

}