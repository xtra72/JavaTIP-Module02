package org.nhnacademy.ballworld;

import java.awt.Color;
import java.awt.Frame;
import java.util.logging.Logger;
import java.awt.Graphics;

public class BallWorldView extends Frame {
    Logger logger;
    BallWorld controller;
    int virtualWidth;
    int virtualHeight;

    public BallWorldView(int width, int height) {
        super();

        logger = Logger.getLogger("global");
        setSize(width, height);
        virtualWidth = width;
        virtualHeight = height;
    }


    public int getVirtualWidth() {
        return  virtualWidth;
    }

    public int getVirtualHeight() {
        return  virtualHeight;
    }

    public void addDrawListener(BallWorld controller) {
        this.controller = controller;
    }

    public void setVirtualSize(int width, int height) {
        virtualWidth = width;
        virtualHeight = height;
    }

    public double translateX(double x) {
        return  x / virtualWidth * getWidth();
    }

    public double translateY(double y) {
        return  (virtualHeight - y) / virtualHeight * getHeight();
    }

    public Point translateX(Point point) {
        return  new Point(point.getX(), translateY(point.getY()));
    }

    protected void draw(Graphics graphics, Ball ball) {
        graphics.setColor(ball.getColor());
        double x1 = translateX(ball.getLocation().getX() - ball.getRadius());
        double y1 = translateY((int)(ball.getLocation().getY() + ball.getRadius()));
        double x2 = translateX(ball.getLocation().getX() + ball.getRadius());
        double y2 = translateY((int)(ball.getLocation().getY() - ball.getRadius()));

        graphics.fillOval((int)x1, (int)y1, (int)(x2 - x1), (int)(y2 - y1));
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        if (this.controller != null) {
            for(Ball ball : this.controller.getBalls()) {
                Color oldColor = graphics.getColor();
                draw(graphics, ball);
                graphics.setColor(oldColor);
            }
        }
    }
}
