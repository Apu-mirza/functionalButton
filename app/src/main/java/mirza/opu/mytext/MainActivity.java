package mirza.opu.mytext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button helloJu = findViewById(R.id.juText);
        Button helloIit = findViewById(R.id.iitText);
        TextView showText = findViewById(R.id.showText);

        helloJu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showText.setVisibility(View.VISIBLE);
                showText.setText("Hello Jahangirnagar University");
            }
        });
        helloIit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showText.setVisibility(View.VISIBLE);
                showText.setText("Hello IIT");
            }
        });

    }
}