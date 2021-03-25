import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class house extends Frame {
    house(){
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);

            }
        });
    }
    public void paint(Graphics s){
        s.setColor(Color.brown);
        s.drawRect(260,280,790,380);
        s.setColor(Color.yellow);
        s.drawLine(260,280,370,180);
        s.drawLine(370,180,470,280);
        s.drawLine(370,180,1050,180);
        s.drawLine(1050,280,1050,280);
        s.drawLine(450,280,470, 660);
        s.drawRect(550,510,90,150);

    }
     public static void main(String[] args){
        house h = new house();
         h.setSize(1900,1900);
         h.setVisible(true);
     }
}
