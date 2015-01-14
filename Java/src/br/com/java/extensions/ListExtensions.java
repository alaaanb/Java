package br.com.java.extensions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public interface ListExtensions<T> extends List<T>
{
	/**
	 * 
	 * @param predicate
	 * @return
	 */
	default ListExtensions<T> where(Predicate<T> predicate)
	{
		@SuppressWarnings("unchecked")
		ListExtensions<T> newSource = (ListExtensions<T>) new ArrayList<T>();

		for (T item : this)
		{
			Boolean resultado = predicate.test(item);

			if (resultado)
			{
				newSource.add(item);
			}
		}

		return newSource;
	}

	/**
	 * 
	 * @return
	 */
	T First();

	/**
	 * 
	 * @param predicate
	 * @return
	 */
	T First(Predicate<T> predicate);

	/**
	 * 
	 * @return
	 */
	T Last();

	/**
	 * 
	 * @param predicate
	 * @return
	 */
	T Last(Predicate<T> predicate);
}
