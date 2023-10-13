/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.geometryobjects;

/**
 *
 * @author Денис
 */
abstract class ThreeDGeometricObject {
    public abstract double volume();
    public abstract double surfaceArea();
}

class Ellipse extends ThreeDGeometricObject {
    private double axisA;
    private double axisB;

    public Ellipse(double axisA, double axisB) {
        this.axisA = axisA;
        this.axisB = axisB;
    }

    @Override
    public double volume() {
        // Ellipse does not have volume, so return 0
        return 0.0;
    }

    @Override
    public double surfaceArea() {
        // Calculate the surface area of an Ellipsoid
        return 4 * Math.PI * axisA * axisB;
    }
}

class Cube extends ThreeDGeometricObject {
    private double length;

    public Cube(double length) {
        this.length = length;
    }

    @Override
    public double volume() {
        return Math.pow(length, 3);
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(length, 2);
    }
}

class Main {
    public static void main(String[] args) {
        Ellipse ellipse = new Ellipse(3.0, 4.0);
        Cube cube = new Cube(2.0);

        System.out.println("Ellipse Surface Area: " + ellipse.surfaceArea());
        System.out.println("Ellipse Volume: " + ellipse.volume());

        System.out.println("Cube Surface Area: " + cube.surfaceArea());
        System.out.println("Cube Volume: " + cube.volume());
    }
}
