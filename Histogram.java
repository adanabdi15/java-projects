

public class Histogram {

     private int[] values;
     private int minIndex;
     private int maxIndex;
     private int maxLength;

 


     public Histogram(int[] values, int minIndex, int maxIndex, int maxLength) {
     this.values = new int [maxIndex + 1];
     this.minIndex = minIndex;
     this.maxIndex = maxIndex;
     this.maxLength = maxLength;



      int maxValue=values[0];
      for(int i=0;i<values.length;i++)
        {
       if(maxValue<values[i])
    {
       maxValue=values[i];
      }

         }

        for(int i=0;i<values.length;i++)
           {
          
        this.values[i]=(values[i]*maxLength)/maxValue;
         }
 
       }

         public void drawHor() {
         for(int j=0;j<26;j++)
       {
           
         for(int i=0;i<values[j];i++)
       {
           System.out.print("*");
       }
           System.out.println();
   }

}

          public void drawVer() {
          for(int i=0;i<26;i++)
            
         {
         for(int j=0;j<values[i];j++)
           
         {

         System.out.println("*");
   }
        System.out.println();
}

 

 

}

}