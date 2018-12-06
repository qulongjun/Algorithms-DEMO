import com.StackAndQeuee.GetMinStack01;
import com.StackAndQeuee.GetMinStack02;

public class Main {

    public static void main(String[] args) {
        GetMinStack02 stack = new GetMinStack02();
//        System.out.println(stack.getMin());
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(0);
        stack.push(2);
        stack.push(12);
        System.out.println(stack.getMin());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("Hello World!");
    }
}
