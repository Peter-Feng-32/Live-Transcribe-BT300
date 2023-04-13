package com.google.audio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ViewSetter extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private String textPosition = "Top Right";
    private double width = 100;
    private double height = 25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_setter);

        Spinner posSpinner = (Spinner) findViewById(R.id.pos_spinner); //Dropdown position list
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.text_positions, android.R.layout.simple_spinner_item); //creates the array
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        posSpinner.setAdapter(adapter); //assigns the adapter to posSpinner

        // Store text position that the user entered
        posSpinner.setOnItemSelectedListener(this);


        // Continue to main page
        Button contButton = (Button) findViewById(R.id.contButton);
        contButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toMainActivity = new Intent(ViewSetter.this, MainActivity.class);
                toMainActivity.putExtra("textPosition", textPosition);
                startActivity(toMainActivity);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        textPosition = (String) parent.getItemAtPosition(pos);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        textPosition = "Top Right";
    }
}
