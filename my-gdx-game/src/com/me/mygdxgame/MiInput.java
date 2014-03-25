package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;

import com.badlogic.gdx.scenes.scene2d.InputListener;


public class MiInput extends InputListener{
	Boton p;
	MiInput(Boton boton)
	{
		super();
		Boton botone;
		p=boton;
	}
	public MiInput(Pelotita pelotita) {
		// TODO Auto-generated constructor stub
	}
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
	
		p.remove();
		
		return true;
	}
}
