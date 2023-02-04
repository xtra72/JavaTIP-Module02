package org.nhnacademy.ballworld;

import java.awt.Color;

public class CannonBall extends MovableBall {
    double gravity;

    public CannonBall(Point location, double radius, Color color) {
        super(location, radius, color);
        this.gravity = 0;
    }

    public CannonBall(Point location, double radius) {
        super(location, radius);
        this.gravity = 0;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    public double getGravity() {
        return  this.gravity;
    }

    @Override
    public void move() {
        super.move();
        if (location.getY() < radius) {
            location.moveTo(location.getX(), radius);
            this.motion.setVelocity(0);
        } else {
            this.motion.addDY(-gravity);
        }
    }
}
