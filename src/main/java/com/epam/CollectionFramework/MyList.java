package com.epam.CollectionFramework;

import java.util.Arrays;

public class MyList<T> {
	
	private int listSize = 0;
	private static final int InitialSIZE = 10;
	private Object listValues[];
	
	public MyList() {
		listValues = new Object[InitialSIZE];
    }
	
	public void add(T t) {
		if (listSize == listValues.length) {
            Capacity();
        }
        listValues[listSize++] = t;
    }
	
	public int size() {
		return listSize;
	}
	
	public T remove(int i) {
	    if (i > listSize || i < 0) {
	        throw new IndexOutOfBoundsException("Of index: " + i + "& size =" + i);
	    }
	    Object value = listValues[i];
	    int remlen = listValues.length - (i) ;
	    System.arraycopy( listValues, i , listValues, i-1, remlen ) ;
	    listSize--;
	    return (T) value;
	}
	 
	public T getElementByIndex(int i) {
		if (i > listSize || i < 0) {
	        throw new IndexOutOfBoundsException("Of index: " + i + "& size " + i);
	    }
		return (T) listValues[i-1];
	}
	 
	private void Capacity() {
        int expSize = listValues.length * 2;
        listValues = Arrays.copyOf(listValues, expSize);
    }
	
	@Override
	public String toString() {
		String str= "[";
	    for(int i = 0; i < listSize ;i++) {
	    	str += listValues[i].toString();
	        	if(i < listSize-1){
	                 str += " , ";
	             }
	         }
	         str += ']';
	         return str;
	    }
	
}
