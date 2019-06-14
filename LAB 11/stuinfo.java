import java.awt.*;
import java.awt.event.*;
class stuinfo extends Frame implements ActionListener,ItemListener
{
Label l1,l2,l3,l4;
TextField t1,t2,t3;
Choice c1;
Button b1,b2;
int a;
public stuinfo(String t)
{
super(t);
l1=new Label("Name");
l2=new Label("Roll No");
l3=new Label("Grade");
l4=new Label("Percentage");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
c1=new Choice();
b1=new Button("Calculate");
b2=new Button("Exit");
for(a=1;a<=100;a++)
{
c1.addItem(String.valueOf(a));
}
c1.addItemListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
setLayout(new FlowLayout());
add(l1);
add(t1);
add(l2);
add(t2);
add(l4);
add(c1);
add(b1);
add(b2);
add(l3);
add(t3);
t3.setEditable(false);
setSize(200,300);
setVisible(true);
show();
}
public void itemStateChanged(ItemEvent f)
{
c1.getSelectedIndex();
}
public void actionPerformed(ActionEvent e)
{
int b=c1.getSelectedIndex();
if(e.getSource()==b1)
{
t3.setEditable(true);
t3.setBackground(Color.white);
if(b>=90)
{
t3.setText("A+");
}
else
{
if(b>=80)
{
t3.setText("A");
}
else
{
if(b>=70)
{
t3.setText("B");
}
else
{
if(b>=60)
{
t3.setText("C");
}
else
{
t3.setText("Fail");
t3.setBackground(Color.red);
}
}
}
}
t3.setEditable(false);
}
if(e.getSource()==b2)
{
System.exit(0);
}
}
}


