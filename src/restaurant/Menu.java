package restaurant;

import java.util.ArrayList;

public class Menu {
    // consists of several menu items
    /*  appetizer,main,dessert */

    //fields
    public ArrayList<MenuItem> appetizers = new ArrayList<>();
    public ArrayList<MenuItem> main = new ArrayList<>();
    public ArrayList<MenuItem> dessert = new ArrayList<>();

    //contructor
    public Menu() {
        populateMenu();
    }
    // this gets the items from the dishes

    public MenuItem getAppetizer(int index) {
        return appetizers.get(index);
    }

    //public void setAppetizer(ArrayList<MenuItem> appetizer) {this.appetizer = appetizer;}

    public ArrayList<MenuItem> getMain() {
        return main;
    }

    //public void setMain(ArrayList<MenuItem> main) {this.main = main;}

    public ArrayList<MenuItem> getDessert() {
        return dessert;
    }

//    public void setDessert(ArrayList<MenuItem> dessert) {    this.dessert = dessert; }


    //return the apptetizers toString()
    public String getAllAppetizers() {
        String aMenu = "";
        aMenu += "Apptetizers:\n";
        for (int i = 0; i < appetizers.size(); i++) {
            MenuItem a = appetizers.get(i);

            aMenu +=   (i + 1) + ". " + a.toString() + "\n"; //A - is for apptetizer
        }
        return aMenu;
    }

    //return all Main dishes to string
    public String getAllMainDishes() {
        String aMenu = "";
        aMenu += "Main Dishes:\n";
        for (int i = 0;i< main.size();i++) {
            MenuItem a = main.get(i);
            aMenu += (i+1)+". "+a.toString() +"\n";
        }
        return aMenu;
    }

    //return all desserts to string
    public String getAllDesserts() {
        String aMenu ="";
        aMenu += "Desserts:\n";
        for (int i =0;i<dessert.size();i++) {
            MenuItem a = dessert.get(i);
            aMenu += (i+1)+". "+a.toString()+"\n";
        }
        return aMenu;
    }


    //create method to have all appteziers , main dishes and desserts
    public void populateMenu() {
        //apptizers
        appetizers.add(new MenuItem("Chicken65\t\t","Apptetizers", 6.00));
        appetizers.add(new MenuItem("Samosa\t\t\t", "Apptetizers", 1.00));
        appetizers.add(new MenuItem("Cutlet\t\t\t", "Apptetizers", 1.00));
        appetizers.add((new MenuItem("Chicken lolipop\t", "Apptetizers", 6.00)));

        //main dishes
        main.add(new MenuItem("Vegetable briyani\t", "Briyani", 7.99));
        main.add(new MenuItem("Egg Noodles\t\t\t", "Briyani", 8.99));
        main.add(new MenuItem("Chicken Dum briyani\t", "Briyani", 10.99));
        main.add(new MenuItem("Goat Chukka Briyani\t", "Briyani", 12.99));

        //dessert
        dessert.add(new MenuItem("Gluab Jamun(2 pieces)\t", "Dessert", 3.00));
        dessert.add(new MenuItem("Rasagulla(2 pieces)\t\t", "Dessert", 3.00));
        dessert.add(new MenuItem(" All Cakes(1 pieces)\t\t","Dessert",4.00));
    }

    //toString
    public String toString() {
        String menu = "";
        menu += " EverGreen Restaurant Menu \n"+ "--------------------------------------\n";
        menu += getAllAppetizers()+"\n";
        menu += getAllMainDishes()+"\n";
        menu += getAllDesserts()+"\n";
        return  menu;
    }

}
