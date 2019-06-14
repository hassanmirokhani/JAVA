class quad1
{
public static void main(String arg[])
{
int a,b,c,d;
float x,y;
a=Integer.parseInt(arg[0]);
b=Integer.parseInt(arg[1]);
c=Integer.parseInt(arg[2]);
d=b*b-4*a*c;
if(d>0)
{
x=(float)((-b+Math.sqrt(d)))/(2*a);
y=(float)((-b-Math.sqrt(d)))/(2*a);
System.out.print("x+="+x+"\ny+="+y);
}
else
{
System.out.println("x="+(-b)+"+i"+(float)Math.sqrt(d*-1)+"/"+2*a);
System.out.print("y="+(-b)+"-i"+(float)Math.sqrt(d*-1)+"/"+2*a);
}
}
}
