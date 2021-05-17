package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreBoard {

    class Score {
        String nombre;
        int puntuacion;

        public Score(String nombre, int puntuacion) {
            this.nombre = nombre;
            this.puntuacion = puntuacion;
        }
    }
    List<Score> listapuntuacion = new ArrayList<>();
    void render(SpriteBatch batch, BitmapFont font){
        font.draw(batch, "SCOREBOARD", 200, 460);

        for (int i = 0; i < 5; i++) {
            font.draw(batch, listapuntuacion.get(i).nombre, 100, 500-i*30);
            font.draw(batch, ""+listapuntuacion.get(i).puntuacion, 300, 400-i*30);
        }
    }
    void guardarPuntos(int puntuacion){
        try{
            FileWriter fileWriter = new FileWriter("puntos.txt", true);
            fileWriter.write("Sirzech," + 100 * puntuacion + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        leerPuntuaciones();
    }
    void leerPuntuaciones() {
        try {
            Scanner scanner = new Scanner(new File("puntos.txt"));
            scanner.useDelimiter(",| \n");

            while (scanner.hasNext()) {
                String nombre = scanner.next();
                int puntos = scanner.nextInt();

                listapuntuacion.add(new Score(nombre, puntos));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
