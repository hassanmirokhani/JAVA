import java.util.*;
class marks
{
public static void main(String arg[])
{
int m[]=new int[6],a;
String s[]={"English","Urdu","Pak Std","Maths","Isl"};
float p;
m[5]=0;
Scanner x=new Scanner(System.in);
for(a=0;a<5;a++)
{
System.out.print("Enter "+s[a]+" Marks ");
m[a]=x.nextInt();
m[5]=m[5]+m[a];
}
System.out.println();
System.out.println("Subjects\tMarks Obtained\tTotal Marks");
for(a=0;a<5;a++)
{
System.out.println(s[a]+"\t\t"+m[a]+"\t\t100");
}
System.out.println("Total Marks="+m[5]);
p=m[5]/5f;
System.out.print("Percentage="+p);
}
}
