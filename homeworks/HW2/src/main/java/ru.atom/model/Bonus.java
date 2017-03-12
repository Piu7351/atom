package ru.atom.model;

import ru.atom.geometry.Point;

public class Bonus implements Positionable {
    private int id;
    private Point position;

    public Bonus(int id, Point position) {
        this.id = id;
        this.position = position;
    }

    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public int getId() {
        return id;
    }

}
