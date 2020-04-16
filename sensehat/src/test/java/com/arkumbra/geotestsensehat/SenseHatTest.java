package com.arkumbra.geotestsensehat;

import org.junit.Test;
import rpi.sensehat.api.Joystick;
import rpi.sensehat.api.LEDMatrix;
import rpi.sensehat.api.SenseHat;
import rpi.sensehat.api.dto.Color;
import rpi.sensehat.api.dto.JoystickEvent;
import rpi.sensehat.api.dto.joystick.Direction;

public class SenseHatTest {

    @Test
    public void test() throws InterruptedException {
        LEDMatrix ledMatrix = new SenseHat().ledMatrix;

        ledMatrix.showMessage("Hello, World!");
    }

    @Test
    public void waitForJoystickInput() {
        SenseHat senseHat = new SenseHat();
        LEDMatrix ledMatrix = senseHat.ledMatrix;
        Joystick joystick = senseHat.joystick;

        ledMatrix.flipVertically();
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

        ledMatrix.flipVertically();
        ledMatrix.lowLight(true);

        ledMatrix.showMessage(".");
        
        int x = 3, y = 3;
        
        int counter = 0;

        while (counter < 20) {
            counter++;
            ledMatrix.setPixel(x, y, Color.GREEN);
            JoystickEvent joystickEvent = joystick.waitForEvent();
            Direction direction = joystickEvent.getDirection();
            switch (direction) {
                case UP:    y++; break;
                case DOWN:  y--; break;
                case RIGHT: x++; break;
                case LEFT:  x--; break;
                default: continue;
            }
            
            // clear events ?
            joystick.getEvents();
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
