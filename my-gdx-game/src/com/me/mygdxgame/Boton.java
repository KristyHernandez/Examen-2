package com.me.mygdxgame;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;



    public class Boton extends Image{
	public Boton(int x, int y) {
		super(new Texture("data/pelotita.png"));
		this.addListener(new MiInput(this));
		if (getX()>200)
		remove();
		
		setX(x);
		setY(y);
	
	}


    }


