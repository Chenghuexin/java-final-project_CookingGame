package DTO;

import Service.GameService;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ProgressBar extends JWindow implements Runnable{

    private GameDTO gameDTO;

    private GameService gameService;

    private JWindow jWindow;

    private JProgressBar jProgressBar;

    private JWindow jWindow_rice;

    private JProgressBar jProgressBar_rice;

    public ProgressBar(GameService gameService){
        this.gameService = gameService;
        jWindow = new JWindow();
        jProgressBar = new JProgressBar();
        jWindow_rice = new JWindow();
        jProgressBar_rice = new JProgressBar();
    }

    public void InitProgress(){
        jWindow.setLocation(450 , 567);
        jWindow.setSize(72 , 19);

        jProgressBar.setStringPainted(true);
        jProgressBar.setBorderPainted(false);
        jProgressBar.setLocation(450 , 567);
        jProgressBar.setSize(72 , 19);
        jProgressBar.setForeground(new Color(0, 200, 30));
        jWindow.add(jProgressBar);
    }

    public JProgressBar getjProgressBar(){return jProgressBar;}

    public JWindow getjWindow(){return jWindow;}

    public void ShowProgress(){
        jWindow.setVisible(true);
        new Thread(this).start();
    }

    @Override
    public void run() {
        PlayMusic playMusic = new PlayMusic();
        for (int i = 0; i < 100; i++) {
            try { Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            jProgressBar.setValue(i);
        }
        //JOptionPane.showMessageDialog(this, "加載完成!!!");
        jWindow.setVisible(false);
    }

    class PlayMusic{
        private File file;
        private AudioInputStream audioInputStream;
        private Clip clip;

        public PlayMusic(){
            file = new File("cut.wav");
            audioInputStream = null;
            try {
                audioInputStream = AudioSystem.getAudioInputStream(file);
            } catch (UnsupportedAudioFileException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            clip = null;
            try {
                clip = AudioSystem.getClip();
            } catch (LineUnavailableException e) {
                e.printStackTrace();
            }
            try {
                clip.open(audioInputStream);
            } catch (LineUnavailableException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            clip.start();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
