class distance
{
private int f;
private float i;
public distance()
{
f=0;
i=0;
}
public distance(int f1,float i1)
{
f=f1;
i=i1;
getdistance(f1,i1);
}
public void getdistance(int f1,float i1)
{
f=f1;
i=i1;
while(i>=12)
{
i-=12;
f++;
}
}
public void showdistance()
{
System.out.println(f+"\'"+i+"\"");
}
public distance adddistance(distance t)
{
distance temp=new distance();
temp.f=f+t.f;
temp.i=i+t.i;
temp.getdistance(temp.f,temp.i);
return(temp);
}
}