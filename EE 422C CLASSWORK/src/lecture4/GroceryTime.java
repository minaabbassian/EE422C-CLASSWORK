package lecture4;

public class GroceryTime {
	
	public static void main(String[] args) {
		GroceryItemOrder i1 = new GroceryItemOrder("chicken", 1, 4.00);
		GroceryItemOrder i2 = new GroceryItemOrder("beets", 2, 2.00);
		GroceryItemOrder i3 = new GroceryItemOrder("curry", 22, 3.50);
		GroceryItemOrder i4 = new GroceryItemOrder("eggs", 22, 3.50);
		GroceryItemOrder i5 = new GroceryItemOrder("ramen", 22, 3.00);
		GroceryItemOrder i6 = new GroceryItemOrder("marshmellows", 22, 3.50);
		GroceryItemOrder i7 = new GroceryItemOrder("bread", 22, 3.50);
		GroceryItemOrder i8 = new GroceryItemOrder("coca cola", 22, 3.50);
		GroceryItemOrder i9 = new GroceryItemOrder("nutella", 22, 3.50);
		GroceryItemOrder i10 = new GroceryItemOrder("cupcakes", 22, 3.79790);
	
		GroceryList list1 = new GroceryList();
		list1.add(i1);
		list1.add(i2);
		list1.add(i3);
		list1.add(i4);
		list1.add(i5);
		list1.add(i6);
		list1.add(i7);
		list1.add(i8);
		list1.add(i9);
		list1.add(i10);
		
		System.out.println(list1.getTotalCost());
		
	}

}


//represents a list of items to buy from the market
class GroceryList {
	
	//use an array field to store the grocery items and to keep track of its size
	GroceryItemOrder[] list;
	private int numItems = 0;
	private static double price = 0;
	
	//constructs a new empty grocery list
	public GroceryList() {
		list = new GroceryItemOrder[10]; //at most 10 items in the list
	}
	
	
	//adds the given item order to this list if the list has fewer than 10 items 
	public void add(GroceryItemOrder item) {
		if(numItems < 10) {
			list[numItems] = item;
			numItems++;
			price += item.getCost();
		}
		
	}
	
	//returns the total sum cost of all grocery item orders in this list 
	public String getTotalCost() {
		return "$" + ((int)(price*100))/100.0;
	}
	
}


//represents a request to purchase a particular item in a given quantity
class GroceryItemOrder {
	
	//store an item quantity and a price per unit
	private int quantity;
	private double pricePerUnit;
	String name; 
	
	//constructs an item order to purchase the item with the given name,
	//	in the given quantity, which costs the given price per unit
	public GroceryItemOrder(String name, int quantity, double pricePerUnit) {
		this.name = name;
		this.quantity = quantity;
		this.pricePerUnit = pricePerUnit;
		
	}
	
	//returns the total cost of this item in its given quantity
	public double getCost() {
		return pricePerUnit*quantity;
	}
	
	//sets this grocery item's quantity to be the given value
	public void setQuantity(int quantity) {
		this.quantity = quantity; 
	}

	
}