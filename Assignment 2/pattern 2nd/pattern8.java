class pattern8{
	public static void main(String args []){
		for(int i=1,k=1,j=4;i<=5;j--,k++,i++){
			
			for(int a=1;a<=k;a++){
				System.out.print("*");
			}
			for(int y=1;y<=j;y++){
				System.out.print(" ");
			}
			System.out.println();
			
		}
		for(int i=1,k=4,j=1;i<=5;j++,k--,i++){
			
			for(int a=1;a<=k;a++){
				System.out.print("*");
			}
			for(int y=j;y>0;y--){
				System.out.print(" ");
			}
			System.out.println();
			
		}
		
	}
}