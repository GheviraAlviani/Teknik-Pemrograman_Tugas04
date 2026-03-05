/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paintthings;

/**
 *
 * @author ghevira
 */
public abstract class Shape {
    protected String shapeName;

    public Shape(String name) {
        shapeName = name;
    }

    // Method abstract: semua turunan harus punya area
    public abstract double area();

    public String toString() {
        return shapeName;
    }
}
