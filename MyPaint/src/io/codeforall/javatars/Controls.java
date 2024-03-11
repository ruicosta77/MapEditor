package io.codeforall.javatars;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Controls implements KeyboardHandler {

    private Player player;
    private boolean rightPressed = false;
    private boolean leftPressed = false;
    private boolean upPressed = false;
    private boolean downPressed = false;
    private boolean spacePressed = false;
    private boolean cPressed = false;

    public Controls(Player player) {
        this.player = player;
        init();
    }

    private void updatePaddles() {
        /*if (rightPressed) {
            player.moveRight();
        }
        if (leftPressed) {
            player.moveLeft();
        }
        if (upPressed) {
            player.moveUp();
        }
        if (downPressed) {
            player.moveDown();
        }
        if (spacePressed) {
            player.paint();
        }
        /*if (cPressed) {
            player.clear();
        }*/
    }

    private void init() {
        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent rightEvent = new KeyboardEvent();
        rightEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        rightEvent.setKey(KeyboardEvent.KEY_RIGHT);
        keyboard.addEventListener(rightEvent);

        KeyboardEvent leftEvent = new KeyboardEvent();
        leftEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        leftEvent.setKey(KeyboardEvent.KEY_LEFT);
        keyboard.addEventListener(leftEvent);

        KeyboardEvent upEvent = new KeyboardEvent();
        upEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        upEvent.setKey(KeyboardEvent.KEY_UP);
        keyboard.addEventListener(upEvent);

        KeyboardEvent downEvent = new KeyboardEvent();
        downEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        downEvent.setKey(KeyboardEvent.KEY_DOWN);
        keyboard.addEventListener(downEvent);

        KeyboardEvent rightEvent2 = new KeyboardEvent();
        rightEvent2.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        rightEvent2.setKey(KeyboardEvent.KEY_RIGHT);
        keyboard.addEventListener(rightEvent2);

        KeyboardEvent leftEvent2 = new KeyboardEvent();
        leftEvent2.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        leftEvent2.setKey(KeyboardEvent.KEY_LEFT);
        keyboard.addEventListener(leftEvent2);

        KeyboardEvent upEvent2 = new KeyboardEvent();
        upEvent2.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        upEvent2.setKey(KeyboardEvent.KEY_UP);
        keyboard.addEventListener(upEvent2);

        KeyboardEvent downEvent2 = new KeyboardEvent();
        downEvent2.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        downEvent2.setKey(KeyboardEvent.KEY_DOWN);
        keyboard.addEventListener(downEvent2);

        KeyboardEvent spaceEvent = new KeyboardEvent();
        spaceEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        spaceEvent.setKey(KeyboardEvent.KEY_SPACE);
        keyboard.addEventListener(spaceEvent);

        KeyboardEvent spaceEvent2 = new KeyboardEvent();
        spaceEvent2.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        spaceEvent2.setKey(KeyboardEvent.KEY_SPACE);
        keyboard.addEventListener(spaceEvent2);

        KeyboardEvent cEvent = new KeyboardEvent();
        cEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        cEvent.setKey(KeyboardEvent.KEY_C);
        keyboard.addEventListener(cEvent);

        KeyboardEvent cEvent2 = new KeyboardEvent();
        cEvent2.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        cEvent2.setKey(KeyboardEvent.KEY_C);
        keyboard.addEventListener(cEvent2);

        KeyboardEvent saveEvent = new KeyboardEvent();
        saveEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        saveEvent.setKey(KeyboardEvent.KEY_S);
        keyboard.addEventListener(saveEvent);

        KeyboardEvent loadEvent = new KeyboardEvent();
        loadEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        loadEvent.setKey(KeyboardEvent.KEY_L);
        keyboard.addEventListener(loadEvent);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
                //rightPressed = true;
                //leftPressed = false;
                player.moveRight();
                break;
            case KeyboardEvent.KEY_LEFT:
                //leftPressed = true;
                //rightPressed = false;
                player.moveLeft();
                break;
            case KeyboardEvent.KEY_UP:
                //upPressed = true;
                //downPressed = false;
                player.moveUp();
                break;
            case KeyboardEvent.KEY_DOWN:
                //downPressed = true;
                //upPressed = false;
                player.moveDown();
                break;
            case KeyboardEvent.KEY_SPACE:
                //spacePressed = true;
                player.paint();
                break;
            case KeyboardEvent.KEY_C:
                //cPressed = true;
                player.clear();
                break;
            case KeyboardEvent.KEY_S:
                player.save();
                break;
            case KeyboardEvent.KEY_L:
                player.load();
                break;
        }
        updatePaddles();
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            /*case KeyboardEvent.KEY_RIGHT:
                rightPressed = false;
                break;
            case KeyboardEvent.KEY_LEFT:
                leftPressed = false;
                break;
            case KeyboardEvent.KEY_UP:
                upPressed = false;
                break;
            case KeyboardEvent.KEY_DOWN:
                downPressed = false;
                break;
            case KeyboardEvent.KEY_SPACE:
                spacePressed = false;
                break;
            case KeyboardEvent.KEY_C:
                cPressed = false;
                break;
        }*/
    }
        updatePaddles();

    }
}

