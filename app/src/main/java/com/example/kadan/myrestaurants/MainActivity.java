package com.example.kadan.myrestaurants;


import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
//    private Button mFindRestaurantsButton;
//    private EditText mLocationEditText;
//    private TextView mAppNameTextView;

    @BindView(R.id.findRestaurantsButton) Button mFindRestaurantsButton;
    @BindView(R.id.locationEditText) EditText mLocationEditText;
    @BindView(R.id.appNameTextView) TextView mAppNameTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mAppNameTextView = (TextView) findViewById(R.id.appNameTextView);
//        mFindRestaurantsButton = (Button) findViewById(R.id.findRestaurantsButton);
//        mLocationEditText = (EditText) findViewById(R.id.locationEditText);
        //Using ButterKnife instead of the above
        ButterKnife.bind(this);

        Typeface ostrichFont = Typeface.createFromAsset(getAssets(), "fonts/Capture_it_2.ttf");
        mAppNameTextView.setTypeface(ostrichFont);

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



