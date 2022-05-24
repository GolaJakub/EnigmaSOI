package Tree;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@ToString
@Getter
public abstract class Tree {
    private Trunk trunk;
    private List<Branch> branches;
    private List<Root> roots;


    public void grow(){
        for (Branch branch: branches) {
                branch.setLength(branch.getLength()+3);
                branch.setLeavesAmount(branch.getLeavesAmount()+4);
        }
        branches.add(new Branch(1,0));

        for (Root root: roots) {
            root.setLength(root.getLength()+5);
        }
        roots.add(new Root(1));
        trunk.setHeight(trunk.getHeight()+2);
    }

    public String introduceYourself(){
        return "I am Tree";
    }

}
