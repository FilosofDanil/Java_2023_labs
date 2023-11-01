package lab;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Rectangle implements Figure {
    private int a;
    private int b;
    private List<Dot> dots;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        dots = new ArrayList<>();
    }

    @Override
    public String draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  ");
        for (int i = 0; i < this.a; i++) {
            stringBuilder.append("__");
        }
        stringBuilder.append("\n");
        for (int i = 0; i < this.b; i++) {
            AtomicInteger placed = new AtomicInteger();
            stringBuilder.append("| ");
            for (int j = 0; j < this.a; j++) {
                int finalJ = j;
                int finalI = i;
                dots.forEach(dot -> {
                    if (dot.getX() == finalJ && dot.getY() == finalI) {
                        placed.getAndIncrement();
                        stringBuilder.append(dot.getType().getSymbol());
                    }
                });
                stringBuilder.append(" ");
            }
            int spaces = this.a - placed.get();
            for (int f = 0; f < spaces; f++) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(" | ");
            stringBuilder.append("\n");
        }
        stringBuilder.append("  ");
        for (int i = 0; i < this.a; i++) {
            stringBuilder.append("__");
        }
        return stringBuilder.toString();
    }

    public void addDot(int x, int y, Character symbol) {
        DotType type = DotFactory.getDotType(symbol);
        Dot dot = new Dot(x, y, type);
        dots.add(dot);
    }
}
