package com.mobile.optional.with.self;

public final class Money {
	private int paper;
	private int coin;
	
	public Money(int p, int c){
		this.paper = p;
		this.coin = c;
	}
	
	public int getPaper() {
		return paper;
	}
	public int getCoin() {
		return coin;
	}
	public int getSum(){
		return this.paper+this.coin;
	}
}
