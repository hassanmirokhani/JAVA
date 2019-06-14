import java.util.*;
class small
{
public static void main(String arg[])
{
int m[]=new int[5],a;
int c,d;
c=m.length-1;
Scanner x=new Scanner(System.in);
for(a=0;a<=c;a++)
{
System.out.print("Enter Number "+(a+1));
m[a]=x.nextInt();
}
for(a=1;a<c;a++)
{
if(m[0]>m[a])
{
d=m[0];
m[0]=m[a];
m[a]=d;
}
}
System.out.print("The Smallest Number Is "+m[0]);
}
}
