import java.awt.event.*;
import java.awt.*;

class calculator implements ActionListener
{
        Frame f;
        Label l1, l2, l3;
        TextField t1, t2,t3;
        Button b;
        Font f1 = new Font("SansSerif",Font.BOLD,13);        
  
    calculator()
    {
        Frame f = new Frame("Pro Calculator");

        l1=new Label("     Enter First Number");     // Lable 2
        l1.setBounds(15,45, 160, 40);
        l1.setBackground(Color.blue);
        l1.setFont(f1);
        f.add(l1);

            l2=new Label("   Enter Second Number");   //Lable 1
            l2.setBounds(15, 95 ,160 ,40);
            l2.setBackground(Color.blue);
            l2.setFont(f1);
            f.add(l2);

        t1=new TextField();     //TextField 1
        t1.setBounds(210,55,150,30);
        t1.setFont(f1);
        f.add(t1);

            t2=new TextField();   // TextField 2
            t2.setBounds(210,100,150,30);
            t2.setFont(f1);
            f.add(t2);
        
        t3=new TextField("\t(Result)  ");
        t3.setBounds(210,180,150,35);
        t3.setFont(f1);
        f.add(t3);

        b = new Button("Add");
        b.setBounds(95,180,80,35);
        b.setFont(f1);
        f.add(b);

        b.addActionListener(this);

        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
               System.exit(0);
            }
        });

        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setBackground(Color.blue);
    }

        public void actionPerformed(ActionEvent e)
        {
            int a = Integer.parseInt(t1.getText());
            int d = Integer.parseInt(t2.getText());
            int c = 0;

            if(e.getSource().equals(b))
            {
                c=a+d;
                t3.setText(String.valueOf(c));
            }
        }

    public static void main(String[] args)
    {
        calculator c = new calculator();
    }
}
