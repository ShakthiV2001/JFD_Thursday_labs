package javaexamples; 
  
 public class CarModel { 
 public static void main(String[] args) {
                 enum car{contessa(1984),ferrari(2021),Bugatti(2022); 
                 private int value;   
                 private car(int value){   
                 this.value=value;   
                 }   
                 }
                 System.out.println("    Car Name\tModel Year"); 
                 for(car c : car.values()) 
                         System.out.println("    "+c+"\t"+c.value); 
         } 
  
 }
