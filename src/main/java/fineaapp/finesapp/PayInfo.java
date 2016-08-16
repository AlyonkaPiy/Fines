package fineaapp.finesapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class PayInfo extends Activity implements View.OnClickListener{


    EditText number_p;
    EditText name;
    EditText email;
    EditText money;
    Button buttonPay;
    TextView tView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payinfo);


        number_p = (EditText) findViewById(R.id.number_p);
        name =(EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        money = (EditText) findViewById(R.id.money);
        tView = (TextView) findViewById(R.id.tView);

        buttonPay = (Button) findViewById(R.id.buttonPay);
        buttonPay.setOnClickListener((View.OnClickListener) this);


        Intent intent = getIntent();

        String number_p = intent.getStringExtra("number_p");
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String money = intent.getStringExtra("money");

        tView.setText("*;21081300; " + number_p + ";*" + name);


    }



    @Override
    public void onClick(View view) {

        Intent intent = new Intent(PayInfo.this, Thanks.class);
        startActivity(intent);
    }
}