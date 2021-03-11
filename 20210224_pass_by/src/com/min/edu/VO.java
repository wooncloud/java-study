package com.min.edu;

/**
 * VO : Variable Object <br>
 * = DTO
 * 
 * @author GDJ33
 *
 */
public class VO {
	private String addr;
	private String postNum;

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPostNum() {
		return postNum;
	}

	public void setPostNum(String postNum) {
		this.postNum = postNum;
	}

	public void print() {
		System.out.println("(❁´◡`❁)" + addr + "/" + postNum);
	}
}
