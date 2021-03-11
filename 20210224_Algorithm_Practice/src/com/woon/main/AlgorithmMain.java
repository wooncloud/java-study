package com.woon.main;

import java.util.Scanner;

import com.woon.ant.AntSequence;
import com.woon.ant.Ant_Sequence;

public class AlgorithmMain {
	public static void main(String[] args) {
		AntSequence ant = new AntSequence();
		Scanner scan = new Scanner(System.in);

		System.out.print("개미수열 몇층까지 출력할까요? : ");
		int count = scan.nextInt();
		
		// 개미수열 시작
		ant.antSequence(count);
		
		System.out.println("------------------------------");
		
		Ant_Sequence antSqn = new Ant_Sequence();
		antSqn.antIteration(10);
	}
}
