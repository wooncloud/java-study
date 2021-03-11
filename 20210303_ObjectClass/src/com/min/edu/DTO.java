package com.min.edu;

public class DTO {

	public String name = "홍길동";

	public DTO(String name) {
		this.name = name;
		// this.name = new String(name);
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		boolean isc = false;

		DTO d = (DTO) obj;
		if (name.equals(d.name))
			isc = true;

		return isc;
	}

}
