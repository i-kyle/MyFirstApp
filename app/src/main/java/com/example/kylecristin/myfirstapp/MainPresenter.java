package com.example.kylecristin.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainPresenter {


    public void toastMe(Activity activity) {
        // Toast myToast = Toast.makeText(this, message, duration);
        Toast myToast = Toast.makeText(activity, "Hello Toast!",
                Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void countMe(View view) {
        // Get the text view.
        TextView showCountTextView = (TextView)
                view.findViewById(R.id.textView);

        // Get the value of the text view.
        String countString = showCountTextView.getText().toString();

        // Convert value to a number and increment it.
        Integer count = Integer.parseInt(countString);
        count++;

        // Display the new value in the text view.
        showCountTextView.setText(count.toString());
    }

    private static final String TOTAL_COUNT = "total_count";

    public void randomMe(Activity view) {

        // Create an Intent to start the second activity
        Intent randomIntent = new Intent(this, SecondActivity.class);

        // Get the text view that shows the count
        TextView showCountTextView = (TextView) view.findViewById(R.id.textView);

        // Get the value of the text view.
        String countString = showCountTextView.getText().toString();

        // Convert the count to an int
        int count = Integer.parseInt(countString);

        // Add the count to the extras for the Intent.
        randomIntent.putExtra(TOTAL_COUNT, count);

        // Start the new activity.
        view.startActivity(randomIntent);
    }

}
