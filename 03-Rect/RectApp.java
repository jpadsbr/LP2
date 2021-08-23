public class RectApp {
  public static void main (String[] args) {
    Rect r1 = new Rect(1,1, 10,10);
    r1.print();
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

  void print () {
    System.out.format("Retangulo de posicao (%d,%d) e tamanho (%d,%d).\n",
    this.x, this.y, this.w, this.h);
  }
}