class pattern2{
	public static void main(String args []){
		for(int i=1,j=8;i<=9;i++,j--){
			for(int b=j;b>=0;b--){
				System.out.print(" ");
				
			}
			
			for(int a=1;a<=i;a++){
				System.out.print(a+" ");
			}
			
			System.out.println();
		}
	}
}
/* output
         1
        1 2
       1 2 3
      1 2 3 4
     1 2 3 4 5
    1 2 3 4 5 6
   1 2 3 4 5 6 7
  1 2 3 4 5 6 7 8
 1 2 3 4 5 6 7 8 9
 */