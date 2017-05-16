package test.optional.with.self;

import java.util.Optional;

import org.junit.Test;

public class SelfTest {
	
	@Test
	public void test(){
		Money m = new Money(100, 10);
		Wallet w = new Wallet("half wallet", Optional.of(m));
		Bag b = new Bag("EastPack", Optional.of(w));
		System.out.println("without empty optional object = " +getAllowance(Optional.of(b)));
		
		Bag c = new Bag("EastPack", Optional.empty());
		System.out.println("with empty optional object = " +getAllowance(Optional.of(c)));
	}
	
	private static int getAllowance(Optional<Bag> b){
		return b.flatMap(Bag::getWallet).flatMap(Wallet::getMoney).map(Money::getSum).orElse(0);
	}

}
