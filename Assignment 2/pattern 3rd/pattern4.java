class pattern4{
	public static void main(String args[]){
		for(int a=8,i=1;i<=9;i++,a--){
			for(int b=1;b<=a;b++){
				System.out.print(" "+" ");
			}
			for(int b=1;b<=i;b++){
				System.out.print(b+" ");
			}
			int j=i-1;
			for(int b=j;b!=0;b--){
				System.out.print(b+" ");
			}
			
			System.out.println();
		}
	}
}
/* output
                1
              1 2 1
            1 2 3 2 1
          1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
      1 2 3 4 5 6 5 4 3 2 1
    1 2 3 4 5 6 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
*/