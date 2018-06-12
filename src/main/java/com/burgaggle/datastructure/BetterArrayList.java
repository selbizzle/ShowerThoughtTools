package com.burgaggle.datastructure;

import java.util.ArrayList;
import java.util.Collection;

public class BetterArrayList<E> extends ArrayList<E> {
	private static final long serialVersionUID = 1L;

	@Override
	public boolean add(E item) {
		if (item != null)
			return super.add(item);
		return false;
	}

	@Override
	public void add(int index, E item) {
		if (item != null)
			super.add(index, item);
	}

	@Override
	public boolean addAll(Collection<? extends E> items) {
		if (items != null) {
			for (E item : items) {
				add(item);

			}
		}
		return true;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> items) {
		int i = index;
		if (items != null) {
			for (E item : items) {
				if (item != null) {
					add(i, item);
					i++;
				}
			}
		}
		return true;
	}

}
