import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

public class EllipseApp {
  public static void main (String[] args) {
    PaintFrame frame = new PaintFrame();
  }
}

class PaintFrame extends JFrame {
  Rectangle rect1, rect5;
  Ellipse ellipse1, ellipse2, ellipse3;


  PaintFrame () {
    this.addWindowListener(
      new WindowAdapter() {
        public void windowClosing (WindowEvent e) {
          System.exit(0);
        }
      }
    );
    this.setTitle("Figures");
    this.setSize(550, 550);
    this.setVisible(true);

    this.rect1 = new Rectangle(100,100, 350,350, 0,0,0, 100,100,100);
    this.ellipse1 = new Ellipse(150,150, 100,45, 0,0,0, 255,255,255);
    this.ellipse2 = new Ellipse(300,150, 100,45, 0,0,0, 255,255,255);
    this.ellipse3 = new Ellipse(250,240, 50,70, 0,0,0, 255,0,0);
    this.rect5 = new Rectangle(200,350, 150,30, 0,0,0, 0,0,255);
  }

  public void paint(Graphics g) {
    super.paint(g);
    this.rect1.paint(g);
    this.ellipse1.paint(g);
    this.ellipse2.paint(g);
    this.ellipse3.paint(g);
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

    g2d.setColor(new Color(this.r2, this.g2, this.b2));
    g2d.fillRect(this.x, this.y, this.w, this.h);
    
    g2d.setColor(new Color(this.r1, this.g1, this.b1));
    g2d.drawRect(this.x, this.y, this.w, this.h);

  }
}

class Ellipse {
  int x, y;
  int w, h;
  int r1, g1, b1;
  int r2, g2, b2;

  Ellipse(int x, int y, int w, int h, int r1, int g1, int b1, int r2, int g2, int b2) {
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

    g2d.setColor(new Color(this.r2, this.g2, this.b2));
    g2d.fill(new Ellipse2D.Double(this.x, this.y, this.w, this.h));

    g2d.setColor(new Color(this.r1, this.g1, this.b1));
    g2d.draw(new Ellipse2D.Double(this.x, this.y, this.w, this.h));
  }
}