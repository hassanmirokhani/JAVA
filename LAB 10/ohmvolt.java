import java.awt.*;
import java.awt.event.*;
class ohmvolt extends Frame implements ActionListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2;
public ohmvolt(String t)
{
super(t);
l1=new Label("Current");
l2=new Label("Resistance");
l3=new Label("Voltage");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
b1=new Button("Calculate");
b2=new Button("Exit");
t3.setEditable(true);
setLayout(new FlowLayout());
add(l1);
add(t1);
add(l2);
add(t2);
add(b1);
add(b2);
add(l3);
add(t3);
b1.addActionListener(this);
b2.addActionListener(this);
setSize(200,300);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
int r,i,v;
i=Integer.parseInt(t1.getText());
r=Integer.parseInt(t2.getText());
v=i*r;
t3.setEditable(true);
t3.setText(String.valueOf(v));
t3.setEditable(false);
show();
}
if(e.getSource()==b2)
{
System.exit(0);
}
}
}