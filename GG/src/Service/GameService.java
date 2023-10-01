package Service;

import Control.GameControl;
import DTO.*;

import java.awt.*;
import java.util.Random;

//遊戲邏輯
public class GameService {
    private GameDTO gameDTO;

    private GameControl gameControl;

    private PlayerWalk playerWalk;

    private PlayerWalk2 playerWalk2;

    private Random random;

    public GameService(GameDTO gameDTO, GameControl gameControl) {
        random = new Random();
        this.gameDTO = gameDTO;
        this.gameControl = gameControl;
        this.gameDTO.setPlayerWalk(new PlayerWalk(this));
        this.gameDTO.setPlayerWalk2(new PlayerWalk2(this));
        this.gameDTO.setProgressBar(new ProgressBar(this));
        this.gameDTO.setProgressBarRice(new ProgressBarRice(this));
        this.gameDTO.setProgressBarLevel2Knife(new ProgressBarLevel2Knife(this));
        this.gameDTO.setDesideMenu(new DesideMenu(this , random.nextInt(7)));
        this.gameDTO.setDesideMenu(new DesideMenu(this , random.nextInt(6)));
    }

    public void UP() {this.gameDTO.getPlayerWalk().move(0 , -19);}

    public void DOWN() {
        this.gameDTO.getPlayerWalk().move(0 , 19);
    }

    public void RIGHT() {
        this.gameDTO.getPlayerWalk().move(19 , 0);
    }

    public void LEFT() {
        this.gameDTO.getPlayerWalk().move(-19 , 0);
    }

    public void Stop() {
            this.gameDTO.getPlayerWalk().move(0 , 0);
    }

    public void Take() {
        this.gameDTO.getPlayerWalk().move(0 , 0);
    }


    public void Give() {
        this.gameDTO.setDesideMenu(new DesideMenu(this , random.nextInt(7)));
    }

    public void Start(){
        this.gameDTO.setPlayerWalk(new PlayerWalk(this));
        this.gameDTO.setPlayerWalk2(new PlayerWalk2(this));
    }

    public void UP2() {
        this.gameDTO.getPlayerWalk2().move(0 , -19);
    }

    public void DOWN2() {
        this.gameDTO.getPlayerWalk2().move(0 , 19);
    }

    public void RIGHT2() {
        this.gameDTO.getPlayerWalk2().move(19 , 0);
    }

    public void LEFT2() {
        this.gameDTO.getPlayerWalk2().move(-19 , 0);
    }

    public void Give2() {this.gameDTO.setDesideMenu(new DesideMenu(this , random.nextInt(6)));}
}
