package com.StackAndQeuee;

import java.util.Stack;

/*
【提问】：实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作。
【要求】：1. pop、push、getMin操作的时间复杂度都是 O(1)。 2. 设计的栈类型可以使用现成的栈结构。
 */

public class GetMinStack01 {

    private Stack<Integer> minStack = new Stack<Integer>(); // 最小数据栈，用于存放栈中最小值

    private Stack<Integer> dataStack = new Stack<Integer>(); // 通用数据栈，用于存放所有数据


    /**
     * 判断当前数据栈是否为空
     */
    public void isEmpty() {
        if (this.dataStack.isEmpty()) throw new RuntimeException("当前数据栈为空！"); // 若通用数据栈为空，则表示当前没有数据或数据已全部清空
    }


    /**
     * 获取当前栈中最小值
     *
     * @return 栈中最小的值
     */
    public int getMin() {

        this.isEmpty();

        return this.minStack.peek(); // 获取最小数据栈中顶部数据
    }

    /**
     * 推出当前栈中顶部数据
     *
     * @return 栈中最后一位
     */
    public int pop() {

        this.isEmpty();

        if (this.dataStack.peek() == this.getMin()) this.minStack.pop(); // 若通用数据栈的最顶部数据和最小数据栈的顶部数据相同，则一起推出栈

        return this.dataStack.pop(); // 推出通用数据栈中顶部数据
    }

    /**
     * 将数据添加至数据栈中
     *
     * @param data 新数据
     */
    public void push(int data) {

        if (this.minStack.isEmpty() || data <= this.getMin()) {

            this.minStack.push(data); // 若当前最小数据栈为空，则将数据推入最小数据栈

        }

        this.dataStack.push(data); // 将数据推入通用数据栈

    }
}
