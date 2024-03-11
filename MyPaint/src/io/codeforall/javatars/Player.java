package io.codeforall.javatars;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Player {
    public final int SPEED = 20;
    private int height = 20;
    private int width = 20;
    private int playerX;
    private int playerY;
    private Rectangle player;
    private Grid grid;


    public Player(int x, int y, int height, int width, Grid grid) {
        this.playerX = x;
        this.playerY = y;
        this.height = height;
        this.width = width;
        this.grid = grid;
        player = new Rectangle(x, y, height, width);
        player.setColor(Color.GREEN);
        player.fill();
    }

    public void paint() {
        for (Cells cells : grid.colsRows) {
            if (getPlayerX() == cells.getRectangle().getX() && getPlayerY() == cells.getRectangle().getY()) {
                if (cells.isPainted()) {
                    cells.getRectangle().draw();
                    cells.setPainted(false);
                    continue;
                }
                cells.getRectangle().setColor(Color.BLACK);
                cells.getRectangle().fill();
                cells.setPainted(true);
            }
        }
    }

    public void paintLoad(String zerosUns){
        for (Cells cells : grid.colsRows){
            if (zerosUns == "0"){
                cells.getRectangle().draw();
                cells.setPainted(false);
                continue;
            }
            cells.getRectangle().setColor(Color.BLACK);
            cells.getRectangle().fill();
            cells.setPainted(true);
        }
    }

    public void save() {
        try {
            FileWriter writer = new FileWriter("save.txt");
            BufferedWriter bWriter = new BufferedWriter(writer);
            int counter = 0;
            for (Cells cells : grid.colsRows) {
                if (counter == 50) {
                    bWriter.newLine();
                    counter = 0;
                }
                if (cells.isPainted()) {
                    bWriter.write("1");
                    counter++;
                    continue;
                }
                bWriter.write("0");
                counter++;
            }
            bWriter.flush();
            bWriter.close();
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void load() {
        clear();
        FileReader reader = null;
        try {
            reader = new FileReader("save.txt");
            BufferedReader bReader = new BufferedReader(reader);
            String line = "";
            String result = "";
            while ((line = bReader.readLine()) != null) {
                System.out.println(line + "SDADSDADASADSADSADADASDSA");
                result += line + "\n";
                System.out.println(result);
            }
            /*for (Cells cell : grid.colsRows){
                if (result.charAt(0) == "0"){
                    paintLoad();
                }
            }*/

            /*String[] word = result.split("");
            System.out.println(word + "-----------");
            for (String wrd : word) {
                paintLoad(wrd);
                System.out.println(wrd + "////////");
            }
            System.out.println(line + "VVVVVVVVVVVVV");*/
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void clear() {
        for (Cells cells : grid.colsRows) {
            cells.getRectangle().draw();
            cells.setPainted(false);
        }
    }

    public void moveRight() {
        if (playerX <= 980) {
            player.translate(SPEED, 0);
            playerX += SPEED;
        }
    }

    public void moveLeft() {
        if (playerX > 10) {
            player.translate(-SPEED, 0);
            playerX -= SPEED;
        }
    }

    public void moveUp() {
        if (playerY > 10) {
            player.translate(0, -SPEED);
            playerY -= SPEED;
        }
    }

    public void moveDown() {
        if (playerY < 980) {
            player.translate(0, SPEED);
            playerY += SPEED;
        }
    }

    public int getPlayerX() {
        return playerX;
    }

    public int getPlayerY() {
        return playerY;
    }
}
