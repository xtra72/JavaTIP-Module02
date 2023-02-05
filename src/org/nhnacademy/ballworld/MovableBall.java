package org.nhnacademy.ballworld;

import java.awt.Color;

public class MovableBall extends Ball {
    Motion motion;
    Motion acceleration;

    public MovableBall(Point location, double radius, Color color, int height) {
        super(location, radius, color, height);
        motion = new Motion();
        acceleration = new Motion();
    }

    public MovableBall(Point location, double radius, int height) {
        super(location, radius, height);
        motion = new Motion();
        acceleration = new Motion();
    }

    public void setMotion(Motion motion) {
        this.motion = motion;
    }

    public void setAcceleration(Motion acceleration) {
        this.acceleration = acceleration;
    }

    public void addAcceleration(Motion acceleration) {
        this.acceleration.add(acceleration);
    }

    public void move() {
        motion.add(acceleration);
        location.move(motion.getDX(), motion.getDY());
    }

    public void turnX() {
        motion.turnX();
    }

    public void turnY() {
        motion.turnY();
    }
}
