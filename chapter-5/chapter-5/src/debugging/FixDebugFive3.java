package debugging;
import java.util.Scanner;
public class FixDebugFive3
{
	private static Scanner input = new Scanner(System.in);
   public static final int LOW = 0;
public static void main (String args[])
   {
      int item = 0;
      String output = null;
      final int LOW = 111;
      final int HIGH = 999;
      final int CUTOFF = 500;
 
      calculateOutPut(item, LOW, HIGH, CUTOFF, output);
   }
   public static void calculateOutPut(int item, final int LOW, final int HIGH, final int CUTOFF, String output)
   {
           
      System.out.println("Please enter item number");
	 item = input.nextInt();

	if(item < LOW) output = "Item number too low";
      else
if(item > HIGH)
output = "Item number too high";
      else
if(item > CUTOFF)
             output = "Valid - in Automotive Department";
          else
             output = "Valid - Item in Housewares Department";
       System.out.println(output);
   }
}


