import java.util.Scanner;
class MoneyCount2
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하세요 = ");
		int cash = scan.nextInt();
		String msg = " ";
		int result = 0;
		int money = 50000;
		int a=1;
		while(a<=10){
			result = cash/money;
			cash = cash%money;
	
			if(cash>=1000){
				msg = "장";
			}else{
				msg = "개";
			}
			if(result>0){
			System.out.printf("%d원 = %d%s", money, result, msg);
			System.out.println();
			}

			if(a%2==0){
				money/=2;
			}else{
				money/=5;
			}

			a++;
		}
		
		
				
		
	}
}

/*
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하세요 = ");
		int cash = scan.nextInt();
		String msg = " ";
		int result = 0;
		int money = 50000;

		for (int i=1; i<=10 ; i++){
			result=cash/money;
			cash=cash%money;

			if(money>=1000){
				msg = "장";
			}else{
				msg = "개";
			}
			if(result>0){
			System.out.printf("%d원 = %d%s", money, result, msg);
			System.out.println();
			}

			if(i%2==0){
				money/=2;	
			}else{
				money/=5;
			}
			

		}//for
*/