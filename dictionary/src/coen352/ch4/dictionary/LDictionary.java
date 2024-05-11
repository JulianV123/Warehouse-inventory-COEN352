package coen352.ch4.dictionary;

import org.junit.jupiter.api.Test;

import coen352.ch4.list.ADTList;
import coen352.ch4.list.*;
import coen352.ch4.sort.*;
import coen352.ch4.binary_search_tree.*;

import java.util.Comparator;

/** Source code example for "A Practical Introduction to Data
Structures and Algorithm Analysis, 3rd Edition (Java)" 
by Clifford A. Shaffer
Copyright 2008-2011 by Clifford A. Shaffer
*/



/** Dictionary implemented by unsorted list. */
public class LDictionary<Key, E> implements ADTDictionary<Key, E> {
	
	private static final int defaultSize = 100; // Default size
	
	private ADTList<Key> klist;
	private ADTList<E> vlist;
	
	/** Constructors */
	LDictionary() { 
		this(defaultSize); 
	}
	
	LDictionary(int sz){ 
		klist = new LList<Key>(sz); // linked list
		vlist = new DList<E>(sz);   // doubly linked list
	}
	
	/** Reinitialize */
	public void clear() { 
		klist.clear(); 
		vlist.clear();
	}
	
	
	
	public E find(Key k) {
		
		int currKeyPos = klist.currPos();
		int currValPos = vlist.currPos();
		
		int index = 0;
		E value;
		
		for (klist.moveToStart(); klist.currPos()<klist.length(); klist.next(),index++) {
		    if (k == klist.getValue()) {
		    	
		    	vlist.moveToPos(index);
		    	value = vlist.getValue();
		    	
		    	klist.moveToPos(currKeyPos);
				vlist.moveToPos(currValPos);
				
				return value;
		    }
		    	
		    
		}   	
		klist.moveToPos(currKeyPos);
		vlist.moveToPos(currValPos);
		return null;
	}
	
	public int findByKey(Key k) {
		int currKeyPos = klist.currPos();
		int currValPos = vlist.currPos();
		
		int index = 0;

		
		for (klist.moveToStart(); klist.currPos()<klist.length(); klist.next(),index++) {
		    if (k == klist.getValue()) {
		    	vlist.moveToPos(index);
		    	
		    	klist.moveToPos(currKeyPos);
				vlist.moveToPos(currValPos);
				return index;
		    }
		    	
		    
		}   	
		klist.moveToPos(currKeyPos);
		vlist.moveToPos(currValPos);
		return -1;
		
	}
	
	/** Find k using sequential search
	  @return Record with key value k 
	public E find(Key k) {
		
		int pos = klist.findByKey(k);
		
		if(pos<vlist.length()&&pos>=0) {
			vlist.moveToPos(pos);
			return vlist.getValue();
		}
		return null;
	}
	*/
	
	/** Insert an element: append to list */
	public void insert(Key k, E e) {
		
		//assert (find(k)!=null):"The dictory has the key exists!";
		if(find(k)!=null) 
			return;
		klist.append(k);
		vlist.append(e);
	
			
	}
	
	/** Use sequential search to find the element to remove */
	public E remove(Key k) {
		E temp = find(k);
		int origin = klist.currPos();
		
		if (temp != null) {
			int pos = findByKey(k);
			
			klist.moveToPos(pos);
			vlist.moveToPos(pos);
			
			
			klist.remove();
			vlist.remove();
		}
		
		klist.moveToPos(origin);
		vlist.moveToPos(origin);
		return temp;
	}
	
	/** Remove the current element */
	public E removeAny() {
		
		if (size() != 0) {
		  klist.remove();
		  E temp = vlist.getValue();
		  vlist.remove();
		  return temp;
		}
		else 
			return null;
	}
	

	
	
	/** @return dictionary item size */
	public int size() { 
		return klist.length(); 
	}
	
	
	

	/** @return string representation of each item <key, value> per line or by tab space; */
	public String toString() {
		int origin = klist.currPos();
		StringBuffer out = new StringBuffer();
		assert (vlist.length()==klist.length()): "the dict is inconsistent";
		for(int i=0;i<klist.length();i++) {
			
			out.append(klist.getValue().toString());
			klist.next();
			
			out.append(":");
			
			out.append(vlist.getValue().toString());
			out.append(" , ");
			vlist.next();
		}
		
		klist.moveToPos(origin);
		vlist.moveToPos(origin);
		return out.toString().trim();
		
	}
	
	 

