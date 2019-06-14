import java.awt.*;
class login
{
public void generatewindow(String t)
{
Frame x=new Frame(t);
Label l1=new Label("Enter User Name");
Label l2=new Label("Enter Password");
Button b1=new Button("OK");
Button b2=new Button("Cancel");
TextField t1=new TextField(20);
TextField t2=new TextField(20);
FlowLayout f=new FlowLayout();
x.setLayout(f);
x.add(l1);
x.add(t1);
x.add(l2);
x.add(t2);
x.add(b1);
x.add(b2);
x.setSize(200,300);
x.show();
}
}
