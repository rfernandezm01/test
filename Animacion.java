package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public class Animacion {
    Texture[] textures;
    int duracion;

    Animacion(int duracion, Texture... textures){
        this.textures = textures;
        this.duracion = duracion;
    }

    Texture obtenerFrame(){
        int kame = Temporizador.tiempoJuego/duracion%textures.length;
        return textures[kame];
    }
}
