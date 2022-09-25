class pattern6{
	public static void main(String args[]){
		for(int i=1,j=4;i<=5;i++,j--){
			for(int b=j;b>=0;b--){
				System.out.print("  ");
				
			}
			
			for(int a=1;a<=i;a++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}