package lab;

public class Main {

    public static void main(String[] args) {
        // simple draw
        Rectangle rectangle = new Rectangle(17, 7);
        for (int i = 0; i < 17; i++) {
            rectangle.addDot(i, 1, '*');
        }
        for (int i = 0; i < 5; i++) {
            rectangle.addDot(i, 5, '/');
        }
        for (int i = 3; i < 7; i++) {
            rectangle.addDot(i, i, 'i');
        }
        System.out.println(rectangle.draw());

        Rectangle men = new Rectangle(25, 15);

        for (int i = 17; i < 21; i++) {
            men.addDot(i, 2, '*');
        }
        for (int i = 3; i < 4; i++) {
            men.addDot(17, i, '*');
            men.addDot(22, i, '*');
        }

        for (int i = 17; i < 21; i++) {
            men.addDot(i, 4, '*');
        }

        for (int i = 5; i < 10; i++) {
            if (i == 7){
                men.addDot(17, i, '|');
                continue;
            }
            men.addDot(20, i, '|');

        }

        for (int i = 0; i < 3; i++) {
            men.addDot(16 - i,  7, '_');
        }

        for (int i = 0; i < 3; i++) {
            men.addDot(18 + i,  7, '_');
        }

        for (int i = 0; i < 3; i++) {
            men.addDot(21 + i,  10 + i, '\\');
        }

        for (int i = 0; i < 3; i++) {
            men.addDot(19 - i,  10 + i, '/');
        }

        System.out.println(men.draw());

        //more complicated draw
    }
}
