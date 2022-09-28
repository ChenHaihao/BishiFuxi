package com.example.bishiti;

/**
 * @author 池恩
 * @date 2022/9/28 16:21
 * @project_name
 */
/*
斐波那契数列（Fibonacci sequence），又称黄金分割数列、因数学家列昂纳多·斐波那契（Leonardoda Fibonacci[1] ）
以兔子繁殖为例子而引入，故又称为“兔子数列”，指的是这样一个数列：0、1、1、2、3、5、8、13、21、34、……在数学上，
斐波纳契数列以如下被以递归的方法定义：F（0）=0，F（1）=1，F（n）=F(n-1)+F(n-2)（n≥2，n∈N*）
 */
public class Feibonaci {
    //递归方法
    public static int feibo1(int n){
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return feibo1(n-1)+feibo1(n-2);
    }
    //非递归方法
    public static int feibo2(int n){
        int arr[] = new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i <= n; i++) {
            arr[i]= arr[i-1]+arr[i-2];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        for (int i = 4; i <= 4; i++) {
            System.out.println("feibo1 i="+i+",vaule="+feibo1(i));
        }
        for (int i = 6; i <= 6;i++){
            System.out.println("feibo2 i="+i+",vaule="+feibo2(i));
        }
    }
}
