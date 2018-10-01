/*
*Subclass for the computer inventory system. 
*
*@author Michael Quinn
*@class Mac
*@coreConcept The core concept for this lesson is file inheritence.
*@date 3/12/18
*/

public class Mac extends ComputingDevice {
   private String model = "Macbook";
   
   //Default constructor
   public Mac (){
      super.setOS("Mac OSX");
      this.model = model;
   }
   
   //Constructor with variables
   public Mac (String model, double CPU, int RAM, String HDD){
      super.setOS("Mac OSX");
      super.setCPU_Speed(CPU);
      super.setRAM(RAM);
      super.setHDD(HDD);
      this.model = model;
   }
   
   //Getters and Setters
   public String getModel(){
      return model;
   }
   public void setModel (String model){
      this.model = model;
   }
   public String toString (){
      return super.toString() + "\nModel: " + model;
   }
}