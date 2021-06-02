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
public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;
    public Painting(){
        height = 0;
        width = 0;
        isWatercolour = false;
        isFramed = false;
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed) {
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }



    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    public void inputPainting(){
        input();
        System.out.print("Enter the height: ");
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        System.out.println();
        System.out.print("Enter the width: ");
        sc = new Scanner(System.in);
        width = sc.nextInt();
        System.out.println();
        System.out.print("WaterColour: ");
        sc = new Scanner(System.in);
        isWatercolour = sc.nextBoolean();
        System.out.println();
        System.out.print("Frame: ");
        sc = new Scanner(System.in);
        isFramed = sc.nextBoolean();
        System.out.println();
    }
    public void OutputPainting(){
        Output();
        System.out.println("Height:" + height );
        System.out.println("Width: " + width);
        System.out.println("WaterColour: " + isWatercolour);
        System.out.println("Frame: " + isFramed);
    }
}
