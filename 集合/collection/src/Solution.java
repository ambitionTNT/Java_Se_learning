import java.lang.StringBuffer;
import java.util.Stack;

import static java.lang.Math.max;


public class Solution {

    /*public static void main(String[] args) {
        String s1 = "99999";
        String s2 = "99999";
        //System.out.println(s1.length());
        //System.out.println(s1.substring(0,1));
        *//*Solution solution = new Solution();
        System.out.print(solution.solve(s1,s2));*//*
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s1);
        System.out.println(stringBuilder);

    }*/
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 计算两个数之和
     * @param s string字符串 表示第一个整数
     * @param t string字符串 表示第二个整数
     * @return string字符串
     */

    /*public String solve (String s, String t) {
        // write code here
        int num = max(s.length(),t.length());
        int[] arr1 = new int[num];
        int[] arr2 = new int[num];
        int s1 = s.length();
        int t1 = t.length();

        for(int i = 0;i<num;i++){
            if(i<s.length()&&s1>0){
                arr1[i] = Integer.parseInt(s.substring(s1-1,s1));
                s1--;
            }else{
                arr1[i] = 0;
            }

        }
       *//* for (int i:arr1){
            System.out.print(i);
        }*//*
        for(int i = 0;i<num;i++){
            if(i<t.length()&&t1>0){
                arr2[i] = Integer.parseInt(t.substring(t1-1,t1));
                t1--;
            }else{
                arr2[i] = 0;
            }

        }
        //System.out.println();
        *//*for (int i:arr2){
            System.out.print(i);
        }*//*
        int s2 = s.length();
        int t2 = t.length();
        int[] res = new int[max(s.length(),t.length())+1];
        int carry  = 0;
        int flag = 0;
        int max = max(s.length(),t.length());
        for(int i = 0;i< max;i++){
            if(arr1[i]+arr2[i]+carry>=10){
                res[i] = arr1[i]+arr2[i]+carry-10;
                carry = 1;


            }else{
                res[i] = arr1[i] + arr2[i] + carry;
                carry = 0;

            }
            //System.out.println(carry);
        }
        if(carry==1){
            res[res.length-1]=1;
        }
        //System.out.println();
        *//*for (int i :res){
            System.out.print(i);
        }*//*
        //return res.toString();
        //System.out.println();
        String str1  = null;
        StringBuffer stringBuffer = new StringBuffer();
        if (res[res.length-1]!=0){
            for (int i = res.length-1;i>=0;i--){
                stringBuffer.append(res[i]);
            }
        }else{
            for (int i = res.length-2;i>=0;i--){
                stringBuffer.append(res[i]);
            }
        }
        //System.out.println(stringBuffer+"---------");
        return stringBuffer.toString();
        *//*String resstr = null;
        if (res[res.length-1]!=0){
            resstr = res.toString();
        }else{
            resstr = res.toString();
            resstr = resstr.substring(0,resstr.length()-1);
        }
        System.out.println(resstr);
        return resstr;*//*

        *//*System.out.println();
        int l = res.length;*//*

        *//*char[] str = new char[res.length];
        for (int i = 0;i<res.length;i++){

            str[i] = (char)res[l-1];
            l--;
        }*//*

        *//*String strres = new String(str);
        System.out.println(strres);
        return strres;*//*


    }*/
    public String solve (String s, String t) {

        Stack<Integer> stack = new Stack<>();
        //i ,j 分别 是s ,t 的指针 用于计算,carry表示进位
        int i = s.length()-1,j = t.length()-1,carry = 0;
        while(i>=0||j>=0||carry!=0){
            carry += i>=0?s.charAt(i--)-'0':0;
            carry += j>=0?t.charAt(j--)-'0':0;
            stack.push(carry%10);
            carry = carry/10;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();

    }

}


