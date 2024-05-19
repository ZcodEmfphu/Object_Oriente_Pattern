package lab9.a.ex1;

public class DinerMenuIterator implements Iterator {
	private MenuItem[] items;
	private int position = 0;

	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}

}
