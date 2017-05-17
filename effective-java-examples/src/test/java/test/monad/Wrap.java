package test.monad;

import java.util.function.Function;

public class Wrap<T> {
	
	private final T value;
	
	private Wrap(T value){
		this.value = value;
	}
	
	public static <T> Wrap<T> of(T value){
		return new Wrap<>(value);
	}
	
	public <R> Wrap<R> map(Function<T,R> mapper){
		return Wrap.of(mapper.apply(value));
	}

}
