package practice;

import java.util.Scanner;

public class Character {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
String s=sc.next();
int uppercase=0;
int lowercase=0;
int digit=0;
int splcharacter=0;
char ch;
for(int i=0;i<s.length();i++)
{
	ch=s.charAt(i);
	if(ch>='A'&& ch<='Z')
	
		uppercase++;
	
	else if(ch>='a'&& ch<='z')
	
		lowercase++;
	
	else if(ch>='0'&& ch<='9')
	
		digit++;
		else
			splcharacter++;
	}
if(s.length()>=8&&uppercase>0&&lowercase>0&&digit>0&&splcharacter>0)
{
	System.out.println("enter a valid String");
}
else
{
	System.out.println("enter a invalid String");
}
	




}

}


