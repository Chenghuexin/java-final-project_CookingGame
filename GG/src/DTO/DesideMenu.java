package DTO;

import Service.GameService;
import UI.PanelGame;
import UI.PanelGame2;

import javax.swing.*;
import java.awt.*;

public class DesideMenu {
    private GameDTO gameDTO;
    private GameService gameService;
    private Round1_Menu[] round1_menu;
    private Round2_Menu[] round2_menu;
    private int Now_Menu;
    private JLabel jLabel_Cabbage;
    private JLabel jLabel_Tomato;
    private JLabel jLabel_Cucumber;
    private JLabel jLabel_Rice;
    private JLabel jLabel_Salmon;
    private JLabel jLabel_Seaweed;
    private JLabel jLabel_TofuSkin;
    private JLabel jLabel_Tuna;
    private JLabel jLabel_Shrimp;
    private boolean Now_Menu_isDone;
    private int Round1_Menu_foodcount;
    private int Round2_Menu_foodcount;

    public DesideMenu(GameService gameService , int menu_choose){
        jLabel_Cabbage = new JLabel();
        jLabel_Tomato = new JLabel();
        jLabel_Cucumber = new JLabel();
        jLabel_Rice = new JLabel();
        jLabel_Salmon = new JLabel();
        jLabel_Seaweed = new JLabel();
        jLabel_TofuSkin = new JLabel();
        jLabel_Tuna = new JLabel();
        jLabel_Shrimp = new JLabel();

        jLabel_Cabbage.setText("高麗菜(切)");
        jLabel_Tomato.setText("番茄(切)");
        jLabel_Cucumber.setText("小黃瓜(切)");
        jLabel_Rice.setText("飯(煮)");
        jLabel_Salmon.setText("鮭魚(切)");
        jLabel_Seaweed.setText("海苔(拿)");
        jLabel_TofuSkin.setText("豆皮(拿)");
        jLabel_Tuna.setText("鮪魚(切)");
        jLabel_Shrimp.setText("蝦(切)");

        jLabel_Cabbage.setBounds(25 , 90 , 100 , 50);
        Font font = new Font("微軟正黑體" , Font.BOLD , 18);
        jLabel_Cabbage.setFont(font);

        jLabel_Tomato.setBounds(25 , 110 , 100 , 50);
        jLabel_Tomato.setFont(font);

        jLabel_Cucumber.setBounds(25 , 130 , 100 , 50);
        jLabel_Cucumber.setFont(font);

        jLabel_Rice.setBounds(100 , 100 , 100 , 50);
        jLabel_Rice.setFont(font);

        jLabel_Salmon.setBounds(100 , 130 , 100 , 50);
        jLabel_Salmon.setFont(font);

        jLabel_Seaweed.setBounds(100 , 150 , 100 , 50);
        jLabel_Seaweed.setFont(font);

        jLabel_TofuSkin.setBounds(100 , 170 , 100 , 50);
        jLabel_TofuSkin.setFont(font);

        jLabel_Tuna.setBounds(100 , 190 , 100 , 50);
        jLabel_Tuna.setFont(font);

        jLabel_Shrimp.setBounds(100 , 210 , 100 , 50);
        jLabel_Shrimp.setFont(font);

        this.gameService = gameService;
        this.initMenu(menu_choose);
        round1_menu = new Round1_Menu[]{
                new Round1_Menu(true , false , false , false , true , true , 1),
                new Round1_Menu(false , true , false , true , false , true , 1),
                new Round1_Menu(false , false , true , true , true , false , 1),
                new Round1_Menu(true , true , false , false , false , true , 2),
                new Round1_Menu(true , false , true , false , true , false , 2),
                new Round1_Menu(false , true , true , true , false , false , 2),
                new Round1_Menu(true , true , true , false , false , false , 3)
        };

        round2_menu = new Round2_Menu[]{
                new Round2_Menu(true , true , true , false , false , false , false , false , false , true , true , true , 3),
                new Round2_Menu(true , false , false , false , false , true , false , true , true , true , true , false , 2),
                new Round2_Menu(true , false , false , false , true , false , false , true , true, true , false , true , 2),
                new Round2_Menu(true , false , true , false , false , false , false , true , false , true , true , true , 2),
                new Round2_Menu(true , true , false , false , true , true , false , false , true , true , false , false , 4),
                new Round2_Menu(true , false , false , true , false , false , false , true , true , false , true , true , 2)
        };
    }

