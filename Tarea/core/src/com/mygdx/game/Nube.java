package com.mygdx.game;

import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.graphics.Texture;

public class Nube extends Image{
	
	Nube(Texture texture){
		
		super(texture);
		
	}
	
	@Override
	public void act(float delta) {
		// TODO Auto-generated method stub
		super.act(delta);
		
		this.setY(350);
        
        this.setX(this.getX()+1);
	
	}
	
}
