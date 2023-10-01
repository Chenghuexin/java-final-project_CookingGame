package UI;

import Control.GameControl;
import Control.PlayerControl2;
import DTO.GameDTO;

import javax.swing.*;
import java.awt.*;

public class PanelGame2 extends JPanel {
    private GameDTO gameDTO;

    private GameControl gameControl;

    private Layer layers;

    Image Round2_map = new ImageIcon("Graphics/Round2.jpeg").getImage();
    public PanelGame2(GameDTO gameDTO , GameControl gameControl){
        layers = new LayerRound2();

        this.gameDTO = gameDTO;
        this.gameControl = gameControl;

        this.initLayer();

        this.addKeyListener(new PlayerControl2(gameControl));

    }

    private void initLayer() {
        layers.setGameDTO(this.gameDTO);
        layers.setGameControl(this.gameControl);
    }

    @Override
    public void paintComponent(Graphics g){

        g.drawImage(Round2_map , 0 , 0 , 1200 , 600 , null);
        layers.paint(g);
        this.requestFocus();
    }
}
