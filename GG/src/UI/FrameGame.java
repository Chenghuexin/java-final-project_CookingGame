package UI;


import javax.swing.*;

public class FrameGame extends JFrame {

    public FrameGame(PanelGame panelGame){
        //獲得遊戲配置
        this.setTitle("隨便亂煮"); //設置標題
        this.setSize(1215, 600); //設置遊戲窗口的總大小(要比圖片還要大一點不然會切割到)
        this.setResizable(false); //設計其窗口不可隨意更動大小
        this.setDefaultCloseOperation(3); //當我們按下視窗的x的話程式就會停止執行
        this.setLocationRelativeTo(null); //讓視窗的位置保持在螢幕的center
        this.setContentPane(panelGame); //設置框架裡面的內容
        this.setVisible(false);
        //this.setVisible(true); //設置可在螢幕中顯示
    }


}
