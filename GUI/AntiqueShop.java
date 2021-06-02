/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.Item;
import DTO.Painting;
import DTO.Statue;
import DTO.Vase;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class AntiqueShop {
    public static void main (String [] args){
        Item item = null; 
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Create a Vase: "); 
            System.out.println("2. Creat a Statue: ");
            System.out.println("3. Creat a Painting: ");
            System.out.println("4. Display the Item: ");
            System.out.print("Input a choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:  
                    item = new Vase();
                    ((Vase)item).inputVase();
                    break;
                
                case 2:  
                    item = new Statue();
                    ((Statue)item).inputStatue();
                    break;
               
                case 3:  
                    item = new Painting();
                    ((Painting)item).inputPainting();
                    break;
                
                case 4:  
                    if(item != null){
                        if(item instanceof Vase)
                            ((Vase)item).OutputVase();
                        
                        else if(item instanceof Statue)
                            ((Statue)item).OutputStatue();
                        
                        else if(item instanceof Painting)
                            ((Painting)item).OutputPainting();
                        
                    }    
                    else System.out.println("You need to creat a Project");
                        break;
                    
            
        }
    } while(choice <= 4);
        
}
}
    
