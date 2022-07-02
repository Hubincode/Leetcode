https://zhuanlan.zhihu.com/p/358653377
涉及算法：
1．滑动窗口
2．二指针或迭代器
3．快速和慢速指针或迭代器
4．合并区间
5．循环排序
6．原地反转链表
7．树的宽度优先搜索（Tree BFS）
8．树的深度优先搜索（Tree DFS）
9．Two Heaps
10．子集
11．经过修改的二叉搜索
12． 前 K 个元素
13． K 路合并
14．拓扑排序




https://xiaochen1024.com/courseware/60b4f11ab1aa91002eb53b18/61963bcdc1553b002e57bf13
1、动态规划
leetcode5、55、45、62、63
步骤：初始化dp数组
重点在于状态转移方程
2、深度优先搜索dfs
leetcode94、104、112
重点在于，问题转化为，左右子树问题
3、广度优先搜索bfs
leetcode102、104
重点在于队列记录二叉树层级
4、回溯算法
leetcode39、40
重点在于dfs 然后回退
result = [];
Arrylist<> backtrack (path, list) {
    if (满足条件) {
        result.push(path);
        return
    }

    for () {
        // 单层逻辑
        backtrack (path, list)
        // 撤销选择 重置状态
    }
}
5、双指针
leetcode141
重点：快慢指针
6、滑动窗口
leetcode3
重点：滑动窗口+set
7、排序算法
重点：快排
8、链表
leetcode206
重点：翻转