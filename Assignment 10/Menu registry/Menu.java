import java.util.ArrayList;
/**
* Class Menu
*
* @author  Gilgard
* @version 1.0
* @since   2020.10.22 
*/
public class Menu {
    private ArrayList<Dish> dishes;
    private double totalPrice;

    /**
    * Constructs list of dishes and finds the total price
    * @param dishes : ArrayList<Dish>
    */
    public Menu(ArrayList<Dish> dishes) {
        this.dishes = dishes;
        this.totalPrice = 0;
        for(int i = 0; i < dishes.size(); i++) {
            totalPrice += dishes.get(i).getPrice();
        }
    }
    
    /** 
     * Adds the dish to the dishes
     * @param dish : Dish
     */
    public void add(Dish dish) {
        dishes.add(dish);
    }
    
    /** 
     * Gets the list of dishes
     * @return ArrayList<Dish>
     */
    public ArrayList<Dish> getDishes() {
        ArrayList<Dish> tempMenu = new ArrayList<Dish>();
        for (int i = 0; i < dishes.size(); i++) {
            tempMenu.add(dishes.get(i));
        }
        return tempMenu;
    }

    
    /** 
     * Gets the total price
     * @return double
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    public Menu clone() {
        return new Menu(dishes);
    }
    
    /** 
     * Makes a string of all dishes and the total price
     * @return String
     */
    public String toString() {
        String s = "Dishes: \n";
        for(int i = 0; i < dishes.size(); i++) {
            s += dishes.get(i).toStringMenu() + "\n" ;
        }
        s += "Total price: " + totalPrice;
        return s;
    }
}
