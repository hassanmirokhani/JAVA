import java.awt.*;
import java.awt.event.*;
class stdinfo extends Frame implements ActionListener,ItemListener
{
Choice c1,c2;
Label l1,l2,l3,l4;
TextField t1,t2;
Button b1,b2;
int a;
public stdinfo(String t)
{
super(t);
c1=new Choice();
c2=new Choice();
l1=new Label("Name");
l2=new Label("Roll No");
l3=new Label("Semester");
l4=new Label("Marks");
t1=new TextField(20);
t2=new TextField(20);
b1=new Button("Save");
b2=new Button("Exit");
c1.addItem("1");
c1.addItem("2");
c1.addItem("3");
c1.addItem("4");
c1.addItem("5");
c1.addItem("6");
c1.addItem("7");
c1.addItem("8");
for(a=1;a<=100;a++)
{
c2.addItem(String.valueOf(a));
}
setLayout(new FlowLayout());
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(c1);
add(l4);
add(c2);
add(b1);
add(b2);
c1.addItemListener(this);
c2.addItemListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
setSize(300,300);
setVisible(true);
show();
}
public void itemStateChanged(ItemEvent e)
{
c1.getSelectedIndex();
c2.getSelectedIndex();
}
public void actionPerformed(ActionEvent f)
{
if(f.getSource()==b2)
{
System.exit(0);
}
}
}
