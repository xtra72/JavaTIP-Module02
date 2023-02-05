package org.nhnacademy.ballworld;

import java.awt.Color;

public class CannonBall extends MovableBall {

    public CannonBall(Point location, double radius, Color color, int height) {
        super(location, radius, color, height);
    }

    public CannonBall(Point location, double radius, int height) {
        super(location, radius, height);
    }

    @Override
    public void move() {
        super.move();
        if (location.getY() < radius) {
            location.moveTo(location.getX(), radius);
            motion.setDXDY(0, 0);
            acceleration.setDXDY(0, 0);
        }
    }
}
