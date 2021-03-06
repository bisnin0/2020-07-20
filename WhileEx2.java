/* 내가 푼 풀이
import java.util.Scanner;
class WhileEx2
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		double ran = Math.random();
		int ran2 = (int)(ran*100);
		int count = 0;

		while(true){

		System.out.print("정수(1~100) 입력 = ");
		int data = scan.nextInt();

			count+=1;
			if(ran2>data){
				System.out.println(data+"보다 큰수 입니다.");
			}else if(ran2<data){
				System.out.println(data+"보다 작은수 입니다.");
			}else{
				System.out.println(count+"번째 만에"+ran2+"을 맞추셨습니다.");
				break;
			}

		}
	}
}
*/
//풀이
import java.util.Scanner;
import java.util.Random;
class WhileEx2
{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		Random ran= new Random();
//게임을 계속해서 반복하고 싶다면 난수 부분을 while로 반복시킨다.
		while(true){
			System.out.println("=========게임을 시작합니다.=========");
			//난수
			int ranInt = ran.nextInt(100)+1;// 0~99 +1 ->1~100

			int cnt=0;
			while(true){
				System.out.print("정수(1~100)입력 = ");
				int inData = scan.nextInt();
				cnt++;
				if(ranInt>inData){//난수가 큰값일때
					System.out.println(inData+"보다 큰수입니다...");
				}else if(ranInt<inData){//입력받은 값이 클때
					System.out.println(inData+"보다 작은수입니다...");
				}else{
					System.out.println(cnt+"번째 만에 "+ranInt+"를 맞추셨습니다.");
					break;
				}//if

			}//while
		}//while
	}//main

}//class

/*
//실행
*************숫자 맞추기*************
정수(1~100) 입력 =  52
52보다 큰수 입니다.

정수(1~100) 입력 =  70
70보다 작은수 입니다.

정수(1~100) 입력 = 65
65보다 작은수 입니다.

정수(1~100) 입력 = 62

4번째만에 62를 맞추셨습니다.

*/