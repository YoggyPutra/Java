/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercisejfo7.pkg5;

/**
 *
 * @author ASUS
 */
public class PrisonTest {
    public static void main(String[] args) {
        Cell cell = new Cell("Cell Pembunuhan", false,"abcd");
        Prisoner bubba = new Prisoner("Ferdi Sambo", 1.75, 2, cell);
        bubba.display();
        bubba.openDoor("abcd"); 
        bubba.openDoor("abcd");  
        bubba.openDoor("abcd");
        
    }
}
