class pattern12{
	public static void main(String args []){
		for(int i=1,k=5,j=1;i<=5;j++,k--,i++){
			
			for(int a=1;a<=k;a++){
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		for(int i=4,k=2;i>0;k++,i--){
		for(int a=1;a<=k;a++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}