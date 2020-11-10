/**
* Class Dish
*
* @author  Gilgard
* @version 1.0
* @since   2020.10.22 
*/
public class Dish {
    private String name;
    private String type;
    private double price;
    private String recipe;

    /**
    * Constructor
    * @param name : String
    * @param type : String
    * @param price : double
    * @param recipe : String
    */
    public Dish(String name, String type, double price, String recipe){
        this.name = name;
        this.type = type;
        this.price = price;
        this.recipe = recipe;
    }

    
    /** 
     * Gets the name
     * @return String
     */
    public String getName() {
        return name;
    }

    
    /** 
     * Gets the type
     * @return String
     */
    public String getType() {
        return type;
    }

    
    /** 
     * Gets the price
     * @return double
     */
    public double getPrice() {
        return price;
    }

    
    /** 
     * Gets the recipe
     * @return String
     */
    public String getRecipe() {
        return recipe;
    }

    
    /** 
     * Checkes if the object is the same as this dish. By seeing if the object has the same name as this dish.
     * @param obj
     * @return boolean
     */
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(!(obj instanceof Dish)) return false;
        Dish dish = (Dish) obj;
        return getName().equals(dish.getName());
    }

    
    /** 
     * Makes a string for more estetic printing of menus
     * @return String
     */
    public String toStringMenu() {
        String s = String.format("Name: %s, Type: %s, Price: %.2f", name, type, price);
        return s;
    }

    
    /** 
     * Makes a string of all parameters
     * @return String
     */
    public String toString() {
        String s = String.format("Name: %s, Type: %s, Price: %.2f, Recipe: %s", name, type, price, recipe);
        return s;
    }
}
