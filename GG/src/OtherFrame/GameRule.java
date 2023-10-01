package OtherFrame;

import Control.GameControl;
import UI.Img;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class GameRule extends JFrame {

    private GameControl gameControl;
    private JButton jback;
    private StartFrame startFrame;

    public GameRule(StartFrame startFrame){
        this.startFrame = startFrame;
        this.setVisible(false);
        this.setTitle("遊戲說明");
        this.setSize(500 , 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(3);
        setLayout(null);
        this.setLocationRelativeTo(null);
        this.createComponent();
        this.createAction();
    }

    private void createAction() {
        this.jback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startFrame.setVisible(true);
                setVisible(false);

                File file = new File("poyo.wav");
                AudioInputStream audioInputStream = null;
                try {
                    audioInputStream = AudioSystem.getAudioInputStream(file);
                } catch (UnsupportedAudioFileException E) {
                    E.printStackTrace();
                } catch (IOException E) {
                    E.printStackTrace();
                }
                Clip clip = null;
                try {
                    clip = AudioSystem.getClip();
                } catch (LineUnavailableException E) {
                    E.printStackTrace();
                }
                try {
                    clip.open(audioInputStream);
                } catch (LineUnavailableException E) {
                    E.printStackTrace();
                } catch (IOException E) {
                    E.printStackTrace();
                }

                clip.start();

                try {
                    Thread.sleep(1);
                } catch (InterruptedException E) {
                    E.printStackTrace();
                }
            }
        });
    }

    private void createComponent() {
        this.jback = new JButton(new ImageIcon(Img.ReturnGame.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT)));
        this.jback.setBounds(45 , 300 , 50 , 50);
        this.add(jback);

        Font font = new Font("微軟正黑體" , Font.BOLD , 18);
        JLabel jLabels = new JLabel();
        jLabels.setText("遊戲說明 : 操控角色將客人的餐點一道一道送出去");
        jLabels.setBounds(45 , 40 , 500 , 50);
        jLabels.setFont(font);
        this.add(jLabels);
        JLabel jLabel = new JLabel();
        jLabel.setText("遊戲操控");
        jLabel.setBounds(45 , 90 , 500 , 50);
        jLabel.setFont(font);
        this.add(jLabel);
        JLabel jLabel_1 = new JLabel();
        jLabel_1.setText("人物移動:方向鍵");
        jLabel_1.setBounds(45 , 140 , 500 , 50);
        jLabel_1.setFont(font);
        this.add(jLabel_1);
        JLabel jLabel_2 = new JLabel();
        jLabel_2.setText("拿取食材、處理食材:空白鍵");
        jLabel_2.setBounds(45 , 190 , 500 , 50);
        jLabel_2.setFont(font);
        this.add(jLabel_2);
        JLabel jLabel_3 = new JLabel();
        jLabel_3.setText("送出餐點:g");
        jLabel_3.setBounds(45 , 240 , 500 , 50);
        jLabel_3.setFont(font);
        this.add(jLabel_3);

    }

}
