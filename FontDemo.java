import java.awt.*;
import java.awt.event.*;
class FontDemo extends Frame implements TextListener,ItemListener
{
  TextField t;
  Label l;
  Choice c1,c2;
  Checkbox ch1,ch2;
  Font f;
  FontDemo()
  {
    setSize(300,400);
	setVisible(true);
	setLayout(new FlowLayout());
    t=new TextField(30);
	add(t);
	c1=new Choice();
	add(c1);
	c1.add("Arial");
	c1.add("Verdana");
	c1.add("Calibri");
	c1.add("Courier");
	c1.add("Cambria");
	c1.add("Georgia");
    c2=new Choice();
	add(c2);
	c2.add("12");
	c2.add("16");
	c2.add("20");
	c2.add("24");
	c2.add("28");
	c2.add("23");
    ch1=new Checkbox("Bold");
    add(ch1);
	ch2=new Checkbox("Italic");
    add(ch2);
	l=new Label(" ",Label.CENTER);
    add(l);
    t.addTextListener(this);
	c1.addItemListener(this);
    c2.addItemListener(this);
	ch1.addItemListener(this);
	ch2.addItemListener(this);
     
  }
  public void textValueChanged(TextEvent te)
  {
   
   }
   public void itemStateChanged(ItemEvent te)
  {
   
   }
   public static void main(String args[])
  {
    new FontDemo();
   }
  }