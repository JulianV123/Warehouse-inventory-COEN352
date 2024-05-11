package coen352.ch4.dictionary;

import javax.print.attribute.Attribute;

public class WarehouseDB {
	
	static WarehouseDB wDB;
	private static ADTDictionary<String, InventoryRecord> sheetIR;

	
	public static void main(String[] args) {
		Inventory inventory = new Inventory(); //creates the inventory
		inventory.initializeItems();		   //initializes all 25 items from the excel data sheet
		wDB = new WarehouseDB();

		// TODO Auto-generated method stub
		wDB.creatDB();

	}

//	InventoryRerod ir1 = new("SP7875",,,,,);
//	InventoryRerod ir2 = new("WTB311",,,,,);
	
	public static void initial() {
		wDB.insert(new InventoryRecord());

	}

	public String toString() {
		return sheetIR.toString();
	}
	
	public  void creatDB() {
		Inventory inventory = new Inventory(); //creates the inventory
		inventory.initializeItems();		   //initializes all 25 items from the excel data sheet
		sheetIR = new  LDictionary();

	}
	
	public  boolean insert(ADTInventoryRecord o) {
		if(o instanceof InventoryRecord) {
			sheetIR.insert(((InventoryRecord)o).getSku(), (InventoryRecord) o);
			return true;
		}
		return false;
	}

	public void insertSetRecords(InventoryRecord[] arrayIR) {
		for (InventoryRecord inventoryRecord : arrayIR) {
			sheetIR.insert(inventoryRecord.getSku(), inventoryRecord);
		}
	}

	public void removeWithKey(String key) {
		sheetIR.remove(key);
	}

	public void removeAll() {
		sheetIR.clear();
	}

	public InventoryRecord findRecordByKey(String key) {
		return sheetIR.find(key);
	}

	public void retrieveReordered(InventoryRecord[] arrayIR) {
		for (InventoryRecord inventoryRecord : arrayIR) {
			if (inventoryRecord.isReordered()) {
				sheetIR.insert(inventoryRecord.getSku(), inventoryRecord);
			}
		}
	}

	public void retrieveByLocation(InventoryRecord[] arrayIR, String location) {
		for (InventoryRecord inventoryRecord : arrayIR) {
			if (inventoryRecord.getLocation().equals(location)) {
				sheetIR.insert(inventoryRecord.getSku(), inventoryRecord);
			}
		}
	}

	public int size() {
		return sheetIR.size();
	}

	public double totalInventoryValue(InventoryRecord[] arrayIR) {
		double total = 0;
		for (InventoryRecord inventoryRecord : arrayIR) {
			total = inventoryRecord.getInventoryValue() + total;
		}
		return total;
	}

	public void query(String attribute, int top, InventoryRecord[] arrayIR, String order) {

		sheetIR.createListIndex(attribute, arrayIR, top, order);

	}

	public void queryBinarySearchTree(String attribute, InventoryRecord[] inventoryRecords) {

		sheetIR.createTreeIndex(attribute, inventoryRecords);

	}

}
