class sci extends mgr
{
private int p;
public sci()
{
super();
p=0;
}
public sci(int c1,String n1,int s1,int e1,String q1,int p1)
{
super(c1,n1,s1,e1,q1);
p=p1;
}
public void get(int c1,String n1,int s1,int e1,String q1,int p1)
{
super.get(c1,n1,s1,e1,q1);
p=p1;
}
public void show()
{
super.show();
System.out.println("Publication="+p);
}
}
