/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Namitha
 * @version 1.0
 */
public class SingleObject {
    /**
     * Private static variable to hold the singleton instance of this class.
     */
    private static SingleObject instance = null;
    
    /**
     * Private identifier variable for the singleton object.
     */
    private String identifier;
    
    /**
     * Private constructor to restrict the instantiation of this class to within this class itself.
     */
    private SingleObject(){}
    
    /**
     * Static method to create and return the singleton instance of this class.
     *
     * @return the singleton instance of this class
     */
    public static SingleObject getInstance(){
        if(instance == null) {
         instance = new SingleObject();
      }
      return instance;
    }
    
    /**
     * Method to display a message on the console.
     */
    public void showMessage(){
        System.out.println("Hello World!");
    }

    /**
     * Getter method to retrieve the identifier value of the singleton object.
     *
     * @return the identifier value of the singleton object
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Setter method to set the identifier value of the singleton object.
     *
     * @param identifier the new identifier value to set
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
