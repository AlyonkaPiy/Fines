package fineaapp.finesapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener{

    EditText number_p;
    EditText money;
    EditText name;
    EditText email;
    Button buttonHelp;
    Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);

        number_p = (EditText) findViewById(R.id.number_p);
        money = (EditText) findViewById(R.id.money);
        name =(EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);

        buttonHelp = (Button) findViewById(R.id.buttonHelp);
        buttonHelp.setOnClickListener((View.OnClickListener) this);
        buttonNext =(Button) findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener((View.OnClickListener) this);

    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, PaiInfo.class);
        startActivityForResult(intent, 1);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (data == null) {return;}
        String name = data.getStringExtra("name");
        name.setText();
    }
}
