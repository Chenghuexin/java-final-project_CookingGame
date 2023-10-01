package UI;

import javax.swing.*;
import java.awt.*;

public class LayerRound2 extends Layer{
    private int score;
    private JLabel jLabel_score2;

    public LayerRound2(){
        jLabel_score2 = new JLabel();
        jLabel_score2.setText(String.valueOf(score));
        jLabel_score2.setBounds(1110 , 450 , 50 , 71);
        Font font = new Font("Serif" , Font.BOLD , 80);
        jLabel_score2.setFont(font);
    }
    @Override
    protected void paint(Graphics g) {
        //人物
        int dir = this.gameControl.DirectionNow();

        switch (dir){
            case 0://左

                if(this.gameControl.ReturnTakeRiceFlag()){
                    g.drawImage(Img.Rice_WalkLeft[this.gameControl.PictureChoose(0)] , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeSalmonFlag()){
                    g.drawImage(Img.Salmon_WalkLeft[this.gameControl.PictureChoose(0)] , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeTunaFlag()){
                    g.drawImage(Img.Tuna_WalkLeft[this.gameControl.PictureChoose(0)] , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeShrimpFlag()){
                    g.drawImage(Img.Shrimp_WalkLeft[this.gameControl.PictureChoose(0)] , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeBentoFlag()){
                    g.drawImage(Img.Bento_WalkLeft[this.gameControl.PictureChoose(1)] , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else{
                    g.drawImage(Img.WalkLeft[this.gameControl.PictureChoose(0)] , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                break;
            case 1://右

                if(this.gameControl.ReturnTakeRiceFlag()){
                    g.drawImage(Img.Rice_WalkRight[this.gameControl.PictureChoose(1)] , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeSalmonFlag()){
                    g.drawImage(Img.Salmon_WalkRight[this.gameControl.PictureChoose(1)] , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeTunaFlag()){
                    g.drawImage(Img.Tuna_WalkRight[this.gameControl.PictureChoose(1)] , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeShrimpFlag()){
                    g.drawImage(Img.Shrimp_WalkRight[this.gameControl.PictureChoose(1)] , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeBentoFlag()){
                    g.drawImage(Img.Bento_WalkRight[this.gameControl.PictureChoose(1)] , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else{
                    g.drawImage(Img.WalkRight[this.gameControl.PictureChoose(1)] , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                break;
            case 2://上

                if(this.gameControl.ReturnTakeRiceFlag()){
                    g.drawImage(Img.Rice_WalkUp , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeSalmonFlag()){
                    g.drawImage(Img.Salmon_WalkUp , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeTunaFlag()){
                    g.drawImage(Img.Tuna_WalkUp , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeShrimpFlag()){
                    g.drawImage(Img.Shrimp_WalkUp , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeBentoFlag()){
                    g.drawImage(Img.Bento_WalkRight[this.gameControl.PictureChoose(1)] , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else{
                    g.drawImage(Img.WalkUp , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                break;
            case 3://下

                if(this.gameControl.ReturnTakeRiceFlag()){
                    g.drawImage(Img.Rice_WalkDown[this.gameControl.PictureChoose(2)] , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeSalmonFlag()){
                    g.drawImage(Img.Salmon_WalkDown[this.gameControl.PictureChoose(2)] , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeTunaFlag()){
                    g.drawImage(Img.Tuna_WalkDown[this.gameControl.PictureChoose(2)] , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeShrimpFlag()){
                    g.drawImage(Img.Shrimp_WalkDown[this.gameControl.PictureChoose(2)] , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeBentoFlag()){
                    g.drawImage(Img.Bento_WalkRight[this.gameControl.PictureChoose(1)] , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else{
                    g.drawImage(Img.WalkDown[this.gameControl.PictureChoose(2)] , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                break;
            case 4://停止
                if(this.gameControl.ReturnTakeRiceFlag()){
                    g.drawImage(Img.Rice_Stop , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeSalmonFlag()){
                    g.drawImage(Img.Salmon_Stop , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeTunaFlag()){
                    g.drawImage(Img.Tuna_Stop , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeShrimpFlag()){
                    g.drawImage(Img.Shrimp_Stop , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else if(this.gameControl.ReturnTakeBentoFlag()){
                    g.drawImage(Img.Bento_WalkRight[this.gameControl.PictureChoose(1)] , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                else{
                    g.drawImage(Img.Stop , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().x , this.gameDTO.getPlayerWalk2().getPlayerCoordinate().y , null);
                }
                break;
        }

        //鍋子
        if(this.gameDTO.getPlayerWalk2().is_Pot_touched()){
            g.drawImage(Img.Pot_choose , 293 , 18 , null);
        }
        else{
            g.drawImage(Img.Pot , 293 , 18 , null);
        }


        //飯
        if(this.gameDTO.getPlayerWalk2().is_Rice_touched()){
            g.drawImage(Img.Rice_choose , 590 , 18 , null);
        }else{
            g.drawImage(Img.Rice , 590 , 18 , null);
        }


        //鮭魚
        if(this.gameDTO.getPlayerWalk2().is_Salmon_touched()){
            g.drawImage(Img.Salmon_choose  , 745 , 18 , null);
        }else{
            g.drawImage(Img.Salmon  , 745 , 18 , null);
        }


        //海帶
        if(this.gameDTO.getPlayerWalk2().is_Seaweed_touched()){
            g.drawImage(Img.Seaweed_choose , 904 , 18 , null);
        }else{
            g.drawImage(Img.Seaweed , 904 , 18 , null);
        }


        //蝦子
        if(this.gameDTO.getPlayerWalk2().is_Shrimp_touched()){
            g.drawImage(Img.Shrimp_choose , 900 , 443 , null);
        }else{
            g.drawImage(Img.Shrimp , 900 , 443 , null);
        }


        //鮪魚
        if(this.gameDTO.getPlayerWalk2().is_Tuna_touched()){
            g.drawImage(Img.Tuna_choose , 630 , 465, null);
        }else{
            g.drawImage(Img.Tuna , 630 , 465, null);
        }


        //豆皮
        if(this.gameDTO.getPlayerWalk2().is_Tofu_Skin_touched()){
            g.drawImage(Img.Tofu_Skin_choose , 400 , 450 , null);
        }else{
            g.drawImage(Img.Tofu_Skin , 400 , 450 , null);
        }


        //菜單
        g.drawImage(Img.Round2_Menu[this.gameDTO.getDesideMenu().getNow_Menu()] , 80, 20 , null);
        this.gameDTO.getDesideMenu().setMenu2Instructor(this.gameControl.panelGame2);



        //菜刀
        if(this.gameDTO.getPlayerWalk2().is_Round2_Knife_touched()){
            g.drawImage(Img.Round2_Knife_choose , 440 , 23 , null);

        } else{
            g.drawImage(Img.Round2_Knife , 440 , 23 , null);
        }

        //盤子
        g.drawImage(Img.plate , 165 , 465 , null);
        if(this.gameDTO.getDesideMenu().Menu2_isDone()){
            if(this.gameDTO.getPlayerWalk2().is_Bento_touched()){
                g.drawImage(Img.Bento_choose , 180 , 470 , null);
            }else{
                g.drawImage(Img.Bento , 180 , 470 , null);
            }

        }

        //分數
        jLabel_score2.setText(String.valueOf(this.gameDTO.getScore2()));
        this.gameControl.panelGame2.add(jLabel_score2);
        if(this.gameControl.ReturnBentoSendFlag()){
            this.gameDTO.setScore2(this.gameDTO.getScore2() + 1);
            jLabel_score2.setText(String.valueOf(this.gameDTO.getScore2()));
            jLabel_score2.setVisible(true);
            this.gameControl.SetBentoSendFlag(false);
        }else{
            jLabel_score2.setVisible(true);
        }
        this.gameControl.getEndFrame().score.setText("score: "+this.gameDTO.getScore2());
    }
}
