/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.moveable;

/**
 *
 * @author Денис
 */
public class Moveable {
    interface Moveable {
    void move();
}
interface Resizable extends Moveable {
    void resize();
}

class Object implements Resizable {
    @Override
    public void move() {
        System.out.println("Object is moving.");
    }

    @Override
    public void resize() {
        System.out.println("Object is resizing.");
    }
}
}