    public void initMenu(int menu_choose) {
        this.Now_Menu = menu_choose;

    }

    public int getNow_Menu(){
        return Now_Menu;
    }

    public void check_cabage_iscut() {
        if(round1_menu[Now_Menu].has_Cabbage){
            round1_menu[Now_Menu].is_Cabbage_Finished = true;
        }
    }

    public void check_tomato_iscut(){
        if(round1_menu[Now_Menu].has_Tomato){
            round1_menu[Now_Menu].is_Tomato_Finished = true;
        }
    }

    public void check_cucumber_iscut(){
        if(round1_menu[Now_Menu].has_Cucumber){
            round1_menu[Now_Menu].is_Cucumber_Finished = true;
        }
    }

    public void check_rice_cook(){
        if(round2_menu[Now_Menu].has_Rice){
            round2_menu[Now_Menu].is_Rice_Finished = true;
        }
    }

    public void check_salmon_iscut(){
        if(round2_menu[Now_Menu].has_Salmon){
            round2_menu[Now_Menu].is_Salmon_Finished = true;
        }
    }

    public void check_seaweed_istake(){
        if(round2_menu[Now_Menu].has_Seaweed){
            round2_menu[Now_Menu].is_Seaweed_Finished = true;
        }
    }

    public void check_tofuskin_istake(){
        if(round2_menu[Now_Menu].has_TofuSkin){
            round2_menu[Now_Menu].is_TofuSkin_Finished = true;
        }
    }

    public void check_tuna_iscut(){
        if(round2_menu[Now_Menu].has_Tuna){
            round2_menu[Now_Menu].is_Tuna_Finished = true;
        }
    }

    public void check_shrimp_iscut(){
        if(round2_menu[Now_Menu].has_Shrimp){
            round2_menu[Now_Menu].is_Shrimp_Finished = true;
        }
    }

