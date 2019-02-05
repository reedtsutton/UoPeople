/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchbox;

/**
 *
 * @author Reed
 */
public class MatchBox extends Box {
    // Declare a new variable for a weight
    double weight;
        
    // This is a constructor with parameters
    MatchBox(double w, double h, double d) {
        width  = w;
        height = h;
        depth  = d;
    }
        
    // Calculate weight based upon volume.
    // Calculate mass (weight) given density and volume
    void calculateWeight(double water) {
        System.out.println ("Weight of MatchBox is " + (width * height * depth) * water);
        System.out.println ();
    }
        
    // The getVolume method in this class reports the values of width, height, depth, and weight, 
    @Override
    void getVolume() {
        System.out.println ("Width  of MatchBox is " + width);
        System.out.println ("Height of MatchBox is " + height);
        System.out.println ("Depth  of MatchBox is " + depth);
        System.out.println ();
    }
        
       
    public static void main(String[] args) {

        Box box = new Box(5.0, 10.0, 3.0); // Object of class Box.java with given parameters
        MatchBox myBox = new MatchBox(box.width, box.height, box.depth); // Object of class MatchBox.java
                                                                         // with parameters from the "box" object
                                                                         
        myBox.getVolume();  // Calls the getVolume() method from the MatchBox.java class.
        myBox.calculateWeight(0.03611);
        box.getVolume();  // Calls the getVolume() method from the Box.java class.

    }   
}