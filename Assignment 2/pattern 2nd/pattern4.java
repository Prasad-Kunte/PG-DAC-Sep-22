class pattern4{
	public static void main(String args []){
		for(int i=5,j=1;i>0;i--,j++){
			for(int a=1;a<=i;a++){
				System.out.print("*"+" ");
			}
			for(int x=1;x<=j;x++){
				System.out.print("  ");
			}
			System.out.println();
		}
	}
}