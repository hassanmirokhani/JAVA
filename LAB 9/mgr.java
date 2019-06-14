class mgr extends emp
{
private int s,e;
private String q;
public mgr()
{
super();
s=0;
e=0;
}
public mgr(int c1,String n1,int s1,int e1,String q1)
{
super(c1,n1);
s=s1;
e=e1;
q=q1;
}
public void get(int c1,String n1,int s1,int e1,String q1)
{
super.get(c1,n1);
s=s1;
e=e1;
q=q1;
}
public void show()
{
super.show();
System.out.println("Salary="+s+"\nExperience="+e+"\nQualification="+q);
}
}
