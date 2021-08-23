import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PaintApp {
  public static void main (String[] args) {
    PaintFrame frame = new PaintFrame();
  }
}

class PaintFrame extends JFrame {
  Rectangle rect1, rect2, rect3, rect4, rect5;

  PaintFrame () {
    this.addWindowListener(
      new WindowAdapter() {
        public void windowClosing (WindowEvent e) {
          System.exit(0);
        }
      }
    );
    this.setTitle("Rectangle");
    this.setSize(550, 550);
    this.setVisible(true);

    this.rect1 = new Rectangle(100,100, 350,350, 0,0,0, 100,100,100);
    this.rect2 = new Rectangle(150,150, 100,45, 255,255,0, 0,0,0);
    this.rect3 = new Rectangle(300,150, 100,45, 255,255,0, 0,0,0);
    this.rect4 = new Rectangle(250,250, 50,50, 0,0,0, 255,0,0);
    this.rect5 = new Rectangle(200,350, 150,30, 0,0,0, 0,0,255);
  }

  public void paint(Graphics g) {
    super.paint(g);
    this.rect1.paint(g);
    this.rect2.paint(g);
    this.rect3.paint(g);
    this.rect4.paint(g);
    this.rect5.paint(g);
  }
}

class Rectangle {
  int x, y;
  int w, h;
  int r1, g1, b1;
  int r2, g2, b2;

  Rectangle(int x, int y, int w, int h, int r1, int g1, int b1, int r2, int g2, int b2) {
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    this.r1 = r1;
    this.g1 = g1;
    this.b1 = b1;
    this.r2 = r2;
    this.g2 = g2;
    this.b2 = b2;
  }

  void paint(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;

    g2d.setColor(new Color(this.r1, this.g1, this.b1));
    g2d.drawRect(this.x, this.y, this.w, this.h);

    g2d.setColor(new Color(this.r2, this.g2, this.b2));
    g2d.fillRect(this.x, this.y, this.w, this.h);
  }
}