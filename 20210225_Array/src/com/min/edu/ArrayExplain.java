package com.min.edu;

import java.util.Arrays;

public class ArrayExplain {

	public static void main(String[] args) {
		// 값으로 만듬
		int[] arr = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(arr));

		// 공간을 만들고 공간의 값은 타입으로 자동 초기화(default 값)
		int[] arr2 = new int[4];
		System.out.println(Arrays.toString(arr2));

		// new를 통해 객체를 생성하고 연산자 블럭을 통해서 값을 생성
		int[] arr3 = new int[] { 5, 6, 7, 8 };
		System.out.println(Arrays.toString(arr3));

		// 2차원 배열 선언 (중첩배열)
		int[][] arrMulti = new int[3][3];
		int[][] arrMulti2 = { { 1, 2, 3 }, { 4, 5, 6 } };

		System.out.println(Arrays.toString(arrMulti));
		System.out.println(Arrays.toString(arrMulti2));

		int n = arrMulti2.length; // 이차원 배열의 설명 row의 갯수가 나옴 (첫번째 갯수)
		int m = arrMulti2[0].length; // 중첩배열의 안의 갯수가 나옴.
		System.out.println(n + "/" + m);

		for (int i = 0; i < arrMulti2.length; i++) {
			System.out.println(Arrays.toString(arrMulti2[i]));
		}
		for (int i = 0; i < arrMulti2.length; i++) {
			for (int j = 0; j < arrMulti2[i].length; j++) {
				System.out.print(arrMulti2[i][j]);
			}
			System.out.println();
		}
	}
}