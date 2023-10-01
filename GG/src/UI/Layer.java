package UI;

import Control.GameControl;
import DTO.GameDTO;

import java.awt.*;

 abstract public class Layer {


    protected GameDTO gameDTO;
    protected GameControl gameControl;

    public Layer(){

    }

    //在Layer的部分設置set數據，這樣在其他的Layer...就可以get數據
     public void setGameDTO(GameDTO gameDTO) {
         this.gameDTO = gameDTO;
     }

     public void setGameControl(GameControl gameControl) {
         this.gameControl = gameControl;
     }

     abstract protected void paint(Graphics g);
}
