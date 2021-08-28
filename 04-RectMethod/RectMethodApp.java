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

  int area () {
    return this.w * this.h;
  }

  void drag (int dx, int dy) {
    this.x = this.x + dx;
    this.y = this.y + dy;
  }
}