class pattern5{
	public static void main(String args[]){
		for(int a=8,i=9;i>=1;i--,a--){
			int j=0,k=0;
			for(int b=1;b<=a;b++){
				System.out.print(" "+" ");
			}
			for(int b=i;b<=9;b++){
				System.out.print(b+" ");
				j++;
				k=b;
			}
			if(i<9){
			for(int b=k-1,c=1;c<j;c++,b--){
				System.out.print(b+" ");
			}
			}
			
			System.out.println();
		}
	}
}
/* output
                9
              8 9 8
            7 8 9 8 7
          6 7 8 9 8 7 6
        5 6 7 8 9 8 7 6 5
      4 5 6 7 8 9 8 7 6 5 4
    3 4 5 6 7 8 9 8 7 6 5 4 3
  2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
*/