package sg.edu.rp.c346.id19023702.demospinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Spinner spnYesNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textView);
        spnYesNo = findViewById(R.id.spinner);

        spnYesNo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        tvDisplay.setText("Spinner Item, Yes Selected");
                        break;
                    case 1:
                        tvDisplay.setText("Spinner Item, No Selected");
                        break;
                }
            }

            public void onNothingselected(AdapterView<?> parent) {}
        });

    }
}

