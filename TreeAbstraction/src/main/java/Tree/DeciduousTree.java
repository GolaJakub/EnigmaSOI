package Tree;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class DeciduousTree extends Tree {
    @Override
    public String introduceYourself() {
        return "I have leaves!";
    }
}
