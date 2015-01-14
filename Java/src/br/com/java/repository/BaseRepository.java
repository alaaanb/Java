package br.com.java.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import br.com.java.extensions.ListExtensions;

public abstract class BaseRepository<T>
{
	private ListExtensions<T> source;

	@SuppressWarnings("unchecked")
	public BaseRepository()
	{
		if (source == null)
		{
			source = (ListExtensions<T>) new ArrayList<T>();
		}
	}

	public abstract T get(Object key);

	public T get(Function<ListExtensions<T>, T> func)
	{
		return func.apply(source);
	}
}
