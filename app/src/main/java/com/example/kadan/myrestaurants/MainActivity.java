package com.example.kadan.myrestaurants;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mFindRestaurantsButton;
    private EditText mLocationEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFindRestaurantsButton = (Button) findViewById(R.id.findRestaurantsButton);
        mLocationEditText = (EditText) findViewById(R.id.locationEditText);

        mFindRestaurantsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Hello World!", Toast.LENGTH_LONG).show();
                String location = mLocationEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, TryActivity.class);
                intent.putExtra("location", location);
                startActivity(intent);
            }
        });
    }
}
