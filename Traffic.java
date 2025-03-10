import java.awt.*;
import java.awt.event.*;
class Traffic extends Frame implements ItemListener
{
 CheckboxGroup g;
 Checkbox c1,c2,c3;
 Label h,l;
 Font f;
 Traffic()
 {
  g=new CheckboxGroup();
  c1=new Checkbox("Red",g,false);
  c2=new Checkbox("Yellow",g,false);
  c3=new Checkbox("Green",g,false);
  h=new Label("Traffic Simulator");
  l=new Label(" ",Label.CENTER);
  f=new Font("Arial",Font.BOLD,28);
  h.setFont(f);
  add(h);
  add(c1);
  add(c2);
  add(c3);
  add(l);
  h.setBounds(200,20,250,80);
  c1.setBounds(20,40,100,60);
  c2.setBounds(20,90,100,80);
  c3.setBounds(20,140,100,80);
  l.setBounds(250,90,180,80);
  c1.addItemListener(this);
  c2.addItemListener(this);
  c3.addItemListener(this);
  setLayout(null);
  setSize(600,400);
  setVisible(true);
  addWindowListener(new WindowAdapter()
  {
    public void windowClosing(WindowEvent we)
   {
    dispose();
   }
  });
 }
 public void itemStateChanged(ItemEvent e)
 {
    Font f=new Font("Arial",Font.BOLD,24);
	l.setFont(f);
	l.setForeground(Color.WHITE);
	if(e.getSource()==c1)
	{
	l.setBackground(Color.RED);
	l.setText("Stop"); 
	}
	else if(e.getSource()==c2)
	{
	l.setBackground(Color.YELLOW);
	l.setText("Ready");
	}
	else
	{
	l.setBackground(Color.GREEN);
	l.setText("Go");
	}
	  
 }

public static void main(String args[])
{
new Traffic();
}
}