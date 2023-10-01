package OtherFrame;

import Control.GameControl;
import UI.Img;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class StartFrame extends JFrame {
    GameControl gameControl;
    private JButton btnStart;
    private JButton btnRule;
    public StartFrame(GameControl gameControl){
        this.gameControl = gameControl;
        this.setVisible(true);
        this.setTitle("隨便亂煮");
        this.setSize(250 , 300);
        this.setResizable(false);
        this.setDefaultCloseOperation(3);
        setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.createComponent();
        this.createAction();
    }

    private void createAction() {
        this.btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameControl.getLevelChoose().setVisible(true);
                gameControl.getLevelChoose().setLayout(null);
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

        this.btnRule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                gameControl.getGameRule().setVisible(true);
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
        this.btnStart = new JButton(Img.start);
        this.btnStart.setBounds(45 , 40 , 140 , 75);
        this.add(btnStart);
        this.btnRule = new JButton(Img.Illustrate);
        this.btnRule.setBounds(45 , 130 , 140 , 75);
        this.add(btnRule);
    }
}
