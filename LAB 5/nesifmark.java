class nesifmark
{
public static void main(String arg[])
{
int a,b,c,d,e;
float t,p;
a=Integer.parseInt(arg[0]);
b=Integer.parseInt(arg[1]);
c=Integer.parseInt(arg[2]);
d=Integer.parseInt(arg[3]);
e=Integer.parseInt(arg[4]);
t=a+b+c+d+e;
p=t*100/500;
System.out.println("Subjets\t\tMarks Obtained\tTotal Marks");
System.out.println("English\t\t"+a+"\t\t100");
System.out.println("Urdu\t\t"+b+"\t\t100");
System.out.println("Physics\t\t"+c+"\t\t100");
System.out.println("Maths\t\t"+d+"\t\t100");
System.out.println("Computer\t"+e+"\t\t100");
System.out.println("Total="+t);
System.out.println("Percentage="+p);
System.out.print("Grade=");
if(p>90)
{
System.out.print("A+");
}
if(p>=80)
{
if(p<90)
{
System.out.print("A");
}
}
if(p>=70)
{
if(p<80)
{
System.out.print("B");
}
}
if(p>=60)
{
if(p<70)
{
System.out.print("C");
}
}
if(p<60)
{
System.out.print("Fail");
}
}
}

