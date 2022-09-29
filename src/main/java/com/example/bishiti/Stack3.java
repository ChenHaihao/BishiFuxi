package com.example.bishiti;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.net.Inet4Address;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * @author 池恩
 * @date 2022/9/29 11:25
 * @project_name
 */
public class Stack3 {
    public static void main(String[] args) {
        //通过两个队列实现堆栈
        System.out.println("通过两个队列实现堆栈");
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

//两个队列实现堆栈
class stack_duilie{
    Queue<Integer> QueueA = new ArrayDeque<Integer>();
    Queue<Integer> QueueB = new ArrayDeque<Integer>();

    //入栈
    public void push(int n){
        QueueA.add(n);
    }

    //出栈
    public int pop(){
    //如果queueA为空，queueB有元素，将queueB的元素依次放入queueA中(){，直到最后一个元素，我们弹出。
        if(QueueA.isEmpty()){
            while (QueueB.size()>1){
                QueueA.add(QueueB.poll());//poll()移出并返回队列的头元素,如果队列为空，则返回null
            }
            return QueueB.poll();
        }
        if(QueueB.isEmpty()){
            while (QueueA.size()>1){
                QueueB.add(QueueA.poll());
            }
            return QueueA.poll();
        }
        return -1;
    }
}
