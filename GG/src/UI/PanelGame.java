package UI;


import Control.GameControl;
import Control.PlayerControl;
import DTO.GameDTO;

import javax.swing.*;
import java.awt.*;

public class PanelGame extends JPanel {

    private GameDTO gameDTO;

    private GameControl gameControl;

    private Layer layers;

    Image Round1_map = new ImageIcon("Graphics/Round1.jpg").getImage();

    //因為和GameDTO和GameControl有連接
    public PanelGame(GameDTO gameDTO , GameControl gameControl){
        layers = new LayerRound1();

        this.gameDTO = gameDTO;
        this.gameControl = gameControl;
        //初始化
        this.initLayer();
        //新增鍵盤監聽
        this.addKeyListener(new PlayerControl(gameControl));

    }

    private void initLayer(){
        layers.setGameDTO(this.gameDTO);
        layers.setGameControl(this.gameControl);
    }

    @Override
    public void paintComponent(Graphics g){
        g.drawImage(Round1_map , 0 , 0 , 1200 , 600 , null);
        layers.paint(g);

        //因為圖片什麼的都是在這邊形成地所以要在最後這裡返回焦點
        this.requestFocus();
        }


}

