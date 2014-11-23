package com.mygdx.game;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Bomb extends Image{
	
	int y = 300;
	
	int j = 0;

	 Bomb(Texture texture){
		  
	      super(texture);

	      addListener(new BombInput(this));
	      
	  }
	  
	  @Override
	  public void act(float delta) {
		  
		  super.act(delta);
		  
		  this.setY(y-=50);
		  
		  this.setX(230);
	    
	  }
	
}