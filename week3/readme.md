#String Formatting
## Format specifier
- %c  for char
- %f  for float, double
- %d  for int, char, etc
- %b  for byte
- %s  for String

## flags: +0-  for any type of data (the + sign will display the + sign in front of the data; - sign left justify) 
## width: minimum amount of character to display within the data 
## precision point: for floating point values: how many decimal places will be displayed after the point 
## precision point: for string literals: Maximum amount of characters that you want to display: if data is bigger than, data is going to be truncated (shortened).

##syntax:
"%(flag)(width)(.precision)specifier"

##example:
("The total is $ %.2f", 3.4);

output ---> The total is $3.40


# printf()
System.out.printf("The total is $ %.2f", 3.4); 


# format()
String message = String.format("The total is $ %.2f", 3.4);
System.out.println(message);
--> the total is $3.40




