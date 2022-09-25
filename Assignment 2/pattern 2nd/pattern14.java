class pattern14{
	public static void main(String args []){
		for(int i=1,k=9,j=1;i<=5;j++,k--,i++){
			for(int x=j;x>0;x--){
				System.out.print(" ");
			}
			for(int a=1;a<=k;a++){
				System.out.print("*");
			}
			for(int y=j;y>0;y--){
				System.out.print(" ");
			}
			System.out.println();
			k--;
		}
		for(int i=1,k=3,j=4;i<=4;j--,k++,i++){
			for(int x=1;x<=j;x++){
				System.out.print(" ");
			}
			for(int a=1;a<=k;a++){
				System.out.print("*");
			}
			for(int y=1;y<=j;y++){
				System.out.print(" ");
			}
			System.out.println();
			k++;
		}
		
		
	}
}