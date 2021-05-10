public class Car {
   private int modelYear; 
   private int purchasePrice;
   private int currentValue;
   
   public void setModelYear(int userYear){
      modelYear = userYear;
   }
   
   public int getModelYear() {
      return modelYear;
   }
   
   public void setPurchasePrice(int purchasePrice){
      this.purchasePrice = purchasePrice;
   }

   public int getPurchasePrice(){
      return purchasePrice;
   }
   
   public void calcCurrentValue(int currentYear) {
      double depreciationRate = 0.15;
      int carAge = currentYear - modelYear;
      
      // Car depreciation formula
      currentValue = (int) 
         Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
   }
   
   public void printInfo(){
      System.out.println("Car's information: ");
      System.out.println("    Model Year: " + modelYear);
      System.out.println("    Purchase Price: $" + purchasePrice);
      System.out.println("    Current Value: $" + currentValue);

   }
   
}