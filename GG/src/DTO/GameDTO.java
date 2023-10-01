package DTO;

public class GameDTO {
    //遊戲需要在畫面上顯示的數據源

    private int score;

    private int score2;

    private PlayerWalk playerWalk;

    private PlayerWalk2 playerWalk2;

    private ProgressBar progressBar;

    private ProgressBarRice progressBarRice;

    private ProgressBarLevel2Knife progressBarLevel2Knife;

    private DesideMenu desideMenu;

    public GameDTO(){
        this.InitDTO();
    }

    public void InitDTO(){
        this.score = 0;
        this.score2 = 0;
    }

    public PlayerWalk getPlayerWalk() {
        return playerWalk;
    }

    public PlayerWalk2 getPlayerWalk2(){return playerWalk2;}

    public ProgressBar getProgressBar() {return progressBar;}

    public ProgressBarRice getProgressBarRice(){return progressBarRice;}

    public ProgressBarLevel2Knife getProgressBarLevel2Knife(){return progressBarLevel2Knife;}

    public DesideMenu getDesideMenu(){return desideMenu;}

    public void setProgressBar(ProgressBar progressBar){this.progressBar = progressBar;}

    public void setProgressBarRice(ProgressBarRice progressBarRice){this.progressBarRice = progressBarRice;}

    public void setProgressBarLevel2Knife(ProgressBarLevel2Knife progressBarLevel2Knife){this.progressBarLevel2Knife = progressBarLevel2Knife;}

    public void setPlayerWalk(PlayerWalk playerWalk) {
        this.playerWalk = playerWalk;
    }

    public void setPlayerWalk2(PlayerWalk2 playerWalk2){
        this.playerWalk2 = playerWalk2;
    }

    public void setDesideMenu(DesideMenu desideMenu){
        this.desideMenu = desideMenu;
    }

    public int getScore(){
        return score;
    }

    public int getScore2(){return score2;}

    public void setScore(int score){
        this.score = score;
    }

    public void setScore2(int score){this.score2 = score;}
}
