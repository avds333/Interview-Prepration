import java.util.Scanner;
class Alphabet_Pattern2
{
 Scanner sc=new Scanner(System.in);
 int rowCount;
 Alphabet_Pattern2()
 {
   System.out.println("Enter the row count: ");   
   rowCount=sc.nextInt();
   for(int i=0;i<rowCount;i++)
   {
    char A='A';
    char val='A';
    for(int j=0;j<=i;j++)
    {
      System.out.print(A++);
    }
    for(int k=rowCount;k>i;k--)
    { 
      System.out.print(" ");
    }
    for(int m=rowCount;m>i+1;m--)//To get only single # at  the bottom
    {
      System.out.print(" ");
    }
    for(int c=0;c<=i;c++)
    {
       System.out.print(val++);
    }
     System.out.println();
   }
 }
 public static void main(String...a)
 {
  new Alphabet_Pattern2();
 }
}
