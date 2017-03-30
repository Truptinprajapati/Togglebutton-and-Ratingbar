package com.example.trupti.togglebuttonandratingabar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ToggleButton tb=(ToggleButton)findViewById(R.id.tg);
        final RatingBar rb=(RatingBar)findViewById(R.id.rb);
        final TextView tv=(TextView)findViewById(R.id.tv);


        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String a=tb.getText().toString();
                if (a.equals("ON"))
                {

                    rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                        @Override
                        public void onRatingChanged(RatingBar ratingBar, float arg1, boolean b) {
                            tv.setText("Rating is: "+arg1);
                            Toast.makeText(getApplicationContext(),"Rating is:-"+arg1,Toast.LENGTH_SHORT).show();


                        }
                    });
                    if (a.equals("OFF"))
                    {

                        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                            @Override
                            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                                tv.setText("Trupti Mokai");
                                Toast.makeText(getApplicationContext(),"Button OFF",Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                }
            }
        });

    }
}
