package coen352.ch4.dictionary;

public class InventoryRecord implements Comparable<InventoryRecord>, ADTInventoryRecord{
	private String	sku;
	private String	description;
	private String	bin;
	private String	location;
	private String	unit;
	private boolean reordered;
	private boolean	discontinued;
	private int 	unitPrice;
	private int 	reorderLevel;
	private int		reorderTimeDays;
	private int		reorderQty;
	private long	qty;
	private double inventoryValue;
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBin() {
		return bin;
	}
	public void setBin(String bin) {
		this.bin = bin;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

	public boolean isReordered() {
		return reordered;
	}

	public void setReordered(boolean reordered) {
		this.reordered = reordered;
	}

	private boolean isDiscontinued() {
		return discontinued;
	}

	public void setDiscontinued(boolean discontinued) {
		this.discontinued = discontinued;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getReorderLevel() {
		return reorderLevel;
	}

	public void setReorderLevel(int reorderLevel) {
		this.reorderLevel = reorderLevel;
	}

	public int getReorderTimeDays() {
		return reorderTimeDays;
	}

	public void setReorderTimeDays(int reorderTimeDays) {
		this.reorderTimeDays = reorderTimeDays;
	}

	public int getReorderQty() {
		return reorderQty;
	}

	public void setReorderQty(int reorderQty) {
		this.reorderQty = reorderQty;
	}

	public long getQty() {
		return qty;
	}
	public void setQty(long qty) {
		this.qty = qty;
	}
	public double getInventoryValue() {
		return inventoryValue;
	}
	public void setInventoryValue(double inventoryValue) {
		this.inventoryValue = inventoryValue;
	}

	 public int compareTo(InventoryRecord other)
     {
    	 return this.getSku().compareTo(other.getSku());
     }

	@Override
	public String toString() {
		String item = "\nSKU = "+getSku()+",\nUnit Name = "+getUnit()+",\n"+getDescription()+",\nUnit Price = "+getUnitPrice()+"$,\nQuantity = "+getQty()+",\nInventory Value = "+getInventoryValue()+"$," +
				"\nIs reordered? "+isReordered()+",\nLocation = "+getLocation()+"\nReorder Level = "+getReorderLevel()+",\nReorder Time in Days = "+getReorderTimeDays()+" days, \nQty in reorder = "+getReorderQty()+"" +
				",\nIs Discontinued? "+isDiscontinued()+"\n"+"\n";
		return "\n"+item;
	}

	/**

	public void sortArrayIR(InventoryRecord[] arrayIR) {
		InsertSort.sort(arrayIR);
	}
	 **/
}
