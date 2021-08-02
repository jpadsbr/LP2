import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class Hello2DApp {
  public static void main(String[] args) {
    Hello2DFrame frame = new Hello2DFrame();
  }
}

class Hello2DFrame extends JFrame {
  public Hello2DFrame () {
    this.setTitle("Java 2D - Hello world!");
    this.setSize(450, 350);
    this.setVisible(true);

    this.addWindowListener(
      new WindowAdapter() {
        public void windowClosing (WindowEvent e) {
          System.exit(0);
        }
      }
    );
  }

  public void paint (Graphics g) {
    super.paint(g);
    Graphics2D g2d = (Graphics2D) g;
    int w = this.getWidth();
    int h = this.getHeight();

    g2d.setPaint(Color.green);
    g2d.fillRect(0, 0, w, h);

    g2d.setPaint(Color.yellow);

    GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
    path.moveTo(w/2, h/4);
    path.lineTo(w*3/4, h/2);
    path.lineTo(w/2, h*3/4);
    path.lineTo(w/4, h/2);
    path.lineTo(w/2, h/4);
    path.closePath();
    g2d.draw(path);
    g2d.fill(path);

    g2d.setPaint(Color.blue);
    g2d.fillOval(w/2-w/8, h/2-h/6, w/4, h/3);
  }
}