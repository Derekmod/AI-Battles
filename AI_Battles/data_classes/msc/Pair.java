package msc;

/**
 * simple class for holding two variables in one class.
 * @author Derek
 *
 * @param <S> first type
 * @param <T> second type
 */
public class Pair<S,T> {
	public S _first;
	public T _second;
	
	public Pair(S first, T second) {
		_first = first;
		_second = second;
	}

}
