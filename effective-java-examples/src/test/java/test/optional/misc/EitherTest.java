package test.optional.misc;

import org.junit.Test;

import com.google.common.base.Optional;
import com.google.common.base.Throwables;

import test.optional.misc.Either;

public class EitherTest {
	@Test
	public void test(){
		
		try {
			Either<Exception, Integer> r = toInteger("123");
			System.out.println("s right:"+r.right());
			System.out.println("s left:"+Optional.fromNullable(r.left()));
			
			Either<Exception, Integer> f = toInteger("abc");
			System.out.println("f right:"+Optional.fromNullable(f.right()));
			System.out.println("f left:"+f.left().getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	static Either<Exception, Integer> toInteger(String val){
		try {
			return Either.right(new Integer(Integer.parseInt(val)));
		} catch (Exception ex) {
			return Either.left(new Exception(Throwables.getRootCause(ex)));
		}
	}
}
