package lecture10;

import java.util.*;

public class MyIterator implements MyIteratorInterface {

	private MyLinkedList parent;
	private int pos;
	private boolean removeOK;
	
	public MyIterator(MyLinkedList parent) {
		removeOK = false;
		pos = 0;
		this.parent = parent;
	}

	@Override
	public Integer next() {
		/*if (parent.isModified)
			throw new ConcurrentModificationException();
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		int result = parent.get(pos);
		pos++;
		removeOK = true;
		return result;*/
		if(!hasNext())
			throw new NoSuchElementException("You are at the end.");
		Integer retVal = parent.get(pos);
		pos++;
		return retVal;
	}

	@Override
	public boolean hasNext() {
		return pos < parent.size(); //returns true when there is something to return
	}

	@Override
	public void remove() {
	/*	if (parent.isModified)
			throw new ConcurrentModificationException();
		if (!removeOK)
			throw new IllegalStateException();
		parent.removeAt(pos - 1);
		pos--;
		removeOK = false;*/
		if(!removeOK)
			throw new IllegalStateException("Calling remove without next().");
		parent.removeAt(pos);
		pos--;
		removeOK = false;
	}


}
