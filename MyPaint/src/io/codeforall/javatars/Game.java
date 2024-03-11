package io.codeforall.javatars;

public class Game {

    private Grid grid;
    private Player player;
    private Controls controls;


    public void start (){
        this.grid = new Grid(50,50);
        grid.init();
        this.player = new Player(Grid.PADDING,Grid.PADDING,20,20, grid);
        this.controls = new Controls(player);
    }
}
