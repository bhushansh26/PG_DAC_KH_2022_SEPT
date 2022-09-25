class P18{
public static void main(String args[]){
	int n=64;
	for(int i=1;i<=5;i++){
		for(int j=1;j<=6-i;j++){
			System.out.print((char)(n+j));
		}
		System.out.println();
	}
}
}