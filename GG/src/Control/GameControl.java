package Control;

import DTO.GameDTO;
import OtherFrame.EndFrame;
import OtherFrame.GameRule;
import OtherFrame.LevelChoose;
import OtherFrame.StartFrame;
import Service.GameService;
import UI.FrameGame;
import UI.FrameGame2;
import UI.PanelGame;
import UI.PanelGame2;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class GameControl {

    private FrameGame frameGame;

    private FrameGame2 frameGame2;

    public PanelGame panelGame; //遊戲控制一定要有PanelGame，才可以去調動PanelGame裡面的東西和刷新畫面

    public PanelGame2 panelGame2;

    private GameDTO gameDTO;

    private GameService gameService;

    private StartFrame startFrame;

    private GameRule gameRule;

    private LevelChoose levelChoose;

    private EndFrame endFrame;

    private boolean StopFlag;

    private boolean TakeCabbageFlag;

    private boolean TakeTomatoFlag;

    private boolean TakeCucumberFlag;

    private boolean TakeBentoFlag;

    private boolean isCabbageCutFlag;

    private boolean isTomatoCutFlag;

    private boolean isCucumberCutFlag;

    private boolean TakeRiceFlag;

    private boolean TakeSalmonFlag;

    private boolean TakeSeaweedFlag;

    private boolean TakeTofuSkinFlag;

    private boolean TakeTunaFlag;

    private boolean TakeShrimpFlag;

    private boolean isRiceCookFlag;

    private boolean isSalmonCutFlag;

    private boolean isSeaweedTakeFlag;

    private boolean isTofuSkinTakeFlag;

    private boolean isTunaCutFlag;

    private boolean isShrimpCutFlag;

    private boolean[] DirectionFlag;

    private int[] DirectionChoose;

    private boolean Now_Meal_Done;

    private boolean Now_Meal2_Done;

    private boolean Bento_Send;

    public GameControl() {
        this.gameDTO = new GameDTO();

        this.panelGame = new PanelGame(gameDTO , this);
        this.panelGame2 = new PanelGame2(gameDTO , this);

        this.gameService = new GameService(gameDTO , this);

        frameGame = new FrameGame(panelGame);
        frameGame2 = new FrameGame2(panelGame2);

        levelChoose = new LevelChoose(this);

        startFrame = new StartFrame(this);

        gameRule = new GameRule(startFrame);

        endFrame = new EndFrame(this);

        StopFlag = true;

        TakeCabbageFlag = false;

        TakeTomatoFlag = false;

        TakeCucumberFlag = false;

        TakeRiceFlag = false;

        TakeSalmonFlag = false;

        TakeSeaweedFlag = false;

        TakeTofuSkinFlag = false;

        TakeTunaFlag = false;

        TakeShrimpFlag = false;

        isCabbageCutFlag = false;

        isRiceCookFlag = false;

        isSalmonCutFlag = false;

        isSeaweedTakeFlag = false;

        isTofuSkinTakeFlag = false;

        isTunaCutFlag = false;

        isShrimpCutFlag = false;

        DirectionFlag = new boolean[] {false , false , false , false}; //0左1右2上3下

        DirectionChoose = new int[] {0 , 0 , 0}; //0左1右2 下

        Now_Meal_Done = false;

        Now_Meal2_Done = false;

        Bento_Send = false;

    }

    public void Initial_DirectionFlag(){//方向初始
        for(int i =0;i<4;i++){
            DirectionFlag[i] = false;
        }

    }

    public boolean ReturnTakeCabbageFlag(){return TakeCabbageFlag;}

    public boolean ReturnTakeTomatoFlag(){return TakeTomatoFlag;}

    public boolean ReturnTakeCucumberFlag(){return TakeCucumberFlag;}

    public boolean ReturnTakeRiceFlag(){return TakeRiceFlag;}

    public boolean ReturnTakeSalmonFlag(){return TakeSalmonFlag;}

    public boolean ReturnTakeSeaweedFlag(){return TakeSeaweedFlag;}

    public boolean ReturnTakeTofuSkinFlag(){return TakeTofuSkinFlag;}

    public boolean ReturnTakeTunaFlag(){return TakeTunaFlag;}

    public boolean ReturnTakeShrimpFlag(){return TakeShrimpFlag;}

    public boolean ReturnTakeBentoFlag(){return TakeBentoFlag;}

    public boolean ReturnBentoSendFlag(){return Bento_Send;}

    public void SetBentoSendFlag(boolean result){
        Bento_Send = result;
    }

    public boolean ReturnCabbageCutFlag(){return isCabbageCutFlag;}

    public boolean ReturnTomatoCutFlat(){return isTomatoCutFlag;}

    public boolean ReturnCucumberCutFlag(){return isCucumberCutFlag;}

    public int PictureChoose(int dir){//決定圖片
        int pic = DirectionChoose[dir];
        if(DirectionChoose[dir] == 0){
            DirectionChoose[dir] = 1;
        }
        else if(DirectionChoose[dir] == 1){
            DirectionChoose[dir] = 0;
        }

        return pic;
    }

    public int DirectionNow(){ //得到方向
        int dir = 4;
        for(int i =0;i<4;i++){
            if(DirectionFlag[i]){
                dir = i;
                break;
            }
        }
        return dir;
    }

    public void UP() {
        this.gameService.UP();
        Initial_DirectionFlag();
        DirectionFlag[2] = true;
        StopFlag = false;
       // TakeFoodFlag = false;
        WalkSound walkSound = new WalkSound();
        this.panelGame.repaint();
    }

    public void DOWN() {
        this.gameService.DOWN();
        Initial_DirectionFlag();
        DirectionFlag[3] = true;
        StopFlag = false;
        //TakeFoodFlag = false;
        WalkSound walkSound = new WalkSound();
        this.panelGame.repaint();
    }

    public void RIGHT() {
        this.gameService.RIGHT();
        Initial_DirectionFlag();
        DirectionFlag[1] = true;
        StopFlag = false;
       // TakeFoodFlag = false;
        WalkSound walkSound = new WalkSound();
        this.panelGame.repaint();
    }

    public void LEFT() {
        this.gameService.LEFT();
        Initial_DirectionFlag();
        DirectionFlag[0] = true;
        StopFlag = false;
       // TakeFoodFlag = false;
        WalkSound walkSound = new WalkSound();
        this.panelGame.repaint();
    }

    public void Take() {
        if(this.gameDTO.getPlayerWalk().is_Cabbage_touched()){
            Initial_DirectionFlag();
            TakeCabbageFlag = true;
            TakeTomatoFlag = false;
            TakeCucumberFlag = false;
            StopFlag = true;
            isCabbageCutFlag = false;
        }
        else if(this.gameDTO.getPlayerWalk().is_Tomato_touched()){
            Initial_DirectionFlag();
            TakeCabbageFlag = false;
            TakeTomatoFlag = true;
            TakeCucumberFlag = false;
            StopFlag = true;
            isTomatoCutFlag = false;
        }
        else if(this.gameDTO.getPlayerWalk().is_Cucumber_touched()){
            Initial_DirectionFlag();
            StopFlag = true;
            TakeCabbageFlag = false;
            TakeTomatoFlag = false;
            TakeCucumberFlag = true;
            isCucumberCutFlag = false;
        }
        else if(this.gameDTO.getPlayerWalk().is_Bento_touched()){
            Initial_DirectionFlag();
            StopFlag = true;
            TakeCabbageFlag = false;
            TakeTomatoFlag = false;
            TakeCucumberFlag = false;
            TakeBentoFlag = true;

        }
        else if(this.gameDTO.getPlayerWalk().is_knife_touched()){
            if(!isCabbageCutFlag && TakeCabbageFlag){
                Initial_DirectionFlag();
                StopFlag = true;
                TakeCabbageFlag = false;
                TakeTomatoFlag = false;
                TakeCucumberFlag = false;
                this.gameDTO.getDesideMenu().check_cabage_iscut();
                Now_Meal_Done = this.gameDTO.getDesideMenu().Menu_isDone();
                this.gameDTO.getProgressBar().InitProgress();//切菜的能量條
                this.gameDTO.getProgressBar().ShowProgress();
                //PlayMusic playMusic = new PlayMusic();
                isCabbageCutFlag = true;

            }

            if(!isTomatoCutFlag && TakeTomatoFlag){
                Initial_DirectionFlag();
                StopFlag = true;
                TakeCabbageFlag = false;
                TakeTomatoFlag = false;
                TakeCucumberFlag = false;
                this.gameDTO.getDesideMenu().check_tomato_iscut();
                Now_Meal_Done = this.gameDTO.getDesideMenu().Menu_isDone();
                this.gameDTO.getProgressBar().InitProgress();//切菜的能量條
                this.gameDTO.getProgressBar().ShowProgress();
                isTomatoCutFlag = true;
            }

            if(!isCucumberCutFlag && TakeCucumberFlag){
                Initial_DirectionFlag();
                StopFlag = true;
                TakeCabbageFlag = false;
                TakeTomatoFlag = false;
                TakeCucumberFlag = false;
                this.gameDTO.getDesideMenu().check_cucumber_iscut();
                Now_Meal_Done = this.gameDTO.getDesideMenu().Menu_isDone();
                this.gameDTO.getProgressBar().InitProgress();//切菜的能量條
                this.gameDTO.getProgressBar().ShowProgress();
                isCucumberCutFlag = true;
            }

        }

        this.panelGame.repaint();
    }


    public void Give() {
        if(this.gameDTO.getPlayerWalk().is_LayerSendFood_touched()){
            StopFlag = true;
            TakeCabbageFlag = false;
            TakeTomatoFlag = false;
            TakeCucumberFlag = false;
            TakeBentoFlag = false;
            Bento_Send = true;
            PlayMusic playMusic = new PlayMusic();
            this.gameService.Give();
        }
        this.panelGame.repaint();
    }

    public GameDTO getGameDTO() {
        return gameDTO;
    }

    public void setGameDTO(GameDTO gameDTO) {
        this.gameDTO = gameDTO;
    }

    public StartFrame getStartFrame(){return startFrame;}

    public FrameGame getFrameGame() {
        return frameGame;
    }

    public EndFrame getEndFrame() {
        return endFrame;
    }

    public FrameGame2 getFrameGame2(){return frameGame2;}

    public GameService getGameService(){return gameService;}

    public LevelChoose getLevelChoose(){return levelChoose;}

    public GameRule getGameRule(){
        return gameRule;
    }

    public void start() {
        StopFlag = true;//因為人物左右移動在第一關和第二關都會使用到所以要先初始化
        this.gameDTO.InitDTO();
        this.gameService.Start();
        this.levelChoose.start();
        this.panelGame.repaint();
        this.panelGame2.repaint();

    }

    public void UP2() {
        this.gameService.UP2();
        Initial_DirectionFlag();
        DirectionFlag[2] = true;
        StopFlag = false;
        // TakeFoodFlag = false;
        WalkSound walkSound = new WalkSound();
        this.panelGame2.repaint();
    }

    public void DOWN2() {
        this.gameService.DOWN2();
        Initial_DirectionFlag();
        DirectionFlag[3] = true;
        StopFlag = false;
        //TakeFoodFlag = false;
        WalkSound walkSound = new WalkSound();
        this.panelGame2.repaint();
    }

    public void RIGHT2() {
        this.gameService.RIGHT2();
        Initial_DirectionFlag();
        DirectionFlag[1] = true;
        StopFlag = false;
        // TakeFoodFlag = false;
        WalkSound walkSound = new WalkSound();
        this.panelGame2.repaint();
    }

    public void LEFT2() {
        this.gameService.LEFT2();
        Initial_DirectionFlag();
        DirectionFlag[0] = true;
        StopFlag = false;
        // TakeFoodFlag = false;
        WalkSound walkSound = new WalkSound();
        this.panelGame2.repaint();
    }

    public void Take2()  {
        if(this.gameDTO.getPlayerWalk2().is_Rice_touched()){
            Initial_DirectionFlag();
            TakeRiceFlag = true;
            TakeSalmonFlag = false;
            TakeSeaweedFlag = false;
            TakeTofuSkinFlag = false;
            TakeTunaFlag = false;
            TakeShrimpFlag = false;
            StopFlag = true;

        }

        if(this.gameDTO.getPlayerWalk2().is_Salmon_touched()){
            Initial_DirectionFlag();
            TakeRiceFlag = false;
            TakeSalmonFlag = true;
            TakeSeaweedFlag = false;
            TakeTofuSkinFlag = false;
            TakeTunaFlag = false;
            TakeShrimpFlag = false;
            StopFlag = true;
        }

        if(this.gameDTO.getPlayerWalk2().is_Seaweed_touched()){
            Initial_DirectionFlag();
            TakeRiceFlag = false;
            TakeSalmonFlag = false;
            TakeSeaweedFlag = true;
            TakeTofuSkinFlag = false;
            TakeTunaFlag = false;
            TakeShrimpFlag = false;
            StopFlag = true;
            isSeaweedTakeFlag = true;
            this.gameDTO.getDesideMenu().check_seaweed_istake();
            Now_Meal2_Done = this.gameDTO.getDesideMenu().Menu2_isDone();
        }

        if(this.gameDTO.getPlayerWalk2().is_Tofu_Skin_touched()){
            Initial_DirectionFlag();
            TakeRiceFlag = false;
            TakeSalmonFlag = false;
            TakeSeaweedFlag = false;
            TakeTofuSkinFlag = true;
            TakeTunaFlag = false;
            TakeShrimpFlag = false;
            StopFlag = true;
            isTofuSkinTakeFlag = true;
            this.gameDTO.getDesideMenu().check_tofuskin_istake();
            Now_Meal2_Done = this.gameDTO.getDesideMenu().Menu2_isDone();
        }

        if(this.gameDTO.getPlayerWalk2().is_Tuna_touched()){
            Initial_DirectionFlag();
            TakeRiceFlag = false;
            TakeSalmonFlag = false;
            TakeSeaweedFlag = false;
            TakeTofuSkinFlag = false;
            TakeTunaFlag = true;
            TakeShrimpFlag = false;
            StopFlag = true;
        }

        if(this.gameDTO.getPlayerWalk2().is_Shrimp_touched()){
            Initial_DirectionFlag();
            TakeRiceFlag = false;
            TakeSalmonFlag = false;
            TakeSeaweedFlag = false;
            TakeTofuSkinFlag = false;
            TakeTunaFlag = false;
            TakeShrimpFlag = true;
            StopFlag = true;
        }

        if(this.gameDTO.getPlayerWalk2().is_Bento_touched()){
            Initial_DirectionFlag();
            TakeRiceFlag = false;
            TakeSalmonFlag = false;
            TakeSeaweedFlag = false;
            TakeTofuSkinFlag = false;
            TakeTunaFlag = false;
            TakeShrimpFlag = false;
            TakeBentoFlag = true;
            StopFlag = true;
        }
        if(this.gameDTO.getPlayerWalk2().is_Round2_Knife_touched()){
            if(!isSalmonCutFlag && TakeSalmonFlag){
                StopFlag = true;
                TakeRiceFlag = false;
                TakeSalmonFlag = false;
                TakeSeaweedFlag = false;
                TakeTofuSkinFlag = false;
                TakeTunaFlag = false;
                TakeShrimpFlag = false;
                this.gameDTO.getDesideMenu().check_salmon_iscut();
                Now_Meal2_Done = this.gameDTO.getDesideMenu().Menu2_isDone();
                this.gameDTO.getProgressBarLevel2Knife().InitProgress();
                this.gameDTO.getProgressBarLevel2Knife().ShowProgress();
                isShrimpCutFlag = false;
            }
            else if(!isTunaCutFlag && TakeTunaFlag){
                StopFlag = true;
                TakeRiceFlag = false;
                TakeSalmonFlag = false;
                TakeSeaweedFlag = false;
                TakeTofuSkinFlag = false;
                TakeTunaFlag = false;
                TakeShrimpFlag = false;
                this.gameDTO.getDesideMenu().check_tuna_iscut();
                Now_Meal2_Done = this.gameDTO.getDesideMenu().Menu2_isDone();
                this.gameDTO.getProgressBarLevel2Knife().InitProgress();
                this.gameDTO.getProgressBarLevel2Knife().ShowProgress();
                isTunaCutFlag = false;
            }
            else if(!isShrimpCutFlag && TakeShrimpFlag){
                StopFlag = true;
                TakeRiceFlag = false;
                TakeSalmonFlag = false;
                TakeSeaweedFlag = false;
                TakeTofuSkinFlag = false;
                TakeTunaFlag = false;
                TakeShrimpFlag = false;
                this.gameDTO.getDesideMenu().check_shrimp_iscut();
                Now_Meal2_Done = this.gameDTO.getDesideMenu().Menu2_isDone();
                this.gameDTO.getProgressBarLevel2Knife().InitProgress();
                this.gameDTO.getProgressBarLevel2Knife().ShowProgress();
                isShrimpCutFlag = false;
            }
        }

        if(this.gameDTO.getPlayerWalk2().is_Pot_touched()){
            if(!isRiceCookFlag && TakeRiceFlag){
                StopFlag = true;
                TakeRiceFlag = false;
                TakeSalmonFlag = false;
                TakeSeaweedFlag = false;
                TakeTofuSkinFlag = false;
                TakeTunaFlag = false;
                TakeShrimpFlag = false;
                this.gameDTO.getDesideMenu().check_rice_cook();
                Now_Meal2_Done = this.gameDTO.getDesideMenu().Menu2_isDone();
                this.gameDTO.getProgressBarRice().InitProgress();
                this.gameDTO.getProgressBarRice().ShowProgress();
                isRiceCookFlag = false;
            }
        }
        this.panelGame2.repaint();
    }

    public void Give2() {
        if(this.gameDTO.getPlayerWalk2().is_LayerSendFood_touched()){
            Initial_DirectionFlag();
            StopFlag = true;
            TakeRiceFlag = false;
            TakeSalmonFlag = false;
            TakeSeaweedFlag = false;
            TakeTofuSkinFlag = false;
            TakeTunaFlag = false;
            TakeShrimpFlag = false;
            TakeBentoFlag = false;
            Bento_Send = true;
            PlayMusic playMusic = new PlayMusic();
            this.gameService.Give2();
        }
        this.panelGame2.repaint();
    }

    class PlayMusic{
        private File file;
        private AudioInputStream audioInputStream;
        private Clip clip;

        public PlayMusic(){
            file = new File("coin.wav");
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

    class WalkSound{
        private File file;
        private AudioInputStream audioInputStream;
        private Clip clip;

        public WalkSound(){
            file = new File("footstep.wav");
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
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

