package com.udacity.project.testyoursoil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Select the test options to be displayed.
     * @param view the calling view
     */
    public void selectOptions(View view) {
        boolean lookOptionSelected = findViewById(R.id.look_option).isSelected();
        boolean feelOptionSelected = findViewById(R.id.feel_option).isSelected();
        boolean separateOptionSelected = findViewById(R.id.separate_option).isSelected();
        boolean digOptionSelected = findViewById(R.id.dig_option).isSelected();
        boolean floodOptionSelected = findViewById(R.id.flood_option).isSelected();

        displayOptions(lookOptionSelected, feelOptionSelected, separateOptionSelected,
                       digOptionSelected, floodOptionSelected);
    }

    /**
     * Display the user selected options.
     * @param lookOpt will be true if the look test option has been selected
     * @param feelOpt will be true if the feel test option has been selected
     * @param separateOpt will be true if the separate test option has been selected
     * @param digOpt will be true if the dig test option has been selected
     * @param floodOpt will be true if the flood test option has been selected
     */
    private void displayOptions(boolean lookOpt, boolean feelOpt, boolean separateOpt,
                                boolean digOpt, boolean floodOpt) {

        // If the option booleans are true, display the associated image and text.
        if (!lookOpt) {
            Log.println(Log.VERBOSE, "MainActivity", "displayLookOption()");
            displayLookOption();
        }
        if (feelOpt) {
            displayFeelOption();
        }
        if (separateOpt) {
            displaySeparateOption();
        }
        if (digOpt) {
            displayDigOption();
        }
        if (floodOpt) {
            displayFloodOption();
        }
    }

    /**
     * Display the look test image and text.
     */
    private void displayLookOption() {
        TextView lookOptTextView = (TextView) findViewById(R.id.look_option_instructions);
        lookOptTextView.setText(R.string.look_test_instructions);
    }

    /**
     * Display the feel test image and text.
     */
    private void displayFeelOption() {
        TextView feelOptTextView = (TextView) findViewById(R.id.feel_option_instructions);
        feelOptTextView.setText(R.string.feel_test_instructions);
    }

    /**
     * Display the separate test image and text.
     */
    private void displaySeparateOption() {
        TextView sepOptTextView = (TextView) findViewById(R.id.separate_option_instructions);
        sepOptTextView.setText(R.string.separate_test_instructions);
    }

    /**
     * Display the dig test image and text.
     */
    private void displayDigOption() {
        TextView digOptTextView = (TextView) findViewById(R.id.dig_option_instructions);
        digOptTextView.setText(R.string.dig_test_instructions);
    }

    /**
     * Display the flood test image and text.
     */
    private void displayFloodOption() {
        TextView floodOptTextView = (TextView) findViewById(R.id.flood_option_instructions);
        floodOptTextView.setText(R.string.flood_test_instructions);
    }
}
