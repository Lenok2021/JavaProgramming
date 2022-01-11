package HomeworkEncap;



public class Item {

// create  private instances
    private String name;
    private double unitPrice;
    private int quantity;

// create getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.isBlank()){
            System.out.println("Invalid name");
            System.exit(0);
        }

        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice<=0){
            System.err.println("Invalid price");
            System.exit(0);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity<=0){
            System.out.println("Invalid quantity");
            System.exit(0);
        }
        if(name.equalsIgnoreCase("toilet paper")){
            quantity=1;
        }
        this.quantity = quantity;
    }

    
}


/*
Item Task
		4.1create a class called Item
	            private variables:
	            	name, unitPrice, quantity
            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other
            			than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1

            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()

 */