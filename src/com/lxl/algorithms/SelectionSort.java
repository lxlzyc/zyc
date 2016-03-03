package com.lxl.algorithms;

public class SelectionSort {
	//选择排序
	public static int[] select(int[] a){
		//直接选择,找到最小值后与前面的值交换位置
		for(int i =0,l=a.length;i<l;i++){
			int temp=a[i];
			int n = i;
			//取未排序中最小值
			for(int t=i+1;t<l;t++){
				if(a[t]<temp){
					temp=a[t];
					n=t;
				}
			}
			//交换当前值与最小值
			a[n] = a[i];
			a[i] = temp;
		}
		return a;
	} 
	 //对data数组从0到lastIndex建大顶堆
    public static void buildMaxHeap(int[] data, int lastIndex){
         //从lastIndex处节点（最后一个节点）的父节点开始 
        for(int i=(lastIndex-1)/2;i>=0;i--){
            //k保存正在判断的节点 
            int k=i;
            //如果当前k节点的子节点存在  
            while(k*2+1<=lastIndex){
                //k节点的左子节点的索引 
                int biggerIndex=2*k+1;
                //如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在
                if(biggerIndex<lastIndex){  
                    //若果右子节点的值较大  
                    if(data[biggerIndex]<data[biggerIndex+1]){  
                        //biggerIndex总是记录较大子节点的索引  
                        biggerIndex++;  
                    }  
                }  
                //如果k节点的值小于其较大的子节点的值  
                if(data[k]<data[biggerIndex]){  
                    //交换他们  
                    int tmp=data[k];  
                    data[k]=data[biggerIndex];  
                    data[biggerIndex]=tmp;  
                    //将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值  
                    k=biggerIndex;  
                }else{  
                    break;  
                }  
            }
        }
    }
    //堆排序
    /**
     * 堆排序优于简单选择排序的原因：
直接选择排序中，为了从 R[1..n] 中选出关键字最小的记录，必须进行 n-1 次比较，然后在 R[2..n] 中选出关键字最小的记录，
又需要做 n-2 次比较。事实上，后面的 n-2 次比较中，有许多比较可能在前面的 n-1 次比较中已经做过，但由于前一趟排序时未保留这些比较结果，所以后一趟排序时又重复执行了这些比较操作。
堆排序可通过树形结构保存部分比较结果，可减少比较次数。
     * @param a
     * @return
     */
    public static int[] selectionByHeap(int[] a){
    	int arrayLength = a.length;
        //循环建堆  
        for(int i=0;i<arrayLength-1;i++){  
            //建堆  
            buildMaxHeap(a,arrayLength-1-i);  
            //交换堆顶和最后一个元素  
            int tmp=a[0];  
            a[0]=a[arrayLength-1-i];  
            a[arrayLength-1-i]=tmp;  
        }  
        return a;
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={11,25,12,6,43,27,15,67,14,32,8,98,54,21,53,123,53,11,25,12,6,43,27,15,67,14,32,8,98,54,21,53,123,53,11,25,12,6,43,27,15,67,14,32,8,98,54,21,53,123,53,11,25,12,6,43,27,15,67,14,32,8,98,54,21,53,123,53};

	}

}
