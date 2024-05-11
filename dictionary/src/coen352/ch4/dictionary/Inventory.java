package coen352.ch4.dictionary;

/**
 This class stores all of the different items used in the warehouse DB.
 The data written here is all based on the Excel sheet provided to us on moodle
 */

public class Inventory {

    InventoryRecord item1 = new InventoryRecord();
    InventoryRecord item2 = new InventoryRecord();
    InventoryRecord item3 = new InventoryRecord();
    InventoryRecord item4 = new InventoryRecord();
    InventoryRecord item5 = new InventoryRecord();
    InventoryRecord item6 = new InventoryRecord();
    InventoryRecord item7 = new InventoryRecord();
    InventoryRecord item8 = new InventoryRecord();
    InventoryRecord item9 = new InventoryRecord();
    InventoryRecord item10 = new InventoryRecord();
    InventoryRecord item11 = new InventoryRecord();
    InventoryRecord item12 = new InventoryRecord();
    InventoryRecord item13 = new InventoryRecord();
    InventoryRecord item14 = new InventoryRecord();
    InventoryRecord item15 = new InventoryRecord();
    InventoryRecord item16 = new InventoryRecord();
    InventoryRecord item17 = new InventoryRecord();
    InventoryRecord item18 = new InventoryRecord();
    InventoryRecord item19 = new InventoryRecord();
    InventoryRecord item20 = new InventoryRecord();
    InventoryRecord item21 = new InventoryRecord();
    InventoryRecord item22 = new InventoryRecord();
    InventoryRecord item23 = new InventoryRecord();
    InventoryRecord item24 = new InventoryRecord();
    InventoryRecord item25 = new InventoryRecord();




