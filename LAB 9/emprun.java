class emprun
{
public static void main(String arg[])
{
peon x=new peon();
mgr y=new mgr();
sci z=new sci();
x.get(1,"Asim",3,500);
y.get(2,"Jawad",45000,4,"MBA");
z.get(3,"Tahir",1000000,15,"PhD",20);
System.out.println("Peon");
x.show();
System.out.println();
System.out.println("Manager");
y.show();
System.out.println();
System.out.println("Scientist");
z.show();
}
}
