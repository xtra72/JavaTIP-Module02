package org.nhnacademy.ballworld;

import java.awt.Color;

public class MovableBall extends Ball {
    Motion motion;

    public MovableBall(Point location, double radius, Color color, int height) {
        super(location, radius, color, height);
    }

    public MovableBall(Point location, double radius, int height) {
        super(location, radius, height);
    }

    public void setMotion(Motion motion) {
        this.motion = motion;
    }

    public void move() {
        location.move(this.motion.getDX(), this.motion.getDY());
    }

    public void turnX() {
        motion.turnX();
    }

    public void turnY() {
        motion.turnY();
    }
}
