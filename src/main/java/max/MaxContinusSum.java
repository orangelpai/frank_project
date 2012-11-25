package max;

public class MaxContinusSum {
	/*
	 * 思路：序列a[n]，记
f(i)：前i个数中连续数最大和；
end(i)：以下标i结尾的前i个数中连续数最大和。
有以下递推式：
f(i) = max{f(i-1), end(i)}；
当end(i-1)<=0，end(i) = a[i]；否则end(i) = end(i-1)+a[i]。
以front，rear指针记录连续最大和的首尾下标。
	 */
	public static void main(String[] args) {
		 int a[] = {-2, 11, -4, 13, -5, -2};  
		 int N = a.length;
		    int i, front=0,rear=0;  
		    int end = a[0], res = a[0];  
		    i=1;  
		    while (i < N)  
		    {  
		        if (end < 0)  
		        {  
		            end = a[i];  
		            front = i;  
		        }  
		        else  
		            end += a[i];  
		        if (end > res)  
		        {  
		            res = end;  
		            rear = i;  
		        }  
		        i++;  
		    }  
		    //printf("max=%d, from index %d, len=%d/n", res, front, rear-front+1);  
		    System.out.println("max="+res);
		    System.out.println(" from index"+front);
		    System.out.println("len="+(rear-front+1));
	}

}
