package DTO;

import Service.GameService;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ProgressBarLevel2Knife extends JWindow implements Runnable {
    private GameService gameService;

    private JWindow jWindow;

    private JProgressBar jProgressBar;

    public ProgressBarLevel2Knife(GameService gameService){
        this.gameService = gameService;
        jWindow = new JWindow();
        jProgressBar = new JProgressBar();
    }

    public void InitProgress(){
        jWindow.setLocation(600 , 100);
        jWindow.setSize(72 , 19);

        jProgressBar.setStringPainted(true);
        jProgressBar.setBorderPainted(false);
        jProgressBar.setLocation(600 , 100);
        jProgressBar.setSize(72 , 19);
        jProgressBar.setForeground(new Color(0, 200, 30));
        jWindow.add(jProgressBar);

    }

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
