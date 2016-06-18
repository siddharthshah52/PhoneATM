package com.hackathon.shasiddh.phoneatm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;

public class PaymentRequestDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_request_display);
        Button agree = (Button) findViewById(R.id.agree);
        Button dismiss = (Button) findViewById(R.id.dismiss);
        agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //send notification to the other user
            }
        });
        dismiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PaymentRequestDisplayActivity.this.finish();
                System.exit(0);
            }
        });
    }
}
