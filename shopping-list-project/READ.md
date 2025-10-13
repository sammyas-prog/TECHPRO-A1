Name: Samporna, Mohammad Ashrawi B.

Title: Shopping List Project

Description: This program shows a simple console-based shopping list application 
that ask the user to enter up to 5 items to buy, using a Scanner for input and an ArrayList to store them as strings,
it enforces non-empty entries by looping until exactly 5 valid items are added, rejecting empty inputs with an error message. 
Once collected, it displays the full list, reports the total number of items (always 5), 
and then asks for a search term, converting it to lowercase for a case-insensitive exact-match check against the list. 
If a match is found, it confirms the item is present. Otherwise, it states it's not, before closing the Scanner.

INPUT & OUTPUT:

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
