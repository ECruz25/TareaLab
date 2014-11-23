package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import java.util.ArrayList;

public class Runner extends Actor{
	
    ArrayList<Image> images;
    
    Image image1;
    Image image2;
    Image image3;
    Image image4;
    
    int dibujo_actual=0,llamadas_act=0;
    
    float tiempo_act=0;
    
    public Runner (){
    
    	super();
        
    	images = new ArrayList<Image>();
		
		image1 = new Image(new Texture("run01.png"));
		image1.setX(400);
		
		image2 = new Image(new Texture("run02.png"));
		image2.setX(400);

		image3 = new Image(new Texture("run03.png"));
		image3.setX(400);

		image4 = new Image(new Texture("run04.png"));
		image4.setX(400);
		
		images.add(image1);
		images.add(image2);
		images.add(image3);
		images.add(image4);
		
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        
        System.out.println(delta);
        System.out.println("Llamadas: " + llamadas_act);
        
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
    	
        super.draw(batch, parentAlpha);
        images.get(dibujo_actual).draw(batch,parentAlpha);
        System.out.println(images.size() + "..." + dibujo_actual);
        
    }
}