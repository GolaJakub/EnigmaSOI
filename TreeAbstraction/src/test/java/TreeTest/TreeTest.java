package TreeTest;

import Tree.Branch;
import Tree.Root;
import Tree.Tree;
import Tree.Trunk;
import org.junit.Assert;
import org.junit.Test;
import Tree.ConiferousTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeTest {


    private final static List<Branch> branches = new ArrayList<Branch>(Arrays.asList(new Branch(4,5), new Branch(5,4)));
    private final static List<Root> roots = new ArrayList<Root>(Arrays.asList(new Root(5),new Root(3),new Root(2)));
    private static final Tree conifer = ConiferousTree.builder().branches(branches).trunk(new Trunk(5)).roots(roots).build();


    @Test
    public void isTreeGrowingCorrectly(){
        Assert.assertEquals(branches.size(),2);
        Assert.assertEquals(roots.size(),3);
        Assert.assertEquals(conifer.getTrunk().getHeight(),5);

        conifer.grow();
        Assert.assertEquals(branches.size(),3);
        Assert.assertEquals(roots.size(),4);
        Assert.assertEquals(conifer.getTrunk().getHeight(),7);

        conifer.grow();
        Assert.assertEquals(branches.size(),4);
        Assert.assertEquals(roots.size(),5);
        Assert.assertEquals(conifer.getTrunk().getHeight(),9);
    }

    @Test
    public void isIntroducingDependsOnTreeType(){
        Assert.assertEquals("I have needles!", conifer.introduceYourself());
    }


}
