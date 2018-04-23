package com.kodilla.testing.shape;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> collection = new ArrayList<>();

    public void addFigure(Shape shape) {
        collection.add(shape);
    }

    public int getCollectionSize() {
        return collection.size();
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (collection.contains(shape)){
            collection.remove(shape);
            result = true;
        }
        return result;
    }

    public String getFigure(int n) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.0000");
        return collection.get(n).getShapeName() + " with a field of: " + decimalFormat.format(collection.get(n).getField());
    }


    public void showFigures() {
        for (int i = 0; i<collection.size(); i++) {
            System.out.println(getFigure(i));
        }

    }

}
