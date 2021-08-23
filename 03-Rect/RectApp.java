public class RectApp {
  public static void main (String[] args) {
    Rect r1 = new Rect(1,1, 10,10);
    r1.print();
  }
}

class Rect {
  int x1, y1;
  int x2, y2;

  Rect (int x1, int y1, int x2, int y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  void print () {
    System.out.format("Linha de posicao inicial (%d,%d) e posicao final (%d,%d).\n",
    this.x1, this.y1, this.x2, this.y2);
  }
}