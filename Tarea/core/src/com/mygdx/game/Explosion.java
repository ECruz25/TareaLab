package com.mygdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Explosion extends Actor{

	ArrayList<Image> images;
	
    int dibujo_actual = 0,llamadas_act = 0;
    
    Image image1;
    Image image2;
    Image image3;
    Image image4;
    Image image5;
    
    float tiempo_act=0;
	
	public Explosion(){
		
		super();
		
		images = new ArrayList<Image>();
		
		image1 = new Image(new Texture("perder01.png"));
		image1.setX(150);
		image2 = new Image(new Texture("perder02.png"));
		image2.setX(150);
		image3 = new Image(new Texture("perder03.png"));
		image3.setX(150);
		image4 = new Image(new Texture("perder04.png"));
		image4.setX(150);
		image5 = new Image(new Texture("perder05.png"));
		image5.setX(150);
		
		
		images.add(image1);
		images.add(image2);
		images.add(image3);
		images.add(image4);
		images.add(image5);
		
	}
	
	@Override
    public void act(float delta) {
        super.act(delta);
        
        System.out.println(delta);
        System.out.println("Llamadas1: " + llamadas_act);
        
        tiempo_act+=delta;
        
        if(tiempo_act>0.1f){
            
        	dibujo_actual++;
            tiempo_act=0;
        
        }

        if (dibujo_actual>=images.size()){
        
        	dibujo_actual=0;
        
        }
        
        llamadas_act++;
    
    }
	
	@Override
	public void draw(Batch batch, float parentAlpha) {
		// TODO Auto-generated method stub
		super.draw(batch, parentAlpha);
		images.get(dibujo_actual).draw(batch,parentAlpha);
		System.out.println(images.size() + "..." + dibujo_actual);
	}
	
}
