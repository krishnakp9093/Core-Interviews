package com.collection2;

public class EqualsAndHashcode {
	@Override
	public int hashCode() {
		final int prime = 31;

		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsAndHashcode other = (EqualsAndHashcode) obj;
		if (id != other.id)
			return false;
		return true;
	}

	int id;

	public EqualsAndHashcode(int id) {
		this.id = id;
	}

}
