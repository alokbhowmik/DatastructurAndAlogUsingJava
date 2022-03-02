package com.company;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Rabit extends Robot {

    static final int MULTIPLYER = 1000;
    static final int DELAY = 1000;
    static final int PERIOD = 10000;

    public Rabit() throws AWTException {
    }

    private void jumpRabit() throws InterruptedException {
        Point point = MouseInfo.getPointerInfo().getLocation();
        int xi1 = (int) (Math.random() * MULTIPLYER);
        int yi1 = (int) (Math.random() * MULTIPLYER);

        int i = point.x, j = point.y;
        while (i != xi1 || j != yi1) {
            // move the mouse to the other point
            mouseMove(i, j);

            if (i < xi1)
                i++;
            if (j < yi1)
                j++;

            if (i > xi1)
                i--;
            if (j > yi1)
                j--;


            // wait
            //Thread.sleep(30);
        }
        //   mouseMove(10, 500);
    }

    private void continueJump() {

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                try {
                    jumpRabit();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, DELAY, PERIOD);
    }

    public static void main(String[] args) throws AWTException, InterruptedException {
        Rabit rabit = new Rabit();
        rabit.continueJump();
    }
}
