package 과제.과제1.과제4.ex3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level4_3 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level4_3 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);

		int[] point = { 97 , 73 ,52 , 76 , 51 };

		/* 문제풀이 위치 */
		System.out.print("정렬전 : ");
		for(int i=0;i< point.length;i++) {
			System.out.print(point[i] + " ");
		}
		System.out.println();
		System.out.print("정렬후 : ");
		for(int k=0;k< point.length;k++){
			for(int m=0; m< point.length; m++){
				int temp;
				if(point[k]<point[m]){
					temp=point[k];
					point[k]=point[m];
					point[m]=temp;
				}
			}

		}
		for(int l=0; l<point.length; l++) {
			System.out.print(point[l] + " ");
		}

		/* ----------- */
	}
}
/* 
	[문제]
		1. int[] point = { 97 , 73 ,52 , 76 , 51 }; int형 배열입니다.
		2. 오림차순으로 정렬하시오.
		3. 정렬 전 과 정렬 후 배열을 그림과 같이 출력하시오.
*/
