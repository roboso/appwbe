package com.example.wow_bossencounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class WodListaRaid extends ActionBarActivity {
	Button altomaglio;
	Button fonderia;
	
	
	@Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wod_list_raid);
        altomaglio = (Button) this.findViewById(R.id.altomaglio);
        fonderia = (Button) this.findViewById(R.id.fonderia);
	}
	public void startaltomaglio (View ImageButton) {
		Intent intent = new Intent(this, WodRaidAltomaglio.class);
		startActivity(intent);
		}
	public void startfornace (View ImageButton) {
		Intent intent = new Intent(this, WodRaidFonderia.class);
		startActivity(intent);
		}
	
	
	}	

