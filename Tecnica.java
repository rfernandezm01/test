package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
public class Tecnica {

    Texture texture;
    float x, y, w, h;

    Tecnica(float xNave, float yNave){
        texture = new Texture("energia.png");
        w = 60;
        h = 120;
        x = xNave-w/2;
        y = yNave;
    }


    public void render(SpriteBatch batch) {
        batch.draw(texture, x, y, w, h);
    }
    void update(){
        y += 7;
    }
}
