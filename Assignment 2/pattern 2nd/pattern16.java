class pattern16{
	public static void main(String args[]){
	
		for(int i=1,j=1,k=4;i<5;k--,j++,i++){
			for(int x=k;x>0;x--){
				System.out.print(" ");
			}
			
			for(int a=1;a<=j;a++){
				if(a==1 || a==j){
					System.out.print("*");
				}
				else{
				System.out.print(" ");
				}
			}
			if(i==4){
				System.out.println();
				System.out.println("*****");
			}
			else if (i==1){
				System.out.println();
			}
			else{
			System.out.println();
			}
		}
		
	}
}