package org.nhnacademy.ballworld;

import java.awt.Color;

public class CannonBall extends MovableBall {
    /**
     * 중력
     */
    double gravity;

    public CannonBall(Point location, double radius, Color color, int height) {
        super(location, radius, color, height);
        this.gravity = 0;
    }

    public CannonBall(Point location, double radius, int height) {
        super(location, radius, height);
        this.gravity = 0;
    }

    /**
     *
     * @param gravity
     */
    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    /**
     *
     * @return
     */
    public double getGravity() {
        return  this.gravity;
    }

    /**
     * 볼을 이동하고, 볼이 바닥에 닿은 경우 움직임을 멈춘다.
     */
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
