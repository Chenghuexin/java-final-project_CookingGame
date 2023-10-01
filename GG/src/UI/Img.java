package UI;

import javax.swing.*;
import java.awt.*;

public class Img {
    private static final String GRAPHICS_PATH = "Graphics/"; //路徑
    private static final String DEFAULT_PATH = "others/"; //路徑
    private static final String MOTION_PATH = "walkpicture/";
    private static final String DEFAULT_PATH2_ROUND2 = "round2/";
    public static Image arrow;
    public static Image arrow_choose;
    public static Image knife;
    public static Image plate;
    public static Image plate_choose;
    public static Image player; //81x58
    public static Image knife_choose;
    public static Image cabbage;
    public static Image cabbage_choose;
    public static Image tomato;
    public static Image tomato_choose;
    public static Image cucumber;
    public static Image cucumber_choose;
    public static ImageIcon start;
    public static Image[] WalkLeft;
    public static Image[] WalkRight;
    public static Image[] WalkDown;
    public static Image WalkUp;
    public static Image Stop;
    public static Image[] Cabbage_WalkLeft;
    public static Image[] Cabbage_WalkRight;
    public static Image[] Cabbage_WalkDown;
    public static Image Cabbage_WalkUp;
    public static Image Cabbage_Stop;
    public static Image[] Tomato_WalkLeft;
    public static Image[] Tomato_WalkRight;
    public static Image[] Tomato_WalkDown;
    public static Image Tomato_WalkUp;
    public static Image Tomato_Stop;
    public static Image[] Cucumber_WalkLeft;
    public static Image[] Cucumber_WalkRight;
    public static Image[] Cucumber_WalkDown;
    public static Image Cucumber_WalkUp;
    public static Image Cucumber_Stop;
    public static Image[] Bento_WalkLeft;
    public static Image[] Bento_WalkRight;
    public static Image[] Bento_WalkDown;
    public static Image Bento_WalkUp;
    public static Image Bento_Stop;
    public static Image[] Round1_Menu;
    public static Image Bento;
    public static Image Bento_choose;
    public static ImageIcon Level1;
    public static ImageIcon Level2;
    public static ImageIcon Restart;
    public static ImageIcon End;
    public static ImageIcon ReturnGame;

    public static Image Pot;
    public static Image Rice;
    public static Image Salmon;
    public static Image Seaweed;
    public static Image[] Round2_Menu;
    public static Image Round2_Knife;
    public static Image Shrimp;
    public static Image Tofu_Skin;
    public static Image Tuna;
    public static Image Pot_choose;
    public static Image Round2_Knife_choose;
    public static Image Rice_choose;
    public static Image Salmon_choose;
    public static Image Seaweed_choose;
    public static Image Shrimp_choose;
    public static Image Tofu_Skin_choose;
    public static Image Tuna_choose;
    public static Image[] Rice_WalkLeft;
    public static Image[] Rice_WalkRight;
    public static Image[] Rice_WalkDown;
    public static Image Rice_WalkUp;
    public static Image Rice_Stop;
    public static Image[] Salmon_WalkLeft;
    public static Image[] Salmon_WalkRight;
    public static Image[] Salmon_WalkDown;
    public static Image Salmon_WalkUp;
    public static Image Salmon_Stop;
    public static Image[] Tuna_WalkLeft;
    public static Image[] Tuna_WalkRight;
    public static Image[] Tuna_WalkDown;
    public static Image Tuna_WalkUp;
    public static Image Tuna_Stop;
    public static Image[] Shrimp_WalkLeft;
    public static Image[] Shrimp_WalkRight;
    public static Image[] Shrimp_WalkDown;
    public static Image Shrimp_WalkUp;
    public static Image Shrimp_Stop;
    public static ImageIcon Illustrate;

    static {
        setSkin(DEFAULT_PATH);
        setROUND2(DEFAULT_PATH2_ROUND2);
        setMotion(MOTION_PATH);
    }

