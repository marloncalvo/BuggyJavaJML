import java.util.Stack;

public class Counterexample {
    public static void main(String[] args) {
        case1();
        case2();
    }
    public static void case1() {
        StackQueue sq = new StackQueue();
        StackQueue.Queue q = sq.new Queue();
        for (int i = 0; i < 99; i++) {
            q.enter(-1);
        }

        assert(!q.isFull());
    }

    public static void case2() {
        StackQueue sq = new StackQueue();
        StackQueue.Queue q = sq.new Queue();
        for (int i = 0; i < 99; i++) {
            q.enter(-1);
        }

        // assert exception
        q.enter(-1);
    }
}
