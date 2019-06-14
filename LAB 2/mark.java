class mark
{
public static void main(String arg[])
{
int a,b,c,d,e;
a=Integer.parseInt(arg[0]);
b=Integer.parseInt(arg[1]);
c=Integer.parseInt(arg[2]);
d=Integer.parseInt(arg[3]);
e=Integer.parseInt(arg[4]);
System.out.println("Subjects\tMarks Obtained\tMax Marks");
System.out.println("English\t\t"+a+"\t\t100");
System.out.println("Urdu\t\t"+b+"\t\t100");
System.out.println("Islamiat\t"+c+"\t\t100");
System.out.println("Pak Std\t\t"+d+"\t\t100");
System.out.println("Maths\t\t"+e+"\t\t100");
System.out.println("Total="+(a+b+c+d+e));
System.out.print("Percentage="+((a+b+c+d+e)/500f)*100);
}
}
