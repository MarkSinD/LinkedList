package com.company.two;

/**
 * todo Document type Car
 */
public class Car implements Comparable<Car>{
    private int mass;
    private double lenght;

    @Override
    public int compareTo(Car o) {
        return Double.compare(this.lenght, o.lenght);
    }
}
