/*
* Demo for the computer inventory system. 
*
*@author Michael Quinn
*@class InventoryDemo
*@coreConcept The core concept for this lesson is file inheritence.
*@date 3/12/18
*/

public class InventoryDemo{
   public static void main (String[] args) {
      System.out.println("This program tests the Computer Inventory Management System.");
      Windows obj1 = new Windows();
      Windows obj2 = new Windows("Asus", 1.8, 16, "512 SSD");
      Mac obj3 = new Mac();
      Mac obj4 = new Mac("Imac", 2.2, 6, "1TB");
      
      System.out.println(obj1.toString());
      System.out.println("*****************");
      System.out.println(obj2.toString());
      System.out.println("*****************");
      System.out.println(obj3.toString());
      System.out.println("*****************");
      System.out.println(obj4.toString());
      System.out.println("*****************");
   }
}