# Return Ready Part Time - Lab 18a

* Part A - Foundations 7.5
* Homework - TDD Lab
* Algo Challenge - 

## Pre-Recorded Lecture
* [link to video](https://vimeo.com/673309893)

## Part A
### Exercise 1 - Part 1

* Continue editing the `Activity01` project
	* The code for this is in the `part_a.activities.activity01` package.
* Create a Cell class that includes the following:
	* String name of the cell
	* Boolean describing whether the door is open
	* Two-argument constructor that sets both fields
* Modify the Prisoner class so that it:
	* Includes a Cell field
	* Sets the Cell field based on a constructor parameter
	* Print's the cell's name as part of the display() method.

### Exercise 1 - Part 2
* Write an openDoor() method in the Prisoner class
	* Access and modify the corresponding field in teh Cell object so that:
		* If the door is closed, open it
		* If the door is open , close it
	* Print whether the door opens or closes
* From the main method"
	* Instantiate a Cell and a Prisoner object
	* Call the prisoner's display() method once
	* Call the openDoor() method a few times 	   	

### Exercise 2 - Part 1

* Continue Editing the `Activity01` project
* Modify the `Cell` class:
	* Change its fields to private
* Does Intellij have any complaints?
	* What are the complaints?
	* Where do they occur?   

### Exercise 3 - Part 1

* Continue Editing the `Activity01` project
* Modify the `Cell` class so that ...
	* Getters exist for the name and isOpen fields
	* There's a private 4-digit security code field, it's initialized from the constructor and has no getter method.
	* There's a setter for opening/closing the door, and it does the following:
		* Accepts a security code as an argument
		* Prints if the code is incorrect
		* If the code is correct and the door is closed, opens it
		* If the code is correct and the door is open, closes it
		* Prints if the door is opened or closed  

### Exercise 3 - Part 2

* Modify the Prisoner class so that ...
	* The display() method prings the cell name
	* The openDoor() method is removed
* Modify the main method so that .. 
	* The Cell is instantiated properly
	* The prisoner no longer tries to open the cell door
	* It tests a cell class's ability to open and close its door
		* Try supplying both correct and incorrect security codes

### Exercise 4 - Part 1

* Continue Editing the `Activity01` project
* Encapsulate the Prisoner class
	* Make its fields private
	* Provide getters and setters for every field  

### Exercise 4 - Part 2

* Add unit test for `Cell`
* Add unit test for `Prisoner`

## Homework - TDD

### What is TDD

“Test-driven development” refers to a style of programming in which three activities are tightly interwoven: coding, testing (in the form of writing unit tests) and design ( in the form of refactoring)

**Refactoring** -  the process of restructuring computer code without changing or adding to its external behavior and functionality.

**Unit Test** -  the smallest piece of code that can be logically isolated in a system. In most programming languages, that’s a function, sub-routine or method.

### The TDD Process
* Write a test
* Run a test and see if it fails (Yay Failure!!)
* Write code
* Run the tests again (Hopefully it passes)
* Rewrite / Refactor code to make it more efficient
* Run Test again to make sure you didn’t break anything.

![](./assets/First-TDD.png)


### UML

UML - short for Unified Modeling Language, is a standardized modeling language consisting of an integrated set of diagrams, developed to help system and software developers for specifying, visualizing, constructing, and documenting the artifacts of software systems, as well as for business modeling and other non-software systems.

#### Types of UML

* Class 
* Component
* Deployment
* Object
* Package
* Sequence

We will be focusing on Class diagrams. Before you write any code to truly master the art of TDD, you must have a plan. Once you have your requirements, the next step is to model out your solution. This is done via UML Class Diagrams.

| Symbol | Meaning |
| :------: | :-------: |
|  | Default |
| +       | Public |
| - | Private |
| #| Protected |
| _ | Constructor |
| < > | Interface |


## Before you get started watch this

* [TDD walkthrough] (https://vimeo.com/673332417)


#### Camera

![](./assets/01camera.png)

Create a Class called RhinoCam with the following:

* Properties
	* make:String
	* model:String
	* year:Integer
	* Resolution:String
* Methods
	* A constructor that takes all the properties as parameters
	* A method called takePicture that returns the string "Picture Taken"
	* Getters and setters for all parameters 	


#### Printer

![](./assets/02printer.png)

Create a Class called RhinoPrint with the following:

* Properties
	* make:String
	* model:String
	* year:Integer
* Methods
	* A constructor that takes all the properties as parameters
	* A method called print that returns the string "Printing Now"
	* A method called scan that returns the string "Scanning Now"
	* Getters and setters for all parameters 

#### Radio

![](./assets/03radio.png)

* Properties
	* make:String
	* model:String
	* year:Integer
	* channel:Double
	* volume:Integer
* Methods
	* A constructor that 
		* Takes just make, model and year the properties as parameters.
		* The volumn should be set to 0 at construction
		* The channel should be set to 98.9 at construction
	* A method called channelUp that changes the channel up by 1 degree
	* A method called channelDown that changes the channel down by 1 degree
	* A method called volumeUp that changes the volume up by 1.
	* A method called volumeDown that changes the volume down by 1.
	* Getters and setters for all parameters 
	

#### Phone

![](./assets/09Phone.png)

* Properties
	* make:String
	* model:String
	* year:Integer
	* brand:String
	* phoneNumber:String
* Methods
	* A constructor that 
		* Takes just make, model and year the properties as parameters.
		* The volumn should be set to 0 at construction
		* The channel should be set to 98.9 at construction
	* A method called call 
		* that takes a string
		* if the string isn't formatted correctly like 215-555-1212
			* It returns a "invalid number"
		* If the string is formatted correctly
			* it returns the "successful call"
	* Getters and setters for all parameters Yea