	  /**
	  public int[] createDesendingIndex() {
			index = new int [klist.length()];
			// revise sorting algorithm to solve the right position of each record
			// according to if it is a ascending or descending order. 
			// the original record order must be reserved without any swap. 
			
			
			return index; 
			
			
		}
		*/

	  public E[] createListIndex(String attribute, InventoryRecord[] inventoryRecords, int top, String order) {

	  	Comparator<Integer> compInt = new Comparator<Integer>() {
	  		@Override
			public int compare(Integer o1, Integer o2) {
	  			return o1.compareTo(o2);
	  		}
	  	};

	  	Comparator<String> compString = new Comparator<String>() {
	  		@Override
			public int compare(String o1, String o2) {
	  			return o1.compareTo(o2);
	  		}
	  	};

	  	Comparator<Long> compLong = new Comparator<Long>() {
			@Override
			public int compare(Long o1, Long o2) {
				return o1.compareTo(o2);
			}
		};

	  	Comparator<Double> compDouble = new Comparator<Double>() {
			@Override
			public int compare(Double o1, Double o2) {
				return o1.compareTo(o2);
			}
		};

	  	MergeSort mergeSort = new MergeSort();

	  	Inventory inventory = new Inventory();
	  	inventory.initializeItems();

	  	E[] valuesOfInterest = (E[])new Comparable[klist.length()];
	  	String[] arraySku = new String[klist.length()];
	  	Object[] arrayNbr = new Object[klist.length()];

	  	if (attribute.equals("sku")) {

			for(int i = 0; i < inventoryRecords.length; i++) {
				arraySku[i] = inventoryRecords[i].getSku();
			}
			mergeSort.sort(arraySku, compString, order);

			for (int i = 0; i < top; i++) {
				System.out.print("Position "+i+": Item's SKU = ");
				System.out.println(arraySku[i]);
			}

		}

	  	if (attribute.equals("unitPrice")) {

			for(int i = 0; i < inventoryRecords.length; i++) {
				arrayNbr[i] = inventoryRecords[i].getUnitPrice();
			}
			mergeSort.sort(arrayNbr, compInt, order);

			for (int i = 0; i < top; i++) {
				System.out.print("Position "+i+": Item's Unit Price = ");
				System.out.println(arrayNbr[i]+"$");
			}
		}

	  	if (attribute.equals("qtyInStock")) {
			for(int i = 0; i < inventoryRecords.length; i++) {
				arrayNbr[i] = inventoryRecords[i].getQty();
			}
			mergeSort.sort(arrayNbr, compLong, order);

			for (int i = 0; i < top; i++) {
				System.out.print("Position "+i+": Item's Quantity = ");
				System.out.println(arrayNbr[i]);
			}
		}

	  	if (attribute.equals("inventoryValue")) {
			for(int i = 0; i < inventoryRecords.length; i++) {
				arrayNbr[i] = inventoryRecords[i].getInventoryValue();
			}
			mergeSort.sort(arrayNbr, compDouble, order);

			for (int i = 0; i < top; i++) {
				System.out.print("Position "+i+": Item's Inventory Value = ");
				System.out.println(arrayNbr[i]+"$");
			}
		}

	  	if (attribute.equals("reorderLevel")) {
			for(int i = 0; i < inventoryRecords.length; i++) {
				arrayNbr[i] = inventoryRecords[i].getReorderLevel();
			}
			mergeSort.sort(arrayNbr, compInt, order);

			for (int i = 0; i < top; i++) {
				System.out.print("Position "+i+": Item's Reorder Level = ");
				System.out.println(arrayNbr[i]);
			}
		}

	  	if(attribute.equals("reorderDays")) {
			for(int i = 0; i < inventoryRecords.length; i++) {
				arrayNbr[i] = inventoryRecords[i].getReorderTimeDays();
			}
			mergeSort.sort(arrayNbr, compInt, order);

			for (int i = 0; i < top; i++) {
				System.out.print("Position "+i+": Item's Reorder Time = ");
				System.out.println(arrayNbr[i]+" days");
			}
		}

	  	if (attribute.equals("qtyReorder")) {
			for(int i = 0; i < inventoryRecords.length; i++) {
				arrayNbr[i] = inventoryRecords[i].getReorderQty();
			}
			mergeSort.sort(arrayNbr, compInt, order);

			for (int i = 0; i < top; i++) {
				System.out.print("Position "+i+": Item's Quantity in Reorder = ");
				System.out.println(arrayNbr[i]);
			}
		}

	  	return valuesOfInterest;
	  }

