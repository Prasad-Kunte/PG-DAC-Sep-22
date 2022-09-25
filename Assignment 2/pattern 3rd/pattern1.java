class pattern1{
	public static void main(String args[]){
		for(int i=1,j=8;i<=9;i++,j--){
			for(int b=j;b>=0;b--){
				System.out.print(" ");
				
			}
			
			for(int a=1;a<=i;a++){
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
}
}
/* output
         1
        2 2
       3 3 3
      4 4 4 4
     5 5 5 5 5
    6 6 6 6 6 6
   7 7 7 7 7 7 7
  8 8 8 8 8 8 8 8
 9 9 9 9 9 9 9 9 9
*/