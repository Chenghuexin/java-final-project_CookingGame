package Control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerControl2 implements KeyListener {
    private GameControl gameControl;

    public PlayerControl2(GameControl gameControl){
        this.gameControl = gameControl;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_UP:
                this.gameControl.UP2();
                try {
                    Thread.sleep(25);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                break;
            case KeyEvent.VK_DOWN:
                this.gameControl.DOWN2();
                try {
                    Thread.sleep(25);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                break;
            case KeyEvent.VK_RIGHT:
                this.gameControl.RIGHT2();
                try {
                    Thread.sleep(25);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                break;
            case KeyEvent.VK_LEFT:
                this.gameControl.LEFT2();
                try {
                    Thread.sleep(25);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                break;
            case KeyEvent.VK_SPACE:
                this.gameControl.Take2();
                break;
            case KeyEvent.VK_G:
                this.gameControl.Give2();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
