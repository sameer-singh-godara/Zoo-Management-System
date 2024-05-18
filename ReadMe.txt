Assumptions:
1. I have made different ID's for Different Objects of Different Classes, which are starting from 0.
2. While Updating/Removing/Visiting/Viewing any Event or Object, you must know the ID of the Object.
3. We have to set the age limit by ourselves, else the limit for age will be from 0 to Maximum Value of Integer.
4. While Adding an Attraction, it is added, by default in Closed State, therefore we have to set the Attraction to Open in Schedule Events Section or Update Section.
5. Only Ticketed Visitors Are Added to particular Attraction.
6. All Visitors (whether ticketed or non-ticketed visitor) for Particular Attraction, who Visited that attraction, is Taken in Account for Most Popular Attraction.
7. Every Discount is by default in Valid State (open).
8. I have taken 2 types of Total Visitors in User Stats (Admin), one in which people visiting Animals are not Included, whereas in another one they are Included.
9. Revenue of the Zoo is the sum of price of tickets and membership given by the visitor.
10. There Can't be less than 2 Animals in each Sub-Class, hence you can't remove animal if they are going below 2.
11. I have created a list of tickets in Visitors account, and after visiting 1 attraction, particular attraction is removed.
12. View Special Deals before login section is removed and transferred in Admin and Visitor Section separately.
13. Follow the instruction which will be printed along the code flow, if there are some errors please ignore.
14. The Extreme age limit in the Discount Section are not included.
15. Every Variable which stores numeric data is in Integer, Except the balance of visitor.
16. Phone number Must be of 10 digits.
17. Email Should Contain Proper Local part and Domain part.
18. Every Coupon Code is CASE SENSITIVE.
19. The Person has to Apply Any One Coupon-Code, If any one Coupon Code is Valid. If he doesn't want any discount then He must Write "NONE"
20. In Condition when both Coupon-Code and Special Deal is applicable then first it will reduce price of the ticket by Coupon Code then Apply Deal Discount on the total Amount
21. I have initialized 6 animals for the Zoo (Lion, Monkey, Snake, Lizard, Frog, Tortoise)
22. I have initialized 2 Discount Coupon (MINOR10, SENIOR20)
23. I have initialized 2 Deals (for minimum no. of attraction to greater or equal to 2 and 3)
24. There Are no Attraction Initially so Add Accordingly


Concepts Used:
1. First of all, I have Admin as Parent Class which is extending to Visitor Class, so I have used Inheritance.
2. I have used Interface Events which is implemented in 2 Classes Animal and Attraction.
3. I have used Animals as an Abstract Parent Class whose Sub-Classes are Mammal, Reptile, and Amphibian, hence Inheritance is also used here.
4. I have used Polymorphism while implementing getFeed and description method in Animal and is over-ridded in all the Sub-Classes of Animal.
5. I have over-ridded the to-String method of Object Class in Animal, and it's Sub-Classes.
6. I have used to-String and equalsTo as Object Class Methods.
7. I have Created an Abstract Class named Offer for Over-ridding the abstract method.
8. I have used HashMap in order to store the Data of Every Mammal, Reptile, Amphibian, Animal, Attraction, Discount, Deal, Visitor, Feedback.


Commands:
1. mvn clean
2. mvn compile
3. mvn package
4. cd target
5. java -cp .\Assignment_2-1.0-SNAPSHOT.jar org.example.ZooTopia