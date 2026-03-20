class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
    class Circle extends Shape {
        void draw() {
            System.out.println("Shape is circle");
        }
        void draw(int r) {
            System.out.println("circle radius" + r);
        }
    }
}
        public class MathShape {
            public static void main(String[] args) {
                Shape s = new Circle();
                s.draw();
                s.draw(5);
            }
        }

//output: compile error