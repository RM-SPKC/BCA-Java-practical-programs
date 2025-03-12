import java.awt.*;
import java.awt.event.*;
class FontDemo extends Frame implements TextListener,ItemListener
{
  TextField t;
  Label h,l,op;
  Choice c1,c2;
  Checkbox ch1,ch2;
  Font f;
  FontDemo()
  {
    setSize(600,600);
	setVisible(true);
	setLayout(null);
	h=new Label("Text Customization");
    add(h);
	l=new Label("Enter a Text");
    add(l);
    t=new TextField(" ",30);
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
	c2.add("32");
    ch1=new Checkbox("Bold");
    add(ch1);
	ch2=new Checkbox("Italic");
    add(ch2);
	op=new Label(" ",Label.CENTER);
    add(op);
	h.setBounds(200,60,250,40);
	l.setBounds(100,100,150,40);
	t.setBounds(260,100,250,40);
	c1.setBounds(100,160,150,40);
	c2.setBounds(260,160,150,40);
	ch1.setBounds(100,210,150,40);
	ch2.setBounds(260,210,150,40);
	op.setBounds(200,300,300,80);
    t.addTextListener(this);
	c1.addItemListener(this);
    c2.addItemListener(this);
	ch1.addItemListener(this);
	ch2.addItemListener(this);
     
  }
  public void textValueChanged(TextEvent te)
   {
     updateFont();
   }
   public void itemStateChanged(ItemEvent te)
   {
     updateFont();
   }
   public void updateFont()
   {
     String in=t.getText();
	 String ff=c1.getSelectedItem();
	 int fs=Integer.parseInt(c2.getSelectedItem());
	 int fst=Font.PLAIN;
	 if(ch1.getState())
	     fst=Font.BOLD;
	 if(ch2.getState())
	     fst=Font.ITALIC;
	 f=new Font(ff,fst,fs);
	 op.setFont(f);
	 op.setText(in);
   }
   public static void main(String args[])
   {
     new FontDemo();   
   }
 }
   
   