    public static void setSkin(String PATH){
        String skinPath = GRAPHICS_PATH + PATH;
        arrow = new ImageIcon(skinPath + "arrow.png").getImage();
        arrow_choose = new ImageIcon(skinPath + "arrow_choose.png").getImage();
        knife = new ImageIcon(skinPath + "knife.png").getImage();
        plate = new ImageIcon(skinPath + "plate.png").getImage();
        plate_choose = new ImageIcon(skinPath + "plate_choose.png").getImage();
        player = new ImageIcon(skinPath + "player_triangle.png").getImage();
        knife_choose = new ImageIcon(skinPath + "knife_choose.png").getImage();
        cabbage = new ImageIcon(skinPath + "cabbage.png").getImage();
        cabbage_choose = new ImageIcon(skinPath + "cabbage_choose.png").getImage();
        tomato = new ImageIcon(skinPath + "tomato.png").getImage();
        tomato_choose = new ImageIcon(skinPath + "tomato_choose.png").getImage();
        cucumber = new ImageIcon(skinPath + "cucumber.png").getImage();
        cucumber_choose = new ImageIcon(skinPath + "cucumber_choose.png").getImage();
        start = new ImageIcon(skinPath + "start.png");
        Round1_Menu = new Image[]{
                new ImageIcon(skinPath + "Cabbage_salad.png").getImage(),
                new ImageIcon(skinPath + "Tomato_salad.png").getImage(),
                new ImageIcon(skinPath + "Cucumber_salad.png").getImage(),
                new ImageIcon(skinPath + "cabbage_tomato.png").getImage(),
                new ImageIcon(skinPath + "cabbage_cucumber.png").getImage(),
                new ImageIcon(skinPath+"tomato_cucumber.png").getImage(),
                new ImageIcon(skinPath + "cabbage_tomato_cucumber.png").getImage()
        };
        Bento = new ImageIcon(skinPath + "Bento.png").getImage();
        Bento_choose = new ImageIcon(skinPath + "Bento_choose.png").getImage();
        Level1 = new ImageIcon(skinPath + "level1.png");
        Level2 = new ImageIcon(skinPath + "level2.png");
        Restart = new ImageIcon(skinPath + "restart.png");
        End = new ImageIcon(skinPath + "end.png");
        ReturnGame = new ImageIcon(skinPath+"ReturnGame.png");
        Illustrate = new ImageIcon(skinPath + "illustrate.png");
    }

    public static void setROUND2(String PATH){
        String round2Path = GRAPHICS_PATH + PATH;
        Pot = new ImageIcon(round2Path + "pot.png").getImage();
        Rice = new ImageIcon(round2Path + "rice.png").getImage();
        Salmon = new ImageIcon(round2Path + "salmon.png").getImage();
        Seaweed = new ImageIcon(round2Path + "seaweed.png").getImage();
        Round2_Knife = new ImageIcon(round2Path + "knife.png").getImage();
        Shrimp = new ImageIcon(round2Path + "shrimp.png").getImage();
        Tofu_Skin = new ImageIcon(round2Path + "tofu_skin.png").getImage();
        Tuna = new ImageIcon(round2Path + "tuna.png").getImage();
        Pot_choose = new ImageIcon(round2Path + "pot_choose.png").getImage();
        Round2_Knife_choose = new ImageIcon(round2Path + "knife_choose.png").getImage();
        Rice_choose = new ImageIcon(round2Path + "rice_choose.png").getImage();
        Salmon_choose = new ImageIcon(round2Path + "salmon_choose.png").getImage();
        Seaweed_choose = new ImageIcon(round2Path + "seaweed_choose.png").getImage();
        Shrimp_choose = new ImageIcon(round2Path + "shrimp_choose.png").getImage();
        Tofu_Skin_choose = new ImageIcon(round2Path + "tofu_skin_choose.png").getImage();
        Tuna_choose = new ImageIcon(round2Path + "tuna_choose.png").getImage();
        Round2_Menu = new Image[]{
                new ImageIcon(round2Path + "sushi.png").getImage(),
                new ImageIcon(round2Path + "shrimp_sushi.png").getImage(),
                new ImageIcon(round2Path + "tuna_sushi.png").getImage(),
                new ImageIcon(round2Path + "riceball.png").getImage(),
                new ImageIcon(round2Path + "three_sushi.png").getImage(),
                new ImageIcon(round2Path + "tofu_sushi.png").getImage()
        };

    }

