package com.example.suanfa929;

/**
 * @author 池恩
 * @date 2022/9/30 10:33
 * @project_name
 */
public class three{
    public static void main(String[] args) {
        String[] strs = {"flow","flower","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        //特殊情况
        if (strs == null || strs.length == 0){
            return "";
        }
        //输入数组中的下标为0的字符串
        //刚开始为第一个字符串，如果第一个与第二个字符串比较后，
        //有公共前缀，那么就将该公共前缀赋值给prefix，继续与第三个比较
        String prefix = strs[0];
        int count = strs.length;
        for (int i = 0; i < count; i++) {
            //调用比较公共前缀函数
            prefix = longestCommonPrefix(prefix,strs[i]);
            if (prefix.length() == 0){
                break;
            }
        }
        return prefix;
    }
    public static String longestCommonPrefix(String str1, String str2) {
        int length = Math.min(str1.length(),str2.length());
        int index = 0;
        while (index < length && str1.charAt(index) == str2.charAt(index)){
            index++;
        }
        //substring(起始索引，结束索引(不包括)) 方法返回字符串的子字符串。
        return str1.substring(0,index);
    }
}
