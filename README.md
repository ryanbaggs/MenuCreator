# MenuCreator

This project provides a quick way to implement a menu for fast testing purposes.

Sets up a menu of specified options and requests input of options.

  1. Initialize (call setMenuOptions) the menuOptions Array with desired options 
  and their corresponding int values to select the options. Include the Exit option.
  
  2. Setup the options by overriding the selectionCases() method and using the option 
  parameter as the arg for the switch statement. Add the exit() method as one of the 
  options, which stops the loop and closes the Scanner.
  
  3. Call the displayMenu() method which runs a loop printing the options, requesting 
  input, and executing the methods provided in the selectionCases().
