package br.com.paulobc.gui.label;

public enum Language {
	PT_BR(1), ENG_US(2);
	
	private int location;
	
	Language(int location) {
		this.location = location;
	}
	
	public int getLocation() {
		return this.location;
	}

}
