public class SLList {
    //rebranding + nested
    //public and private: Private variables and methods 
    //can only be accessed by code inside the same .java file, e.g. in this case SLList.java. 
    public class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode m) {
            item = i;
            next = m;
        }
    }

    //Bureaucracy
    public IntNode first;

    /** constructor */
    public SLList(int x) {
        first = new IntNode(x, null);
    }

    //add first and get first
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    public int getFirst() {
        return first.item;
    }
    
}
