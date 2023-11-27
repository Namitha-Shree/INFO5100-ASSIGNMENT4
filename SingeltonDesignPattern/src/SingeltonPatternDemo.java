/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Namitha
 * @version 1.0
 */
public class SingeltonPatternDemo {
    
    /**
     * Main method to test the singelton design pattern.
     *
     * @param args command line arguments
     */
    public static void main(String[] args){
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
