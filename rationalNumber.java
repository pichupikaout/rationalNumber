public class rationalNumber 
{
private int numerator;
private int denominator;

   public rationalNumber()
   {
       numerator = 0;
       denominator = 1;
   }
   public rationalNumber(int n, int d)
   {
       numerator = n;
       denominator = d;
       reduce();
   }

    // Use GET and SET methods!
      // Set the numerator
   public void setNumerator(int n)
   {
      this.numerator = n;
   }
   // Set the denominator
   public void setDenominator(int d)
   {
      this.denominator = d;
   }
   
   // Get the numerator
   public int getNumerator()
   {
      return this.numerator;
   }
   // Get the denominator
   public int getDenominator()
   {
      return this.denominator;
   }   
   
   // add two Rational numbers
    public rationalNumber add(rationalNumber right) {
        int num;
        int den;
        num = this.numerator + right.numerator;
        den = this.denominator;
        int otherDen = right.getDenominator();
        int factor = gcd(den, otherDen);
        int number = (den * otherDen) / factor;
        den = (number / den) * den;
        rationalNumber rationalSum = new rationalNumber(num, den);
        return rationalSum;
    }

    public int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);

    }
   // subtract two Rational numbers
   public rationalNumber subtract(rationalNumber right) {
    int num;
    int den;
    num = this.numerator - right.numerator;
    den = this.denominator;
    int otherDen = right.getDenominator();
    int factor = gcd(den, otherDen);
    int number = (den * otherDen) / factor;
    den = (number / den) * den;
    rationalNumber rationalSum = new rationalNumber(num, den);
    return rationalSum;
    }
   // multiply two Rational numbers
   public rationalNumber multiply(rationalNumber right)
   {
      int num;
      int den;
      rationalNumber rationalSum;
      num = this.getNumerator() * right.getNumerator();
      den = this.getDenominator() * right.getDenominator();
      rationalSum = new rationalNumber(num, den);
      return rationalSum;
   }

   // divide two Rational numbers
   public rationalNumber divide(rationalNumber right)
   {
      int num;
      int den;
      rationalNumber rationalSum;
        num = this.getNumerator() * right.getDenominator();
        den = this.getDenominator() * right.getNumerator();
        rationalSum = new rationalNumber(num, den);
        return rationalSum;
      
   }
   private void reduce() {
       if (this.getNumerator() > this.getDenominator()) {
           for (int a = 2; a < this.getNumerator(); a++) {
               if (this.getNumerator() % a == 0 && this.getDenominator() % a == 0) {
                   this.setNumerator(this.getNumerator() / a);
                   this.setDenominator(this.getDenominator() / a);
               }
           }
       } else {
            for (int a = 2; a < this.getDenominator(); a++) {
            if (this.getNumerator() % a == 0 && this.getDenominator() % a == 0) {
                this.setNumerator(this.getNumerator() / a);
                this.setDenominator(this.getDenominator() / a);
            }
        }
       }
   }
   

   // return String representation of a Rational number
   public String toString()
   {
        return this.getNumerator() + "/" + this.getDenominator();
   }

   // return floating-point String representation of
   // a Rational number
   public String toFloatString()
   {
        return "As a decimal: " + this.getNumerator() / this.getDenominator();
   }

}  // end class Rational


