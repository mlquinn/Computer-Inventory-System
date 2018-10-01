/*
*Subclass for the computer inventory system. 
*
*@author Michael Quinn
*@class Windows
*@coreConcept The core concept for this lesson is file inheritence.
*@date 3/12/18
*/

public class Windows extends ComputingDevice {
   private String MFG = "Unknown";
   
   //Default constructor
   public Windows (){
      super.setOS("Windows");
      this.MFG = MFG;
   }
   
   //Constructor with variables
   public Windows (String MFG, double CPU, int RAM, String HDD){
      super.setOS("Windows");
      super.setCPU_Speed(CPU);
      super.setRAM(RAM);
      super.setHDD(HDD);
      this.MFG= MFG;
   }
   
   //Getters and Setters
   public String getMFG(){
      return MFG;
   }
   public void setMFG (String MFG){
      this.MFG= MFG;
   }
   public String toString (){
      return super.toString() + "\nMFG: " + MFG;
   }
}