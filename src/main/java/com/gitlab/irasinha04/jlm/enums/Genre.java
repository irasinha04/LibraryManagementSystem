package com.gitlab.irasinha04.jlm.enums;

public enum Genre {
	// unissuable
	REFERENCE(false), MAGAZINE(false), NEWSPAPER(false), POSTER(false), COMICS(false),

	// issuable
	FICTION(true), COOK_BOOK(true), SELF_HELP(true), THRILLER(true), FANTASY(true), MYSTERY(true), HISTORY(true), TECHNICAL(true);
	
	
	private boolean isIssueable;

	Genre(boolean isIssueable) {
		this.isIssueable = isIssueable;
	}

	public boolean isIssueable() {
		return isIssueable;
	}
}
