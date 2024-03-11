package io.codeforall.javatars;

import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.ArrayList;
import java.util.List;

public class Grid {

    public static final int PADDING = 10;
    public static final int CELL_SIZE = 20;
    protected List<Cells> colsRows = new ArrayList<>();

    public Grid(int cols,int rows) {
        int x = 10;
        int y = 10;
        for (int i = 0; i < cols * rows; i++) {
            colsRows.add(new Cells(x, y, CELL_SIZE, CELL_SIZE));
            x += 20;
            if (x >= 1000) {
                x = 10;
                y += 20;
            }
        }
    }

    public void init() {
        for (Cells cell : colsRows) {
            cell.getRectangle().draw();
        }
    }
}
