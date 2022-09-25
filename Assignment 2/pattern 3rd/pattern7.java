class pattern7{
	public static void main (String args[]){
		for(int i=9,j=0;i>=0;j++,i--){
			for(int a=1;a<=j;a++){
				System.out.print(" ");
			}
			for(int a=i;a>=0;a--){
				System.out.print(" "+i);
			}
			
			System.out.println();
			
		}
	}
}
/* output
 9 9 9 9 9 9 9 9 9 9
  8 8 8 8 8 8 8 8 8
   7 7 7 7 7 7 7 7
    6 6 6 6 6 6 6
     5 5 5 5 5 5
      4 4 4 4 4
       3 3 3 3
        2 2 2
         1 1
          0
*/