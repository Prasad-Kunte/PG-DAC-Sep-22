class pattern6{
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
	}
}