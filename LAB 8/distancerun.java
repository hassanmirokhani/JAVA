class distancerun
{
public static void main(String arg[])
{
distance x=new distance();
distance y=new distance(10,20);
distance z=new distance();
x.getdistance(5,50);
x.showdistance();
y.showdistance();
z=x.adddistance(y);
z.showdistance();
}
}
