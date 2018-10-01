/*
*Superclass for the computer inventory system. 
*
*@author Michael Quinn
*@class ComputingDevice
*@coreConcept The core concept for this lesson is file inheritence.
*@date 3/6/18
*/
public abstract class ComputingDevice {
   private double CPU_Speed = 1.0;
   private int RAM = 2;
   private String HDD = "500GB";
   private String OS = "NULL"; 
   
   //Defualt constructor
   protected ComputingDevice () {
      this.CPU_Speed = CPU_Speed;
      this.RAM = RAM;
      this.HDD = HDD;
      this.OS = OS;
   }
   //Construcor with variables
   protected ComputingDevice (double CPU_Speed, int RAM, String HDD, String OS){
      this.CPU_Speed = CPU_Speed;
      this.RAM = RAM;
      this.HDD = HDD;
      this.OS = OS;
   }
   
   //Getters and Setters
   public double getCPU_Speed (){
      return CPU_Speed;
   }
   public void setCPU_Speed(double CPU_Speed){
      this.CPU_Speed = CPU_Speed;
   }
   public int getRAM () {
      return RAM;
   }
   public void setRAM (int RAM) {
      this.RAM = RAM;
   }
   public String getHDD (){
      return HDD;
   }
   public void setHDD (String HDD){
      this.HDD = HDD;
   }
   public String getOS() {
      return OS;
   }
   public void setOS(String OS){
      this.OS = OS;
   }
   @Override
   public String toString(){
      return "CPU: " + CPU_Speed + "\nRAM: " + RAM + "\nHDD: " + HDD + "\nOS: " + OS;
   }
}
