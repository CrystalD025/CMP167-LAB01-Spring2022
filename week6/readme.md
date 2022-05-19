#Method: a block of code to specifically execute one task , once created it can be called anywhere in the code 
##syntax of Method definition: 
	accessModifier staticOrNot dataTypeOfReturnValue nameOfMethod (parameterlist) ExceptionList
	{
	body
	}
	
-accessModifier: public, private, protected, default or package (optional)
-StaticOrNot: the static elements belong to the class and not the instance, static elements such as methods and variables will be able to access without creating objects (optional)
-dataTypeOfReturnValue: if it doesnt return anything it will be set as "void" (required)
-nameOfMethod: it shoudl start with letters, _ , $ (required)
-parameterlist: declaration of variables that will be used to execute the tasks, these or parameters are assigned a value at the moment the method is called (required)
-ExceptionList: (optional) set exceptions that will be triggered when an unexpected error occurs 
-body: surrounded by curly brackets, , contains the set of statements to execute a task (required)


##Examples 
	public static int sum(int a,  int b); //declaration of the method , abstract method bc no body has been defined 
	
	
	public static int product(int x, int y) //method definition, concrete method bc has a body defined 
	{
	
	return x*y;
	}

	public static int sumAll(int n, int m)
	{
	int sum = 0;
	for (int i=n, i<=m; i++) {
			sum +=n;
			
		}
		return sum;
	}
	
	
	
	public static void main (String [] args) { //main method
	
	
	
	}
	
	
#Method signature : nameOfMethod (DataTypes of parameters)



#method call: 
##syntax:
	nameOfMethod(ArgumentList);
	
-ArgumentList: values that will be assigned to he parameterList
 
##semantics:
-hold a space in memory and gives it as name the method call
-search for a method declaration and definition that matches the method signature of the method call
-if a match is found, assign the argument values to the parameters variables and execute the statements 
	-if there is a return statement, evaluate the expression and replace the method call with the resultant value, end the method call,free the space
	-if no return statement, end method call
-if a match is not found , error occurs, results in not compiling or 



#return statement 
##semantics:
-evaluate the expression 
-replace the method call with resultant value 
-end the method call 



	
	



