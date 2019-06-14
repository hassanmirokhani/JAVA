class calc
{
public static void main(String arg[])
{
int a,b;
char c;
a=Integer.parseInt(arg[0]);
b=Integer.parseInt(arg[1]);
c=arg[2].charAt(0);
switch(c)
{
case'+':
System.out.print(a+"+"+b+"="+(a+b));
break;
case'-':
System.out.print(a+"-"+b+"="+(a-b));
break;
case'x':
System.out.print(a+"*"+b+"="+a*b);
break;
case'/':
System.out.print(a+"/"+b+"="+(float)a/b);
break;
default:
System.out.print("Invalid Operator");
}
}
}
