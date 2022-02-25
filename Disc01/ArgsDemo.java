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

    }
    public static void main(String[] args) {
        System.out.println(args[0]);
        
    }
}