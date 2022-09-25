class pattern10{
	public static void main(String args[]){
		for(char i=69,t=5,j=4;i>64;t--,i--,j--){
			for(int b=j;b>=0;b--){
				System.out.print(" ");
				
			}
			char y=i;
			for(int a=t;a<=5;a++,y++){
				System.out.print(y+" ");
			}
			for(int b=j;b>=0;b--){
				System.out.print(" ");
				
			}
			System.out.println();
		}
	}
}