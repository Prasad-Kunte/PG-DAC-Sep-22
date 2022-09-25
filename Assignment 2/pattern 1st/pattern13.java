class pattern13{
	public static void main(String args[]){
		for(char i=65,j=4;i<=69;i++,j--){
			for(int b=j;b>=0;b--){
				System.out.print(" ");
				
			}
			
			for(int a=65;a<=i;a++){
				System.out.print(i+" ");
			}
			for(int b=j;b>=0;b--){
				System.out.print(" ");
				
			}
			System.out.println();
		}
	}
}