package com.hubin.niuke;

import java.util.*;

public class NC93 {

    /**
     * lru design
     * @param operators int整型二维数组 the ops
     * @param k int整型 the k
     * @return int整型一维数组
     */
    public int[] LRU (int[][] operators, int k) {
        // write code here
        // 初始化 LRU
        LRUcache lrucache = new LRUcache(k);
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<operators.length; i++){
            // 为 1 时，添加
            if(operators[i][0] == 1){
                lrucache.put(operators[i][1], operators[i][2]);
            }else{
                // 为 2 时，获取
                list.add(lrucache.get(operators[i][1]));
            }
        }

        // 输出答案
        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}

// 手写 LRU 缓存
class LRUcache{
    // 双向链表
    class Node{
        int key, value;
        Node pre, next;
        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    // HashMap 和 大小记录
    Map<Integer, Node> map = new HashMap<>();
    int size = 0;

    // 定义双向链表头尾节点
    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);

    // 定义 LRU 容量
    int capacity;

    // 外部接口，根据 key 获取 value
    public int get(int key){
        Node node = map.get(key);
        if(node == null){
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    // 外部接口，加入 key，value 到 LRU 缓存
    public void put(int key, int value){
        Node node = map.get(key);
        if(node == null){
            Node iNode = new Node(key, value);
            if(size < capacity){
                insertNode(iNode);
            }else{
                deleteNode(tail.pre);
                insertNode(iNode);
            }
        }else{
            node.value = value;
            moveToHead(node);
        }
    }

    // 内部方法，将当前节点更新到链表首端
    private void moveToHead(Node node){
        deleteNode(node);
        insertNode(node);
    }

    // 内部方法，将当前节点从链表中删除
    private void deleteNode(Node node){
        map.remove(node.key);
        node.pre.next = node.next;
        node.next.pre = node.pre;
        size--;
    }

    // 内部方法，将当前节点加入链表，放于首端
    private void insertNode(Node node){
        map.put(node.key, node);
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
        node.pre = head;
        size++;
    }

    // 构造方法，初始化 LRU
    public LRUcache(int capacity){
        this.capacity = capacity;
        head.next = tail;
        tail.pre = head;
        tail.next = null;
    }
}

