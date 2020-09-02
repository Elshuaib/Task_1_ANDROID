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
        int numberOfCoffees = 2;
        display(numberOfCoffees);
        displayPrice(numberOfCoffees * 5);
    }

    /**
     * This method will increase the quantity of coffee ordered.
     */
    public void increment(View view){
        int quantity = 2;
        quantity = quantity + 1;
        display(quantity);
    }

    /**
     * This method decreases the quantity of coffee ordered.
     */
    public void decrement(View view){
        int quantity = 2;
        quantity = quantity - 1;
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

}