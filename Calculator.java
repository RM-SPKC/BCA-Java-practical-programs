import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener
 {
    TextField t;
    double num1;
    char operator;

    public Calculator()
	{
        setTitle("Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());

        t = new TextField();
        t.setEditable(false);
        t.setFont(new Font("Arial", Font.BOLD, 20));
        add(t, BorderLayout.NORTH);

        Panel p = new Panel(new GridLayout(4, 4,5,5));
        for (String i : "7 8 9 / 4 5 6 * 1 2 3 - 0 C = +".split(" "))
		{
            Button b = new Button(i);
            b.setFont(new Font("Arial", Font.BOLD, 18));
            b.addActionListener(this);
            p.add(b);
        }
        add(p, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });
    }

    public void actionPerformed(ActionEvent e) 
	{
        String in = e.getActionCommand();
            if (in.matches("[0-9]"))
			{
               t.setText(t.getText() + in);
            } 
			else if (in.equals("C")) 
			{
               t.setText("");
            }
			else if (in.equals("=")) 
			{
                double num2 = Double.parseDouble(t.getText());
                double result = 0;

                switch (operator) 
				{
                    case '+': result = num1 + num2; break;
                    case '-': result = num1 - num2; break;
                    case '*': result = num1 * num2; break;
                    case '/':
                       try
					   {
					    if(num2==0)
						  throw new ArithmeticException();
                        result = num1 / num2;
					   }
					   catch(ArithmeticException ae)
					   {
					    t.setText("Error : Division by zero");
						return;
					   }
                        break;
                    default:
                        t.setText("Error");
                }
                t.setText(String.valueOf(result));
            } 
			else 
			{
                num1 = Double.parseDouble(t.getText());
                operator = in.charAt(0);
                t.setText("");
            }
        } 

    public static void main(String[] args) 
	{
        new Calculator().setVisible(true);
    }
}
