package UI;

import javax.swing.*;

public class FrameGame2 extends JFrame {

    public FrameGame2(PanelGame2 panelGame2){
        this.setTitle("隨便亂煮");
        this.setSize(1215 , 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setVisible(false);
        this.setContentPane(panelGame2);
        this.setVisible(false);
    }
}
