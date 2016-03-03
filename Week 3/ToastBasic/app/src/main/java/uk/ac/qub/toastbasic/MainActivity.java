package uk.ac.qub.toastbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;
import android.view.Gravity;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.mainButton);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstname = (EditText) findViewById(R.id.firstNameEditText);
                EditText surname = (EditText) findViewById(R.id.SurnameEditText);

                String output = firstname.getText() + " " + surname.getText();

                Toast.makeText(getApplicationContext(), output, Toast.LENGTH_SHORT).show();
            }
        });
    }




        // Exercise 3 code for event handler
//        button.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                // Get layout from Toast.xml
//                LayoutInflater inflater = getLayoutInflater();
//
//                View layout = inflater.inflate(R.layout.toast, (ViewGroup) findViewById(R.id.toast_layout_id));
//
//                // Set message
//
//                TextView text = (TextView) layout.findViewById(R.id.text1);
//                text.setText("This is a Custom Toast Message");
//
//
//                // Toast Config
//
//                Toast toast = new Toast(getApplicationContext());
//                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
//                toast.setDuration(Toast.LENGTH_LONG);
//                toast.setView(layout);
//                toast.show();
//
//            }
//        });
//
//        // Exercise 2 code for event handler
//
//        // code for first activity
//        //Toast.makeText(getApplicationContext(), "This is an Android Toast Message", Toast.LENGTH_LONG).show();
//
//
//
//        // Exercise 1 code for toast no prompt
//
//
//        Context context = getApplicationContext();
//        CharSequence message = "I like butter and jam on my toast";
//        int duration = Toast.LENGTH_SHORT;
//
//        Toast toastBasic = Toast.makeText(context,message,duration);
//
//        int moveToastDown = 150;
//        int moveToastRight = 150;
//        Toast toastTop = Toast.makeText(context, message, duration);
//
//        toastTop.setGravity(Gravity.TOP | Gravity.LEFT, moveToastDown, moveToastRight);
//        toastBasic.show();
//        toastTop.show();

}
