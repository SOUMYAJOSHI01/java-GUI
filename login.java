import java.awt.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class login extends Frame  {


    login()
    {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

       Label l1,l2;
       TextField t1,t2;
       Button b1;
       l1=new Label("Username", (int) CENTER);
       l2=new Label("Password", (int) CENTER);
       b1=new Button("Login");
       t1=new TextField(20);
       t2=new TextField(20);
       add(l1);
       add(t1);
       add(l2);
       add(t2);
       add(b1);





    }


    public static void main(String[] args) {

        login l=new login();
        l.setSize(700,700);
        l.setVisible(true);
        l.setLayout(new FlowLayout());
    }
}
