package com.example.wow_bossencounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class MopListaRaid extends ActionBarActivity  {
	
	Button segrete;
	Button cuore;
	Button terrazza;
	Button regnodeltuono;
	Button soo;

	
	
	
	@Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mop_list_raid);
        segrete = (Button) this.findViewById(R.id.segrete);
        cuore = (Button) this.findViewById(R.id.cuore);
        terrazza = (Button) this.findViewById(R.id.terrazza);
        regnodeltuono = (Button) this.findViewById(R.id.regnodeltuono);
        soo = (Button) this.findViewById(R.id.soo);
	}
        public void listasegrete (View Button) {
    		Intent intent = new Intent(this, MopRaidSegrete.class);
    		startActivity(intent);
    		}
        public void listacuore (View Button) {
    		Intent intent = new Intent(this, MopRaidCuore.class);
    		startActivity(intent);
    		}
        public void listaterrazza (View Button) {
    		Intent intent = new Intent(this, MopRaidTerrazza.class);
    		startActivity(intent);
    		}
        public void listaregnodeltuono (View Button) {
    		Intent intent = new Intent(this, MopRaidTot.class);
    		startActivity(intent);
    		}
        public void listasoo (View Button) {
    		Intent intent = new Intent(this, MopRaidAssedio.class);
    		startActivity(intent);
    		}

}