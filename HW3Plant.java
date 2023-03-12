/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mirea.kt.hw1plant;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class HW1Plant {

    public static void main(String[] args) {
        System.out.println("Вариант№4 РИБО-03-21 Семенова Ксения Александровна");
        Scanner in = new Scanner(System.in);
        System.out.println("If you want to choose:\n Plant enter P\n Trees enter T\n Coniferous enter C \n Deciduous enter D ");
        String plantType= in.nextLine();
        System.out.println("What title? ");
        String title= in.nextLine();
        System.out.println("What width? ");
        int width=in.nextInt();
        System.out.println("size in sm");
        int sizeInSm=in.nextInt();
        
        if (plantType.equals("P")){
             Plant firstPlant = new Plant(title,width,sizeInSm);
             Gardener gardener= new Gardener();
             gardener.filter(firstPlant);
             System.out.println(firstPlant.toString());
        }
        else if(plantType.equals("T")){
            System.out.println("What bark color? ");
            Scanner on = new Scanner(System.in);
             String barkColor= on.nextLine();
             System.out.println("What nomber of hollow? ");
             int nomberOfHollow=in.nextInt();
             System.out.println("What nomber of twig");
             int nomberTwig=in.nextInt();
             trees firstTrees = new trees(title,width,sizeInSm,barkColor,nomberOfHollow,nomberTwig);
             Gardener gardener= new Gardener();
             gardener.filter(firstTrees);
             System.out.println(firstTrees.toString());
        }
        else if(plantType.equals("C")){
            System.out.println("What bark color? ");
            Scanner on = new Scanner(System.in);
             String barkColor= on.nextLine();
             System.out.println("What nomber of hollow? ");
             int nomberOfHollow=in.nextInt();
             System.out.println("What nomber of twig");
             int nomberTwig=in.nextInt();
            System.out.println("What needle color? ");
            Scanner an = new Scanner(System.in);
             String needleСolor= an.nextLine();
             System.out.println("What lenght of needles? ");
             int lenghtOfNeedles=in.nextInt();
             System.out.println("What power of the smell of needles from 1 to 10?");
             int powerOfTheSmellOfNeedles=in.nextInt();
             coniferous firstConiferous = new coniferous(title, width,sizeInSm,barkColor, nomberOfHollow, nomberTwig,needleСolor,lenghtOfNeedles,powerOfTheSmellOfNeedles);
             Gardener gardener= new Gardener();
             gardener.filter(firstConiferous);
             System.out.println(firstConiferous.toString());
        }
        else if(plantType.equals("D")){
           System.out.println("What bark color? ");
            Scanner on = new Scanner(System.in);
             String barkColor= on.nextLine();
             System.out.println("What nomber of hollow? ");
             int nomberOfHollow=in.nextInt();
             System.out.println("What nomber of twig");
             int nomberTwig=in.nextInt();
            System.out.println("What color of leaves? ");
            Scanner an = new Scanner(System.in);
             String colorOfLeaves= an.nextLine();
             System.out.println("What nomber of leaves? ");
             int nomberOfLeaves=in.nextInt();
             System.out.println("What leaf size?");
             int leafSize=in.nextInt();
             deciduous firstDeciduous = new deciduous(title, width,sizeInSm,barkColor, nomberOfHollow, nomberTwig,colorOfLeaves,nomberOfLeaves,leafSize);
             Gardener gardener= new Gardener();
             gardener.filter(firstDeciduous);
             System.out.println(firstDeciduous.toString());
        }
    
    }
       
}