	  public E[] createTreeIndex(String attribute, InventoryRecord[] inventoryRecords) {
	  	Inventory inventory = new Inventory();
	  	inventory.initializeItems();

	  	E[] valuesOfInterest = (E[])new Comparable[klist.length()];

	  	MyBST myBST = new MyBST();

	  	if (attribute.equals("sku")) {
			for (int i = 0; i < inventoryRecords.length; i++) {
				myBST.insert(inventoryRecords[i].getSku());
			}
			Object[] arrayNbr = myBST.inOrder();

			for (int i = 0; i < arrayNbr.length; i++) {
				System.out.print("Position "+i+": Item's SKU = ");
				System.out.println(arrayNbr[i]);
			}
		}

	  	if(attribute.equals("unitPrice")) {
	  		for (int i = 0; i < inventoryRecords.length; i++) {
	  			myBST.insert(inventoryRecords[i].getUnitPrice());
			}
			Object[] arrayNbr = myBST.inOrder();

	  		for (int i = 0; i < arrayNbr.length; i++) {
				System.out.print("Position "+i+": Item's Unit Price = ");
				System.out.println(arrayNbr[i]+"$");
			}
		}

	  	if(attribute.equals("qtyInStock")) {
	  		for (int i = 0; i < inventoryRecords.length; i++) {
	  			myBST.insert(inventoryRecords[i].getQty());
	  		}
	  		Object[] arrayNbr = myBST.inOrder();

	  		for (int i = 0; i < arrayNbr.length; i++) {
	  			System.out.print("Position "+i+": Item's Quantity = ");
	  			System.out.println(arrayNbr[i]);
	  		}
	  	}

	  	if(attribute.equals("inventoryValue")) {
	  		for (int i = 0; i < inventoryRecords.length; i++) {
	  			myBST.insert(inventoryRecords[i].getInventoryValue());
	  		}
	  		Object[] arrayNbr = myBST.inOrder();

	  		for (int i = 0; i < arrayNbr.length; i++) {
	  			System.out.print("Position "+i+": Item's Inventory Value = ");
	  			System.out.println(arrayNbr[i]+"$");
	  		}
	  	}

	  	if(attribute.equals("reorderLevel")) {
	  		for (int i = 0; i < inventoryRecords.length; i++) {
	  			myBST.insert(inventoryRecords[i].getReorderLevel());
	  		}
	  		Object[] arrayNbr = myBST.inOrder();

	  		for (int i = 0; i < arrayNbr.length; i++) {
	  			System.out.print("Position "+i+": Item's Reorder Level = ");
	  			System.out.println(arrayNbr[i]);
	  		}
	  	}

	  	if(attribute.equals("reorderDays")) {
	  		for (int i = 0; i < inventoryRecords.length; i++) {
	  			myBST.insert(inventoryRecords[i].getReorderTimeDays());
	  		}
	  		Object[] arrayNbr = myBST.inOrder();

	  		for (int i = 0; i < arrayNbr.length; i++) {
	  			System.out.print("Position "+i+": Item's Reorder Time = ");
	  			System.out.println(arrayNbr[i]+" days");
	  		}
	  	}

	  	if(attribute.equals("qtyReorder")) {
	  		for (int i = 0; i < inventoryRecords.length; i++) {
	  			myBST.insert(inventoryRecords[i].getReorderQty());
	  		}
	  		Object[] arrayNbr = myBST.inOrder();

	  		for (int i = 0; i < arrayNbr.length; i++) {
	  			System.out.print("Position "+i+": Item's Quantity in Reorder = ");
	  			System.out.println(arrayNbr[i]);
	  		}
	  	}

	  	return valuesOfInterest;
	  }

}