import java.awt.*;
import java.awt.event.*;
class factorial extends Frame implements ActionListener
{
Label l1,l2;
TextField t1,t2;
Button b1,b2;
public factorial(String t)
{
super(t);
l1=new Label("Enter Number");
l2=new Label("Factorial");
t1=new TextField(20);
t2=new TextField(20);
b1=new Button("Calculate");
b2=new Button("Exit");
t2.setEditable(false);
b1.addActionListener(this);
b2.addActionListener(this);
setLayout(new FlowLayout());
add(l1);
add(t1);
add(b1);
add(b2);
add(l2);
add(t2);
setSize(300,200);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
int a,b,c=1;
b=Integer.parseInt(t1.getText());
for(a=1;a<=b;a++)
{
c=c*a;
}
t2.setEditable(true);
t2.setText(String.valueOf(c));
t2.setEditable(false);
}
if(e.getSource()==b2)
{
System.exit(0);
}
}
}