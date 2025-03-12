import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MouseDemo extends MouseAdapter
{
  JLabel l;
  JFrame f;
  Font fo;
  
  MouseDemo()
  {
    f=new JFrame();
	f.setSize(600,600);
	f.setTitle("Mouse Event Handling");
	f.setVisible(true);
	l=new JLabel("",JLabel.CENTER);
	f.add(l);
	fo=new Font("Arial",Font.BOLD,32);
	l.setFont(fo);
	f.addMouseListener(this);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  public void mouseEntered(MouseEvent m)
  {
    l.setText("Mouse Entered");
  }
  public void mouseExited(MouseEvent m)
  {
    l.setText("Mouse Exited");
  }
  public void mouseClicked(MouseEvent m)
  {
    l.setText("Mouse Clicked");
  }
  public void mousePressed(MouseEvent m)
  {
    l.setText("Mouse Pressed");
  }
  public void mouseReleased(MouseEvent m)
  {
    l.setText("Mouse Released");
  }
  
  public static void main(String args[])
  {
   new MouseDemo();  
  }
  
}
