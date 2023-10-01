package DTO;

import Service.GameService;

import java.awt.*;

public class PlayerWalk2 {
    private GameDTO gameDTO;
    private GameService gameService;
    private Point PlayerCoordinate;
    private Point[] LayerPoint;
    private int Player_width = 90;
    private int Player_height = 90;

    public PlayerWalk2(GameService gameService){
        this.gameService = gameService;
        PlayerCoordinate = new Point(300, 278);
        this.LayerPoint = new Point[]{
                new Point(54 , 0),
                new Point(249 , 249),
                new Point(284 , 18),
                new Point(1200 , 142),
                new Point(1064 , 142),
                new Point(1188 , 443),
                new Point(373 , 443),
                new Point(1064 , 567),
                new Point(125 , 443),
                new Point(302 , 567)
        };
    }

    public Point getPlayerCoordinate(){
        return PlayerCoordinate;
    }

    public void move(int x , int y){
        for(int i =0;i<LayerPoint.length;i+=2){
            if(PlayerCoordinate.x + x < 0 || PlayerCoordinate.x + Player_width + x > 1200 || PlayerCoordinate.y + y < 0 || PlayerCoordinate.y + Player_height + y > 600){
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

    public boolean is_Pot_touched(){
        boolean is_touched = false;
        if((PlayerCoordinate.x >= 265 && PlayerCoordinate.x <= 355) && (PlayerCoordinate.y >= 142 && PlayerCoordinate.y + Player_height <= 249)){
            is_touched = true;
        }
        return is_touched;
    }

    public boolean is_Round2_Knife_touched(){
        boolean is_touched = false;
        if((PlayerCoordinate.x >= 385 && PlayerCoordinate.x <= 500) && (PlayerCoordinate.y >= 142 && PlayerCoordinate.y + Player_height <= 249)){
            is_touched = true;
        }
        return is_touched;

    }

    public boolean is_Rice_touched(){
        boolean is_touched = false;
        if((PlayerCoordinate.x >= 530 && PlayerCoordinate.x <= 650) && (PlayerCoordinate.y >= 142 && PlayerCoordinate.y + Player_height <= 249)){
            is_touched = true;
        }
        return is_touched;
    }

    public boolean is_Salmon_touched(){
        boolean is_touched = false;
        if((PlayerCoordinate.x >= 730 && PlayerCoordinate.x <= 800) && (PlayerCoordinate.y >= 142 && PlayerCoordinate.y + Player_height <= 249)){
            is_touched = true;
        }
        return is_touched;
    }

    public boolean is_Seaweed_touched(){
        boolean is_touched = false;
        if((PlayerCoordinate.x >= 900 && PlayerCoordinate.x <= 950) && (PlayerCoordinate.y >= 142 && PlayerCoordinate.y + Player_height <= 249)){
            is_touched = true;
        }
        return is_touched;
    }

    public boolean is_Tofu_Skin_touched(){
        boolean is_touched = false;
        if((PlayerCoordinate.x >= 373 && PlayerCoordinate.x <= 470) && (PlayerCoordinate.y >= 330 && PlayerCoordinate.y + Player_height <= 443)){
            is_touched = true;
        }
        return is_touched;
    }

    public boolean is_Tuna_touched(){
        boolean is_touched = false;
        if((PlayerCoordinate.x >= 600 && PlayerCoordinate.x <= 720) && (PlayerCoordinate.y >= 330 && PlayerCoordinate.y + Player_height <= 443)){
            is_touched = true;
        }
        return is_touched;
    }

    public boolean is_Shrimp_touched(){
        boolean is_touched = false;
        if((PlayerCoordinate.x >= 880 && PlayerCoordinate.x <= 980) && (PlayerCoordinate.y >= 330 && PlayerCoordinate.y + Player_height <= 443)){
            is_touched = true;
        }
        return is_touched;
    }

    public boolean is_Bento_touched(){
        boolean is_touched = false;
        if((PlayerCoordinate.x >= 125 && PlayerCoordinate.x <= 302) && (PlayerCoordinate.y >= 330 && PlayerCoordinate.y + Player_height <= 443)){
            is_touched = true;
        }
        return is_touched;
    }

    public boolean is_LayerSendFood_touched(){
        boolean is_touched = false;
        if((PlayerCoordinate.x >= 0 && PlayerCoordinate.x <= 18) && (PlayerCoordinate.y >= 249 && PlayerCoordinate.y  <= 355)){
            is_touched = true;
        }
        return is_touched;
    }

}
