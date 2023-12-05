package com.distinctgeeks.bmt.ms.enums;

public enum MovieFormat {
	
	TWO_DIMENTION("2D"),
	THREE_DIMENTION("3D"),
	FOUR_DIMENTION("4D");

	private String movieFormat;
	
	MovieFormat(String movieFormat) {
		this.movieFormat = movieFormat;
	}

	public String getMovieFormat(){
		return movieFormat;
	}
}
