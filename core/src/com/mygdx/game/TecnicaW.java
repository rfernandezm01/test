package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

    public class TecnicaW {
        float x, y, w, h;
        Texture kame1, kame2, kame3, kame4, kame5, kame6;
        int tiempokame;
        Sound crit,sound;

        TecnicaW(float xNave, float yNave) {
            w = 100;
            h = 1000;
            x = xNave - w / 2;
            y = yNave;
            tiempokame = 0;
            crit = Gdx.audio.newSound(Gdx.files.internal("kame sonido.mp3"));
            sound.play();

        }

        void update(){

        }

        void render (SpriteBatch batch, int kame) {
            if(kame==10);
            if (kame<50){
                batch.draw(kame1,x,y,w,h);
            }else if (kame<70){
                batch.draw(kame2,x,y,w,h);
            }else if (kame<88){
                batch.draw(kame3,x,y,w,h);
            }else if (kame<100){
                batch.draw(kame4,x,y,w,h);
            }else if (kame<120){
            batch.draw(kame5,x,y,w,h);
            } else if (kame<140){
                batch.draw(kame6,x,y,w,h);
        }

        }
    }