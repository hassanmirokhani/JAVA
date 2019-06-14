class peon extends emp
{
private int h,r;
public peon()
{
super();
h=0;
r=0;
}
public peon(int c1,String n1,int h1,int r1)
{
super(c1,n1);
h=h1;
r=r1;
}
public void get(int c1,String n1,int h1,int r1)
{
super.get(c1,n1);
h=h1;
r=r1;
}
public void show()
{
super.show();
System.out.println("Hours="+h+"\nRate="+r+"\nAmount="+h*r);
}
}
