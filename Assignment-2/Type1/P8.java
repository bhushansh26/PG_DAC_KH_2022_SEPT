class P8{
	public static void main (String args[]){
		for(int i=1 ;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print(" ");
			}
			
			for(int j=6-i;j<=5;j++){
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
	}
}