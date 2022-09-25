class pattern13{
	public static void main(String args []){
		for(int i=1,k=5,j=1;i<=5;j++,k--,i++){
			for(int x=2;x<=j;x++){
				System.out.print(" ");
			}
			
			for(int a=1;a<=k;a++){
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		for(int i=4,k=2,j=4;i>0;j--,k++,i--){
			for(int x=2;x<=j;x++){
				System.out.print(" ");
			}
		for(int a=1;a<=k;a++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}