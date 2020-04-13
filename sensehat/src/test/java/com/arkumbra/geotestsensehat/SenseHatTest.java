package com.arkumbra.geotestsensehat;

import org.junit.Test;
import rpi.sensehat.api.LEDMatrix;
import rpi.sensehat.api.SenseHat;

public class SenseHatTest {

    @Test
    public void test() throws InterruptedException {
        LEDMatrix ledMatrix = new SenseHat().ledMatrix;

        ledMatrix.showMessage("Hello, World!");

        waitFor(2000);
    }

    private void waitFor(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
