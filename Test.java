class Test 
{
	public static void main(String[] args) 
	{
		int a=1;

		for(int dan=1; dan<=9; dan+=3){

			for(int i=1; i<=3; i++){
				System.out.print(+a+"´Ü\t");	
				a+=1;				
			}System.out.println();
			for(int j=1; j<=9; j++){
				int b=0;
				for(int k=1; k<=3; k++){
					
				System.out.print((dan+b)+"*"+j+"="+(j*(dan+b))+"\t");
				b++;
				}	
				System.out.println();

				//2*3=6 3*3= 4*3=
				//2 4   3 4   4 4
			}



			
		}

		
	}
}
