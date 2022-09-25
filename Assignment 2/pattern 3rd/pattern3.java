class pattern3{
	public static void main (String args[]){
		for(int i=1,j=8;i<=9;i++,j--){
			for(int b=j;b>=0;b--){
				System.out.print(" ");
				
			}
			
			for(int a=1;a<=i;a++){
				System.out.print("*"+" ");
			}
			
			System.out.println();
		}
	}
}
/* output
         *
        * *
       * * *
      * * * *
     * * * * *
    * * * * * *
   * * * * * * *
  * * * * * * * *
 * * * * * * * * *
 */