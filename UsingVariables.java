public class UsingVariables {
  
  public static void main (String[] args) {
    
    byte byteVar;
    byteVar = 5;
    
    boolean boolVar; 
    boolVar = true;
    
    float fVar1;
    fVar1= 3.7f; 
    
    float fVar2;
    fVar2 = 5.5f;
   
    System.out.println( "the current value of FVar2 is " + fVar2); 
    System.out.println( "The current value of fVar1 is " + fVar1);
    System.out.println( "The current value of boolVar is " + boolVar);
    System.out.println( "The current value of byteVar is " + byteVar);
    
    byteVar = 10;
    
    boolVar = false;
    
    fVar1 = 5.5f;
    
    fVar2 = 3.7f;  
    System.out.println( "The current value of byteVar is " + byteVar);
    System.out.println( "The current value of boolVar is " + boolVar); 
    System.out.println( "The current value of fVar1 is " + fVar1);
    System.out.println( "the current value of FVar2 is " + fVar2); 
  }
  
  
}