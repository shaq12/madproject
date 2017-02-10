package com.example.whitelegg_n.osmdroid1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by whitelegg_n on 09/02/2017.
 */
public class MapChooseActivity extends Activity implements View.OnClickListener
{
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mca);

        Button regular = (Button)findViewById(R.id.btnRegular);
        regular.setOnClickListener(this);
        Button cyclemap = (Button)findViewById(R.id.btnCyclemap);
        cyclemap.setOnClickListener(this);
    }

    // onClick() runs when the buttons have been pressed
    public void onClick(View view)
    {
        // Set the cyclemap boolean variable to false by default.
        boolean cyclemap = false;

        // Get the ID of the button that was pressed. If it's the ID for the cyclemap
        // button, set the cyclemap boolean to true.
        if(view.getId() == R.id.btnCyclemap)
        {
            cyclemap = true;
        }

        // Create an Intent to send information back to the main activity.
        Intent intent = new Intent();

        // Create a Bundle to store data to be sent back.
        Bundle bundle = new Bundle();

        // Add the boolean to the Bundle.
        bundle.putBoolean("com.example.cyclemap", cyclemap);

        // Add the Bundle to the Intent.
        intent.putExtras(bundle);

        // Set an OK result, meaning that everything was successful.
        setResult(RESULT_OK, intent);

        // Close the second activity (this will return to the first)
        finish();
    }
}
