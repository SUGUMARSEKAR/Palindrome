import java.io.*;
public class Cam
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the sentence ");
String str = br.readLine();
String x = " ";
char start = str.charAt(0);
x =x +  Character.toUpperCase(start);
for(int i=1;i<str.length();i++)
{
	char a = str.charAt(i);
	char b = str.charAt(i-1);
if(str.equals(" "))
{
	x = x + Character.toUpperCase(a);
}
else
{
x = x + a;	
}
}
System.out.print(x);
}
}
