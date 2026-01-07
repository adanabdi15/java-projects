public class Cylinder { 
  
  public static void main (String[] args) {

 double r = 7.0;
 double h = 21.0;
 double pie2 = 2*Math.PI*Math.pow(r,2);
 double pie = 2*Math.PI* r * h;
 double area = pie2 + pie;
 
 System.out.println("Radius is " + r + " centimeters");
 System.out.println("Height is " + h + " centimeters");
 System.out.println("The cylinder's surface area is " + area + " square centimeters");
   }
  
} 
 
 