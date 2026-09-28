class circle {
  int radius;

  circle(int radius) {
    this.radius = radius;
  }

  void area() {
    System.out.println(3.14 * radius * radius);
  }

  void volume() {
    System.out.println(4 / 3 * 3.14 * radius * radius * radius);
  }

}

class rectangle {
  int width;
  int length;
  int height;

  rectangle(int width, int length) {
    this.width = width;
    this.length = length;
  }

  rectangle(int width, int length, int height) {
    this.width = width;
    this.length = length;
    this.height = height;
  }

  void area() {
    System.out.println(width * length);
  }

  void volume() {
    System.out.println(width * length * height);
  }
}

class square {
  int length;

  square(int length) {
    this.length = length;
  }

  void area() {
    System.out.println(length * length);
  }

  void volume() {
    System.out.println(length * length * length);
  }
}

public class Shapes {
  public static void main(String[] args) {
    circle c1 = new circle(10);
    rectangle r1 = new rectangle(10, 20);
    square s1 = new square(10);

    c1.area();
    r1.area();
    s1.area();

    // 3D Shapes
    rectangle r2 = new rectangle(10, 20, 30);

    System.out.println("Volumes of 3D Shapes:");
    c1.volume();
    r2.volume();
    s1.volume();

  }
}
