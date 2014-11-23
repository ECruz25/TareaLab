package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import java.util.ArrayList;

public class Corredor extends Actor{
	
    ArrayList<Image> images;
    
    int dibujo_actual=0,llamadas_act=0;
    
    float tiempo_act=0;
    
    public Corredor (){
    
    	super();
        
    	images = new ArrayList<Image>();
        
        images.add(new Image(new Texture("run01.png")));
        images.add(new Image(new Texture("run02.png")));
        images.add(new Image(new Texture("run03.png")));
        images.add(new Image(new Texture("jump.png")));
        images.add(new Image(new Texture("jump.png")));
        images.add(new Image(new Texture("jump.png")));
        
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
