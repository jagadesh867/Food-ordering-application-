import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Zomato");

        System.out.println("Enter your mobile.No");
        int mobileNumber = sc.nextInt();

        System.out.println("Food details");
        System.out.println("1.Idly");
        System.out.println("2.Dosa");
        System.out.println("3.Pizza");
        System.out.println("4.Burger");
        System.out.println("5.Biriyani");
        System.out.println("6.Noodles");
        System.out.println("7.Fried Rice");

        System.out.println("Please select your Food item");
        int foodItem = sc.nextInt();

        switch(foodItem) {
            case 1:
                System.out.println("You are choosing Idly");
                break;
            case 2:
                System.out.println("You are choosing Dosa");
                break;
            case 3:
                System.out.println("You are choosing Pizza");
                break;
            case 4:
                System.out.println("You are choosing Burger");
                break;
            case 5:
                System.out.println("You are choosing Biriyani");
                break;
            case 6:
                System.out.println("You are choosing Noodles");
                break;
            case 7:
                System.out.println("You are choosing Fried Rice");
                break;
        }

        System.out.println("Please select the Hotel");
        System.out.println("1.Sai sangeeth Hotel");
        System.out.println("2.Favourite Restaurent");
        System.out.println("3.Anbagam Restaurent");
        System.out.println("4.Al-Ameen Restaurent");

        int hotelChoice = sc.nextInt();

        switch(hotelChoice) {
            case 1:
                System.out.println("Review:");
                break;
            case 2:
                System.out.println("Review:");
                break;
            case 3:
                System.out.println("Review:");
                break;
            case 4:
                System.out.println("Review:");
                break;
            case 5:
                System.out.println("Review:");
                break;
        }

        if (foodItem == 1) {
            int idlyPrice = 12;
            if (hotelChoice == 1 || hotelChoice == 3) {
                System.out.println("1 Set = 12Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                idlyPrice = 12;
                System.out.println("Your Total bill is: " + (quantity * idlyPrice) + "Rs");
                System.out.println("Thankyou for your Order");
            }
            else {
                System.out.println("1 Set = 10Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                idlyPrice = 10;
                System.out.println("Your Total bill is: " + (quantity * idlyPrice) + "Rs");
                System.out.println("Thankyou for your Order");

            }
        }
        else if (foodItem == 2) {
            int dosaPrice = 35;
            if (hotelChoice == 1 || hotelChoice == 3) {
                System.out.println("1 Set = 35Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                dosaPrice = 35;
                System.out.println("Your Total bill is: " + (quantity * dosaPrice) + "Rs");
                System.out.println("Thankyou for your Order");
            }
            else {
                System.out.println("1 Set = 32Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                dosaPrice = 32;
                System.out.println("Your Total bill is: " + (quantity * dosaPrice) + "Rs");
                System.out.println("Thankyou for your Order");
            }
        }
        else if (foodItem == 3) {
            int pizzaPrice = 150;
            if (hotelChoice == 1 || hotelChoice == 3) {
                System.out.println("1 Pizza = 150Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                pizzaPrice = 150;
                System.out.println("Your Total bill is: " + (quantity * pizzaPrice) + "Rs");
                System.out.println("Thankyou for your Order");
            }
            else {
                System.out.println("1 Pizza = 130Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                pizzaPrice = 130;
                System.out.println("Your Total bill is: " + (quantity * pizzaPrice) + "Rs");
                System.out.println("Thankyou for your Order");
            }
        }
        else if (foodItem == 4) {
            int burgerPrice = 80;
            if (hotelChoice == 1 || hotelChoice == 3) {
                System.out.println("1 Set = 80Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                burgerPrice = 80;
                System.out.println("Your Total bill is: " + (quantity * burgerPrice) + "Rs");
                System.out.println("Thankyou for your Order");
            }
            else {
                System.out.println("1 Set = 75Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                burgerPrice = 75;
                System.out.println("Your Total bill is: " + (quantity * burgerPrice) + "Rs");
                System.out.println("Thankyou for your Order");
            }
        }
        else if (foodItem == 5) {
            int biriyaniPrice = 100;
            if (hotelChoice == 1 || hotelChoice == 3) {
                System.out.println("1 Parcel = 100Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                biriyaniPrice = 100;
                System.out.println("Your Total bill is: " + (quantity * biriyaniPrice) + "Rs");
                System.out.println("Thankyou for your Order");
            }
            else {
                System.out.println("1 Parcel = 100Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                biriyaniPrice = 100;
                System.out.println("Your Total bill is: " + (quantity * biriyaniPrice) + "Rs");
                System.out.println("Thankyou for your Order");
            }
        }
        else if (foodItem == 6) {
            int noodlesPrice = 100;
            if (hotelChoice == 1 || hotelChoice == 3) {
                System.out.println("1 Quantity = 100Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                noodlesPrice = 100;
                System.out.println("Your Total bill is: " + (quantity * noodlesPrice) + "Rs");
                System.out.println("Thankyou for your Order");
            }
            else {
                System.out.println("1 Quantity = 85Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                noodlesPrice = 85;
                System.out.println("Your Total bill is: " + (quantity * noodlesPrice) + "Rs");
                System.out.println("Thankyou for your Order");
            }
        }
        else {
            int friedRicePrice = 85;
            if (hotelChoice == 1 || hotelChoice == 3) {
                System.out.println("1 Quantity = 85Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                friedRicePrice = 85;
                System.out.println("Your Total bill is: " + (quantity * friedRicePrice) + "Rs");
                System.out.println("Thankyou for your Order");
            }
            else {
                System.out.println("1 Quantity = 80Rs");
                System.out.println("Enter your Food quantity");
                int quantity = sc.nextInt();
                friedRicePrice = 80;
                System.out.println("Your Total bill is: " + (quantity * friedRicePrice) + "Rs");
                System.out.println("Thankyou for your Order");
            }
        }

        sc.close();

    }
}