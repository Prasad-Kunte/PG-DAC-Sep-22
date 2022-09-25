class pattern6{
	public static void main (String args[]){
		for(int i=9,j=0;i>=0;j++,i--){
			for(int a=1;a<=j;a++){
				System.out.print(" ");
			}
			for(int a=i;a>=0;a--){
				System.out.print(" *");
			}
			
			System.out.println();
			
		}
	}
}
/* output
 * * * * * * * * * *
  * * * * * * * * *
   * * * * * * * *
    * * * * * * *
     * * * * * *
      * * * * *
       * * * *
        * * *
         * *
          *
*/