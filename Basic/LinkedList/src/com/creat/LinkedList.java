package com.creat;

/**
 * ClassName: LinkedList
 * Package: com.creat
 * Description:
 *
 * @Author Joe
 * @Create 2024-04-05 18:29
 * @Version
 */
public class LinkedList {
    public static void main(String[] args) {
        ListNode n0 = new ListNode(1);
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(5);
        ListNode n4 = new ListNode(4);

        // 构建节点之间的引用
        n0.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
    }
    /* 在链表的节点 n 之后插入节点 P
    * 时间复杂度 :O(1)
    * */
    public void insert(ListNode n, ListNode P) {
        ListNode n1 = n.next;//n1是一个局部变量
        P.next = n1;
        n.next = P;//n的next只能存一个，给P之后，内存地址就变了，不会是n1了
    }
    /* 删除链表的节点 n 之后的首个节点
    * 时间复杂度 :O(1)
    * */
    public void remove(ListNode n) {
        if (n.next == null)
            return;
        // n0 -> P -> n1
        ListNode P = n.next;
        ListNode n1 = P.next;
        n.next = n1;
    }
    /* 访问链表中索引为 index 的节点
    * 时间复杂度 :O(n)
    * */
    public ListNode access(ListNode head, int index) {
        for (int i = 0; i < index; i++) {
            if (head == null)
                return null;
            head = head.next;
        }
        return head;
    }
    /* 在链表中查找值为 target 的首个节点
    * 时间复杂度 :O(n)
    *  */
    public int find(ListNode head, int target) {
        int index = 0;
        while (head != null) {
            if (head.val == target)
                return index;
            head = head.next;
            index++;
        }
        return -1;
    }
}

/* 链表节点类 */
class ListNode {
    int val;        // 节点值,存储值的
    ListNode next;  // 指向下一节点的引用
    ListNode(int x) { val = x; }  // 构造函数
}

/* 双向链表节点类 */
class DoublyLinkedList {
    int val;        // 节点值
    DoublyLinkedList next;  // 指向后继节点的引用
    DoublyLinkedList prev;  // 指向前驱节点的引用
    DoublyLinkedList(int x) { val = x; }  // 构造函数
}