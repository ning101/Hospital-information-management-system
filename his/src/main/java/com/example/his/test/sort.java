package com.example.his.test;

import java.util.Random;

public class sort {
    public static void main(String[] args) {
        SortTest sortTest = new SortTest(100000,100,5000000);
//        sortTest.insertSort();
//        sortTest.insertSort2();
//        sortTest.selectSort();
//        sortTest.maopaoSort();
        sortTest.guibingSort();
        int[] arr = sortTest.randArr(100000,100,5000000);
        long preTiem = System.currentTimeMillis();
        quickSort(arr,0,99999);
        long nextTime = System.currentTimeMillis();
        System.out.println("快速排序总用时" + (nextTime-preTiem) + " ms");
        for (int i=0; i<100; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void quickSort(int[] arr,int start,int end) {
        if(start >= end) {
            return;
        }
        int i,j,t,temp;
        i = start;
        j = end;
//        Random r = new Random();
//        int q = r.nextInt(end-start) + start;
        temp = arr[i];

        while (i<j){
            while (i<j && temp <= arr[j])
                j--;
            while (i<j && temp >= arr[i])
                i++;
            if (i<j){
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }

        arr[start] = arr[i];
        arr[i] = temp;

        quickSort(arr,start,j-1);
        quickSort(arr,j+1,end);

    }
}

class SortTest{
    private int n;
    private int l;
    private int r;
    private int[] a;

    public SortTest(int n,int l, int r) {
        this.n = n;
        a = randArr(n,l,r);
    }

    public void quickSort(){
        int[] arr = a.clone();
        long preTime = System.currentTimeMillis();
        quick(arr,0,n-1);
        long nextTime = System.currentTimeMillis();
        System.out.println("归并排序总用时" + (nextTime - preTime) + "ms");
        for (int i=0; i<Math.min(n,100); i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private void quick(int[] arr,int low,int high){
        
    }

    /**
     * 归并排序
     */
    public void guibingSort(){
        int[] arr = a.clone();
        long preTime = System.currentTimeMillis();
        guibing1(arr,0,n-1);
        long nextTime = System.currentTimeMillis();
        System.out.println("归并排序总用时" + (nextTime - preTime) + "ms");
        for (int i=0; i<Math.min(n,100); i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private void guibing1(int[] aa, int m, int q){
        if (m >= q)
            return;
        //优化???小于15用插入排序？？？
//        if (q - m < 15){
//            for (int i=1; i<n; i++){
//                int c = aa[i];
//                int j;
//                for (j=i; j>0 && aa[j-1] > c; j--){
//                    aa[j] = aa[j-1];
//                }
//                aa[j] = c;
//            }
//            return;
//        }
        int mid = (m+q)/2;
        guibing1(aa,m,mid);
        guibing1(aa,mid+1,q);
        //优化1，有序就不排，当数组比较有序时速度加快，反之变慢
//        if (aa[mid] > aa[mid+1])
            merge(aa,m,mid,q);
    }

    private void merge(int[] aa, int m, int mid, int q){
        int[] aux = new int[q-m+1];
        int i=m,j=mid+1,k=0;

        //将较小的元素先存入新数组
        while (i<=mid && j<=q ){
            if (aa[i] < aa[j])
                aux[k++] = aa[i++];
            else
                aux[k++] = aa[j++];
        }

        //将左数组存入新数组
        while (i<=mid){
            aux[k++] = aa[i++];
        }

        //将右数组存入新数组
        while (j<=q){
            aux[k++] = aa[j++];
        }

        for (int l=0; l<aux.length; l++){
            aa[l+m] = aux[l];
        }
    }

    /**
     * 插入排序
     */
    public void insertSort(){
        int[] arr = a.clone();
        int k;
        long preTime = System.currentTimeMillis();
        for (int i=1; i<n; i++){
            for (int j=i; j>0; j--){
                if (arr[j] < arr[j-1]){
                    k = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = k;
                }else {
                    break;
                }
            }
        }
        long nextTime = System.currentTimeMillis();
        System.out.println("插入排序总用时" + (nextTime - preTime) + "ms");
        for (int i=0; i<Math.min(n,100); i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    /**
     * 插入排序优化
     */
    public void insertSort2(){
        int[] arr = a.clone();
        long preTime = System.currentTimeMillis();
        for (int i=1; i<n; i++){
            int c = arr[i];
            int j;
            for (j=i; j>0 && arr[j-1] > c; j--){
                arr[j] = arr[j-1];
            }
            arr[j] = c;
        }
        long nextTime = System.currentTimeMillis();
        System.out.println("优化后的插入排序总用时" + (nextTime - preTime) + "ms");
        for (int i=0; i<Math.min(n,100); i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    /**
     * 选择排序
     */
    public void selectSort(){
        int[] arr = a.clone();
        long preTime = System.currentTimeMillis();
        for (int i=0; i<n; i++){
            int k=i,m;
            for (int j=i+1; j<n; j++){
                if (arr[j] < arr[k])
                    k = j;
            }
            m = arr[i];
            arr[i] = arr[k];
            arr[k] = m;
        }
        long nextTime = System.currentTimeMillis();
        System.out.println("选择排序总用时" + (nextTime - preTime) + "ms");
        for (int i=0; i<Math.min(n,100); i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    /**
     * 冒泡排序
     */
    public void maopaoSort(){
        int[] arr = a.clone();
        int m;
        long preTime = System.currentTimeMillis();
        for (int i=1; i<n; i++){
            for (int j=0; j<n-i; j++){
                if (arr[j] > arr[j+1]){
                    m = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = m;
                }
            }
        }
        long nextTime = System.currentTimeMillis();
        System.out.println("冒泡排序总用时" + (nextTime - preTime) + "ms");
        for (int i=0; i<Math.min(n,100); i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    /**
     * 随机生成数组
     * @param n 数组大小
     * @param l 最小值
     * @param r 最大值
     * @return  数组
     */
    protected int[] randArr(int n, int l, int r){
        int[] arr = new int[n];
        Random random = new Random();
        for (int i=0; i<n; i++)
            arr[i] = random.nextInt(r-l) + l ;
        return arr;
    }

    /**
     * 生成近乎有序的数组
     * @param n 数组大小
     * @param l 最小值
     * @param r 最大值
     * @return  数组
     */
    protected int[] randApprSortArr(int n, int l, int r){
        int[] arr = new int[n];
        Random random = new Random();
        for (int i=0; i<n; i++)
            arr[i] = i+l ;
        for (int i=0; i<Math.min(n,100); i++){
            int k = random.nextInt(n);
            int m = random.nextInt(n);
            int q = arr[k];
            arr[k] = arr[m];
            arr[m] = q;
        }
        return arr;
    }
}
