package coen352.ch4.dictionary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class WarehouseDBJUnitTest {

    static WarehouseDB wDB;
    private static ADTDictionary<String, InventoryRecord> sheetIR;
    Inventory inventory = new Inventory();

    @BeforeAll
    static void setUp() {
        wDB = new WarehouseDB();

        // TODO Auto-generated method stub
        wDB.creatDB();

    }

    @Test
    void insert() {
        wDB.removeAll();
        inventory.initializeItems();
        wDB.insert(inventory.item5);
        wDB.insert(inventory.item3);
        wDB.insert(inventory.item10);
        //System.out.println(wDB.toString()); //Un-comment this line to visualize if all the correct items have been inserted correctly
        assertEquals(3, wDB.size(), "size is not as expected, items not inserted");
    }

    @Test
    void insertSetRecords() {
        wDB.removeAll();
        inventory.initializeItems();

        InventoryRecord[] inventoryRecords = new InventoryRecord[5];

        inventoryRecords[0] = inventory.item1;
        inventoryRecords[1] = inventory.item3;
        inventoryRecords[2] = inventory.item7;
        inventoryRecords[3] = inventory.item13;
        inventoryRecords[4] = inventory.item17;


        wDB.insertSetRecords(inventoryRecords);

        //System.out.println(wDB.toString()); //Un-comment this line to visualize if all the correct items have been inserted correctly

        assertEquals(5, wDB.size(), "size is not as expected, array not inserted in the warehouse database");

    }

    @Test
    void removeWithKey() {
        wDB.removeAll();
        inventory.initializeItems();

        wDB.insert(inventory.item3);
        wDB.insert(inventory.item8);
        wDB.insert(inventory.item18);

        //The SKU(key) of item 8 is IN0008

        wDB.removeWithKey("IN0008");

        //System.out.println(wDB.toString()); //Un-comment this line to visualize if the item has been removed

        assertEquals(2, wDB.size(), "size not expected, item not removed correctly");
    }

    @Test
    void removeAll() {
        wDB.removeAll();
        inventory.initializeItems();

        wDB.insert(inventory.item1);
        wDB.insert(inventory.item19);
        wDB.insert(inventory.item20);

        wDB.removeAll();
        assertEquals(0, wDB.size(), "size not expected, all items have not been removed");
    }

    @Test
    void findRecordByKey() {
        wDB.removeAll();
        inventory.initializeItems();

        wDB.insert(inventory.item1);
        wDB.insert(inventory.item17);
        wDB.insert(inventory.item23);

        //The SKU(key) of item 17 is IN0017

        InventoryRecord foundInventoryRecord = wDB.findRecordByKey("IN0017");

        //System.out.println(foundInventoryRecord); //Un-comment this line to visualize if the correct item has been identified

        assertEquals(inventory.item17, foundInventoryRecord, "Have not found the expected item");
    }

    @Test
    void retrieveReordered() {
        wDB.removeAll();
        inventory.initializeItems();

        //I will select 5 items from the inventory and find all items flagged as reordered (the little red flag on the left of the excel sheet)

        InventoryRecord[] inventoryRecords = new InventoryRecord[5];

        inventoryRecords[0] = inventory.item1;
        inventoryRecords[1] = inventory.item2;
        inventoryRecords[2] = inventory.item3;
        inventoryRecords[3] = inventory.item4;
        inventoryRecords[4] = inventory.item5;

        //From the selected items, Only items 1 and 2 are flagged as reordered, the size of the retrieved reordered items should be 2

        wDB.retrieveReordered(inventoryRecords);

        //System.out.println(wDB.toString()); //Un-comment this line to visualize if the correct items has been identified

        assertEquals(2, wDB.size(), "size not expected, there should be only 2 items in the warehouse");
    }

    @Test
    void retrieveByLocation() {
        wDB.removeAll();
        inventory.initializeItems();

        //I will select 5 items from the inventory and find all items in the same location

        InventoryRecord[] inventoryRecords = new InventoryRecord[5];

        inventoryRecords[0] = inventory.item1;
        inventoryRecords[1] = inventory.item2;
        inventoryRecords[2] = inventory.item10;
        inventoryRecords[3] = inventory.item11;
        inventoryRecords[4] = inventory.item16;

        //I will try to find items located in the "A42" section of the warehouse.
        //From the selected items,Only items 1,10 and 11 are part of that section.
        //The size expected of the retrieved items by location should be 3.

        wDB.retrieveByLocation(inventoryRecords, "A42");

        //System.out.println(wDB.toString()); //Un-comment this line to visualize if the correct items has been identified

        assertEquals(3, wDB.size(), "size not expected, there should be only 3 items in the warehouse");
    }

    @Test
    void size() {
        wDB.removeAll();
        inventory.initializeItems();

        wDB.insert(inventory.item1);
        wDB.insert(inventory.item2);
        wDB.insert(inventory.item3);

        assertEquals(3, wDB.size(), "size not as expected, there should be only 3 items in the entire database");
    }

    @Test
    void totalInventoryValue() {
        wDB.removeAll();
        inventory.initializeItems();

        //I will select 10 items from the inventory and calculate the total inventory value
        //If we want to calculate the value of all 25 items, we can simply initialize an array of 25 items
        //and add all of the 25 items to the array.

        InventoryRecord[] inventoryRecords = new InventoryRecord[10];

        inventoryRecords[0] = inventory.item1;
        inventoryRecords[1] = inventory.item2;
        inventoryRecords[2] = inventory.item4;
        inventoryRecords[3] = inventory.item8;
        inventoryRecords[4] = inventory.item10;
        inventoryRecords[5] = inventory.item11;
        inventoryRecords[6] = inventory.item14;
        inventoryRecords[7] = inventory.item18;
        inventoryRecords[8] = inventory.item20;
        inventoryRecords[9] = inventory.item24;

        //The total value for items 1,2,4,8,10,11,14,18,20,24 should be 57 692$

        assertEquals(57692, wDB.totalInventoryValue(inventoryRecords), "Not the expected inventory value for the items listed");

    }

    @Test
    void testQuerySKU() {

        wDB.removeAll();
        inventory.initializeItems();
        int top = 3;
        String actual = "";

        wDB.insert(inventory.item1);
        wDB.insert(inventory.item17);
        wDB.insert(inventory.item7);
        wDB.insert(inventory.item3);
        wDB.insert(inventory.item2);

        InventoryRecord[] inventoryRecords = new InventoryRecord[5];

        inventoryRecords[0] = inventory.item1;
        inventoryRecords[1] = inventory.item17;
        inventoryRecords[2] = inventory.item7;
        inventoryRecords[3] = inventory.item3;
        inventoryRecords[4] = inventory.item2;

        System.out.println("Top "+top+" Sorted inventory by SKU: ");

        wDB.query("sku", top, inventoryRecords, "ascending");

        //The sorted inventory does not store the inventory records, it stores their position
        //and the attribute associated with the item (sku, unit price, inventory value etc).

        //The following lines of code prove that the order of the original records position remains unchanged.

        System.out.println("Unsorted inventory : ");
        System.out.println("");

        int counter = 0;
        for (InventoryRecord inventoryRecord : inventoryRecords) {
            System.out.println("Position "+counter+" = ");
            System.out.println(inventoryRecord);
            counter++;
        }

        //The assertEquals test will also prove that the order of the original inventory records has not changed

        for (int i = 0; i < inventoryRecords.length; i++) {
            actual = actual+inventoryRecords[i].getSku()+" ";
        }

        assertEquals("IN0001 IN0017 IN0007 IN0003 IN0002 ", actual, "Not the expected inventory, the inventory has changed");
    }

    @Test
    void testQueryUnitPrice() {
        wDB.removeAll();
        inventory.initializeItems();
        int top = 4;
        String actual = "";

        wDB.insert(inventory.item5);
        wDB.insert(inventory.item8);
        wDB.insert(inventory.item21);
        wDB.insert(inventory.item15);
        wDB.insert(inventory.item6);

        InventoryRecord[] inventoryRecords = new InventoryRecord[5];

        inventoryRecords[0] = inventory.item5;
        inventoryRecords[1] = inventory.item8;
        inventoryRecords[2] = inventory.item21;
        inventoryRecords[3] = inventory.item15;
        inventoryRecords[4] = inventory.item6;

        System.out.println("Top "+top+" Sorted inventory by Unit Price: ");

        wDB.query("unitPrice", top, inventoryRecords, "descending");

        //The sorted inventory does not store the inventory records, it stores their position
        //and the attribute associated with the item (sku, unit price, inventory value etc).

        //The following lines of code prove that the order of the original records position remains unchanged.

        System.out.println("Unsorted inventory : ");
        System.out.println("");

        int counter = 0;
        for (InventoryRecord inventoryRecord : inventoryRecords) {
            System.out.println("Position "+counter+" = ");
            System.out.println(inventoryRecord);
            counter++;
        }

        //The assertEquals test will also prove that the order of the original inventory records has not changed

        for (int i = 0; i < inventoryRecords.length; i++) {
            actual = actual+(inventoryRecords[i].getSku())+" ";
        }

        assertEquals("IN0005 IN0008 IN0021 IN0015 IN0006 ", actual, "Not the expected inventory, the inventory has changed");

    }

    @Test
    void testBinarySearchTree() {
        wDB.removeAll();
        inventory.initializeItems();
        String actual = "";

        wDB.insert(inventory.item7);
        wDB.insert(inventory.item13);
        wDB.insert(inventory.item2);
        wDB.insert(inventory.item5);
        wDB.insert(inventory.item25);

        InventoryRecord[] inventoryRecords = new InventoryRecord[5];

        inventoryRecords[0] = inventory.item7;
        inventoryRecords[1] = inventory.item13;
        inventoryRecords[2] = inventory.item2;
        inventoryRecords[3] = inventory.item5;
        inventoryRecords[4] = inventory.item25;

        System.out.println("Sorted inventory by Inventory Value (Using a BST database structure)");

        wDB.queryBinarySearchTree("inventoryValue", inventoryRecords);

        //The following lines of code prove that the order of the original records position remains unchanged.

        System.out.println("Unsorted inventory : ");
        System.out.println("");

        int counter = 0;
        for (InventoryRecord inventoryRecord : inventoryRecords) {
            System.out.println("Position "+counter+" = ");
            System.out.println(inventoryRecord);
            counter++;
        }

        //The assertEquals test will also prove that the order of the original inventory records has not changed

        for (int i = 0; i < inventoryRecords.length; i++) {
            actual = actual+(inventoryRecords[i].getSku())+" ";
        }

        assertEquals("IN0007 IN0013 IN0002 IN0005 IN0025 ", actual, "Not the expected inventory, the inventory has changed");
    }
}