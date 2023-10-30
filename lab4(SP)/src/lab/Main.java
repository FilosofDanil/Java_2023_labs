package lab;

public class Main {

    public static void main(String[] args) {
        // simple draw
        Rectangle rectangle = new Rectangle(17, 7);
        for(int i = 0; i < 17; i++){
            rectangle.addDot(i, 1, '*');
        }
        for(int i = 0; i < 5; i++){
            rectangle.addDot(i, 5, '/');
        }
        for(int i = 3; i < 7; i++){
            rectangle.addDot(i, i, 'i');
        }
        System.out.println(rectangle.draw());

        //more complicated draw
    }
}
