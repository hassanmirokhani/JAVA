import java.awt.*;
import java.awt.event.*;
class quadraticformula extends Frame implements ActionListener
{
Label l1,l2,l3,l4,l5;
TextField t1,t2,t3,t4,t5;
Button b1,b2;
public quadraticformula(String t)
{
super(t);
l1=new Label("a");
l2=new Label("b");
l3=new Label("c");
l4=new Label("x");
l5=new Label("y");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
t4=new TextField(20);
t5=new TextField(20);
b1=new Button("Calculate");
b2=new Button("Exit");
t4.setEditable(false);
t5.setEditable(false);
b1.addActionListener(this);
b2.addActionListener(this);
setSize(100,300);
setLayout(new FlowLayout());
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(b1);
add(b2);
add(l4);
add(t4);
add(l5);
add(t5);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
int a,b,c,d;
float x,y;
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=Integer.parseInt(t3.getText());
d=b*b-4*a*c;
if(d>=0)
{
x=(float)((-b+Math.sqrt(d))/(2*a));
t4.setEditable(true);
t4.setText(String.valueOf(x));
t4.setEditable(false);
show();
y=(float)((-b-Math.sqrt(d))/(2*a));
t5.setEditable(true);
t5.setText(String.valueOf(y));
t5.setEditable(false);
show();
}
else
{
t4.setEditable(true);
t4.setText("Roots Are Imaginary");
t4.setEditable(false);
show();
t5.setEditable(true);
t5.setText("Roots Are Imaginary");
t5.setEditable(false);
show();
}
}
if(e.getSource()==b2)
{
System.exit(0);
}
}
}