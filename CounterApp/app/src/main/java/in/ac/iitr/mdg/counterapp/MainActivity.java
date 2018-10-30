package in.ac.iitr.mdg.counterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declarations
    Button increment, decrement; // btn objects
    TextView textView; // textView objects for displaying the current val of counter
    int counter = 0; //global variable for counting

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initiations
        increment = findViewById(R.id.increment_btn);
        decrement = findViewById(R.id.decrement_btn);
        textView = findViewById(R.id.textView);

        //methods
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter--; //counter = counter - 1;
                textView.setText(String.valueOf(counter)); //type casts to String // you can also use Integer.toString(counter)
            }
        });

        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++; //counter = counter + 1;
                textView.setText(String.valueOf(counter)); //type casts to String // you can also use Integer.toString(counter)
            }
        });
    }
}
