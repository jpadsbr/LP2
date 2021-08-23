public class RectMethodApp {
  public static void main (String[] args) {
    Rect r1 = new Rect(1,1, 10,10);
    r1.area();
    r1.drag(19,19);
  }
}

class Rect {
  int x, y;
  int w, h;

  Rect (int x, int y, int w, int h) {
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
  }

  void area () {
    int area = this.w * this.h;
    System.out.format("Area do retangulo igual a (%d).\n", area);
  }

  void drag (int dx, int dy) {
    int newXPos = this.x + dx;
    int newYPos = this.y + dy;
    System.out.format("Nova posicao do retangulo igual a (%d,%d).\n", newXPos, newYPos);
  }
}