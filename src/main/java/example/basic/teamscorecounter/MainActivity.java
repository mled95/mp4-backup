package example.basic.teamscorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    private EditText display1;
    private EditText display2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display1 = findViewById(R.id.input);
        display1.setShowSoftInputOnFocus(false);
        display2 = findViewById(R.id.input2);
        display2.setShowSoftInputOnFocus(false);





    }

    private void updateText1(){



    }

    private void updateText2(){


    }

    public void button1(View view) {

        String score1 = display1.getText().toString();

        int i = Integer.parseInt(score1);

        i++;

        String a = new Integer(i).toString();

        //Bundle bundle = new Bundle();
        //bundle.putString("Team1", a);

        //Intent intent = new Intent(this, WinnerActivity.class);
        //intent.putExtras(bundle);
        if (i < 5) {
            display1.setText("0"+a);
        }
        else {

            display1.setText(a);

            String score2 = display2.getText().toString();

            Bundle bundle = new Bundle();

            Intent intent = new Intent(this, WinnerActivity.class);
            bundle.putString("Team1", score1);
            bundle.putString("Team2", score2);
            intent.putExtras(bundle);

            startActivity(intent);

        }

    }

    public void button2(View view){
        String score2= display2.getText().toString();

        int i = Integer.parseInt(score2);

        i++;

        String b = new Integer(i).toString();

        if (i < 5) {
            display2.setText("0"+b);
        }
        else {

            display2.setText(b);



            String score1 = display1.getText().toString();

            Bundle bundle = new Bundle();

            Intent intent = new Intent(this, WinnerActivity.class);
            bundle.putString("Team1", score1);
            bundle.putString("Team2", score2);
            intent.putExtras(bundle);
          startActivity(intent);
        }



    }
}