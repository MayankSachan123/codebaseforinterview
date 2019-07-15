
public class HourGlassSum {

	public static void main(String[] args) {
		// int arr [][]= {{1, 1, 1, 0, 0, 0},{0, 1, 0, 0, 0,0},{1, 1, 1, 0, 0, 0},{0, 0, 2, 4, 4, 0},{0, 0, 0, 2, 0, 0},{0, 0, 1, 2, 4, 0}};
		int arr [][]= {{-9, -9, -9,  1, 1, 1},{0, -9, 0 , 4, 3, 2},{-9, -9, -9 , 1, 2 ,3},{0,  0 , 8  ,6, 6, 0},{0,  0,  0, -2, 0, 0},{0,  0,  1,  2, 4, 0}};
		for(int[] i : arr) {
		for(int j : i) {
			System.out.print(j+"  ");
		}
		System.out.print	("\n");
		}
		
	
		System.out.println(arr[0].length+" "+arr.length);
		int check =0;
		boolean flag=true;
		if(arr[0].length<=6 && arr[0].length>=1) {
		for(int i=0;i<arr[0].length-2;i++) {
			for(int j=0;j<arr[i].length-2;j++) {
				
				int sum=0;
				sum=sum+arr[i][j]+arr[i][j+1]+arr[i][j+2];
				sum=sum+arr[i+1][j+1];
				sum=sum+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				System.out.print("SUM : "+sum+" ");
				if (flag) {

					check = sum;

					flag = false;

					}
				if(check<sum) {
					check=sum;
				}
				
			}
			System.out.println("\n");
		}
		}
		System.out.println(check);
		
	}

}
