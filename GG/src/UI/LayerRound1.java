package UI;

import javax.swing.*;
import java.awt.*;

public class LayerRound1 extends Layer{
    private int score;
    private JLabel jLabel_score;

    public LayerRound1() {
        jLabel_score = new JLabel();
        jLabel_score.setText(String.valueOf(score));
        jLabel_score.setBounds(850 , 0 , 50 , 71);
        Font font = new Font("Serif" , Font.BOLD , 40);
        jLabel_score.setFont(font);
    }

    @Override
    protected void paint(Graphics g) {

        //人物走動
        int dir = this.gameControl.DirectionNow();

        switch (dir){
            case 0://左
                if(this.gameControl.ReturnTakeCabbageFlag()){
                    g.drawImage(Img.Cabbage_WalkLeft[this.gameControl.PictureChoose(0)] , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeTomatoFlag()){
                    g.drawImage(Img.Tomato_WalkLeft[this.gameControl.PictureChoose(0)] , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeCucumberFlag()){
                    g.drawImage(Img.Cucumber_WalkLeft[this.gameControl.PictureChoose(0)] , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeBentoFlag()){
                    g.drawImage(Img.Bento_WalkLeft[this.gameControl.PictureChoose(0)] , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                else{

                    g.drawImage(Img.WalkLeft[this.gameControl.PictureChoose(0)] , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                break;
            case 1://右
                if(this.gameControl.ReturnTakeCabbageFlag()){
                    g.drawImage(Img.Cabbage_WalkRight[this.gameControl.PictureChoose(1)] , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeTomatoFlag()){
                    g.drawImage(Img.Tomato_WalkRight[this.gameControl.PictureChoose(1)] , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeCucumberFlag()){
                    g.drawImage(Img.Cucumber_WalkRight[this.gameControl.PictureChoose(1)] , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeBentoFlag()){
                    g.drawImage(Img.Bento_WalkRight[this.gameControl.PictureChoose(1)] , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                else{
                    g.drawImage(Img.WalkRight[this.gameControl.PictureChoose(1)] , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                break;
            case 2://上
                if(this.gameControl.ReturnTakeCabbageFlag()){
                    g.drawImage(Img.Cabbage_WalkUp , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeTomatoFlag()){
                    g.drawImage(Img.Tomato_WalkUp , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeCucumberFlag()){
                    g.drawImage(Img.Cucumber_WalkUp , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeBentoFlag()){
                    g.drawImage(Img.Bento_WalkUp , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                else{
                    g.drawImage(Img.WalkUp , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                break;
            case 3://下
                if(this.gameControl.ReturnTakeCabbageFlag()){
                    g.drawImage(Img.Cabbage_WalkDown[this.gameControl.PictureChoose(2)] , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeTomatoFlag()){
                    g.drawImage(Img.Tomato_WalkDown[this.gameControl.PictureChoose(2)] , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeCucumberFlag()){
                    g.drawImage(Img.Cucumber_WalkDown[this.gameControl.PictureChoose(2)] , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeBentoFlag()){
                    g.drawImage(Img.Bento_WalkDown[this.gameControl.PictureChoose(2)] , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                else{
                    g.drawImage(Img.WalkDown[this.gameControl.PictureChoose(2)] , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                break;
            case 4://停止
                if(this.gameControl.ReturnTakeCabbageFlag()){
                    g.drawImage(Img.Cabbage_Stop , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeTomatoFlag()){
                    g.drawImage(Img.Tomato_Stop , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeCucumberFlag()){
                    g.drawImage(Img.Cucumber_Stop , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeBentoFlag()){
                    g.drawImage(Img.Bento_Stop , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                else{
                    g.drawImage(Img.Stop , this.gameDTO.getPlayerWalk().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk().getPlayerCoordinate().y , null);
                }
                break;
        }

        //食物
        //高麗菜
        if(this.gameDTO.getPlayerWalk().is_Cabbage_touched()){
            g.drawImage(Img.cabbage_choose , 18 , 231 , null);
        }
        else{
            g.drawImage(Img.cabbage , 18 , 231 , null);
        }

        //番茄
        if(this.gameDTO.getPlayerWalk().is_Tomato_touched()){
            g.drawImage(Img.tomato_choose , 18 , 350, null);
        }
        else{
            g.drawImage(Img.tomato , 18 , 350 , null);
        }

        //小黃瓜
        if(this.gameDTO.getPlayerWalk().is_Cucumber_touched()){
            g.drawImage(Img.cucumber_choose , 18 , 470 , null);
        }
        else{
            g.drawImage(Img.cucumber , 18 , 470 , null);
        }


        //菜刀
        if(this.gameDTO.getPlayerWalk().is_knife_touched()){
            g.drawImage(Img.knife_choose , 315 , 497 , null);
        }
        else {
            g.drawImage(Img.knife, 315, 497, null);
        }


        //盤子和便當
        g.drawImage(Img.plate, 798 , 499, null);
        g.drawImage(Img.plate , 937 , 499 , null);

        if(this.gameDTO.getDesideMenu().Menu_isDone()){
            if(this.gameDTO.getPlayerWalk().is_Bento_touched()){
                g.drawImage(Img.Bento_choose , 815 , 505 , null);
            }
            else{
                g.drawImage(Img.Bento , 815 , 505 , null);
            }

        }

        //送食物的地方
        if(this.gameDTO.getPlayerWalk().is_LayerSendFood_touched()){
            g.drawImage(Img.arrow_choose , 1071  , 205 , 1190 , 358 , 0 , 0 , 79 , 79 , null); //箭頭
        }
        else{
            g.drawImage(Img.arrow , 1071  , 205 , 1190 , 358 , 0 , 0 , 79 , 79 , null); //箭頭
        }


        //分數
        jLabel_score.setText(String.valueOf(this.gameDTO.getScore()));
        this.gameControl.panelGame.add(jLabel_score);
        if(this.gameControl.ReturnBentoSendFlag()){
            //125*71
            this.gameDTO.setScore(this.gameDTO.getScore()+1);
            jLabel_score.setText(String.valueOf(this.gameDTO.getScore()));
            jLabel_score.setVisible(true);
            this.gameControl.SetBentoSendFlag(false);
        }
        else{
            jLabel_score.setVisible(true);
        }
        this.gameControl.getEndFrame().score.setText("score: "+this.gameDTO.getScore());


        //菜單
        g.drawImage(Img.Round1_Menu[this.gameDTO.getDesideMenu().getNow_Menu()] , 18 , 0 , null);
        this.gameDTO.getDesideMenu().setMenuInstructor(this.gameControl.panelGame);

    }
}
