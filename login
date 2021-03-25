import java.awt.*;
import java.awt.event.*;
class LoginWindow extends Frame
{
    TextField name,pass;
    Button b1,b2;
    LoginWindow()
    {
		 this.addWindowListener( new WindowAdapter()
  {
    public void windowClosing(WindowEvent we)
	{
	  System.exit(0);
	}
	});
		
        setLayout(new FlowLayout());
        this.setLayout(null);
        Label n=new Label("Name:",Label.CENTER);
        Label p=new Label("password:",Label.CENTER);
        name=new TextField(15);
        pass=new TextField(15);
        pass.setEchoChar('*');
        b1=new Button("Login");
        this.add(n);
        this.add(name);
        this.add(p);
        this.add(pass);
        this.add(b1);
        this.add(b2);
        n.setBounds60,80,80,60);
        p.setBounds(70,130,90,60);
        name.setBounds(200,100,80,20);
        pass.setBounds(200,140,90,20);
        b1.setBounds(100,260,70,40);
       
 
    }
	public void paint(Graphics g)
	 {
	    this.setBackground(Color.blue);
		
		Font f=new Font("Arial",Font.BOLD,20);
		g.setFont(f);
		g.setColor(Color.blue);
		g.drawString("LOGIN ",60,60);
		}
	
    public static void main(String args[])
    {
        LoginWindow sl=new LoginWindow();
        sl.setVisible(true);
        sl.setSize(400,400);
        sl.setTitle("login window");
 
    }
}
