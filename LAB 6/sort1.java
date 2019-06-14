import java.util.*;
class sort1
{
public static void main(String arg[])
{
float m[]=new float[5],a;
int b,c,d;
c=m.length-1;
Scanner x=new Scanner(System.in);
for(b=0;b<=c;b++)
{
System.out.print("Enter Number "+(b+1));
m[b]=x.nextFloat();
}
for(d=0;d<c;d++)
{
for(b=d+1;b<=c;b++)
{
if(m[d]<m[b])
{
a=m[b];
m[b]=m[d];
m[d]=a;
}
}
}
System.out.println();
for(b=0;b<=c;b++)
{
System.out.println(m[b]);
}
}
}
