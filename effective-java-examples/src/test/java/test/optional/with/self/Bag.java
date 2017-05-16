package test.optional.with.self;

import java.util.Optional;

public class Bag {
	
	private String brand;
	
	private Optional<Wallet> wallet;
	
	public Bag(String b, Optional<Wallet> w){
		this.brand = b;
		this.wallet = w;
	}
	
	public Optional<Wallet> getWallet(){
		return this.wallet;
	}
	
	public String getBrand(){
		return this.brand;
	}

}
