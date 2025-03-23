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
  h=new Label("Traffic Light Simulator");
  l=new Label(" ",Label.CENTER);
  f=new Font("Arial",Font.BOLD,24);
  h.setFont(f);
  add(h);
  add(c1);
  add(c2);
  add(c3);
  add(l);
  setLayout(null);
  h.setBounds(200,20,350,60);
  l.setBounds(220,120,180,60);
  c1.setBounds(50,220,100,60);
  c2.setBounds(50,290,100,60);
  c3.setBounds(50,360,100,60);
  
  c1.addItemListener(this);
  c2.addItemListener(this);
  c3.addItemListener(this);
  setSize(600,600);
  setVisible(true);
  addWindowListener(new WindowAdapter()
  {
    public void windowClosing(WindowEvent we)
   {
    System.exit(0);
   }
  });
 }
 public void itemStateChanged(ItemEvent e)
 {
    Font f=new Font("Arial",Font.BOLD,24);
	l.setFont(f);
	if(e.getSource()==c1)
	{
	l.setForeground(Color.RED);
	l.setText("Stop"); 
	}
	else if(e.getSource()==c2)
	{
	l.setForeground(Color.YELLOW);
	l.setText("Ready");
	}
	else
	{
	l.setForeground(Color.GREEN);
	l.setText("Go");
	}
	  
 }
public static void main(String args[])
{
new Traffic();
}
}