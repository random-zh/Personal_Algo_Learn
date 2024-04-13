package com.test;

/**
 * ClassName: LinkedList
 * Package: com.test
 * Description:
 *
 * @Author Joe
 * @Create 2024-04-05 19:50
 * @Version
 */
public class LinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
// 在链表头部插入一个新节点
        list.insertAtHead(5);
        list.insertAtHead(3);
        list.insertAtHead(1);

// 获取链表的头节点
        ListNode firstNode = list.getHead();
        System.out.println("第一个节点的值为：" + firstNode.val);

    }
    private ListNode head; // 链表头节点的引用

    // 构造函数，用于初始化链表的头节点
    public LinkedList() {
        head = null; // 初始时链表为空
    }

    // 在链表头部插入一个新节点
    public void insertAtHead(int val) {
        ListNode newNode = new ListNode(val); // 创建新节点
        newNode.next = head; // 将新节点的next指向当前的头节点
        head = newNode; // 更新头节点引用为新节点
    }

    // 获取链表的头节点
    public ListNode getHead() {
        return head;
    }
}

// 链表节点类
class ListNode {
    int val;        // 节点值
    ListNode next;  // 指向下一节点的引用

    ListNode(int x) {
        val = x;
    }  // 构造函数
}

