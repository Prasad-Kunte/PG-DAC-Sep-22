class pattern15{
	public static void main(String args[]){
	
		for(int i=1,j=1;i<5;j++,i++){
			
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