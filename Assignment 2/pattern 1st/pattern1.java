class pattern1{
	public static void main(String args[]){
		for(int i=1;i<=5;i++){
			for(int a=1;a<=i;a++){
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
}
/* output
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/