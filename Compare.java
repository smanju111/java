import java.util.Scanner; 
/* import - to import another class file into this file
   util - package
   Scanner - class file*/

public class Compare //To connect this code to another program and both file and class should have the same name
{
public static void main(String Sta[])
{
int a, b;
Scanner s = new Scanner(System.in); //class name - to store s object into Scanner class file

System.out.println("Enter a value:");
a = s.nextInt(); //Storing integer value using s object into a object

System.out.println("Enter b value");
b = s.nextInt();

System.out.print("a="+a+",b="+b);
if(a>b){
System.out.println(a+"is greater");
}
else
System.out.println(b+"is greater");
}
}
