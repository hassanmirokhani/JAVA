class medicine1 extends medicine
{
private String e;
private float d;
public medicine1()
{
super();
e=null;
d=0f;
}
public medicine1(String n1,int q1,float p1,String e1,float d1)
{
super(n1,q1,p1);
e=e1;
d=d1;
}
public void get(String n1,int q1,float p1,String e1,float d1)
{
super.get(n1,q1,p1);
e=e1;
d=d1;
}
public void show()
{
super.show();
System.out.println("Expiry Date="+e+"\nDiscount="+d);
}
}
