package com.udacity.project.testyoursoil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = "MainActivity: ";

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

        // Variables to maintain the state of the option checkboxes.
        boolean lookOptionSelected;
        boolean feelOptionSelected;
        boolean separateOptionSelected;
        boolean digOptionSelected;
        boolean floodOptionSelected;

        // Get state of option checkboxes and set variables. Also ensure that the checkboxes are
        // defined to prevent null pointer exception.
        CheckBox lookCheckBox = (CheckBox) findViewById(R.id.look_option);
        if (lookCheckBox != null) {
            lookOptionSelected = lookCheckBox.isChecked();
        } else {
            lookOptionSelected = false;
            Log.println(Log.ERROR, LOG_TAG, "lookCheckBox not defined");
        }
        CheckBox feelCheckBox = (CheckBox) findViewById(R.id.feel_option);
        if (feelCheckBox != null) {
            feelOptionSelected = feelCheckBox.isChecked();
        } else {
            feelOptionSelected = false;
            Log.println(Log.ERROR, LOG_TAG, "feelCheckBox not defined");
        }
        CheckBox separateCheckBox = (CheckBox) findViewById(R.id.separate_option);
        if (separateCheckBox != null) {
            separateOptionSelected = separateCheckBox.isChecked();
        } else {
            separateOptionSelected = false;
            Log.println(Log.ERROR, LOG_TAG, "separateCheckBox not defined");
        }
        CheckBox digCheckBox = (CheckBox) findViewById(R.id.dig_option);
        if (digCheckBox != null) {
            digOptionSelected = digCheckBox.isChecked();
        } else {
            digOptionSelected = false;
            Log.println(Log.ERROR, LOG_TAG, "digCheckBox not defined");
        }
        CheckBox floodCheckBox = (CheckBox) findViewById(R.id.flood_option);
        if (floodCheckBox != null) {
            floodOptionSelected = floodCheckBox.isChecked();
        } else {
            floodOptionSelected = false;
            Log.println(Log.ERROR, LOG_TAG, "floodCheckBox not defined");
        }

        // Display the images and text associated with the selected options.
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

        // Call the individual display methods.
        displayLookTest(lookOpt);
        displayFeelTest(feelOpt);
        displaySeparateTest(separateOpt);
        displayDigTest(digOpt);
        displayFloodTest(floodOpt);
    }

    /**
     * Display the look test image and text.
     * @param lookOpt is true if the look test option has been selected
     */
    private void displayLookTest(boolean lookOpt) {

        // Get references to the views for the look test option.
        ImageView lookOptImageView = (ImageView) findViewById(R.id.look_option_image);
        TextView lookOptTextView = (TextView) findViewById(R.id.look_option_instructions);
        // If the look test option has been selected, display the instructions,
        if (lookOpt) {
            lookOptImageView.setVisibility(View.VISIBLE);
            lookOptTextView.setVisibility(View.VISIBLE);
        } else {  // otherwise, clear the views.
            lookOptImageView.setVisibility(View.GONE);
            lookOptTextView.setVisibility(View.GONE);
        }
    }

    /**
     * Display the feel test image and text.
     * @param feelOpt is true if the feel test option has been selected
     */
    private void displayFeelTest(boolean feelOpt) {

        // Get references to the views for the feel test option.
        ImageView feelOptImageView = (ImageView) findViewById(R.id.feel_option_image);
        TextView feelOptTextView = (TextView) findViewById(R.id.feel_option_instructions);

        // If the feel test option has been selected, display the instructions,
        if (feelOpt) {
            feelOptImageView.setVisibility(View.VISIBLE);
            feelOptTextView.setVisibility(View.VISIBLE);
        } else {   // otherwise, clear the views.
            feelOptImageView.setVisibility(View.GONE);
            feelOptTextView.setVisibility(View.GONE);
        }
    }

    /**
     * Display the separate test image and text.
     * @param separateOpt is true if the separate test option has been selected
     */
    private void displaySeparateTest(boolean separateOpt) {

        // Get references to the views for the separate test option.
        ImageView sepOptImageView = (ImageView) findViewById(R.id.separate_option_image);
        TextView sepOptTextView = (TextView) findViewById(R.id.separate_option_instructions);

        // If the separate test option has been selected, display the instructions,
        if (separateOpt) {
            sepOptImageView.setVisibility(View.VISIBLE);
            sepOptTextView.setVisibility(View.VISIBLE);
        } else {  // otherwise, clear the views.
            sepOptImageView.setVisibility(View.GONE);
            sepOptTextView.setVisibility(View.GONE);
        }
    }

    /**
     * Display the dig test image and text.
     * @param digOpt is true if the dig test option has been selected
     */
    private void displayDigTest(boolean digOpt) {

        // Get references to the views for the dig test option.
        ImageView digOptImageView = (ImageView) findViewById(R.id.dig_option_image);
        TextView digOptTextView = (TextView) findViewById(R.id.dig_option_instructions);

        // If the dig test option has been selected, display the instructions,
        if (digOpt) {
            digOptImageView.setVisibility(View.VISIBLE);
            digOptTextView.setVisibility(View.VISIBLE);
        } else {   // otherwise, clear the views.
            digOptImageView.setVisibility(View.GONE);
            digOptTextView.setVisibility(View.GONE);
        }
    }

    /**
     * Display the flood test image and text.
     * @param floodOpt is true if the flood test option has been selected
     */
    private void displayFloodTest(boolean floodOpt) {

        // Get references to the views for the flood test option.
        ImageView floodOptImageView = (ImageView) findViewById(R.id.flood_option_image);
        TextView floodOptTextView = (TextView) findViewById(R.id.flood_option_instructions);

        // If the flood test option has been selected, display the instructions,
        if (floodOpt) {
            floodOptImageView.setVisibility(View.VISIBLE);
            floodOptTextView.setVisibility(View.VISIBLE);
        } else {   // otherwise, clear the views.
            floodOptImageView.setVisibility(View.GONE);
            floodOptTextView.setVisibility(View.GONE);
        }
    }
}
