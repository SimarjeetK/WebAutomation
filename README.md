Project Structure

Main Folder
WebDriverBaseTest- This class is created using singleton design pattern and responsible of creating Thread safe single driver for a Test Suite.
BaseTestPage- This Class includes all the base functions having functions which is widely used before and after each Test method execution, to find elements and Common Methods.

Pages- Page Folder is having Locators.java which is nested interface built to store the Page Locators.
All Page Classes has elements specific to given project Pages in the application.
StringUtils.java - This Class is being used to declare all the Constant String which are being Used in the application. For UI verification of Labels it plays a Huge role.


Test Folder
Java Folder-Has All Test Scripts covering the different Flow of Test Scenarios.
Resource Folder - is being Used to keep the testng.xml file basically the Text Suite files which one need to run. It’s used to pass the Test data as well


POM.xml - This is build file for Maven Build Tool, where all the dependencies and Maven Build plugins are defined to fetch the dependencies at run time. 



###Postman Collections
One can downlaod the .json file inside this folder and run the Collections from Postman
by importing the same JSON File