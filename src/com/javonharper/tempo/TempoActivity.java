package com.javonharper.tempo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class TempoActivity extends FullScreenActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempo);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tempo, menu);
        return true;
    }
    
    public void updateBpm(View view) {
    	System.out.println("Updating BPM...");
    } 
}
