class pattern9{
	public static void main(String args[]){
		for(int i=1,j=4;i<=5;i++,j--){
			for(int b=j;b>=0;b--){
				System.out.print(" ");
				
			}
			char c='A';
			for(int a=1;a<=i;c++,a++){
				System.out.print(c+" ");
			}
			for(int b=j;b>=0;b--){
				System.out.print(" ");
				
			}
			System.out.println();
		}
	}
}