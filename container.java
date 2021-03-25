import java.awt.*;


public class Container  {

        public static void main(String[] args){

            Frame f1 = new Frame();
            Checkbox c1 = new Checkbox(" java");
            TextField x1 = new TextField(10);
            Choice s = new Choice();
            s.setBounds(100, 100, 75, 75);
            s.add("blue");
            s.add("green");
            s.add("red");
            s.add("white");
            f1.add(s);
            f1.add(c1);
            f1.add(x1);

            f1.setVisible(true);
            f1.setSize(400, 400);
            f1.setLayout(new FlowLayout());
        }
    }
