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

public class EndFrame extends JFrame {
    private GameControl gameControl;
    private JButton restartGame;
    private JButton endGame;
    private JButton returnGame;
    public JLabel score;

    public EndFrame(GameControl gameControl) {
        this.gameControl=gameControl;
        this.setTitle("重新開始/結束遊戲");
        this.setSize(250,300);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.createComponent();
    }

    private void createComponent() {
        this.score=new JLabel();
        Font font1 = new Font("標楷體" , Font.BOLD , 20);
        this.score.setBounds(30 , 150 , 125 , 37);
        this.score.setFont(font1);
        if(gameControl.getLevelChoose().getChoose()==1){
            this.score.setText("score: "+gameControl.getGameDTO().getScore());
            this.add(this.score);
        }
        else{
            this.score.setText("score: "+gameControl.getGameDTO().getScore2());
            this.add(this.score);
        }

        this.endGame=new JButton(new ImageIcon(Img.End.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT)));
        this.endGame.setBounds(30,25,50,50);
        this.endGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.add(endGame);

        this.restartGame=new JButton(new ImageIcon(Img.Restart.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT)));
        this.restartGame.setBounds(170,25,50,50);
        this.restartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameControl.start();
                if(gameControl.getLevelChoose().getChoose() == 1){
                    gameControl.getFrameGame().setVisible(true);
                }else{
                    gameControl.getFrameGame2().setVisible(true);
                }
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
                requestFocus();

            }
        });
        this.add(restartGame);

        this.returnGame=new JButton(new ImageIcon(Img.ReturnGame.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT)));
        this.returnGame.setBounds(100,25,50,50);
        this.returnGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameControl.getGameDTO().InitDTO();
                gameControl.getGameService().Start();
                gameControl.getLevelChoose().setVisible(true);
                gameControl.panelGame.repaint();
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
                requestFocus();
            }
        });
        this.add(returnGame);
    }

}

