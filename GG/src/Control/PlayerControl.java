package Control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerControl implements KeyListener {

    private GameControl gameControl;

    public PlayerControl(GameControl gameControl) {
        this.gameControl = gameControl;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_UP:
                this.gameControl.UP();
                try {
                    Thread.sleep(25);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                break;
            case KeyEvent.VK_DOWN:
                this.gameControl.DOWN();
                try {
                    Thread.sleep(25);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                break;
            case KeyEvent.VK_RIGHT:
                this.gameControl.RIGHT();
                try {
                    Thread.sleep(25);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                break;
            case KeyEvent.VK_LEFT:
                this.gameControl.LEFT();
                try {
                    Thread.sleep(25);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                break;
            case KeyEvent.VK_SPACE:
                this.gameControl.Take();
                break;
            case KeyEvent.VK_G:
                this.gameControl.Give();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
