/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Person {

    private String name;
    private String adress;

    public Person(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public void getName() {
        System.out.println(this.name);
    }

    public void getAdress() {
        System.out.println(this.adress);
    }

    @Override
    public String toString() {
        return this.name + "\n  " + this.adress;
    }
}
