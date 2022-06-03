package Methods;

// improved stack class that uses the length array member
public class ImprovedStack {
    private int stck[];
    private int tos;

    // allocate and initialize stack
    ImprovedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // push an item onto the stck
    void push (int item) {
        if (tos==stck.length-1)
            System.out.println("stack is full.");
        else
            stck[++tos] = item;
    }

    // pop an item from the stack
    int pop() {
        if (tos<0) {
            System.out.println("stack underflow.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
