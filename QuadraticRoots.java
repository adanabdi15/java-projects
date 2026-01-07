public class QuadraticRoots { 
  
  public static void main (String[] args) {
    
    double a = -3.0;
    double b = -7.0;
    double c =  5.0;
    double d = b * b - 4 *a*c;
    //I changed (Math.pow(b,2) - 4 *a*c)) by creating a its own variable "d". 
    
    double root1;
    double root2; 
      
    root1 = (-b + Math.sqrt(d)) / (2 * a);
    root2 = (-b - Math.sqrt(d)) / (2 * a);

    System.out.println("Coefficient A is " + a);
    System.out.println("Coefficient B is " + b);
    System.out.println("Coefficient C is " + c);
    System.out.println("Root #1 is " + root1);
    System.out.println("Root #2 is " + root2);
  }
  
} 