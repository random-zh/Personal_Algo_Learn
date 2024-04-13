package com.creat;

import java.util.ArrayList;
import java.util.Stack;

/**
 * ClassName: Stack
 * Package: com.creat
 * Description:
 *
 * @Author Joe
 * @Create 2024-04-12 20:59
 * @Version
 */
public class StackTest {
    public static void main(String[] args) {
        /* 初始化栈 */
        Stack<Integer> stack = new Stack<>();

        /* 元素入栈 */
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(4);

        /* 访问栈顶元素 */
        int peek = stack.peek();

        /* 元素出栈 */
        int pop = stack.pop();

        /* 获取栈的长度 */
        int size = stack.size();

        /* 判断是否为空 */
        boolean isEmpty = stack.isEmpty();
    }
}

/* 基于链表实现的栈 */
class LinkedListStack {
    private ListNode stackPeek; // 将头节点作为栈顶
    private int stkSize = 0; // 栈的长度

    public LinkedListStack() {
        stackPeek = null;
    }

    /* 获取栈的长度 */
    public int size() {
        return stkSize;
    }

    /* 判断栈是否为空 */
    public boolean isEmpty() {
        return size() == 0;
    }

    /* 入栈 */
    public void push(int num) {
        ListNode node = new ListNode(num);
        node.next = stackPeek;
        stackPeek = node;
        stkSize++;
    }

    /* 出栈 */
    public int pop() {
        int num = peek();
        stackPeek = stackPeek.next;
        stkSize--;
        return num;
    }

    /* 访问栈顶元素 */
    public int peek() {
        if (isEmpty())
            throw new IndexOutOfBoundsException();
        return stackPeek.val;
    }

    /* 将 List 转化为 Array 并返回 */
    public int[] toArray() {
        ListNode node = stackPeek;
        int[] res = new int[size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = node.val;
            node = node.next;
        }
        return res;
    }
}


/* 基于数组实现的栈 */
class ArrayStack {
    private ArrayList<Integer> stack;

    public ArrayStack() {
        // 初始化列表（动态数组）
        stack = new ArrayList<>();
    }

    /* 获取栈的长度 */
    public int size() {
        return stack.size();
    }

    /* 判断栈是否为空 */
    public boolean isEmpty() {
        return size() == 0;
    }

    /* 入栈 */
    public void push(int num) {
        stack.add(num);
    }

    /* 出栈 */
    public int pop() {
        if (isEmpty())
            throw new IndexOutOfBoundsException();
        return stack.remove(size() - 1);
    }

    /* 访问栈顶元素 */
    public int peek() {
        if (isEmpty())
            throw new IndexOutOfBoundsException();
        return stack.get(size() - 1);
    }

    /* 将 List 转化为 Array 并返回 */
    public Object[] toArray() {
        return stack.toArray();
    }
}


/* 链表节点类 */
class ListNode {
    int val;        // 节点值,存储值的
    ListNode next;  // 指向下一节点的引用

    ListNode(int x) {
        val = x;
    }  // 构造函数
}

