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
	setTitle("Text Formatting");
	setVisible(true);
	setLayout(null);
	f=new Font("Arial",Font.BOLD,18);
	h=new Label("Text Customization");
    add(h);
	h.setFont(f);
	l=new Label("Enter a Text");
    add(l);
    t=new TextField(" ");
	add(t);
	c1=new Choice();
	add(c1);
	c1.add("Arial");
	c1.add("Serif");
	c1.add("Courier");
	c1.add("Cambria");
	c1.add("Monospaced");
	c1.add("SansSerif");
	
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
	l.setBounds(100,120,150,40);
	t.setBounds(260,120,250,40);
	c1.setBounds(100,180,150,40);
	c2.setBounds(260,180,150,40);
	ch1.setBounds(100,230,150,40);
	ch2.setBounds(260,230,150,40);
	op.setBounds(150,320,500,80);
    t.addTextListener(this);
	c1.addItemListener(this);
    c2.addItemListener(this);
	ch1.addItemListener(this);
	ch2.addItemListener(this);
	
	
	addWindowListener(new WindowAdapter()
	{
            public void windowClosing(WindowEvent e) { System.exit(0); }
    });
     
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
     String s=t.getText();
	 String ff=c1.getSelectedItem();
	 int fs=Integer.parseInt(c2.getSelectedItem());
	 int fst=Font.PLAIN;
	 if(ch1.getState())
	     fst|=Font.BOLD;
	 if(ch2.getState())
	     fst|=Font.ITALIC;
		 
	 f=new Font(ff,fst,fs);
	 op.setFont(f);
	 
	 op.setText(s);
   }
   public static void main(String args[])
   {
     new FontDemo();   
   }
 }
   
   