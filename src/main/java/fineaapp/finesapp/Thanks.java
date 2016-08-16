package fineaapp.finesapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Alenka on 14.08.2016.
 */
public class Thanks extends AppCompatActivity implements View.OnClickListener{

    Button buttonThanks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thanklayout);

        buttonThanks = (Button) findViewById(R.id.buttonThanks);
        buttonThanks.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view) {
        //Intent intent = new Intent(Thanks.this, Thanks.class);
        //startActivity(intent);
    }
}
