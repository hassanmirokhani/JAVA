import java.util.*;
class stuHassan069
{
public static void main(String arg[])
{
int a,b,e,d,r,c,m[][]=new int[5][3];
String s[]={"Roll No","Marks","Semester"};
r=m.length-1;
c=m[0].length-1;
Scanner sc=new Scanner(System.in);
for(a=0;a<=r;a++)
{
for(b=0;b<=c;b++)
{
System.out.print("Enter "+s[b]);
m[a][b]=sc.nextInt();
}
}
for(a=0;a<r;a++)
{
for(b=a+1;b<=r;b++)
{
if(m[a][1]<m[b][1])
{
for(e=0;e<=c;e++)
{
d=m[a][e];
m[a][e]=m[b][e];
m[b][e]=d;
}
}
}
}
for(a=0;a<=c;a++)
{
System.out.print(s[a]+"\t\t");
}
System.out.println();
for(a=0;a<=r;a++)
{
for(b=0;b<=c;b++)
{
System.out.print(m[a][b]+"\t\t");
}
System.out.println();
}
}
}