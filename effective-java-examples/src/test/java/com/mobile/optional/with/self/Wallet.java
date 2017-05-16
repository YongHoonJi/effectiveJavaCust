package com.mobile.optional.with.self;

import java.util.Optional;

public final class Wallet {
	private String type;
	private Optional<Money> money;
	
	public Wallet(String t, Optional<Money> m){
		this.type = t;
		this.money = m;
	}

	public Optional<Money> getMoney(){
		return this.money;
	}
	
	public String getType(){
		return this.type;
	}
}
