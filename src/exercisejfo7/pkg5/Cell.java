/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercisejfo7.pkg5;

/**
 *
 * @author ASUS
 */
public class Cell {
    private String name;
    private boolean isOpen;
    private String securityCode;

    public Cell(String name, boolean isOpen, String securityCode) {
        this.name = name;
        this.isOpen = isOpen;
        this.securityCode = securityCode;
    }

    public void display() {
        System.out.println("Cell Name : " + name);
    }

    public boolean isDoorOpen() {
        return isOpen;
    }

    public void setDoor(boolean condition) {
        isOpen = condition;
    }
    
    public void setDoor(String code) {
        if (code.equals(securityCode)) {
            if (isOpen) {
                System.out.println("The door is already Closed");
            } else {
                System.out.println("The door is already Opened");
            }
            isOpen = !isOpen;
        } else {
            System.out.println("the code is incorrect");
        }
    }


    public String getCellName() {
        return this.name;
    }

    public boolean getDoorCondition() {
        return isOpen;
    }

    public boolean checkSecurityCOdeIsMatch(String code) {
        return code.equals(securityCode);
    }

    public void setName(String finalName) {
        name = finalName;
    }

    void openDoor(String abcd) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

