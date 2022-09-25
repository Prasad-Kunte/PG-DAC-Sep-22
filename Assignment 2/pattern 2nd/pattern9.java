class pattern9{
	public static void main(String args []){
		for(int i=1,k=1,j=4;i<=5;j--,k++,i++){
			for(int x=1;x<=j;x++){
				System.out.print(" ");
			}
			for(int a=1;a<=k;a++){
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		for(int i=1,k=4,j=1;i<=5;j++,k--,i++){
			for(int x=j;x>0;x--){
				System.out.print(" ");
			}
			for(int a=1;a<=k;a++){
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
	}
}