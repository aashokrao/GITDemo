package javaBasics;

public class Arrays {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int[][] b= {{5,22,55},{33,1,9}};
		int sum=0;
		//System.out.println(a.length);
		/*
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			sum=sum+a[i];
			if(a[i]==3) {
				//System.out.println("Index of 3 is "+(i+1));
				break;
			}
		}
		*/
	//	System.out.println(sum);
		int min=b[0][0];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				if(b[i][j]<min) {
					min=b[i][j];
					break;
				}
			}
		}
		System.out.println("Min value "+min);
	
	}
}
