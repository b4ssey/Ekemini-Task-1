public class Bassey
{
	public static void main(String[] args) {
	    
	   int[][] first = {{3,8,5}, {5,6,6}};
	   int[][] second = {{3,4,}, {2,3}, {1,2}};
	   
	   multiplyMatrices(first, second);
	
	}
	
	public static int[][] multiplyMatrices(int[][] a, int[][] b){
	    int[][] ab = new int[a.length][b[0].length];
	    if(a.length != b[0].length ){
	        System.out.println("Incompactible matrices");
	    }else{
	        for(int i =0; i< a.length ; i++){
	            for(int j = 0; j < b[i].length; j++){
	                for(int k = 0; k<a[j].length;k++){
	                    ab[i][j] += a[i][k] * b[k][j];
	                }
	                System.out.print(ab[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	    }
	 return ab;  
	}
	 
}
