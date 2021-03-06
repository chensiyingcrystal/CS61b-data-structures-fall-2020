public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

//recursive
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }
//iterative
    public int iterativeSize() {
        int s = 1;
        //optimized
        IntList tmp = this;
        // IntList tmp = new IntList(this.f, this.r);
        while (tmp.rest != null) {
            tmp = tmp.rest;
            s++;
        }
        return s;
    }

//get a value
//recursive
    public int get(int i) {
        if (i == 0) return first;
        return rest.get(i - 1);
    }

// //iterative
// public int get(int i) {
//     int count = 0;
//     IntList tmp = this;
//     int val = tmp.first;
//     while (count < i) {
//         val = tmp.rest.first;
//         tmp = tmp.rest;
//         count++;
//     }
//     return val;

//more exercise
/** Returns an IntList identical to L, but with
    * each element incremented by x. L is not allowed
    * to change. 
*/
    public static IntList incrList(IntList l, int x) {
        IntList q = new IntList(l.first + x, null);
        IntList t = q;
        IntList k = l;
        while (k.rest != null) {
            t.rest = new IntList(k.rest.first + x, null);
            t = t.rest;
            k = k.rest;
        }
        return q;
    }

/** Returns an IntList identical to L, but with
    * each element incremented by x. Not allowed to use
    * the 'new' keyword. 
*/
    public static IntList dincrList(IntList l, int x) {
        IntList q = l;
        IntList t = q;
        while (t != null) {
            t.first += x;
            t = t.rest;
        }
        return q;
    }

    public void addfirst(IntList l) {
        rest = l;
    }
    public static void main(String[] args) {
        IntList l = new IntList(5, null);
        l.rest = new IntList(7, null);
        l.rest.rest = new IntList(9, null);

        //build our list backwards
        IntList q = new IntList(15, null);
        q = new IntList(10, q);
        q = new IntList(5, q);
        
        // System.out.println(l.size());
        // System.out.println(l.iterativeSize());

        IntList m = new IntList(1, null);
        System.out.println(m.size());
        m.addfirst(q);
        System.out.println(m.size());

        //see how this data structute of IntList can change size
        //add new elements to its back
        l.rest.rest.rest = new IntList(11, null);

        // System.out.println(l.get(l.size() - 1));
        // System.out.println(incrList(l, 3).first);
        // System.out.println(dincrList(l, 3).first);


    }
}

