Name: Samporna, Mohammad Ashrawi B.

Title: Shopping List Project

Description: This program shows a simple console-based shopping list application 
that ask the user to enter up to 5 items to buy, using a Scanner for input and an ArrayList to store them as strings,
it enforces non-empty entries by looping until exactly 5 valid items are added, rejecting empty inputs with an error message. 
Once collected, it displays the full list, reports the total number of items (always 5), 
and then asks for a search term, converting it to lowercase for a case-insensitive exact-match check against the list. 
If a match is found, it confirms the item is present. Otherwise, it states it's not, before closing the Scanner.

INPUT: 

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();
        int maxItems = 5;
        System.out.println("Enter up to 5 items to buy:");
        while (shoppingList.size() < maxItems) {
            System.out.print("Item " + (shoppingList.size() + 1) + ": ");
            String item = scanner.nextLine();
            if (!item.isEmpty()) {
                shoppingList.add(item);
            } else {
                System.out.println("Item cannot be empty. Try again.");
            }
        }
        System.out.println("\nYour shopping list:");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println("- " + shoppingList.get(i));
        }
        System.out.println("You entered " + shoppingList.size() + " items.");
        System.out.print("\nSearch for an item: ");
        String searchItem = scanner.nextLine().toLowerCase();
        boolean found = false;
        for (String item : shoppingList) {
            if (item.toLowerCase().equals(searchItem)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(searchItem + " is in your shopping list!");
        } else {
            System.out.println(searchItem + " is NOT in your shopping list.");
        }
        scanner.close();
    }
}

OUTPUT:

Enter up to 5 items to buy:
Item 1: apples

Item 2: 

Item cannot be empty. Try again.

Item 2: bananas

Item 3: milk

Item 4: bread

Item 5: eggs

Your shopping list:
- apples
- bananas
- milk
- bread
- eggs
You entered 5 items.

Search for an item: Milk
milk is in your shopping list!
