import javax.imageio.plugins.tiff.TIFFTag;

public class ArgsDemo {
    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }
//recursive
    public int size() {
        if (rest == NULL) return 0;
        return 1 + this.rest.size();
    }
//iterative
    public int itesize() {
        int s = 1;
        //optimized
        IntList tmp = this;
        // IntList tmp = new IntList(this.f, this.r);
        while (tmp.rest != NULL) {
            tmp = tmp.rest;
            s++;
        }
        return s;
    }
//get a value
//iterative
    public int get(int i) {
        int count = 0;
        IntList tmp = this;
        int val = tmp.first;
        while (count < i) {
            val = tmp.rest.first;
            tmp = tmp.rest;
            count++;
        }
        return val;
//recursive
    public int get(int i) {
        if (i == 0) return first;
        return rest.get(i - 1);
    }

//more exercise
    public static IntList incrList(IntList L, int x) {
        IntList Q = new IntList();
        IntList T = Q;
        IntList K = L;
        while (K != null) {
            T.first = K.first + x;
            if (K.rest == null) {
                Q.rest = null;
            }
            else {
                Q.rest = new IntList();
                Q = Q.rest;
            }
            K = K.rest;
        }
    }

    public static IntList incrList(IntList L, int x) {
        IntList Q = new IntList();
        IntList T = Q;
        IntList K = L;
        T.first = K.first + x;
        while (K.rest != null) {
            T.rest = new IntList();
            T.rest.first = K.rest.first + x;
            T = T.rest;
            K = K.rest;
        }
    }
//recursive
    public static IntList dincrList(IntList L, int x) {
        IntList Q = L;
        IntList T = Q;
        while (T != null) {
            T.first += x;
            T = T.rest;
        }
    }
    public static void main(String[] args) {
        System.out.println(args[0]);
        
    }
}