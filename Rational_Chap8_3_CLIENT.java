// Java extension packages


public class Rational_Chap8_3_CLIENT
{

   // CLIENT
   public static void main(String[] args)
   {
       rationalNumber r1 = new rationalNumber(1, 4), r2 = new rationalNumber(2, 4);
       rationalNumber result;

      // perform calculations
         result = r1.add( r2 );
         System.out.println( r1.toString() + " + " + r2.toString() + " = " + result.toString() + 
             " OR as a decimal: " + result.toFloatString() + "\n");

         result = r1.subtract( r2 );
         System.out.println( r1 + " - " + r2.toString() + " = " + result + 
             " OR as a decimal: " + result.toFloatString() + "\n");

         result = r1.multiply( r2 );
         System.out.println( r1.toString() + " * " + r2 + " = " + result + 
             " OR as a decimal: " + result.toFloatString() + "\n");

         result = r1.divide( r2 );
         System.out.println( r1 + " / " + r2 + " = " + result + " \n "
            + " OR as a decimal: " + result.toFloatString() + "\n");
            
        } // main
}  // end class RationalTest
