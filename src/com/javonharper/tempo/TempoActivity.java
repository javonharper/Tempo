package com.javonharper.tempo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class TempoActivity extends FullScreenActivity {
	BpmCalculator bpmCalculator;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempo);
        bpmCalculator = new BpmCalculator();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tempo, menu);
        return true;
    }
    
    public void updateBpm(View view) {
    	System.out.println("Updating BPM...");
    	
    	bpmCalculator.recordTime();
    	
    	String displayValue;
    	
    	if (bpmCalculator.times.size() >= 2) {
        	int bpm = bpmCalculator.getBpm();
        	displayValue = Integer.valueOf(bpm).toString();
    	} else {
    		displayValue = getString(R.string.tap_again);
    	}

    	TextView bpmTextView = (TextView) findViewById(R.id.bpmTextView);
    	bpmTextView.setText(displayValue);
    	
    } 
}
