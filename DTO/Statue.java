/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Statue extends Item {
    private int weight;
    private String Colour;
    public Statue(){
        weight = 0;
        Colour = "";
    }

    public Statue(int weight, String Colour) {
        this.weight = weight;
        this.Colour = Colour;
    }

    public Statue(int weight, String Colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.Colour = Colour;
    }

    

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return Colour;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }
    public void inputStatue(){
        input();
        System.out.print("Enter the weight: ");
        Scanner sc = new Scanner(System.in);
        weight = sc.nextInt();
        System.out.println();
        System.out.print("Enter the Colour: ");
        sc = new Scanner(System.in);
        Colour = sc.nextLine();
        System.out.println();
    }
    public void OutputStatue(){
        Output();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + Colour);
    }
}
