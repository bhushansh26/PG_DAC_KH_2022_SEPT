class P10{
	public static void main(String args[] ){
		int n=64;
		for(int i=1;i<=5;i++){
			for(int j=4;j>=i;j--){
				System.out.print(" ");
			}
			for(int j=6-i;j<=5;j++){
				System.out.print((char)(n+j)+" ");
			}
			System.out.println();
		}
	}
}