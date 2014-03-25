package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class Pausa<pausaimage> extends  InputListener{
	 private static boolean pausado;
	pausaimage ib;
	 Pausa (pausaimage  p) { 
		 super ();
		ib = p;
		}	 
	 
	
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button, Object pausa)
	{
 touchDown(event, y, y, button, button);
 {
	pausa.pausado=!Pausa.pausado;
 }
    System.out.println("PAUSA PRESIONADA");	
		return  true;
	
	}
}


