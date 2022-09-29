package com.example.bishiti;

/**
 * @author 池恩
 * @date 2022/9/29 11:15
 * @project_name
 */

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 2.使用集合实现堆栈功能，使用int数组保存数据特点：先进后出，后进先出
 */
public class Stack2 {
    public static void main(String[] args) {
        //通过集合实现堆栈
        System.out.println("通过集合实现堆栈");
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

//使用集合定义一个堆栈
class stack_jihe{
    List<Integer> list = new ArrayList<Integer>();
    int index = 0;


    //入栈
    public void push(int n){
        list.add(n);
        index++;
    }

    //出栈
    public int pop(){
        if (!list.isEmpty()){
            index--;
            return list.remove(index);
        }
        return -1;
    }

}