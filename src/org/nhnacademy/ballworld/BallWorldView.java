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


    public void addDrawListener(BallWorld controller) {
        this.controller = controller;
    }

    public void setVirtualSize(int width, int height) {
        virtualWidth = width;
        virtualHeight = height;
    }

    public int translateY(int y) {
        return  getHeight() - y;
    }

    protected void draw(Graphics graphics, Ball ball) {
        graphics.setColor(ball.getColor());
        double x = (ball.getLocation().getX() - ball.getRadius()) / (double)virtualWidth * (double)getWidth();
        double y = translateY((int)(ball.getLocation().getY() + ball.getRadius())) / (double)virtualHeight * getHeight();

        graphics.fillOval((int)x, (int)y,
                (int) (2 * ball.getRadius() / virtualWidth * getWidth() ),
                (int) (2 * ball.getRadius() / virtualHeight * getHeight() ));
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
