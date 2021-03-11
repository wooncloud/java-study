package com.min.edu;

enum Animal {
	DOG, CAT, PIG, MOUSE
}

public class SwitchCaseMain2 {

	public static void main(String[] args) {
		Animal ee = Animal.DOG;

		// key와 value는 반드시 같은 타입이여야 한다.
		switch (ee) {
		case DOG:
			break;
		case CAT:
			break;
		case PIG:
			break;
		case MOUSE:
			break;

		default:
			break;
		}
	}
}