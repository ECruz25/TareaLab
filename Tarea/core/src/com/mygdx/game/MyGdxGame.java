package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;


public class MyGdxGame extends ApplicationAdapter {
	
	SpriteBatch batch;
	
	Music music;
	
	Stage stage;
	
	Image nube;
	
	Texture img;
	
	int frame = 0;
	int frame1 = 0;
	
	@Override
	public void create () {
		
        stage = new Stage();
        
        music = Gdx.audio.newMusic(Gdx.files.internal("fight.wav"));
        
        stage.addActor(new Corredor());
        
        Gdx.input.setInputProcessor(stage);
        
	}
	
	void addExplode(){
		
		stage.addActor(new Explosion());
		
	}
	
	void addRunner(){
		
		stage.addActor(new Runner());
		
	}
	
	void addCroc(){
		
		stage.addActor(new Croc());
		
	}
	
	void addSun(){
		
		stage.addActor(new Sun());
		
	}
	
	void addBomb(){
    	
        stage.addActor(new Bomb(new Texture("missil.png")));
       
    }
	
	void addNube(){
		
		stage.addActor(new Nube(new Texture("nube.png")));
		
	}

	@Override
	public void render () {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        //music.play();
   
        stage.draw();
        stage.act();
        
        if (frame%100000==0){

            addSun();

        }
        
        if(frame%2000==0){
        	
            addNube();
        	
        }
        
        if (frame%7550000==0){

            addExplode();

        }
        
        if (frame%100000==0){

            addRunner();

        }
        
        if (frame%100000==0){

            addCroc();

        }
        
        frame+=1;
        frame1+=15;
        
	}
	
}
