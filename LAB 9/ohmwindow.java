import java.awt.*;
class ohmwindow
{
public void ohmcalculate(String a)
{
Frame x=new Frame(a);
Label l1=new Label("Enter Current");
Label l2=new Label("Enter Resistance");
Label l3=new Label("Voltage");
Button b1=new Button("Calculate");
Button b2=new Button("Cancel");
TextField t1=new TextField(20);
TextField t2=new TextField(20);
TextField t3=new TextField(20);
FlowLayout f=new FlowLayout();
x.setLayout(f);
x.add(l1);
x.add(t1);
x.add(l2);
x.add(t2);
x.add(b1);
x.add(b2);
x.add(l3);
x.add(t3);
x.setSize(200,300);
x.show();
}
}
