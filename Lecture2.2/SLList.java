public class SLList {
    //rebranding + nested
    //public and private: Private variables and methods 
    //can only be accessed by code inside the same .java file, e.g. in this case SLList.java. 
    //make this private if no external classes use IntNode
    //if the nested class never uses any detail of the SLList class, meaning it never looks out
    //use the static here; advantage: result in a minor savings of memory
    //when the class is private, the access modifiers before its attributes and methods are no longer important
    private static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode m) {
            item = i;
            next = m;
        }
    }

    //Bureaucracy
    //make the list all the same(even empty)
    //sentinel.next is gonna be the first real item
    // private IntNode first;
    private IntNode sentinel;
    //saving important data to speed up retrieval(similar to dp idea of recording value)
    //known as caching
    private int size;

    /** constructor */
    // public SLList(int x) {
    //     first = new IntNode(x, null);
    //     size = 1;
    // }
    public SLList(int x) {
        sentinel = new IntNode(0, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    //empty list
    // public SLList() {
    //     first = null;
    //     size = 0;
    // }
    public SLList() {
        sentinel = new IntNode(0, null);
        size = 0;
    }

    //add first and get first
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    // public int getFirst() {
    //     return first.item;
    // }
    public int getFirst() {
        return sentinel.next.item;
    }

    //add last and size
    //fix the empty problem
    // public void addLast(int x) {
    //     size += 1;
        
    //     //one way to avoid empty list
    //     //disadvantage: verbose, inefficient
    //     if (first == null) {
    //         first = new IntNode(x, null);
    //         return;
    //     }

    //     IntNode p = first;
    //     //advance p to the end of the list
    //     while (p.next != null) {
    //         p = p.next;
    //     }
        
    //     p.next = new IntNode(x, null);
    // }

    public void addLast(int x) {
        size += 1;

        IntNode p = sentinel;
        //advance p to the end of the list
        while (p.next != null) {
            p = p.next;
        }
        
        p.next = new IntNode(x, null);
    }
    
    //SLList has no next variable, so it cannot directly use recursive call to get size
    //Instead, we'll use a middlemanclass that interacts with the underlying naked recursive data structure
    //two methods with same name but different parameters are allowed in Java
    //An alternate approach is to create a non-static method in the IntNode class
    //This approach disadvantage: time complexity linear time, not friendly to large list
    // private static int size(IntNode n) {
    //     if (n.next == null) return 1;
    //     return 1 + size(n.next);
    // } 

    // public int size() {
    //     return size(first);
    // }
    
    //creating cache for size instead
    //the class SLList itself serves as a cache for the naked data structure
    //allows us to organize and store important data information about entire list, save time
    //safe, avoid errors by IntList users
    public int size() {
        return size;
    }
    
    public static void main(String[] args) {
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        System.out.println(L.size());

        SLList s1 = new SLList();
        s1.addLast(5);
    }
}