    public void initializeItems() {
        item1.setSku("IN0001");
        item1.setDescription("Description 1");
        item1.setUnit("Item 1");
        item1.setUnitPrice(51);
        item1.setQty(25);
        item1.setInventoryValue(1275);
        item1.setReordered(true);
        item1.setLocation("A42");
        item1.setReorderLevel(29);
        item1.setReorderTimeDays(13);
        item1.setReorderQty(50);
        item1.setDiscontinued(false);

        item2.setSku("IN0002");
        item2.setDescription("Description 2");
        item2.setUnit("Item 2");
        item2.setUnitPrice(93);
        item2.setQty(132);
        item2.setInventoryValue(12276);
        item2.setReordered(true);
        item2.setLocation("A94");
        item2.setReorderLevel(231);
        item2.setReorderTimeDays(4);
        item2.setReorderQty(50);
        item2.setDiscontinued(false);

        item3.setSku("IN0003");
        item3.setDescription("Description 3");
        item3.setUnit("Item 3");
        item3.setUnitPrice(57);
        item3.setQty(151);
        item3.setInventoryValue(8607);
        item3.setReordered(false);
        item3.setLocation("B33");
        item3.setReorderLevel(114);
        item3.setReorderTimeDays(11);
        item3.setReorderQty(50);
        item3.setDiscontinued(false);

        item4.setSku("IN0004");
        item4.setDescription("Description 4");
        item4.setUnit("Item 4");
        item4.setUnitPrice(19);
        item4.setQty(186);
        item4.setInventoryValue(3534);
        item4.setReordered(false);
        item4.setLocation("A94");
        item4.setReorderLevel(158);
        item4.setReorderTimeDays(6);
        item4.setReorderQty(50);
        item4.setDiscontinued(false);

        item5.setSku("IN0005");
        item5.setDescription("Description 5");
        item5.setUnit("Item 5");
        item5.setUnitPrice(75);
        item5.setQty(62);
        item5.setInventoryValue(4650);
        item5.setReordered(false);
        item5.setLocation("C63");
        item5.setReorderLevel(39);
        item5.setReorderTimeDays(12);
        item5.setReorderQty(50);
        item5.setDiscontinued(false);

        item6.setSku("IN0006");
        item6.setDescription("Description 6");
        item6.setUnit("Item 6");
        item6.setUnitPrice(11);
        item6.setQty(5);
        item6.setInventoryValue(55);
        item6.setReordered(true);
        item6.setLocation("B33");
        item6.setReorderLevel(9);
        item6.setReorderTimeDays(13);
        item6.setReorderQty(150);
        item6.setDiscontinued(false);

        item7.setSku("IN0007");
        item7.setDescription("Description 7");
        item7.setUnit("Item 7");
        item7.setUnitPrice(56);
        item7.setQty(58);
        item7.setInventoryValue(3248);
        item7.setReordered(false);
        item7.setLocation("C63");
        item7.setReorderLevel(109);
        item7.setReorderTimeDays(7);
        item7.setReorderQty(100);
        item7.setDiscontinued(true);

        item8.setSku("IN0008");
        item8.setDescription("Description 8");
        item8.setUnit("Item 8");
        item8.setUnitPrice(38);
        item8.setQty(101);
        item8.setInventoryValue(3838);
        item8.setReordered(true);
        item8.setLocation("A94");
        item8.setReorderLevel(162);
        item8.setReorderTimeDays(3);
        item8.setReorderQty(100);
        item8.setDiscontinued(false);

        item9.setSku("IN0009");
        item9.setDescription("Description 9");
        item9.setUnit("Item 9");
        item9.setUnitPrice(59);
        item9.setQty(122);
        item9.setInventoryValue(7198);
        item9.setReordered(false);
        item9.setLocation("B33");
        item9.setReorderLevel(82);
        item9.setReorderTimeDays(3);
        item9.setReorderQty(150);
        item9.setDiscontinued(false);

        item10.setSku("IN0010");
        item10.setDescription("Description 10");
        item10.setUnit("Item 10");
        item10.setUnitPrice(50);
        item10.setQty(175);
        item10.setInventoryValue(8750);
        item10.setReordered(true);
        item10.setLocation("A42");
        item10.setReorderLevel(283);
        item10.setReorderTimeDays(8);
        item10.setReorderQty(50);
        item10.setDiscontinued(false);

        item11.setSku("IN0011");
        item11.setDescription("Description 11");
        item11.setUnit("Item 11");
        item11.setUnitPrice(59);
        item11.setQty(176);
        item11.setInventoryValue(10384);
        item11.setReordered(true);
        item11.setLocation("A42");
        item11.setReorderLevel(229);
        item11.setReorderTimeDays(1);
        item11.setReorderQty(100);
        item11.setDiscontinued(false);

        item12.setSku("IN0012");
        item12.setDescription("Description 12");
        item12.setUnit("Item 12");
        item12.setUnitPrice(18);
        item12.setQty(22);
        item12.setInventoryValue(396);
        item12.setReordered(true);
        item12.setLocation("B33");
        item12.setReorderLevel(36);
        item12.setReorderTimeDays(12);
        item12.setReorderQty(50);
        item12.setDiscontinued(false);

        item13.setSku("IN0013");
        item13.setDescription("Description 13");
        item13.setUnit("Item 13");
        item13.setUnitPrice(26);
        item13.setQty(72);
        item13.setInventoryValue(1872);
        item13.setReordered(true);
        item13.setLocation("A94");
        item13.setReorderLevel(102);
        item13.setReorderTimeDays(9);
        item13.setReorderQty(100);
        item13.setDiscontinued(false);

        item14.setSku("IN0014");
        item14.setDescription("Description 14");
        item14.setUnit("Item 14");
        item14.setUnitPrice(42);
        item14.setQty(62);
        item14.setInventoryValue(2604);
        item14.setReordered(true);
        item14.setLocation("C63");
        item14.setReorderLevel(83);
        item14.setReorderTimeDays(2);
        item14.setReorderQty(100);
        item14.setDiscontinued(false);

        item15.setSku("IN0015");
        item15.setDescription("Description 15");
        item15.setUnit("Item 15");
        item15.setUnitPrice(32);
        item15.setQty(46);
        item15.setInventoryValue(1472);
        item15.setReordered(false);
        item15.setLocation("B33");
        item15.setReorderLevel(23);
        item15.setReorderTimeDays(15);
        item15.setReorderQty(50);
        item15.setDiscontinued(false);

        item16.setSku("IN0016");
        item16.setDescription("Description 16");
        item16.setUnit("Item 16");
        item16.setUnitPrice(90);
        item16.setQty(96);
        item16.setInventoryValue(8640);
        item16.setReordered(true);
        item16.setLocation("A94");
        item16.setReorderLevel(180);
        item16.setReorderTimeDays(3);
        item16.setReorderQty(50);
        item16.setDiscontinued(false);

        item17.setSku("IN0017");
        item17.setDescription("Description 17");
        item17.setUnit("Item 17");
        item17.setUnitPrice(97);
        item17.setQty(57);
        item17.setInventoryValue(5529);
        item17.setReordered(false);
        item17.setLocation("A42");
        item17.setReorderLevel(98);
        item17.setReorderTimeDays(12);
        item17.setReorderQty(50);
        item17.setDiscontinued(true);

        item18.setSku("IN0018");
        item18.setDescription("Description 18");
        item18.setUnit("Item 18");
        item18.setUnitPrice(12);
        item18.setQty(6);
        item18.setInventoryValue(72);
        item18.setReordered(true);
        item18.setLocation("A94");
        item18.setReorderLevel(7);
        item18.setReorderTimeDays(13);
        item18.setReorderQty(50);
        item18.setDiscontinued(false);

        item19.setSku("IN0019");
        item19.setDescription("Description 19");
        item19.setUnit("Item 19");
        item19.setUnitPrice(82);
        item19.setQty(143);
        item19.setInventoryValue(11762);
        item19.setReordered(true);
        item19.setLocation("C63");
        item19.setReorderLevel(164);
        item19.setReorderTimeDays(12);
        item19.setReorderQty(50);
        item19.setDiscontinued(false);

        item20.setSku("IN0020");
        item20.setDescription("Description 20");
        item20.setUnit("Item 20");
        item20.setUnitPrice(16);
        item20.setQty(124);
        item20.setInventoryValue(1984);
        item20.setReordered(false);
        item20.setLocation("C63");
        item20.setReorderLevel(113);
        item20.setReorderTimeDays(14);
        item20.setReorderQty(50);
        item20.setDiscontinued(false);

        item21.setSku("IN0021");
        item21.setDescription("Description 21");
        item21.setUnit("Item 21");
        item21.setUnitPrice(19);
        item21.setQty(112);
        item21.setInventoryValue(2128);
        item21.setReordered(false);
        item21.setLocation("B33");
        item21.setReorderLevel(75);
        item21.setReorderTimeDays(11);
        item21.setReorderQty(50);
        item21.setDiscontinued(false);

        item22.setSku("IN0022");
        item22.setDescription("Description 22");
        item22.setUnit("Item 22");
        item22.setUnitPrice(24);
        item22.setQty(182);
        item22.setInventoryValue(4368);
        item22.setReordered(false);
        item22.setLocation("A94");
        item22.setReorderLevel(132);
        item22.setReorderTimeDays(15);
        item22.setReorderQty(50);
        item22.setDiscontinued(false);

        item23.setSku("IN0023");
        item23.setDescription("Description 23");
        item23.setUnit("Item 23");
        item23.setUnitPrice(29);
        item23.setQty(106);
        item23.setInventoryValue(3074);
        item23.setReordered(false);
        item23.setLocation("B33");
        item23.setReorderLevel(142);
        item23.setReorderTimeDays(1);
        item23.setReorderQty(50);
        item23.setDiscontinued(true);

        item24.setSku("IN0024");
        item24.setDescription("Description 24");
        item24.setUnit("Item 24");
        item24.setUnitPrice(75);
        item24.setQty(173);
        item24.setInventoryValue(12975);
        item24.setReordered(false);
        item24.setLocation("A42");
        item24.setReorderLevel(127);
        item24.setReorderTimeDays(9);
        item24.setReorderQty(100);
        item24.setDiscontinued(false);

        item25.setSku("IN0025");
        item25.setDescription("Description 25");
        item25.setUnit("Item 25");
        item25.setUnitPrice(14);
        item25.setQty(28);
        item25.setInventoryValue(392);
        item25.setReordered(false);
        item25.setLocation("C63");
        item25.setReorderLevel(21);
        item25.setReorderTimeDays(8);
        item25.setReorderQty(50);
        item25.setDiscontinued(false);

    }

}
