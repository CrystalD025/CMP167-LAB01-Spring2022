#Loops: a block of code that repeats itself. Counted or definite loops, and indefinite loops
#Iteration : a repetition, one complete cycle.

#while loops
##syntax:
	while (condition) {
		statements;
	}
##semantics:
-evaluate the condition
-if condition is true, execute inner statements
-if false, end loop
###sentinel value: a value that the while loop is always keeping an eye out for, if the sentinel valaue is given then at the next iteration the loop will end
	example sentinel value of -1
	while (n!= -1) {
		statements;
		n=input;
	}
	
	
###true
-it will run forever until there is a breaking condition inside 
###example:
	while (true) {
		statements;
		if (condition) {
			break;
		}
	}

###flag
- a boolean variable that is first set to true, and there is a condition inside the loop that will change the value in this flag

##example:
	while (flag) {
		statements;
		if (condition) {
			flag = false;
		}
	}



#incrementing
this while loop has a condition that will change as as the variable inside  will change every iteration 

	while (n<100) {
		statements;
		n++;
	}


#Do while loop
- this loop will at least repeat once without checking the condition 

##example:
	do {
		statements;
	} while(condition);
	
##semantics:
-step 1: execute inner statements
-step 2:check the while condition
-if condition is true, go to step 1
-if condition is false, end the loop.

#For loop
	for (start; stop; step) {
		statements;
	}
	
	
start: initialization code, or assignment code, or variable
stop: condition, if condition is false it will stop 
step: incrementing or decrementing code 

##semantics:
-1:run start code once
-2:check the stop condition
-3:if condition is true, execute inner statements, and then go to step code. go to step 2
-4:If condition is false, end loop

#For each loop 
	String [] names {"Crystal", "Max", "Tom"};
	for ( String tempName: names) {
		System.out.println(tempName);
	}





