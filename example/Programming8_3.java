/*
 학과 : 컴퓨터공학과
 학번 : 20191439
 학년 : 2학년
 이름 : 김찬유
 */
public class Programming8_3 {

	public static void main(String[] args) {
		int count = 0;   // 삼각형 갯수를 셀 변수 정의
		for(int i =1;i < 100; i++) {    
			for(int j =1;j < 100;j++) {
				for(int k =1;k < 100;k++) {
					if(i*i + j*j == k*k) {   //a^2 + b^2 = c^2을 성립하는지 확인
						System.out.println(i + " " + j + " " + k );
						count = count +1;
					}
				}
			}
		}
		System.out.println("각 변의 길이가 100보다 작은 삼각형의 갯수는 " + count + "개이다.");  //각 변의 길이가 100보다 작은 삼각형 갯수 출력
	}

}
