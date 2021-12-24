//package palindrome2
import java.util.Scanner;
public class palindrome2
{
  public static void main(String[] args)
   {
      string str, reverse=" ";
      Scanner.scanner= new Scanner(System.in);
      System.out.println("Enter the string: ");
      string = scanner.nextLine();
      int length= str.length();
      for(int i=length-1; i>=0 ; i--)
       {
         reverse = reverse + num.charAt(i);
         if (num.equals(reverse))