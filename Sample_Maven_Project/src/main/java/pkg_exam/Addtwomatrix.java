package pkg_exam;

public class Addtwomatrix {

	public static void main(String[] args) {
		int num1[][]= {{1,2,3},{4,5,6}};
		int num2[][]= {{4,5,6},{7,8,9}};
		int[][] sum=new int[2][3];
	
		System.out.println("sum of two matrix ");
		for(int i=0;i<num1.length;i++)
		{
			for(int j=0;j<num1[i].length;j++)
			{
				
				
				sum[i][j]= num1[i][j]+ num2[i][j];
				System.out.print(sum[i][j] +" ");
			}
			System.out.println();
			}
		}
		{
			
		
		
	}

}
