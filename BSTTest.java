import junit.framework.TestCase;

public class BSTTest extends TestCase {

    public void testMain() {
        Tree tree = new Tree();
        tree.insert(1);
        tree.insert(-1);
        tree.insert(2);
        tree.insert(0);
        tree.insert(3);
        tree.insert(-2);
        tree.insert(5);
        tree.insert(4);
        tree.insert(6);
        tree.insert(7);

        assertTrue(tree.minimumDepth()==3);
        assertTrue(tree.maximumDepth() == 6);

        PreOrderVisitor pov = new PreOrderVisitor(99);
        tree.accept(pov);
        assertFalse(pov.getResult());

        pov.setItem(5);
        tree.accept(pov);
        assertTrue(pov.getResult());

        BFSVisitor bv = new BFSVisitor(3);
        tree.accept(bv);
        assertTrue(bv.getResult());

        bv.setItem(-8);
        tree.accept(bv);
        assertFalse(bv.getResult());
    }
}