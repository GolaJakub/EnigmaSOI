package Tree;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class ConiferousTree extends Tree {
    @Override
    public String introduceYourself() {
        return "I have needles!";
    }
}
