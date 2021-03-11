package com.min.vo;

public class VO {

	String str = "superman";
	
	@Override
	public int hashCode() {
		return str.hashCode() + 137;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean isc = false;
		VO other = (VO)obj;
		
		if(str.equals(other.str)) {
			isc = true;
		}
		
		return isc;
	}
	
}
