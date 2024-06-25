//To print reverse of a string 
import java.util.*;
class Reversestr
{
public static void main(String A[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a name");
String a=sc.nextLine();
int size=a.length();
char ch[]=new char[a.length()];
ch=a.toCharArray();
//printting array in reverse manner
for(int i=size-1;i>=0;i--)
System.out.print(ch[i]);
}
}

