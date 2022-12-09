package example.basic.teamscorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class WinnerActivity extends AppCompatActivity {

    private EditText display3;
    private TextView display4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);
       display3 = findViewById(R.id.winner_text);
        display3.setShowSoftInputOnFocus(false);
        display4 = findViewById(R.id.textView2);
        Bundle bundle = getIntent().getExtras();
        String t1 = bundle.getString("Team1");
        String t2 = bundle.getString("Team2");

        //display3.setText(t1);
        //display4.setText(t2);

        int i = Integer.parseInt(t1);
        int j = Integer.parseInt(t2);

        String mssg1;

        if (i > j) {
            int k;
            k = i - j +1;
            display3.setText("team 1 wins!");
            display4.setText("Team 1 won by "+k+" points");

            mssg1 = "Team 1 won by "+k+" points";
        }
        else {
            int k;
            k = j - i +1;
            display3.setText("team 2 wins!");
            display4.setText("Team 2 won by "+k+" points");


            mssg1 = "Team 2 won by "+k+" points";
        }



        }

    public void callScore(View view){

        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+3475809622"));
        startActivity(i);
        }

    public void messageScore(View view){

        String sms = display4.getText().toString();

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", "3475809622", null));
        intent.putExtra("sms_body", sms);
        startActivity(intent);

    }

    public void mapScore(View view){
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=gaming cafe");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);


    }


    }


