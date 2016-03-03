package com.lxl.algorithms;

import java.util.Arrays;

public class ExchangeSort {
//交换排序
	/**
	 * 基本思想：在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数依
	 * 次进行比较和调整，让较大的数往下沉，较小的往上冒。即：每当两相邻的数比较后发现它们的排序
	 * 与排序要求相反时，就将它们互换。
	 * @param a
	 * @return
	 */
	public static int[] bubbleSort(int[] a){
		//从下往上
        for (int i = 0; i < a.length; i++) {
        	//从上往下
            for(int j = 0; j<a.length-i-1; j++){
                //这里-i主要是每遍历一次都把最大的i个数沉到最底下去了，没有必要再替换了
            	if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
		return a;
	}
	//高级快速排序算法
	/**
	 * 1、基本思想：选择一个基准元素,通常选择第一个元素或者最后一个元素,通过一趟扫描，将待排序列分成两部分,一部分比基准元素小,一部分大于等于基准元素,此时基准元素在其排好序后的正确位置,然后再用同样的方法递归地排序划分的两部分。
	 * @param targetArr
	 * @param start
	 * @param end
	 */
	private <T extends Comparable<?super T>> void quickSort(T[] targetArr,int start,int end){
		int i=start,j=end;
		T key = targetArr[start];
	 
		while(i<j){
			/*按j--方向遍历目标数组，直到比key小的值为止*/
			while(j>i&&targetArr[j].compareTo(key)>=0){
				j--;
			}
			if(i<j){
				/*targetArr[i]已经保存在key中，可将后面的数填入*/
				targetArr[i]=targetArr[j];
				i++;
			}
			/*按i++方向遍历目标数组，直到比key大的值为止*/
			while(i<j&&targetArr[i].compareTo(key)<=0){
				/*此处一定要小于等于零，假设数组之内有一亿个1，0交替出现的话，而key的值又恰巧是1的话，那么这个小于等于的作用就会使下面的if语句少执行一亿次。*/
				i++;
			}
			if(i<j){
				/*targetArr[j]已保存在targetArr[i]中，可将前面的值填入*/
				targetArr[j]=targetArr[i];
				j--;
			}
		}
		/*此时i==j*/
		targetArr[i]=key;
		 
		/*递归调用，把key前面的完成排序*/
		this.quickSort(targetArr,start,i-1);
		 
		 
		/*递归调用，把key后面的完成排序*/
		this.quickSort(targetArr,j+1,end);
	 
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={11,25,12,6,43,27,15,67,14,32,8,98,54,21,53,123,53,11,25,12,6,43,27,15,67,14,32,8,98,54,21,53,123,53,11,25,12,6,43,27,15,67,14,32,8,98,54,21,53,123,53,11,25,12,6,43,27,15,67,14,32,8,98,54,21,53,123,53};
		System.out.println(Arrays.toString(bubbleSort(a)));
	}
}
