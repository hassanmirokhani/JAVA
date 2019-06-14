import java.util.*;
class calc1
{
public static void main(String arg[])
{
int a,b;
char c;
Scanner x=new Scanner(System.in);
System.out.println("Enter First No");
a=x.nextInt();
System.out.println("Enter Second No");
b=x.nextInt();
do
{
System.out.println("Enter Operator");
c=x.next().charAt(0);
switch(c)
{
case'+':
System.out.println(a+"+"+b+"="+(a+b));
break;
case'-':
System.out.println(a+"-"+b+"="+(a-b));
break;
case'*':
System.out.println(a+"*"+b+"="+(a*b));
break;
case'/':
System.out.println(a+"/"+b+"="+(float)a/b);
break;
default:
System.out.print("Invalid Operator");
continue;
}
break;
}while(true);
}
}
