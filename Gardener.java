/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.hw1plant;

/**
 *
 * @author Home
 */
public class Gardener {
    public void filter(Plant firstPlant){
            String name=firstPlant.getTitle();
            name=name+ " VGTBL";
            String[] a ={"a","o","i","u","e","O","I","U","E","A"};
            for(int i=0; i<a.length;i++){
                name = name.replace(a[i] ,"");
            }
            firstPlant.setTitle(name);
        
    }
    
}
