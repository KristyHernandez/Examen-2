
package com.me.mygdxgame;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import dibujable.Puntuacion.Puntuacio;



public class MyGdxGame<Enemigo, fin> implements ApplicationListener {
	private static int contador = 0;
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture texture;
	private Texture pelotita;
    private Sprite sprite;
	private Sprite sprite2;
	private Sprite sprite_nave;
	private Texture Elemento;
	private Texture Puntuacion;
    private Texture punto;
    private Texture punt;
    private Puntuacio punti;
	private Puntuacio puntuacion;
	private Enemigo enemigo;
	private int Contador;
	private java.awt.Image In;
	private Texture en; 
	private fin end;
	private Texture Pausa;
	private Texture pause;
	private Texture fio;
	private Texture pausado; 
	
	

	private Image i;
	Pelotita p;
	Stage s;
	ArrayList<Sprite>sprites=new ArrayList<Sprite>();
	ArrayList<Pelotita>Pelotitas=new ArrayList<Pelotita>();
	ArrayList<pelotitamala>pelotitasm=new ArrayList<pelotitamala>();
	int rotacion=0;
	
	
	@Override
	public void create()
	{		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		
		camera = new OrthographicCamera(1, h/w);
		batch = new SpriteBatch();
		texture = new Texture(Gdx.files.internal("data/fondo.png"));
		pelotita  = new Texture(Gdx.files.internal("data/pelotita.png"));
		
		
		texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		
		TextureRegion region = new TextureRegion(texture, 0, 0, 512, 512);
		
		sprite = new Sprite(region);
		sprite2 = new Sprite(region);
		sprite2.setPosition(0,-0.5f);
		sprite2.setSize(0.9f, 0.9f * sprite.getHeight() / sprite.getWidth());
		sprite.setSize(0.9f, 0.9f * sprite.getHeight() / sprite.getWidth());
		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		sprite.setPosition(0,0);
		sprite.setRotation(25);
		
	    
	
		
		s=new Stage();
		i=new Image(texture);
		s.addActor(i);
		
		Gdx.input.setInputProcessor(s);
		inicioimage ib = new inicioimage ();
		s.addActor(ib);
 
		
		
		s.addActor((Actor) end);
		
		for(int i=0;i<25;i++)
		{
			Pelotita p = new Pelotita((int)(Math.random()*1000%w),(int)(Math.random()*1000%h));
			s.addActor(p);
			Pelotitas.add(p);
		}
		for(int i=0;i<15;i++)
		{
			pelotitamala t=new pelotitamala((int)(Math.random()*1000%w),(int)(Math.random()*1000%h));
			s.addActor(t);
			Pelotitas.add(p);
		}

		
		
	}
	public void tempAddEnemics(Sprite[] enemigos){
	       
        for (int i=0; i<contador;i++){
            ArrayList<Sprite> temporizador = null;
			temporizador.add(enemigos[i]);
        }
    }
	
	public void add(Enemigo enemigo, Enemigo[] enemigos){
	       
    	enemigos[contador] = enemigo;
    	contador++;
    }
	
	public void areaAddEnemics(Object[] enemy){
		
        for (int i=0; i<contador;i++){
        
			
        }
    }
	

	private void add(Object object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		batch.dispose();
		texture.dispose();
	}

	@Override
	public void render() {	
		sprite.setRotation(rotacion);
	
		
		Gdx.gl.glClearColor(4, 2, 6, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		
		batch.setProjectionMatrix(camera.combined);
		{
			
		
		s.act();
		
		s.draw();
	 }
	}
	@Override
	public void resize(int width, int height) {
		s.setViewport(600, 400, true);
	
	}
	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
