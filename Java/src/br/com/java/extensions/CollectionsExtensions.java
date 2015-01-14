package br.com.java.extensions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CollectionsExtensions
{
	public static <T> List<T> where(List<T> source, Predicate<T> predicate)
	{
		List<T> newSource = new ArrayList<T>();

		for (T item : source)
		{
			Boolean resultado = predicate.test(item);

			if (resultado)
			{
				newSource.add(item);
			}
		}

		return newSource;
	}

	public static <T> T First(List<T> source)
	{
		return source.get(0);
	}

	public static <T> T First(List<T> source, Predicate<T> predicate)
	{
		List<T> newSource = CollectionsExtensions.where(source, predicate);

		return newSource.get(0);
	}

	public static <T> T Last(List<T> source)
	{
		int finalPosition = source.size() - 1;

		return source.get(finalPosition);
	}

	public static <T> T Last(List<T> source, Predicate<T> predicate)
	{
		List<T> newSource = CollectionsExtensions.where(source, predicate);

		int finalPosition = newSource.size() - 1;

		return source.get(finalPosition);
	}
}
