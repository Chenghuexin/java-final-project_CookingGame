package DTO;

import Service.GameService;
import UI.Layer;

import java.awt.*;

public class PlayerWalk {
    private GameDTO gameDTO;
    private GameService gameService;
    private Point PlayerCoordinate;
    private Point[] LayerPoint;
    private int Player_width = 90;
    private int Player_height = 90;
    private boolean food_touched_flag;

    public PlayerWalk(GameService gameService) {
        this.gameService = gameService;
        this.LayerPoint = new Point[]{
            new Point(0 , 0),
            new Point(142 , 178),
            new Point(0 , 213),
            new Point(142 , 550),
            new Point(284 , 497),
            new Point(426 , 567),
            new Point(497 , 0),
            new Point(550 , 195),
            new Point(497 , 426),
            new Point(550 , 600),
            new Point(1064 , 0),
            new Point(1200 , 71),
            new Point(1064 , 213),
            new Point(1200 , 355),
            new Point(780 , 497),
            new Point(1064 , 567)
        };
        PlayerCoordinate = new Point( 390, 71);
        food_touched_flag = false;
    }

    public Point getPlayerCoordinate(){
        return PlayerCoordinate;
    }

    public void move(int x , int y){
        for(int i =0;i<LayerPoint.length;i += 2){
            if(PlayerCoordinate.x + x < 0 || PlayerCoordinate.x + Player_width + x > 1200 || PlayerCoordinate.y + y < 0 || PlayerCoordinate.y + Player_height + 2 * y > 600){
                //2*y是因為我們後來覺得下面兩個東西貼地比較好所以設的frame保持600，所以圖形會被切割到，所以要2*y
                x = 0;
                y = 0;
                break;
            }
            if(PlayerCoordinate.x + Player_width + x > LayerPoint[i].x && PlayerCoordinate.y + Player_height + y > LayerPoint[i].y &&
               LayerPoint[i+1].x > PlayerCoordinate.x + x && LayerPoint[i+1].y > PlayerCoordinate.y + y){

                x = 0;
                y = 0;
                break;
            }
        }
        PlayerCoordinate.x += x;
        PlayerCoordinate.y += y;
    }

    public boolean is_knife_touched(){
        boolean is_touched = false;
        if((PlayerCoordinate.y >= 390 && PlayerCoordinate.y <= 490) && (PlayerCoordinate.x >= 280 && PlayerCoordinate.x + Player_width <= 441)){
            is_touched = true;
        }
        return is_touched;
    }

    public boolean is_Bento_touched(){
        boolean is_touched = false;
        if((PlayerCoordinate.y >= 390 && PlayerCoordinate.y <= 490) && (PlayerCoordinate.x >= 750 && PlayerCoordinate.x + Player_width <= 904)){
            is_touched = true;
        }
        return is_touched;
    }

    public boolean is_LayerSendFood_touched(){
        boolean is_touched = false;
        if((PlayerCoordinate.x >= 950 && PlayerCoordinate.x <= 1064) && (PlayerCoordinate.y >= 213 && PlayerCoordinate.y + Player_height <= 355)){
            is_touched = true;
        }
        return is_touched;
    }

    public boolean is_Cabbage_touched(){

        if((PlayerCoordinate.x >= 142 && PlayerCoordinate.x <= 150) && (PlayerCoordinate.y >= 200 && PlayerCoordinate.y + Player_height <= 330)){
            food_touched_flag = true;
        }
        else{
            food_touched_flag = false;
        }

        return food_touched_flag;
    }

    public boolean is_Tomato_touched(){

        if((PlayerCoordinate.x >= 142 && PlayerCoordinate.x <= 150) && (PlayerCoordinate.y >= 340 && PlayerCoordinate.y + Player_height <= 460)){
            //is_touched = true;
            food_touched_flag = true;
        }
        else{
            food_touched_flag = false;
        }
        return food_touched_flag;
    }

    public boolean is_Cucumber_touched(){
        //boolean is_touched = false;
        food_touched_flag = false;
        if((PlayerCoordinate.x >= 142 && PlayerCoordinate.x <= 150) && (PlayerCoordinate.y >= 460 && PlayerCoordinate.y + Player_height <= 580)){
            //is_touched = true;
            food_touched_flag = true;
        }
        else{
            food_touched_flag = false;
        }
        return food_touched_flag;
    }

}