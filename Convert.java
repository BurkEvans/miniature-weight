import java.util.*;
public class Convert
{
  public static void main (String[]args)
  {
     System.out.println("Enter a decimal number to convert to binary and hex: ");
     Scanner scan = new Scanner(System.in);
     int a = scan.nextInt();
     
     decimalToBinary(a);
     System.out.print("\n");
     decimalToHex(a);
     System.out.print("\n");
     
     System.out.println("Enter a binary number to convert to decimal: ");
     String b = scan.next();
     System.out.println(binaryToDecimal(b));
     
     System.out.println("Enter a number in hex (uppercase)to convert to decimal: ");
     String c = scan.next();
     hexToDecimal(c);
    } 
  public static void decimalToBinary(int x)
   {
    if(x > 0)
    {
      decimalToBinary(x/2);
      System.out.print(x%2 + "");
    }
    }
  public static String binaryToDecimal(String s)
  {
        int a =1;
        int n = 0;
        for (int x=s.length()-1; x>=0; x--)
        {
            n += a * (s.charAt(x) - '0');
            a = a*2;
        }
        return n + "";
    }
  public static void decimalToHex(int x)
   {
    if(x > 0)
    {
      decimalToHex(x/16);
      
      if(x%16 < 10)
      System.out.print( x%16 +"");
      else if (x%16 == 10)
      System.out.print("A");
      else if (x%16 == 11)
      System.out.print("B");
      else if (x%16 == 12)
      System.out.print("C");
      else if (x%16 == 13)
      System.out.print("D");
      else if (x%16 == 14)
      System.out.print("E");
      else 
      System.out.print("F");
    }

    }
  public static void hexToDecimal(String s)
  {
      int a =1;
      int n = 0;
        for (int x=s.length()-1; x>=0; x--)
        {
            if (s.charAt(x) - '0' <10)
                {
                 n += a * (s.charAt(x) - '0');
                 a = a*16;
                }
            else 
                 {
                 n += a * (s.charAt(x) - '7');
                 a = a*16;
                }
        }
        
             System.out.print( n + "\n");
    }  
}