    public boolean Menu_isDone(){
        if(round1_menu[Now_Menu].is_Cabbage_Finished && round1_menu[Now_Menu].is_Tomato_Finished && round1_menu[Now_Menu].is_Cucumber_Finished){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean Menu2_isDone(){
        if(round2_menu[Now_Menu].is_Rice_Finished && round2_menu[Now_Menu].is_Shrimp_Finished && round2_menu[Now_Menu].is_Seaweed_Finished && round2_menu[Now_Menu].is_TofuSkin_Finished && round2_menu[Now_Menu].is_Tuna_Finished && round2_menu[Now_Menu].is_Shrimp_Finished){
            return true;
        }else{
            return false;
        }
    }

    public void setMenuInstructor(PanelGame panelGame) {
        if(round1_menu[Now_Menu].has_Cabbage && !round1_menu[Now_Menu].is_Cabbage_Finished){
            panelGame.add(jLabel_Cabbage);
            jLabel_Cabbage.setVisible(true);
        }
        else{
            jLabel_Cabbage.setVisible(false);
        }

        if(round1_menu[Now_Menu].has_Tomato && !round1_menu[Now_Menu].is_Tomato_Finished){
            panelGame.add(jLabel_Tomato);
            jLabel_Tomato.setVisible(true);
        }
        else{
            jLabel_Tomato.setVisible(false);
        }

        if(round1_menu[Now_Menu].has_Cucumber && !round1_menu[Now_Menu].is_Cucumber_Finished){
            panelGame.add(jLabel_Cucumber);
            jLabel_Cucumber.setVisible(true);
        }
        else{
            jLabel_Cucumber.setVisible(false);
        }
    }

    public void setMenu2Instructor(PanelGame2 panelGame2){
        if(round2_menu[Now_Menu].has_Rice && !round2_menu[Now_Menu].is_Rice_Finished){
            panelGame2.add(jLabel_Rice);
            jLabel_Rice.setVisible(true);
        }else{
            jLabel_Rice.setVisible(false);
        }

        if(round2_menu[Now_Menu].has_Salmon && !round2_menu[Now_Menu].is_Salmon_Finished){
            panelGame2.add(jLabel_Salmon);
            jLabel_Salmon.setVisible(true);
        }else{
            jLabel_Salmon.setVisible(false);
        }

        if(round2_menu[Now_Menu].has_Seaweed && !round2_menu[Now_Menu].is_Seaweed_Finished){
            panelGame2.add(jLabel_Seaweed);
            jLabel_Seaweed.setVisible(true);
        }else{
            jLabel_Seaweed.setVisible(false);
        }

        if(round2_menu[Now_Menu].has_TofuSkin && !round2_menu[Now_Menu].is_TofuSkin_Finished){
            panelGame2.add(jLabel_TofuSkin);
            jLabel_TofuSkin.setVisible(true);
        }else{
            jLabel_TofuSkin.setVisible(false);
        }

        if(round2_menu[Now_Menu].has_Tuna && !round2_menu[Now_Menu].is_Tuna_Finished){
            panelGame2.add(jLabel_Tuna);
            jLabel_Tuna.setVisible(true);
        }else{
            jLabel_Tuna.setVisible(false);
        }

        if(round2_menu[Now_Menu].has_Shrimp && !round2_menu[Now_Menu].is_Shrimp_Finished){
            panelGame2.add(jLabel_Shrimp);
            jLabel_Shrimp.setVisible(true);
        }else{
            jLabel_Shrimp.setVisible(false);
        }
    }

    class Round1_Menu{
        private boolean has_Cabbage;
        private boolean has_Tomato;
        private boolean has_Cucumber;

        private boolean is_Cabbage_Finished;
        private boolean is_Tomato_Finished;
        private boolean is_Cucumber_Finished;

        private boolean is_Done;

        private int foodcount;

        public Round1_Menu(boolean Cabbage , boolean Tomato , boolean Cucumber , boolean CabbageDone , boolean TomatoDone , boolean CucumberDone , int num){
            has_Cabbage = Cabbage;
            has_Tomato = Tomato;
            has_Cucumber = Cucumber;
            is_Cabbage_Finished = CabbageDone;
            is_Tomato_Finished = TomatoDone;
            is_Cucumber_Finished = CucumberDone;
            is_Done = false;
            this.foodcount = num;
        }
    }

    class Round2_Menu{
        private boolean has_Rice;
        private boolean has_Salmon;
        private boolean has_Seaweed;
        private boolean has_TofuSkin;
        private boolean has_Tuna;
        private boolean has_Shrimp;

        private boolean is_Rice_Finished;
        private boolean is_Salmon_Finished;
        private boolean is_Seaweed_Finished;
        private boolean is_TofuSkin_Finished;
        private boolean is_Tuna_Finished;
        private boolean is_Shrimp_Finished;

        private boolean is_Done;

        private int foodcount;

        public Round2_Menu(boolean Rice , boolean Salmon , boolean Seaweed , boolean TofuSkin , boolean Tuna , boolean Shrimp , boolean RiceDone , boolean SalmonDone , boolean SeaweedDone , boolean TofuSkinDone , boolean TunaDone , boolean ShrimpDone , int foodcount){
            this.has_Rice = Rice;
            this.has_Salmon = Salmon;
            this.has_Seaweed = Seaweed;
            this.has_TofuSkin = TofuSkin;
            this.has_Tuna = Tuna;
            this.has_Shrimp = Shrimp;
            this.is_Rice_Finished = RiceDone;
            this.is_Salmon_Finished = SalmonDone;
            this.is_Seaweed_Finished = SeaweedDone;
            this.is_TofuSkin_Finished = TofuSkinDone;
            this.is_Tuna_Finished = TunaDone;
            this.is_Shrimp_Finished = ShrimpDone;
            is_Done = false;
            this.foodcount = foodcount;
        }

    }


}