    public static void setMotion(String PATH){

        String motionPath = GRAPHICS_PATH + PATH;
        WalkLeft = new Image[] { new ImageIcon(motionPath + "left_1.png").getImage() , new ImageIcon(motionPath + "left_2.png").getImage()};
        WalkRight = new Image[]{new ImageIcon(motionPath + "right_1.png").getImage() , new ImageIcon(motionPath + "right_2.png").getImage()};
        WalkDown = new Image[]{new ImageIcon(motionPath+"down_right.png").getImage() , new ImageIcon(motionPath + "down_left.png").getImage()};
        WalkUp = new ImageIcon(motionPath + "up.png").getImage();
        Stop = new ImageIcon(motionPath + "stop.png").getImage();

        Cabbage_WalkLeft = new Image[] { new ImageIcon(motionPath + "Cabbage_left_1.png").getImage() , new ImageIcon(motionPath + "Cabbage_left_2.png").getImage()};
        Cabbage_WalkRight = new Image[] { new ImageIcon(motionPath + "Cabbage_right_1.png").getImage() , new ImageIcon(motionPath + "Cabbage_right_2.png").getImage()};
        Cabbage_WalkDown = new Image[] { new ImageIcon(motionPath + "Cabbage_down_right.png").getImage() , new ImageIcon(motionPath + "Cabbage_down_left.png").getImage()};
        Cabbage_WalkUp = new ImageIcon(motionPath + "Cabbage_up.png").getImage();
        Cabbage_Stop = new ImageIcon(motionPath + "Cabbage_stop.png").getImage();

        Tomato_WalkLeft = new Image[] { new ImageIcon(motionPath + "tomato_left_1.png").getImage() , new ImageIcon(motionPath + "tomato_left_2.png").getImage()};
        Tomato_WalkRight = new Image[] { new ImageIcon(motionPath + "Tomato_right_1.png").getImage() , new ImageIcon(motionPath + "Tomato_right_2.png").getImage()};
        Tomato_WalkDown = new Image[] { new ImageIcon(motionPath + "Tomato_down_right.png").getImage() , new ImageIcon(motionPath + "Tomato_down_left.png").getImage()};
        Tomato_WalkUp = new ImageIcon(motionPath + "Tomato_up.png").getImage();
        Tomato_Stop = new ImageIcon(motionPath + "Tomato_stop.png").getImage();

        Cucumber_WalkLeft = new Image[] { new ImageIcon(motionPath + "cucumber_left_1.png").getImage() , new ImageIcon(motionPath + "cucumber_left_2.png").getImage()};
        Cucumber_WalkRight = new Image[] { new ImageIcon(motionPath + "cucumber_right_1.png").getImage() , new ImageIcon(motionPath + "cucumber_right_2.png").getImage()};
        Cucumber_WalkDown = new Image[] { new ImageIcon(motionPath + "cucumber_down_right.png").getImage() , new ImageIcon(motionPath + "cucumber_down_left.png").getImage()};
        Cucumber_WalkUp = new ImageIcon(motionPath + "cucumber_up.png").getImage();
        Cucumber_Stop = new ImageIcon(motionPath + "cucumber_stop.png").getImage();

        Bento_WalkLeft = new Image[]{new ImageIcon(motionPath + "bento_left_1.png").getImage() , new ImageIcon(motionPath + "bento_left_2.png").getImage()};
        Bento_WalkRight = new Image[]{new ImageIcon(motionPath + "bento_right_1.png").getImage() , new ImageIcon(motionPath + "bento_right_2.png").getImage()};
        Bento_WalkDown = new Image[]{new ImageIcon(motionPath + "bento_down_right.png").getImage() , new ImageIcon(motionPath + "bento_down_left.png").getImage()};
        Bento_WalkUp = new ImageIcon(motionPath + "bento_up.png").getImage();
        Bento_Stop = new ImageIcon(motionPath + "bento_stop.png").getImage();

        Rice_WalkLeft = new Image[]{new ImageIcon(motionPath + "rice_left_1.png").getImage() , new ImageIcon(motionPath + "rice_left_2.png").getImage()};
        Rice_WalkRight = new Image[]{new ImageIcon(motionPath + "rice_right_1.png").getImage() , new ImageIcon(motionPath + "rice_right_2.png").getImage()};
        Rice_WalkDown = new Image[]{new ImageIcon(motionPath + "rice_down_right.png").getImage() , new ImageIcon(motionPath + "rice_down_left.png").getImage()};
        Rice_WalkUp = new ImageIcon(motionPath + "rice_up.png").getImage();
        Rice_Stop = new ImageIcon(motionPath + "rice_stop.png").getImage();

        Salmon_WalkLeft = new Image[]{new ImageIcon(motionPath + "salmon_left_1.png").getImage() , new ImageIcon(motionPath + "salmon_left_2.png").getImage()};
        Salmon_WalkRight = new Image[]{new ImageIcon(motionPath + "salmon_right_1.png").getImage() , new ImageIcon(motionPath + "salmon_right_2.png").getImage()};
        Salmon_WalkDown = new Image[]{new ImageIcon(motionPath + "salmon_down_right.png").getImage() , new ImageIcon(motionPath + "salmon_down_left.png").getImage()};
        Salmon_WalkUp = new ImageIcon(motionPath + "salmon_up.png").getImage();
        Salmon_Stop = new ImageIcon(motionPath + "salmon_stop.png").getImage();

        Tuna_WalkLeft = new Image[]{new ImageIcon(motionPath + "tuna_left_1.png").getImage() , new ImageIcon(motionPath + "tuna_left_2.png").getImage()};
        Tuna_WalkRight = new Image[]{new ImageIcon(motionPath + "tuna_right_1.png").getImage() , new ImageIcon(motionPath + "tuna_right_2.png").getImage()};
        Tuna_WalkDown = new Image[]{new ImageIcon(motionPath + "tuna_down_right.png").getImage() , new ImageIcon(motionPath + "tuna_down_left.png").getImage()};
        Tuna_WalkUp = new ImageIcon(motionPath + "tuna_up.png").getImage();
        Tuna_Stop = new ImageIcon(motionPath + "tuna_stop.png").getImage();

        Shrimp_WalkLeft = new Image[]{new ImageIcon(motionPath + "shrimp_left_1.png").getImage() , new ImageIcon(motionPath + "shrimp_left_2.png").getImage()};
        Shrimp_WalkRight = new Image[]{new ImageIcon(motionPath + "shrimp_right_1.png").getImage() , new ImageIcon(motionPath + "shrimp_right_2.png").getImage()};
        Shrimp_WalkDown = new Image[]{new ImageIcon(motionPath + "shrimp_down_right.png").getImage() , new ImageIcon(motionPath + "shrimp_down_left.png").getImage()};
        Shrimp_WalkUp = new ImageIcon(motionPath + "shrimp_up.png").getImage();
        Shrimp_Stop = new ImageIcon(motionPath + "shrimp_stop.png").getImage();

    }
}
