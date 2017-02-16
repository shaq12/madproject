package com.example.whitelegg_n.osmdroid1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by 1sters06 on 16/02/2017.
 */
public class SetLocation extends Activity implements View.OnClickListener
{
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setlocation);

        Button ok = (Button)findViewById(R.id.btnOk);
        ok.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

    EditText latitudeEditText = (EditText) findViewById(R.id.latitudeEditText);
    double latitude = Double.parseDouble(latitudeEditText.getText().toString());

    EditText longitudeEditText = (EditText) findViewById(R.id.longitudeEditText);
    double longitude = Double.parseDouble(longitudeEditText.getText().toString());


        Bundle latlongBundle = new Bundle();
        latlongBundle.putDouble("whitelegg_n", latitude);
        latlongBundle.putDouble("whitelegg_n",longitude);

     Intent intent = new Intent();
     intent.putExtras(latlongBundle);
     setResult(RESULT_OK, intent);
     finish();
    }
}


