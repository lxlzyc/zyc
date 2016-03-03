package com.lxl.algorithms;

import java.util.Arrays;


/**
 * 插入排序
 * @author Administrator
 *
 */
public class InsertionSort {

	public static int[] insert(int[] a){
		//插入思想  直接插入
		for(int i=0,l=a.length;i<l-1;i++){			
			int j = i;
			while(j>=0){
				int k = j+1;
				if(a[k]<a[j]){
					int c = a[j];
					a[j] = a[k];
					a[k] = c;
				}else{
					break;
				}
				j--;
			}
		}
		return a;
	}
	
	public static int[] insertByDichotomy(int[] a){
		//插入思想  直接插入  使用二分法
		for(int i=0,l=a.length;i<l-1;i++){			
			int temp = a[i];
			int left = 0;
			int right  = i-1;
			int mid =0;
			//当左右游标未错位时
			while(left<=right){
				mid = (left+right)/2;
				//比较当前位置与已排序中间位置的数值
				if(temp<a[mid]){
					//小于已排序中间位置时，右侧游标移到中间减一位置处
					right = mid-1;
				}else{
					//大于已排序中间位置时，左侧游标移到中间+1位置处
					left = mid+1;
				}
			}
			//游标错位后，定位结束，此时，把左游标右边已经排序的值往右移一位
			for(int j = i-1;j>=left;j--){
				a[j+1] =a[j];
			}
			//把数据插入应在的位置
			if(left !=i){
				a[left] =  temp;
			}
		}
		return a;
	}
	public static int[] insertByShell(int[] a){
		//插入思想  直接插入  希尔排序
		int d = a.length;
		while(true){
			//以长度分组
			d = d/2;
			for(int x=0;x<d;x++){
				/**
				 * 先取一个小于 n 的整数 d1 作为第一个增量，把文件的全部记录分成 d1 个组。
				 * 所有距离为 d1 的倍数的记录放在同一个组中。先在各组内进行直接插入排序；
				 * 然后，取第二个增量 d2<d1 重复上述的分组和排序，直至所取的增量 dt=1
				 * (dt<dt-l<…<d2<d1)，即所有记录放在同一组中进行直接插入排序为止。
				 * 该方法实质上是一种分组插入方法。
				 */
				for(int i=x+d;i<a.length;i=i+d){
					int temp = a[i];
					int j;
					//
					for(j=i-d;j>=0&&a[j]>temp;j=j-d){
						a[j+d] =a[j];
					}
					a[j+d] = temp;
				}
			}
			if(d == 1){
				break;
			}
		}
		return a;
	}	
	public static void main(String[] args){
		int[] a ={11,25,12,6,43,27,15,67,14,32,8,98,54,21,53,123,53,11,25,12,6,43,27,15,67,14,32,8,98,54,21,53,123,53,11,25,12,6,43,27,15,67,14,32,8,98,54,21,53,123,53,11,25,12,6,43,27,15,67,14,32,8,98,54,21,53,123,53};
		System.out.println(Arrays.toString(insert(a)));
		System.out.println(Arrays.toString(insertByDichotomy(a)));
	}
	
}
