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
import java.util.Timer;
import java.util.TimerTask;

public class LevelChoose extends JFrame {
    private GameControl gameControl;
    private JButton jButton_Level1;
    private JButton jButton_Level2;
    private JButton jback;
    public JLabel jLabel;
    public JLabel jLabel2;
    private int choose = 1;
    java.util.Timer timer;

    public LevelChoose(GameControl gameControl){
        //this.setVisible(true);
        this.gameControl=gameControl;
        this.setTitle("Level Selection");
        this.setSize(400 , 200);
        this.setResizable(false);
        this.setDefaultCloseOperation(3);
        setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(false);
        this.createComponent();
        this.createAction();
    }

    private void createAction() {

        this.jButton_Level1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                choose = 1;
                gameControl.getFrameGame().setVisible(true);
                gameControl.getFrameGame().setLayout(null);
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
                start();//開始計時

            }
        });

        this.jButton_Level2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                choose = 2;
                gameControl.getFrameGame2().setVisible(true);
                gameControl.getFrameGame2().setLayout(null);
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
                start();
            }
        });

        this.jback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                gameControl.getStartFrame().setVisible(true);

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
                start();
            }
        });


    }

    private void createComponent() {
        this.jButton_Level1 = new JButton(Img.Level1);
        this.jButton_Level1.setBounds(42 , 25 , 100 , 100);
        this.add(jButton_Level1);
        this.jButton_Level2 = new JButton(Img.Level2);
        this.jButton_Level2.setBounds(180  , 25 , 100 , 100);
        this.add(jButton_Level2);
        this.jback = new JButton(new ImageIcon(Img.ReturnGame.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT)));
        this.jback.setBounds(300 , 25 , 50 , 50);
        add(jback);
        this.jLabel=new JLabel();
        this.jLabel2 = new JLabel();
        Font font = new Font("Serif" , Font.BOLD , 45);
        Font font2 = new Font("Serif" , Font.BOLD , 60);
        this.jLabel.setFont(font);
        this.jLabel2.setFont(font2);





    }

    public void start() {
        timer = new Timer();
        if(choose==1){
            this.jLabel.setBounds(1110 , 18 , 125 , 37);//125 37
            gameControl.getFrameGame().add(this.jLabel);
        }
        else{
            this.jLabel2.setBounds(1110 , 20 , 125 , 100);//125 37
            gameControl.getFrameGame2().add(this.jLabel2);
        }

        timer.scheduleAtFixedRate(new TimerTask() {

            int i = 60;
            public void run() {
                if(choose==1){
                    jLabel.setText(String.valueOf(i));
                }
                else{
                    jLabel2.setText(String.valueOf(i));
                }
                i--;

                if (i < 0) {
                    timer.cancel();
                    if(choose==1){
                        jLabel.setText("Game Over");
                    }
                    else{
                        jLabel2.setText("Game Over");
                    }
                    setVisible(false);
                    gameControl.getFrameGame().setVisible(false);
                    gameControl.getFrameGame2().setVisible(false);
                    gameControl.getEndFrame().setVisible(true);

                }
            }
        }, 0, 1000);
    }

    public int getChoose() {
        return choose;
    }

}
