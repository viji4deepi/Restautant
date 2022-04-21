package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    // consists of several menu items
    /*  appetizer,main,dessert */

    //fields
    private ArrayList<MenuItem> appetizers = new ArrayList<>();
    private ArrayList<MenuItem> main = new ArrayList<>();
    private ArrayList<MenuItem> dessert = new ArrayList<>();
    //last updated
    private Date lastUpdated;

    //contructor
    public Menu() {
        populateMenu();
        this.lastUpdated = new Date();

    }


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

    //LAST UPDATED


    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
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
