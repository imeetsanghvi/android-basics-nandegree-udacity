package com.example.justjava;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int coffeeCount = 1;
    float totalPrice;

    String customer_name;

    boolean add_whippped_cream, add_chocolate;

    Button bta, bts, bto;
    TextView quantityTextView, priceTextView;
    CheckBox whipped_cream, chocolate;
    EditText customerNameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        initialize();
        CalculatePrice();
        display();

    }


    private void initialize() {

        bta = (Button) findViewById(R.id.add_drink);
        bts = (Button) findViewById(R.id.subtract_drink);

        bto = (Button) findViewById(R.id.order_button);

        bta.setEnabled(true);
        bts.setEnabled(true);

        quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        priceTextView = (TextView) findViewById(R.id.Price_text_view);

        whipped_cream = (CheckBox) findViewById(R.id.checkbox_whipped_cream);
        chocolate = (CheckBox) findViewById(R.id.checkbox_chocolate);

        customerNameText = (EditText) findViewById(R.id.customer_name);
    }



    private void CalculatePrice(){
        totalPrice = coffeeCount * 5;
    }

    private void display() {
        quantityTextView.setText(String.valueOf(coffeeCount));
        priceTextView.setText("Total $ ".concat(String.valueOf(totalPrice)));
        priceTextView.setTextColor(getColor(R.color.black));

    }

    private void getCheckBox_and_customerName (){
        add_whippped_cream = whipped_cream.isChecked();
        add_chocolate = chocolate.isChecked();
        customer_name = customerNameText.getText().toString();
    }

    public void submitOrder(View view) {
        getCheckBox_and_customerName();
        if (customer_name.equals("")) {
            priceTextView.setText("Enter User Name");
            priceTextView.setTextColor(Color.rgb(255,0,0));
        }
        else {
            String orderSummary = "Name = " + customer_name +
                    "\nAdd Whipped Cream? " + add_whippped_cream +
                    "\nAdd CHocolate? " + add_chocolate +
                    "\nQuantity = " + coffeeCount +
                    "\nPrice = $" + totalPrice +
                    "\nThank You" ;
//        displayOrderSummary(orderSummary);
            sendEmail(orderSummary);
        }
    }

    private void sendEmail(String orderSummary) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);

        emailIntent.setData(Uri.parse("mailto:")); // only email apps should handle this
//        emailIntent.setType("*/*");
        emailIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{ "meetsanghvi98@gmail.com"});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Coffe Order");
        emailIntent.putExtra(Intent.EXTRA_TEXT, orderSummary);
        startActivity(emailIntent);
//        if (emailIntent.resolveActivity(getPackageManager()) != null) {
//            startActivity(emailIntent);
//        }else {
//            priceTextView.setText("Email app not there");
//        }


    }


    public void addDrinkToOrder(View view) {
        if (coffeeCount > 9){
            coffeeCount = 10;
        }
        else {
            coffeeCount++;

        }
        CalculatePrice();
        display();
    }

    public void subtractDrinkFromOrder(View view) {
        if (coffeeCount < 2 ){
            coffeeCount = 1;
        }
        else{coffeeCount--;}
        CalculatePrice();
        display();
    }

}