import java.util.ArrayList;
import java.util.HashMap;

/**
* Class MenuRegistry
* 
* @author  Gilgard
* @version 1.0
* @since   2020.10.22 
*/

public class MenuRegistry {
    private ArrayList<Dish> dishes;
    private HashMap<String, Menu> menus;

    /**
    * Constructs a MenuRegistry with empty ArrayList and HashMap
    */
    public MenuRegistry() {
        dishes = new ArrayList<>();
        menus = new HashMap<>();
    }

    
    /** 
     * Adds a dish to the list of dishes if it is not already added.
     * @param dish : Dish
     * @return boolean
     */
    public boolean add(Dish dish) {
        if(dishes.contains(dish)) return false;
        dishes.add(dish);
        return true;
    }

    
    /** 
     * Adds a menu to the map of menus under the name key if it is not already added
     * @param name : String
     * @param menu : Menu
     * @return boolean
     */
    public boolean add(String name, Menu menu) {
        if(menus.containsKey(name)) return false;
        for(Dish dish : menu.getDishes()) {
            add(dish);
        }
        menus.put(name, menu);
        return true;
    }

    
    /** 
     * Gets list of dishes
     * @return ArrayList<Dish>
     */
    public ArrayList<Dish> getDishes() {
        ArrayList<Dish> tempDishes = new ArrayList<>();
        for (int i = 0; i < dishes.size(); i++) {
            tempDishes.add(dishes.get(i));
        }
        return tempDishes;
    }

    
    /** 
     * Gets map of menus
     * @return HashMap<String, Menu>
     */
    public HashMap<String, Menu> getMenus() {
        HashMap<String, Menu> tempMenus = new HashMap<>();
        for(String i: menus.keySet()) {
            tempMenus.put(i, menus.get(i).clone());
        }
        return tempMenus;
    }

    
    /** 
     * Gets all the dishes of the given type
     * @param type : String
     * @return ArrayList<Dish>
     */
    public ArrayList<Dish> getTypeDishes(String type) {
        ArrayList<Dish> typeDishes = new ArrayList<Dish>();
        for (Dish dish: dishes) {
            if(dish.getType().compareTo(type) == 0) {
                typeDishes.add(dish);
            }
        }
        return typeDishes;
    }
    
    
    /** 
     * Gets the dish with the given name
     * @param name : String
     * @return Dish
     */
    public Dish getDish(String name) {
        for(Dish dish: dishes) {
            if(dish.getName().compareTo(name) == 0) return dish;
        }
        return null;
    }

    /** 
     * Gets a list of all menues under the given price
     * @param price : double
     * @return HashMap<String,Menu>
     */
    public HashMap<String,Menu> getMenus(double price){
        HashMap<String,Menu> pricedmenus = new HashMap<>();
        for(String key: menus.keySet()){
            if(menus.get(key).getTotalPrice() <= price) pricedmenus.put(key, menus.get(key));
        }
        return pricedmenus;
    }
    
    /** 
     * Makes a string with all the dishes and all the menus
     * @return String
     */
    public String toString() {
        String s = "Dishes:";
        for(Dish dish: dishes) {
            s += "\n" + dish.toString();
        }
        s += "\nMenus:";
        for(String name: menus.keySet()) {
            s += "\nName: " + name + "\n" + menus.get(name).toString();
        }
        return s;
    }

}
