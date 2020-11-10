import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        MenuRegistry menuRegistry = new MenuRegistry();
        Dish starter1 = new Dish("Tomatsuppe", "Forret", 99, "Tomatboks, hvitløk, løk, chilly");
        Dish starter2 = new Dish("Sommerrull", "Forret", 102, "Kål, rispapir, scampi, avokado, dyppsaus");
        Dish main1 = new Dish("Okse entrecot", "Hovedrett", 190, "Entrecot, potet, rosenkål, skysaus");
        Dish main2 = new Dish("Torskefilet", "Hovedrett", 160, "Torsk, potetstappe, grønnkålchps, sellerirot, soyasmørsaus");
        Dish dessert1 = new Dish("Panna cotta", "Dessert", 101, "Panna cotta, limemarinerte skogsbær");
        Dish dessert2 = new Dish("Iskrem", "Dessert", 99, "sjokoladeis, vaniljeis, krokan");

        ArrayList<Dish> list = new ArrayList<>();
        list.add(starter1);
        list.add(main1);
        list.add(dessert1);

        Menu menu1 = new Menu(list);

        menuRegistry.add("Kjøttetern", menu1);

        list.clear();
        list.add(starter2);
        list.add(main2);
        list.add(dessert2);

        Menu menu2 = new Menu(list);

        menuRegistry.add("Peskitarianern", menu2);

        if(!menuRegistry.add(starter1)) System.out.println("Dish already added");

        System.out.println(menuRegistry.getDish("Tomatsuppe").toString() + "\n\n");

        ArrayList<Dish> starters = menuRegistry.getTypeDishes("Forret");
        String s = "";
        for(Dish dish: starters){
            s += dish.toStringMenu() + "\n";
        }
        System.out.println(s);

        HashMap<String,Menu> under = menuRegistry.getMenus(370);
        s = "";
        for(String i: under.keySet()){
            s += "Name: " + i + "\n" + under.get(i).toString() + "\n";
        }
        System.out.println(s);
    }
    
}
