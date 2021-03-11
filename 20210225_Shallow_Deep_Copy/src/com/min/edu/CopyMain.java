package com.min.edu;

public class CopyMain {

	public static void main(String[] args) {
		ReferenceCopy rc = new ReferenceCopy();
		rc.ShallowCopy();
		System.out.println();
		rc.DeepCopy();
	}

}
