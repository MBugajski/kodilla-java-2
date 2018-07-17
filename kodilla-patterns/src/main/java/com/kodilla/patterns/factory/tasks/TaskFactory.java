package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("shop", "things", 1.1);
            case PAINTING:
                return new PaintingTask("paint", "white", "walls");
            case DRIVING:
                return new DrivingTask("drive", "far", "car");
            default:
                return null;
        }

    }
}
