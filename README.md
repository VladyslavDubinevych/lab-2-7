Lab 2
Task description:
Implement the hierarchy of classes for the task of lab №2(Camping. Implement the hierarchy of goods sold for those wishing to go camping). You should also create objects of the classes you have implemented in a separate Main class, which will contain the main method


Lab 3
Task description:
You need to create a class - Manager that will contain logic(example for variant 64):
Search for products that can be used for hiking. Display the result sorted by product weight and manufacturer name/ Implement the ability to sort by weight of goods. The implementation of sorting should provide the ability to sort both in descending and ascending order


Lab 4
Task description:
Convert a project with 2-3 labs' code so that its build can be done with maven.


Lab 5
Task description:
In 5th lab it is necessary to write modular tests for the code of labs №2-4 and to reach a level of coverage by tests of 80%.


Lab 6
Task description:
Two methods should be implemented for each of the Good's derived classes and in the Good class itself:

pubic String getHeaders () {…} - returns a string of attributes present in this class, separated by commas
pubic String toCSV () {...} - returns the value of the attributes (field values) of this object, separated by commas
The implementation of the toCSV method in child classes should also call this method from the parent class. Fields declared in the parent class must be converted to a comma-separated string in the parent class.
To implement a file entry, a separate Writer class must be implemented(GoodWriter), which will contain the public void writeToFile(List goods) method.
Also, checkstyle and spotbugs plugins should be added to pom.xml and the code should be tested with these parsers. Any errors that spotbugs will find should be fixed and the number of errors that checkstyle points out should be reduced too.


Lab 7
Task description:
Write the code for the task: Replace the addresses in the text with the words ADDRESS, where the address is presented in the form of cityName, p. StreetName, buildingNumber(eg Lviv, str Naukova, 7b).
The validity of the code should be checked through tests.
Performing operations on the text should be done with the help of objects(the use of static methods is prohibited).
