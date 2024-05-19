public class Receipt {
    public static void main(String[] args) {

        System.out.println("Here's your receipt:\n");

        String[] Apples = {"Gala", "Granny Smith", "Macintosh"};

        double[] price = {1.99, 1.49, 1.29};

        for (int x = 0; x < Apples.length; x++) {
            System.out.println("\t" + Apples[x] + ": " + price[x] + ".");

   
        }

        System.out.println("\n What is the price of your sausages if you dont mind? ");

        String[] sausages = {"Cumberland", "Lincolnshire", "Chorizo", "Boerewors"};

        double[] price2 = {3.99, 2.99, 2.59, 6.47};

        for (int y = 0; y < sausages.length; y++) {
            System.out.println("\n " + sausages[y] + ": " + price2[y] + ".");

        }  

        System.out.println(" Im looking for the cans of coke. Do you know what isle they are in? ");

        String[] Drinks = {"Fanta", "Appleizer", "RolaCola", "Dr Pepper", "Coke", "Lucozade", "Ribena", "Ting", "Milkshake", "Water"};

        int[] isle = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};

        for (int d = 0; d < Drinks.length; d++) {

            if (Drinks[d].equals("Coke")) {
                System.out.println(" \n I believe the Coke is in isle : " + isle[d] + " .");
                break;
        }
  
        }

        System.out.println(" ");
        
        }

        }
