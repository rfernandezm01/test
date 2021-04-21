package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.List;

public class Nave {
    Texture texture;
    float x, y, w, h;
    List<Bala> balas;
    List<Tecnica> stecnica;

    Nave(){
        texture =  new Texture("nave.png");
        x = 100;
        y = 100;
        w = 70;
        h = 70;
        balas = new ArrayList<>();
        stecnica = new ArrayList<>();
    }

    void render(SpriteBatch batch){
        batch.draw(texture, x, y, w, h);

        for (Bala bala: balas) {
            bala.render(batch);
        }
        for (Tecnica tecnica: stecnica) {
            tecnica.render(batch);
        }
    }

    void update(){
        for (Bala bala: balas) {
            bala.update();
        }
        for (Tecnica tecnica: stecnica) {
            tecnica.update();
        }

        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) x += 5;
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) x -= 5;
        if (Gdx.input.isKeyPressed(Input.Keys.UP)) y += 5;
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) y -= 5;

        if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) {
            balas.add(new Bala(x+w/2, y+h));
        }
        if (Gdx.input.isKeyJustPressed(Input.Keys.Z)) {
            stecnica.add(new Tecnica(x+w/2, y+h/2));
        }
    }
}
