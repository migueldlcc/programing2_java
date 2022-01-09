/**
 * A class that tests and finds the largest element of a tree
 * @author: Miguel de la Cruz Cabello
 * @version: 05/01/2020
 */
public class TernaryTreeTester
{
    public static void main(String[] args)
    {
        TernaryTree root = createBigTree();
        System.out.println("The largest element of the Tree is: " + root.largestElement());
    }

    /**
     * Helper method to create a big tree full of stuff.
     */
    public static TernaryTree createBigTree()
    {
        TernaryTree root = new TernaryTree(99);
        TernaryTree a = new TernaryTree(31);
        TernaryTree b = new TernaryTree(21);
        TernaryTree c = new TernaryTree(123);
        TernaryTree d = new TernaryTree(4123);
        TernaryTree e = new TernaryTree(512);
        TernaryTree f = new TernaryTree(6321);
        TernaryTree g = new TernaryTree(721);
        TernaryTree h = new TernaryTree(833);
        TernaryTree i = new TernaryTree(912);
        TernaryTree j = new TernaryTree(1120);
        TernaryTree k = new TernaryTree(131);
        TernaryTree l = new TernaryTree(1212);
        TernaryTree m = new TernaryTree(112343);
        TernaryTree n = new TernaryTree(11234);
        TernaryTree o = new TernaryTree(14325);
        TernaryTree p = new TernaryTree(12346);
        TernaryTree q = new TernaryTree(45217);
        TernaryTree r = new TernaryTree(185);
        TernaryTree s = new TernaryTree(191);
        TernaryTree t = new TernaryTree(2230);
        TernaryTree u = new TernaryTree(22341);
        TernaryTree v = new TernaryTree(23452);
        TernaryTree w = new TernaryTree(23423);
        TernaryTree x = new TernaryTree(2574);
        TernaryTree y = new TernaryTree(285);
        TernaryTree z = new TernaryTree(25536);

        d.setLeftSubtree(a);
        d.setMiddleSubtree(b);
        d.setRightSubtree(c);
        root.setLeftSubtree(d);

        f.setLeftSubtree(e);
        i.setLeftSubtree(f);
        i.setMiddleSubtree(g);
        i.setRightSubtree(h);
        root.setMiddleSubtree(i);

        m.setMiddleSubtree(j);
        m.setRightSubtree(k);
        n.setLeftSubtree(l);
        p.setLeftSubtree(m);
        p.setMiddleSubtree(n);
        p.setRightSubtree(o);

        s.setLeftSubtree(q);
        s.setRightSubtree(r);
        u.setLeftSubtree(t);
        w.setLeftSubtree(s);
        w.setMiddleSubtree(u);
        w.setRightSubtree(v);
        
        y.setLeftSubtree(x);

        z.setLeftSubtree(p);
        z.setMiddleSubtree(w);
        z.setRightSubtree(y);

        root.setRightSubtree(z);

        return root;
    }
}