class pattern8{
	public static void main(String args[]){
		for(int i=5,j=4;i>0;i--,j--){
			for(int b=j;b>=0;b--){
				System.out.print(" ");
				
			}
			
			for(int a=i;a<=5;a++){
				System.out.print(a+" ");
			}
			for(int b=j;b>=0;b--){
				System.out.print(" ");
				
			}
			System.out.println();
		}
	}
}