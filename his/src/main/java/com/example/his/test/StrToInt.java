package com.example.his.test;


//字符串转数字
public class StrToInt {
    public static void main(String[] args) {
        String str = "9223372036854775808".trim();
        int len = str.length();
        char[] a = str.toCharArray();
        long flag;
        if (a[0] == '+' || (a[0] >= '0' && a[0] <= '9')){
            flag = 0;
        }else if (a[0] == '-'){
            flag = 1;
        }else {
            flag = 2;
        }
        long sum = 0;
        for (int i=0; i<len; i++){
            if (flag == 0){
                //起始符号
                if (i == 0 && a[i] == '+')
                    continue;
                if (a[i] > '9' || a[i] < '0')
                    break;
                sum = sum * 10 + (a[i] - '0');
                //边界判断
                if (sum > Integer.MAX_VALUE) {
                    System.out.println(Integer.MAX_VALUE);
                    break;
                }
            }else if (flag == 1){
                if (i == 0 && a[i] == '-')
                    continue;
                if (a[i] > '9' || a[i] < '0')
                    break;
                sum = sum * 10 - (a[i] - '0');
                if (sum < Integer.MIN_VALUE) {
                    System.out.println(Integer.MIN_VALUE);
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
