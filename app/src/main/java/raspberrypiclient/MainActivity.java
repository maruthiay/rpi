package raspberrypiclient;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import linium.ledcontrol.R;

public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /********************************/
         /*    Define all the buttons    */
        /********************************/
        final EditText username1 = (EditText) findViewById(R.id.username);
        final EditText password1 = (EditText) findViewById(R.id.password);
        final Button button1 = (Button) findViewById(R.id.button);

        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username1.getText().toString().equals("linium") && password1.getText().toString().equals("linium")) {
                    Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, ActivityLED.class);
                        startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
