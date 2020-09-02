package com.arkumbra.geotestsensehat;

import org.junit.Ignore;
import org.junit.Test;
import rpi.sensehat.api.Joystick;
import rpi.sensehat.api.LEDMatrix;
import rpi.sensehat.api.SenseHat;
import rpi.sensehat.api.dto.Color;
import rpi.sensehat.api.dto.JoystickEvent;
import rpi.sensehat.api.dto.joystick.Action;
import rpi.sensehat.api.dto.joystick.Direction;

@Ignore
public class SenseHatTest {

    @Ignore
    @Test
    public void test() throws InterruptedException {
        LEDMatrix ledMatrix = new SenseHat().ledMatrix;

        ledMatrix.showMessage("Hello, World!");
    }

    @Ignore
    @Test
    public void waitForJoystickInput() {
        SenseHat senseHat = new SenseHat();
        LEDMatrix ledMatrix = senseHat.ledMatrix;
        Joystick joystick = senseHat.joystick;

        //ledMatrix.flipVertically(); not supported yet...
        ledMatrix.lowLight(true);

        ledMatrix.showMessage("...");
        JoystickEvent joystickEvent = joystick.waitForEvent();
        Direction direction = joystickEvent.getDirection();

        ledMatrix.showMessage(direction.name());
    }

    @Test
    public void moveOnJoystickInput() {
        SenseHat senseHat = new SenseHat();
        LEDMatrix ledMatrix = senseHat.ledMatrix;
        Joystick joystick = senseHat.joystick;

        ledMatrix.lowLight(true);

        ledMatrix.showMessage("GO");
        
        int x = 3, y = 3;
        
        int counter = 0;

        while (counter < 20) {
            ledMatrix.clear();
            ledMatrix.setPixel(x, y, Color.GREEN);
            JoystickEvent joystickEvent = joystick.waitForEvent();
            System.out.println(joystickEvent.getDirection());

            if (joystickEvent.getAction() == Action.RELEASED) {
                // skip
                continue;
            }

            if (joystickEvent.getAction() == Action.PRESSED && joystickEvent.getDirection() == Direction.MIDDLE) {
                ledMatrix.showMessage("QUIT");
                break;
            }

            Direction direction = joystickEvent.getDirection();
            switch (direction) {
                case UP:    y--; break;
                case DOWN:  y++; break;
                case RIGHT: x++; break;
                case LEFT:  x--; break;
                default: continue;
            }

            counter++;;
            // clear events ?
            // joystick.getEvents();
        }


        ledMatrix.showMessage("End");
    }


    private void waitFor(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
