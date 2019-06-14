class quad
{
public static void main(String arg[])
{
int a,b,c;
double x,y;
a=Integer.parseInt(arg[0]);
b=Integer.parseInt(arg[1]);
c=Integer.parseInt(arg[2]);
x=(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
y=(-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
System.out.print("The Roots Of Quadratic Equation"+x+"And"+y);
}
}
