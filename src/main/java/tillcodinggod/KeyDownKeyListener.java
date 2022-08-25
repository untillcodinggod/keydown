package tillcodinggod;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyDownKeyListener implements KeyListener {
    private final KeyDown keyDown;

    public KeyDownKeyListener(KeyDown keyDown) {
        this.keyDown = keyDown;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        if (e.getKeyCode()  == KeyEvent.VK_ENTER) {
            keyDown.updateMessage();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
