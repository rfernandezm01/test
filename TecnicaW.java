package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
    public class TecnicaW {
        Animacion kame = new Animacion(16,
                new Texture("kame1.png"),
                new Texture("kame2.png"),
                new Texture("kame3.png"),
                new Texture("kame4.png"),
                new Texture("kame5.png"),
                new Texture("kame6.png")
        );
        float x, y, w, h;


        TecnicaW(float xNave, float yNave) {
            w = 100;
            h = 1000;
            x = xNave - w / 2;
            y = yNave;

        }
        public void update() {

        }

        public void render(SpriteBatch batch) {
            batch.draw(kame.obtenerFrame(), x, y, w, h);
        }
    }
