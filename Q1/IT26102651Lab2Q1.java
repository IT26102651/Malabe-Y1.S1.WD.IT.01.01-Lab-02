public class IT26102651Lab2Q1 {
  public static void main (String[]arg){
  
  int perimeter = 100; //Given perimeter of the fence
  double length;
  double width;
  
  //width to length ratio:3/4 = 0.75
  double width_ratio = 0.75;
  
  //Calculate the length and width 
  
  //Using the formula: perimeter = 2* ( length + width )
  //Substitute width = width_ratio * length 
  //100 = 2 * ( length + (width_ratio * length))
  //100 = 2 * length *( 1+ width_ratio)
  //length = 100 / (2 * (1+width_ratio))
  
  length = perimeter / (2 * (1+width_ratio));
  width = width_ratio * length;
  
  //Output the results
  System.out.println("Length of the fence: " + length);
  System.out.println("width of the fence: " + width);
  }
 } 
  
  









  