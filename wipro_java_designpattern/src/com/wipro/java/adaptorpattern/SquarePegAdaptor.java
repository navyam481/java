package com.wipro.java.adaptorpattern;


/**
 * Adapter allows fitting square pegs into round holes.
 */
public class SquarePegAdaptor extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdaptor(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
