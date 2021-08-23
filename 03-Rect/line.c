#include <stdio.h>

typedef struct {
  int x1, y1;
  int x2, y2;
} Rect;

void print (Rect* r) {
  printf("Linha de posicao inicial (%d,%d) e posicao final (%d,%d).\n",
  r->x1, r->y1, r->x2, r->y2);
}

void main (void) {
  Rect r1 = { 1,1, 10, 10};
  print(&r1);
}