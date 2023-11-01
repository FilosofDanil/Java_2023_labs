package lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DotFactory {
    private static List<DotType> dotTypes = new ArrayList<>();

    public static DotType getDotType(Character symbol) {
        Optional<DotType> dotTypeOptional = dotTypes.stream().filter(dotType -> dotType.getSymbol().equals(symbol)).findFirst();
        if (dotTypeOptional.isEmpty()) {
            DotType createdDotType = new DotType(symbol);
            dotTypes.add(createdDotType);
            return createdDotType;
        } else {
            return dotTypeOptional.get();
        }
    }
}
