package com.example.coffeeshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int number = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayNumberOfCups(1);
    }


    public void displayNumberOfCups(int number) {
        TextView textView = (TextView) findViewById(R.id.number_of_cups);
        textView.setText("" + number);
    }

    public void increment(View view) {
        number = number + 1;
        displayNumberOfCups(number);
    }

    public void decrement(View view) {
        //**why while does not work?**
        if (number > 1) {
            number = number - 1;
            displayNumberOfCups(number);
        }
    }

    /**
     * order button shows final price
     */
    public void submitOrder() {
        int price = calculatePrice();
        String priceMessage = "total is " + price + "\n Thank you";
        displayPrice(priceMessage);

    }

    /**
     * calculated the total price
     *
     * @return total price
     */
    public int calculatePrice() {
        int price = number * 5;
        //String totalPrice = "the price would be\n " + number * 5 + " CAD";
        //totalPrice= number*5;
        return price;
    }

    /**
     * displays a string in textView
     * @param price
     */
    public void displayPrice(String price) {
        TextView textView = (TextView) findViewById(R.id.totalPrice);
        textView.setText("" + price);
    }
}