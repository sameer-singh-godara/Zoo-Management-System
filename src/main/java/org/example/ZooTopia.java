package org.example;

import java.util.*;

public class ZooTopia {
    public static void main(String[] args) {
        int attractionId = 0;
        int animalId = 0;
        int visitorId = 0;
        int discountId = 0;
        int dealId = 0;
        int feedbackId = 0;
        float revenue = 0;
        int totalVisitorsVisited = 0;
        int totalVisitorsVisitedAnimalsIncluded = 0;
        int tryLogin = 5;

        Zoo zoo = new Zoo();
        System.out.println("--------------");
        System.out.println("Welcome to Zoo");
        String username = "admin";
        String password = "admin123";

        Mammal lion = new Mammal("Lion", animalId, "It lives in Den", "Roar");
        animalId++;
        zoo.addMammal(lion);
        Mammal monkey = new Mammal("Monkey", animalId, "It lives in Trees", "Hehehe");
        animalId++;
        zoo.addMammal(monkey);

        Reptile snake = new Reptile("Snake", animalId, "It Slides It doesn't has Legs", "Ssshhhh");
        animalId++;
        zoo.addReptile(snake);
        Reptile lizard = new Reptile("Lizard", animalId, "It Eats Mosquito", "sssssss");
        animalId++;
        zoo.addReptile(lizard);

        Amphibian frog = new Amphibian("Frog", animalId, "It lives in Pond", "trtrtr");
        animalId++;
        zoo.addAmphibian(frog);
        Amphibian tortoise = new Amphibian("Tortoise", animalId, "It Lives for very long Years", "tortoise sound");
        animalId++;
        zoo.addAmphibian(tortoise);

        Discount minor = new Discount("MINOR10", 0, 18,10, discountId, 1);
        discountId++;
        Discount senior = new Discount("SENIOR20", 60, Integer.MAX_VALUE,20, discountId, 1);
        discountId++;
        zoo.addDiscount(minor);
        zoo.addDiscount(senior);

        Deal two = new Deal(2,15, dealId, 1);
        dealId++;
        Deal three = new Deal(3,30, dealId, 1);
        dealId++;
        zoo.addDeal(two);
        zoo.addDeal(three);



        while(true){
            System.out.println("--------------");
            System.out.println("1. Enter As Admin");
            System.out.println("2. Enter As Visitor");
            System.out.println("3. Exit");
            System.out.println("Enter The Your Choice");
            Scanner sc = new Scanner(System.in);
            int firstChoice = sc.nextInt();
            sc.nextLine();
            if (firstChoice == 1){
                while (true) {
                    System.out.println("--------------");
                    System.out.println("Enter Admin Username");
                    String adminUsername = sc.nextLine();
                    System.out.println("Enter Admin Password");
                    String adminPassword = sc.nextLine();
                    if (Objects.equals(adminUsername, username) && Objects.equals(adminPassword, password)) {
                        System.out.println("You have entered Successfully as " + adminUsername);
                        tryLogin = 5;
                        while (true) {
                            System.out.println("--------------");
                            System.out.println("1. Manage Attraction");
                            System.out.println("2. Manage Animals");
                            System.out.println("3. Schedule Events");
                            System.out.println("4. Set Discounts");
                            System.out.println("5. Set Special Deals");
                            System.out.println("6. View Visitor Stats");
                            System.out.println("7. View Feedback");
                            System.out.println("8. Exit");
                            System.out.println("Enter The Your Choice");
                            int secondChoiceA = sc.nextInt();
                            sc.nextLine();
                            if (secondChoiceA == 1) {
                                while (true) {
                                    System.out.println("--------------");
                                    System.out.println("Manage Attractions");
                                    System.out.println("1. Add Attraction");
                                    System.out.println("2. Update Attraction");
                                    System.out.println("3. Remove Attraction");
                                    System.out.println("4. View All Attraction");
                                    System.out.println("5. Exit");
                                    System.out.println("Enter The Your Choice");
                                    int thirdChoiceA = sc.nextInt();
                                    sc.nextLine();

                                    if (thirdChoiceA == 1) {
                                        System.out.println("--------------");
                                        System.out.println("Enter Attraction Name");
                                        String nameAtt = sc.nextLine();
                                        System.out.println("Enter Attraction Description");
                                        String descriptionAtt = sc.nextLine();
                                        System.out.println("Enter Attraction Price");
                                        int priceAtt = sc.nextInt();
                                        sc.nextLine();
                                        Attraction attraction = new Attraction(nameAtt, descriptionAtt, attractionId, priceAtt, 0, 0, 0);
                                        zoo.addAttraction(attraction);
                                        System.out.println("The Attraction is Registered Successfully with ID : " + attractionId);
                                        attractionId++;

                                    } else if (thirdChoiceA == 2) {
                                        while (true) {
                                            System.out.println("--------------");
                                            System.out.println("Update Attraction");
                                            System.out.println("1. Update Name");
                                            System.out.println("2. Update Description");
                                            System.out.println("3. Update Price");
                                            System.out.println("4. Update Availability");
                                            System.out.println("5. Exit");
                                            System.out.println("Enter The Your Choice");
                                            int fourthChoiceA = sc.nextInt();
                                            sc.nextLine();
                                            if (fourthChoiceA == 1) {
                                                System.out.println("--------------");
                                                System.out.println("Enter Attraction ID");
                                                int idInput = sc.nextInt();
                                                sc.nextLine();
                                                System.out.println("Enter New Attraction Name");
                                                String nameNewAtt = sc.nextLine();
                                                zoo.updateAttractionName(idInput, nameNewAtt);
                                            } else if (fourthChoiceA == 2) {
                                                System.out.println("--------------");
                                                System.out.println("Enter Attraction ID");
                                                int idInput = sc.nextInt();
                                                sc.nextLine();
                                                System.out.println("Enter New Attraction Description");
                                                String descriptionNewAtt = sc.nextLine();
                                                zoo.updateAttractionDescription(idInput, descriptionNewAtt);
                                            } else if (fourthChoiceA == 3) {
                                                System.out.println("--------------");
                                                System.out.println("Enter Attraction ID");
                                                int idInput = sc.nextInt();
                                                System.out.println("Enter New Attraction Price");
                                                int priceNewAtt = sc.nextInt();
                                                sc.nextLine();
                                                zoo.updateAttractionPrice(idInput, priceNewAtt);
                                            } else if (fourthChoiceA == 4) {
                                                System.out.println("--------------");
                                                System.out.println("Enter Attraction ID");
                                                int idInput = sc.nextInt();
                                                System.out.println("Enter New Attraction Availability (write 1: for open and 0: for closed)");
                                                int openNewAtt = sc.nextInt();
                                                sc.nextLine();
                                                zoo.updateAttractionOpen(idInput, openNewAtt);
                                            } else if (fourthChoiceA == 5) {
                                                break;
                                            } else {
                                                System.out.println("Try Again Wrong Command");
                                            }
                                        }
                                    } else if (thirdChoiceA == 3) {
                                        System.out.println("--------------");
                                        System.out.println("Enter Attraction ID");
                                        int idInput = sc.nextInt();
                                        sc.nextLine();
                                        zoo.removeAttraction(idInput);
                                    } else if (thirdChoiceA == 4) {
                                        System.out.println("Attraction in the Zoo are as follows:");
                                        Attraction maxKey = null;
                                        Map<Integer, Attraction> attractionMap = zoo.getAttractions();
                                        HashMap<Integer, Attraction> attractions = zoo.getAttractions();
                                        for (Map.Entry<Integer, Attraction> entry : attractionMap.entrySet()) {
                                            maxKey = entry.getValue();
                                            if (maxKey != null) {
                                                if (maxKey.isOpen() == 1) {
                                                    System.out.println(maxKey + " ; Open");
                                                } else if (maxKey.isOpen() == 0) {
                                                    System.out.println(maxKey + " ; Closed");
                                                }
                                            }
                                        }
                                        if (maxKey.equals(null)){
                                            System.out.println("There Are No Attraction in Zoo");
                                        }
                                    } else if (thirdChoiceA == 5) {
                                        break;
                                    } else {
                                        System.out.println("Wrong Command Try Again");
                                    }
                                }
                            } else if (secondChoiceA == 2) {
                                while (true) {
                                    System.out.println("--------------");
                                    System.out.println("Manage Animals");
                                    System.out.println("1. Add Animal");
                                    System.out.println("2. Update Animal");
                                    System.out.println("3. Remove Animal");
                                    System.out.println("4. View All Animals");
                                    System.out.println("5. Exit");

                                    System.out.println("Enter The Your Choice");
                                    int thirdChoiceA = sc.nextInt();
                                    sc.nextLine();

                                    if (thirdChoiceA == 1) {
                                        System.out.println("--------------");
                                        System.out.println("Enter Animal Name");
                                        String nameAnimal = sc.nextLine();
                                        System.out.println("Enter Animal Description");
                                        String descriptionAnimal = sc.nextLine();
                                        System.out.println("Enter Animal Sound");
                                        String feedAnimal = sc.nextLine();
                                        while (true) {
                                            System.out.println("Enter Animal Type Choose Among These Only [Mammal, Reptile, Amphibian]");
                                            String animalType = sc.nextLine();
                                            animalType.toLowerCase();
                                            if (animalType.equals("mammal")) {
                                                Mammal animal = new Mammal(nameAnimal, animalId, descriptionAnimal, feedAnimal);
                                                zoo.addMammal(animal);
                                                break;
                                            } else if (animalType.equals("reptile")) {
                                                Reptile animal = new Reptile(nameAnimal, animalId, descriptionAnimal, feedAnimal);
                                                zoo.addReptile(animal);
                                                break;
                                            } else if (animalType.equals("amphibian")) {
                                                Amphibian animal = new Amphibian(nameAnimal, animalId, descriptionAnimal, feedAnimal);
                                                zoo.addAmphibian(animal);
                                                break;
                                            } else {
                                                System.out.println("Wrong Command Try Again");
                                            }
                                        }
                                        System.out.println("The Animal is Registered Successfully with ID : " + animalId);
                                        animalId++;

                                    } else if (thirdChoiceA == 2) {
                                        while (true) {
                                            System.out.println("--------------");
                                            System.out.println("Update Animal");
                                            System.out.println("1. Update Name");
                                            System.out.println("2. Update Description");
                                            System.out.println("3. Update Sound");
                                            System.out.println("4. Update Type");
                                            System.out.println("5. Exit");
                                            System.out.println("Enter The Your Choice");
                                            int fourthChoiceA = sc.nextInt();
                                            sc.nextLine();
                                            if (fourthChoiceA == 1) {
                                                System.out.println("--------------");
                                                System.out.println("Enter Animal ID");
                                                int idInput = sc.nextInt();
                                                sc.nextLine();
                                                System.out.println("Enter New Animal Name");
                                                String nameNewAnimal = sc.nextLine();
                                                zoo.updateAnimalName(idInput, nameNewAnimal);
                                            } else if (fourthChoiceA == 2) {
                                                System.out.println("--------------");
                                                System.out.println("Enter Animal ID");
                                                int idInput = sc.nextInt();
                                                sc.nextLine();
                                                System.out.println("Enter New Animal Description");
                                                String descriptionNewAnimal = sc.nextLine();
                                                zoo.updateAnimalDescription(idInput, descriptionNewAnimal);
                                            } else if (fourthChoiceA == 3) {
                                                System.out.println("--------------");
                                                System.out.println("Enter Animal ID");
                                                int idInput = sc.nextInt();
                                                System.out.println("Enter New Attraction Sound");
                                                String soundNewAnimal = sc.nextLine();
                                                sc.nextLine();
                                                zoo.updateAnimalSound(idInput, soundNewAnimal);
                                            } else if (fourthChoiceA == 4) {
                                                System.out.println("--------------");
                                                System.out.println("Enter Animal ID");
                                                int idInput = sc.nextInt();
                                                sc.nextLine();
                                                if (zoo.getAnimals().containsKey(idInput)){
                                                    String nameAnimal = zoo.getAnimals().get(idInput).getName();
                                                    String descriptionAnimal = zoo.getAnimals().get(idInput).getDescription();
                                                    String feedAnimal = zoo.getAnimals().get(idInput).getFeed();
                                                    zoo.removeAnimalUpdateType(idInput);
                                                    while (true) {
                                                        System.out.println("Enter Animal Type Choose Among These Only [Mammal, Reptile, Amphibian]");
                                                        String animalType = sc.nextLine();
                                                        animalType.toLowerCase();
                                                        if (animalType.equals("mammal")) {
                                                            Mammal animal = new Mammal(nameAnimal, idInput, descriptionAnimal, feedAnimal);
                                                            zoo.addMammal(animal);
                                                            System.out.println("Type of Animal with ID " + idInput + " has been updated to " + animal.getType());
                                                            break;
                                                        } else if (animalType.equals("reptile")) {
                                                            Reptile animal = new Reptile(nameAnimal, idInput, descriptionAnimal, feedAnimal);
                                                            zoo.addReptile(animal);
                                                            System.out.println("Type of Animal with ID " + idInput + " has been updated to " + animal.getType());
                                                            break;
                                                        } else if (animalType.equals("amphibian")) {
                                                            Amphibian animal = new Amphibian(nameAnimal, idInput, descriptionAnimal, feedAnimal);
                                                            zoo.addAmphibian(animal);
                                                            System.out.println("Type of Animal with ID " + idInput + " has been updated to " + animal.getType());
                                                            break;
                                                        } else {
                                                            System.out.println("Wrong Command Try Again");
                                                        }
                                                    }
                                                }
                                            } else if (fourthChoiceA == 5) {
                                                break;
                                            } else {
                                                System.out.println("Try Again Wrong Command");
                                            }
                                        }
                                    } else if (thirdChoiceA == 3) {
                                        System.out.println("--------------");
                                        System.out.println("Enter Animal ID");
                                        int idInput = sc.nextInt();
                                        sc.nextLine();
                                        zoo.removeAnimal(idInput);
                                    } else if (thirdChoiceA == 4) {
                                        System.out.println("Animals in the Zoo are as follows:");
                                        Animal maxKey = null;
                                        Map<Integer, Animal> animalMap = zoo.getAnimals();
                                        HashMap<Integer, Animal> animals = zoo.getAnimals();
                                        for (Map.Entry<Integer, Animal> entry : animalMap.entrySet()) {
                                            maxKey = entry.getValue();
                                            if (maxKey != null) {
                                                System.out.println(maxKey);
                                            }
                                        }
                                    } else if (thirdChoiceA == 5) {
                                        break;
                                    } else {
                                        System.out.println("Wrong Command Try Again");
                                    }
                                }
                            }
                            else if (secondChoiceA == 3) {
                                while (true) {
                                    System.out.println("--------------");
                                    System.out.println("Schedule Events:");
                                    System.out.println("1. Set Price");
                                    System.out.println("2. Set Availability");
                                    System.out.println("3. Exit");
                                    System.out.println("Enter The Your Choice");
                                    int fourthChoiceA = sc.nextInt();
                                    sc.nextLine();
                                    if (fourthChoiceA == 1) {
                                        System.out.println("--------------");
                                        System.out.println("Enter Attraction ID");
                                        int idInput = sc.nextInt();
                                        System.out.println("Enter New Attraction Price");
                                        int priceNewAtt = sc.nextInt();
                                        sc.nextLine();
                                        zoo.updateAttractionPrice(idInput, priceNewAtt);
                                    } else if (fourthChoiceA == 2) {
                                        System.out.println("--------------");
                                        System.out.println("Enter Attraction ID");
                                        int idInput = sc.nextInt();
                                        System.out.println("Enter New Attraction Availability (write 1: for open and 0: for closed)");
                                        int openNewAtt = sc.nextInt();
                                        sc.nextLine();
                                        zoo.updateAttractionOpen(idInput, openNewAtt);
                                    } else if (fourthChoiceA == 3) {
                                        break;
                                    } else {
                                        System.out.println("Try Again Wrong Command");
                                    }
                                }
                            } else if (secondChoiceA == 4) {
                                while (true) {
                                    System.out.println("--------------");
                                    System.out.println("Set Discount");
                                    System.out.println("1. Add New Discount");
                                    System.out.println("2. Update Discount");
                                    System.out.println("3. Remove Discount");
                                    System.out.println("4. View All Discounts");
                                    System.out.println("5. Exit");
                                    System.out.println("Enter The Your Choice");
                                    int thirdChoiceA = sc.nextInt();
                                    sc.nextLine();
                                    if (thirdChoiceA == 1) {
                                        int lowerDiscountAge = 0;
                                        int upperDiscountAge = Integer.MAX_VALUE;
                                        System.out.println("--------------");
                                        System.out.println("Add New Discount");
                                        System.out.println("Enter Coupon Code");
                                        String discountCode = sc.nextLine();
                                        while (true) {
                                            System.out.println("Enter Age Limit");
                                            System.out.println("1. Set Lower Age (Else it Would be Set to 0)");
                                            System.out.println("2. Set Upper Age (Else it Would be Set to Maximum Value of Integer)");
                                            System.out.println("3. Exit");
                                            System.out.println("Enter The Your Choice");
                                            int fourthChoiceA = sc.nextInt();
                                            sc.nextLine();
                                            if (fourthChoiceA == 1) {
                                                System.out.println("Enter The Lower Age Limit");
                                                int lowerAge = sc.nextInt();
                                                sc.nextLine();
                                                lowerDiscountAge = lowerAge;
                                            } else if (fourthChoiceA == 2) {
                                                System.out.println("Enter The Upper Age Limit");
                                                int upperAge = sc.nextInt();
                                                sc.nextLine();
                                                upperDiscountAge = upperAge;
                                            } else if (fourthChoiceA == 3) {
                                                break;
                                            } else {
                                                System.out.println("You have Entered Wrong Command Try Again");
                                            }
                                        }
                                        System.out.println("Enter Percentage");
                                        int percentageDiscount = sc.nextInt();
                                        sc.nextLine();
                                        Discount discount = new Discount(discountCode, lowerDiscountAge, upperDiscountAge, percentageDiscount, discountId, 1);
                                        zoo.addDiscount(discount);
                                        System.out.println("The Discount is Added Successfully with Code : " + discount.getCode());
                                        discountId++;
                                    } else if (thirdChoiceA == 2) {
                                        while (true) {
                                            System.out.println("--------------");
                                            System.out.println("Update Discount");
                                            System.out.println("1. Update Lower Limit of Discount");
                                            System.out.println("2. Update Upper Limit of Discount");
                                            System.out.println("3. Update Percentage of Discount");
                                            System.out.println("4. Update Validity of Discount");
                                            System.out.println("5. Exit");
                                            System.out.println("Enter The Your Choice");
                                            int fourthChoiceA = sc.nextInt();
                                            sc.nextLine();
                                            if (fourthChoiceA == 1) {
                                                System.out.println("Enter The Coupon Code");
                                                String couponCode = sc.nextLine();
                                                System.out.println("Enter the New Lower Limit");
                                                int lowerNewAge = sc.nextInt();
                                                sc.nextLine();
                                                zoo.updateLowerLimitDiscount(couponCode, lowerNewAge);
                                            } else if (fourthChoiceA == 2) {
                                                System.out.println("Enter The Coupon Code");
                                                String couponCode = sc.nextLine();
                                                System.out.println("Enter the New Upper Limit");
                                                int upperNewAge = sc.nextInt();
                                                sc.nextLine();
                                                zoo.updateUpperLimitDiscount(couponCode, upperNewAge);
                                            } else if (fourthChoiceA == 3) {
                                                System.out.println("Enter The Coupon Code");
                                                String couponCode = sc.nextLine();
                                                System.out.println("Enter the New Percentage");
                                                int newPercentage = sc.nextInt();
                                                sc.nextLine();
                                                zoo.updatePercentageDiscount(couponCode, newPercentage);
                                            } else if (fourthChoiceA == 4) {
                                                System.out.println("Enter The Coupon Code");
                                                String couponCode = sc.nextLine();
                                                System.out.println("Enter the New Validity (0: for In-Valid & 1: for Valid)");
                                                int isOpen = sc.nextInt();
                                                sc.nextLine();
                                                zoo.updateValidityDiscount(couponCode, isOpen);
                                            } else if (fourthChoiceA == 5) {
                                                break;
                                            } else {
                                                System.out.println("Wrong Command Try Again");
                                            }
                                        }
                                    } else if (thirdChoiceA == 3) {
                                        System.out.println("--------------");
                                        System.out.println("Remove Discount from Data-Base");
                                        System.out.println("Enter The Coupon Code");
                                        String couponCode = sc.nextLine();
                                        zoo.removeDiscount(couponCode);
                                    } else if (thirdChoiceA == 4) {
                                        System.out.println("View Discounts");
                                        Discount maxKey;
                                        Map<String, Discount> discountMap = zoo.getDiscounts();
                                        HashMap<String, Discount> discounts = zoo.getDiscounts();
                                        for (Map.Entry<String, Discount> entry : discountMap.entrySet()) {
                                            maxKey = entry.getValue();
                                            if (maxKey != null) {
                                                if (maxKey.getIsOpen() == 1){
                                                    System.out.println(maxKey + " ; Age-Range: [" + maxKey.getLowerAge() + " to " + maxKey.getUpperAge() + "] ; Open" );
                                                }
                                                else {
                                                    System.out.println(maxKey + " ; Age-Range: [" + maxKey.getLowerAge() + " to " + maxKey.getUpperAge() + "] ; Closed" );
                                                }
                                            }
                                        }
                                    } else if (thirdChoiceA == 5) {
                                        break;
                                    } else {
                                        System.out.println("Wrong Command Try Again");
                                    }
                                }
                            } else if (secondChoiceA == 5) {
                                while (true) {
                                    System.out.println("--------------");
                                    System.out.println("Special Deals");
                                    System.out.println("1. Add Deal");
                                    System.out.println("2. Update Deal");
                                    System.out.println("3. Remove Deal");
                                    System.out.println("4. View All Deals");
                                    System.out.println("5. Exit");
                                    System.out.println("Enter The Your Choice");
                                    int thirdChoiceA = sc.nextInt();
                                    sc.nextLine();
                                    if (thirdChoiceA == 1) {
                                        System.out.println("--------------");
                                        System.out.println("Add Deal");
                                        System.out.println("Enter Minimum Number of Ticket for Deal");
                                        int minimumTicket = sc.nextInt();
                                        sc.nextLine();
                                        System.out.println("Enter Discount Percentage for Deal");
                                        int percentage = sc.nextInt();
                                        sc.nextLine();
                                        Deal deal = new Deal(minimumTicket, percentage, dealId, 1);
                                        zoo.addDeal(deal);
                                        System.out.println("Deal Has been added Successfully");
                                        dealId++;
                                    } else if (thirdChoiceA == 2) {
                                        while (true) {
                                            System.out.println("--------------");
                                            System.out.println("Update Deal");
                                            System.out.println("1. Update Minimum No. of Tickets for Deal");
                                            System.out.println("2. Update Discount Percentage for Deal");
                                            System.out.println("3. Update Validity for Deal");
                                            System.out.println("4. Exit");
                                            System.out.println("Enter The Your Choice");
                                            int fourthChoiceA = sc.nextInt();
                                            sc.nextLine();
                                            System.out.println("--------------");
                                            if (fourthChoiceA == 1) {
                                                System.out.println("Enter Deal ID whose Minimum No. of Ticket You Want to Change");
                                                int idInput = sc.nextInt();
                                                sc.nextLine();
                                                System.out.println("Enter the New Minimum No. of Ticket");
                                                int minimumNewTicket = sc.nextInt();
                                                sc.nextLine();
                                                zoo.updateMinTicketDeal(idInput, minimumNewTicket);
                                            } else if (fourthChoiceA == 2) {
                                                System.out.println("Enter Deal ID whose Percentage of Discount You Want to Change");
                                                int idInput = sc.nextInt();
                                                sc.nextLine();
                                                System.out.println("Enter the Percentage of Discount");
                                                int percentage = sc.nextInt();
                                                sc.nextLine();
                                                zoo.updatePercentageDeal(idInput, percentage);
                                            } else if (fourthChoiceA == 3) {
                                                System.out.println("Enter Deal ID whose Validity You Want to Change");
                                                int idInput = sc.nextInt();
                                                sc.nextLine();
                                                System.out.println("Enter Validity (write 1: for Valid and 0: for In-Valid)");
                                                int isOpen = sc.nextInt();
                                                sc.nextLine();
                                                zoo.updateValidityDeal(idInput, isOpen);
                                            } else if (fourthChoiceA == 4) {
                                                break;
                                            } else {
                                                System.out.println("Wrong Command Try Again");
                                            }
                                        }
                                    } else if (thirdChoiceA == 3) {
                                        System.out.println("--------------");
                                        System.out.println("Remove Deal from Data-Base");
                                        System.out.println("Enter Deal ID");
                                        int idInput = sc.nextInt();
                                        sc.nextLine();
                                        zoo.removeDeal(idInput);
                                    } else if (thirdChoiceA == 4) {
                                        System.out.println("--------------");
                                        System.out.println("View Deals");
                                        Deal maxKey;
                                        Map<Integer, Deal> dealMap = zoo.getDeals();
                                        HashMap<Integer, Deal> deals = zoo.getDeals();
                                        for (Map.Entry<Integer, Deal> entry : dealMap.entrySet()) {
                                            maxKey = entry.getValue();
                                            if (maxKey != null) {
                                                if (maxKey.getIsOpen() == 1){
                                                    System.out.println("ID: " + maxKey.getId() + " ; " + maxKey + " ; Open");
                                                }
                                                else {
                                                    System.out.println("ID: " + maxKey.getId() + " ; " + maxKey + " ; Closed");
                                                }
                                            }
                                        }
                                    } else if (thirdChoiceA == 5) {
                                        break;
                                    } else {
                                        System.out.println("Wrong Command Try Again");
                                    }
                                }
                            } else if (secondChoiceA == 6) {
                                System.out.println("--------------");
                                System.out.println("Visitor Statistics");
                                System.out.println("1. Total number of Visitors Visited Attraction : " + totalVisitorsVisited);
                                System.out.println("2. Total number of Visitors Visited Attraction including Animals: " + totalVisitorsVisitedAnimalsIncluded);
                                System.out.println("3. Total Revenue of Zoo : ₹" + revenue);
                                /* finding attraction with maximum visitors */
                                int max = 0;
                                Attraction maxKey = null;
                                Map<Integer, Attraction> attractionHashMap = zoo.getAttractions();
                                for (Map.Entry<Integer, Attraction> entry : attractionHashMap.entrySet()) {

                                    int val = (entry.getValue()).getTotalVisitors();
                                    if (val > max) {
                                        max = val;
                                        maxKey = entry.getValue();
                                    }
                                }
                                if (maxKey != null) {
                                    System.out.println("4. Most Popular Attraction : " + maxKey.getName());
                                } else {
                                    System.out.println("4. There Are No Attraction Hence No Popular Attraction");
                                }
                            } else if (secondChoiceA == 7) {
                                System.out.println("--------------");
                                System.out.println("Feedbacks of Visitors are as follows:");
                                Map<Integer, String> feedbacksHashMap = zoo.getFeedbacks();
                                String keyValue = null;
                                for (Map.Entry<Integer, String> entry : feedbacksHashMap.entrySet()) {
                                    keyValue = entry.getValue();
                                    if (keyValue != null) {
                                        System.out.println("Feedback ID: " + entry.getKey() + " - Feedback: " + entry.getValue());
                                    }
                                }
                                if (keyValue == null) {
                                    System.out.println("No Feedbacks Given by Visitor Yet");
                                }

                            }
                            else if (secondChoiceA == 8) {
                                System.out.println("--------------");
                                System.out.println("Exited Successfully");
                                break;
                            }
                            else {
                                System.out.println("Wrong Command Try Again");
                            }
                        }
                    }
                    else {
                        if (tryLogin > 0) {
                            System.out.println("--------------");
                            System.out.println("You have entered wrong username or password Try Again");
                            System.out.println("Tries Left : " + tryLogin);
                            tryLogin--;
                            continue;
                        }
                        else {
                            System.out.println("--------------");
                            System.out.println("You Don't Know Either Username or Password");
                            System.out.println("Therefore Exited");
                            break;
                        }
                    }
                    break;
                }
            }
            else if (firstChoice == 2){
                while(true){
                    System.out.println("--------------");
                    System.out.println("1. Register");
                    System.out.println("2. Login");
                    System.out.println("3. Exit");
                    System.out.println("Enter The Your Choice");
                    int secondChoiceV = sc.nextInt();
                    sc.nextLine();
                    if (secondChoiceV == 1){
                        int flag = 0;
                        System.out.println("--------------");
                        System.out.println("Enter Visitor Name");
                        String name = sc.nextLine();
                        System.out.println("Enter Visitor Age");
                        int age = sc.nextInt();
                        String phoneNumber;

                        while (true){
                            System.out.println("Enter Visitor Phone Number");
                            phoneNumber = sc.next();
                            sc.nextLine();
                            if (zoo.isValidPhoneNumber(phoneNumber)){
                                flag = 0;
                                break;
                            }
                            else {
                                flag = 1;
                            }
                        }
                        System.out.println("Enter Visitor Balance");
                        float balance = sc.nextFloat();
                        sc.nextLine();
                        String email;
                        while (true){
                            System.out.println("Enter Visitor Email ID");
                            email = sc.next();
                            if (zoo.isValidEmail(email)){
                                flag = 0;
                                break;
                            }
                            else {
                                flag = 1;
                            }
                        }
                        System.out.println("Enter Visitor Password");
                        String passwordVisitor = sc.next();
                        Visitor visitor = new Visitor(name, age, phoneNumber, balance, email, passwordVisitor, visitorId);
                        zoo.addVisitor(visitor);
                        System.out.println("Visitor is Successfully registered with ID : "+ visitorId);
                        visitorId++;

                    }
                    else if (secondChoiceV == 2) {
                        while (true) {
                            String usernameVisitor;
                            while (true) {
                                System.out.println("Enter Visitor Email ID");
                                usernameVisitor = sc.next();
                                if (zoo.isValidEmail(usernameVisitor)) {
                                    break;
                                }
                            }
                            System.out.println("Enter Visitor Password");
                            String passwordVisitor = sc.next();
                            HashMap<Integer, Visitor> visitorHashMap = zoo.getVisitors();
                            Collection<Visitor> value1 = visitorHashMap.values();
                            ArrayList<Visitor> visitorsList = new ArrayList<>(value1);
                            if (visitorHashMap.isEmpty()) {
                                System.out.println("Member Doesn't Exist Try Again First Enter Some Members");
                            } else {
                                int flag = 0;
                                for (Visitor visitor : visitorsList) {
                                    if (usernameVisitor.equals(visitor.getUsername()) && passwordVisitor.equals(visitor.getPassword())) {
                                        flag = 1;
                                        System.out.println("Hi " + visitor.getName() + ", You Have Logged In Successfully");
                                        while (true) {
                                            tryLogin = 5;
                                            System.out.println("--------------");
                                            System.out.println("1. Explore Zoo");
                                            System.out.println("2. Buy Membership");
                                            System.out.println("3. Buy Tickets");
                                            System.out.println("4. View Discounts");
                                            System.out.println("5. View Special Deals");
                                            System.out.println("6. Visit Animals");
                                            System.out.println("7. Visit Attraction");
                                            System.out.println("8. Leave Feedback");
                                            System.out.println("9. Recharge Balance");
                                            System.out.println("10. Exit");
                                            System.out.println("Enter The Your Choice");
                                            int thirdChoiceV = sc.nextInt();
                                            sc.nextLine();

                                            if (thirdChoiceV == 1) {
                                                System.out.println("--------------");
                                                System.out.println("Explore Zoo");
                                                while (true) {
                                                    System.out.println("--------------");
                                                    System.out.println("1. View Animals");
                                                    System.out.println("2. View Attraction");
                                                    System.out.println("3. Exit");
                                                    System.out.println("Enter The Your Choice");
                                                    int fourthChoiceV = sc.nextInt();
                                                    sc.nextLine();
                                                    if (fourthChoiceV == 1) {
                                                        System.out.println("--------------");
                                                        System.out.println("Animals in the Zoo are as follows:");
                                                        Animal maxKey = null;
                                                        Map<Integer, Animal> animalMap = zoo.getAnimals();
                                                        HashMap<Integer, Animal> animals = zoo.getAnimals();
                                                        for (Map.Entry<Integer, Animal> entry : animalMap.entrySet()) {
                                                            maxKey = entry.getValue();
                                                            if (maxKey != null) {
                                                                System.out.println(maxKey);
                                                            }
                                                        }
                                                        if (maxKey != null) {
                                                            System.out.println("Enter the ID for Animal's Description You Want To See (To Exit this section, Enter Number other than the ID's mentioned)");
                                                            int fifthChoiceV = sc.nextInt();
                                                            if (animals.containsKey(fifthChoiceV)) {
                                                                System.out.println(animals.get(fifthChoiceV).getName() + "'s Description: " + animals.get(fifthChoiceV).getDescription());
                                                            } else {
                                                                System.out.println("--------------");
                                                                System.out.println("You Entered Wrong Command, Hence Exited");
                                                            }
                                                        } else {
                                                            System.out.println("There are no Animals in the Zoo");
                                                        }
                                                    } else if (fourthChoiceV == 2) {
                                                        System.out.println("--------------");
                                                        System.out.println("Attraction in the Zoo are as follows:");
                                                        Attraction maxKey = null;
                                                        Map<Integer, Attraction> attractionMap = zoo.getAttractions();
                                                        HashMap<Integer, Attraction> attractions = zoo.getAttractions();
                                                        for (Map.Entry<Integer, Attraction> entry : attractionMap.entrySet()) {
                                                            maxKey = entry.getValue();
                                                            if (maxKey != null) {
                                                                if (maxKey.isOpen() == 1) {
                                                                    System.out.println(maxKey + " - Open");
                                                                } else if (maxKey.isOpen() == 0) {
                                                                    System.out.println(maxKey + " - Closed");
                                                                }
                                                            }
                                                        }
                                                        if (maxKey != null) {
                                                            System.out.println("Enter The ID for Attraction's Description You Want To See (To Exit this section, Enter Number other than the ID's mentioned)");
                                                            int fifthChoiceV = sc.nextInt();
                                                            if (attractions.containsKey(fifthChoiceV)) {
                                                                System.out.print(attractions.get(fifthChoiceV).getName() + "'s Description: " + attractions.get(fifthChoiceV).getDescription());
                                                            } else {
                                                                System.out.println("--------------");
                                                                System.out.println("You Entered Wrong Command, Hence Exited");
                                                            }
                                                        } else {
                                                            System.out.println("There are no Attraction in the Zoo");
                                                        }
                                                    } else if (fourthChoiceV == 3) {
                                                        break;
                                                    } else {
                                                        System.out.println("--------------");
                                                        System.out.println("Wrong Command Try Again");
                                                    }
                                                }
                                            } else if (thirdChoiceV == 2) {
                                                while (true) {
                                                    if (visitor.getMembership() == 0) {
                                                        System.out.println("--------------");
                                                        System.out.println("Buy Membership:");
                                                        System.out.println("1. Basic Membership (₹20)");
                                                        System.out.println("2. Premium Membership (₹50)");
                                                        System.out.println("3. Exit");
                                                        System.out.println("Enter The Your Choice");

                                                        int fourthChoiceV = sc.nextInt();
                                                        sc.nextLine();
                                                        if (fourthChoiceV == 1) {
                                                            ////////// Discount Coupon Section
                                                            float price = 20;
                                                            float discountPercentage;
                                                            Discount sampleDiscount = null;
                                                            int flag2 = 0;
                                                            System.out.println("--------------");
                                                            System.out.println("These Are The Valid Coupons Available for You Choose Any One of Them (CASE-SENSITIVE)");
                                                            Map<String, Discount> discountMap = zoo.getDiscounts();
                                                            HashMap<String, Discount> discounts = zoo.getDiscounts();
                                                            HashMap<String, Float> discountsVisitor = new HashMap<>();
                                                            for (Map.Entry<String, Discount> entry : discountMap.entrySet()) {
                                                                sampleDiscount = entry.getValue();
                                                                if (sampleDiscount != null) {
                                                                    if (sampleDiscount.getIsOpen() == 1 && sampleDiscount.getUpperAge()>visitor.getAge() && sampleDiscount.getLowerAge()<visitor.getAge()){
                                                                        System.out.println(sampleDiscount);
                                                                        discountsVisitor.put(sampleDiscount.getCode(), sampleDiscount.getPercentage());
                                                                        flag2 = 1;
                                                                    }
                                                                }
                                                            }
                                                            if (sampleDiscount != null && flag2 == 1) {
                                                                System.out.println("Discount Percentage: 0% ; Coupon-Code: NONE");
                                                                while (true) {
                                                                    System.out.println("Enter Coupon Code");
                                                                    String couponInput = sc.nextLine();
                                                                    if (discountsVisitor.containsKey(couponInput)) {
                                                                        discountPercentage = discountsVisitor.get(couponInput);
                                                                        break;
                                                                    } else if (couponInput.equals("NONE")) {
                                                                        discountPercentage = 0;
                                                                        break;
                                                                    } else {
                                                                        System.out.println("Enter Correct Coupon Code");
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                discountPercentage = 0;
                                                                System.out.println("There Are No Valid Coupons for You");
                                                            }
                                                            price = (price - (price*((discountPercentage)/100)));
                                                            /////////////
                                                            if (visitor.getBalance() >= price) {
                                                                visitor.setMembership(1);
                                                                float balanceV = visitor.getBalance();
                                                                visitor.setBalance(balanceV - price);
                                                                System.out.println("You have Successfully Purchased Basic Membership");
                                                                System.out.println("Your balance is: ₹" + visitor.getBalance());
                                                                revenue += price;
                                                                break;
                                                            }
                                                            else {
                                                                System.out.println("Low Balance Recharge Your Balance");
                                                                System.out.println("Your balance is: ₹" + visitor.getBalance());
                                                                break;
                                                            }
                                                        }
                                                        else if (fourthChoiceV == 2) {
                                                            ////////// Discount Coupon Section
                                                            float price = 50;
                                                            float discountPercentage;
                                                            int flag2 = 0;
                                                            Discount sampleDiscount = null;
                                                            System.out.println("--------------");
                                                            System.out.println("These Are The Valid Coupons Available for You Choose Any One of Them (CASE-SENSITIVE)");
                                                            Map<String, Discount> discountMap = zoo.getDiscounts();
                                                            HashMap<String, Discount> discounts = zoo.getDiscounts();
                                                            HashMap<String, Float> discountsVisitor = new HashMap<>();
                                                            for (Map.Entry<String, Discount> entry : discountMap.entrySet()) {
                                                                sampleDiscount = entry.getValue();
                                                                if (sampleDiscount != null) {
                                                                    if (sampleDiscount.getIsOpen() == 1 && sampleDiscount.getUpperAge()>visitor.getAge() && sampleDiscount.getLowerAge()<visitor.getAge()){
                                                                        System.out.println(sampleDiscount);
                                                                        discountsVisitor.put(sampleDiscount.getCode(), sampleDiscount.getPercentage());
                                                                        flag2 = 1;
                                                                    }
                                                                }
                                                            }
                                                            if (sampleDiscount != null && flag2 == 1) {
                                                                System.out.println("Discount Percentage: 0% ; Coupon-Code: NONE");
                                                                while (true) {
                                                                    System.out.println("Enter Coupon Code");
                                                                    String couponInput = sc.nextLine();
                                                                    if (discountsVisitor.containsKey(couponInput)) {
                                                                        discountPercentage = discountsVisitor.get(couponInput);
                                                                        break;
                                                                    } else if (couponInput.equals("NONE")) {
                                                                        discountPercentage = 0;
                                                                        break;
                                                                    } else {
                                                                        System.out.println("Enter Correct Coupon Code");
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                discountPercentage = 0;
                                                                System.out.println("There Are No Valid Coupons for You");
                                                            }
                                                            price = (price - (price*((discountPercentage)/100)));
                                                            /////////////

                                                            if (visitor.getBalance() >= price) {
                                                                visitor.setMembership(2);
                                                                float balanceV = visitor.getBalance();
                                                                visitor.setBalance(balanceV - price);
                                                                System.out.println("You have Successfully Purchased Premium Membership");
                                                                System.out.println("Your balance is: ₹" + visitor.getBalance());
                                                                revenue += price;
                                                                break;
                                                            } else {
                                                                System.out.println("Low Balance Recharge Your Balance");
                                                                System.out.println("Your balance is: ₹" + visitor.getBalance());
                                                                break;
                                                            }
                                                        } else if (fourthChoiceV == 3) {
                                                            break;
                                                        } else {
                                                            System.out.println("--------------");
                                                            System.out.println("Wrong Command Try Again");
                                                        }
                                                    } else if (visitor.getMembership() == 1) {
                                                        System.out.println("--------------");
                                                        System.out.println("Upgrade Membership, you currently have Basic Membership:");
                                                        System.out.println("1. Premium Membership (₹30) (Only the difference between both membership is to be paid)");
                                                        System.out.println("2. Exit");
                                                        System.out.println("Enter The Your Choice");
                                                        int fourthChoiceV = sc.nextInt();
                                                        sc.nextLine();
                                                        if (fourthChoiceV == 1) {
                                                            ////////// Discount Coupon Section
                                                            float price = 30;
                                                            float discountPercentage;
                                                            int flag2 = 0;
                                                            Discount sampleDiscount = null;
                                                            System.out.println("--------------");
                                                            System.out.println("These Are The Valid Coupons Available for You Choose Any One of Them (CASE-SENSITIVE)");
                                                            Map<String, Discount> discountMap = zoo.getDiscounts();
                                                            HashMap<String, Discount> discounts = zoo.getDiscounts();
                                                            HashMap<String, Float> discountsVisitor = new HashMap<>();
                                                            for (Map.Entry<String, Discount> entry : discountMap.entrySet()) {
                                                                sampleDiscount = entry.getValue();
                                                                if (sampleDiscount != null) {
                                                                    if (sampleDiscount.getIsOpen() == 1 && sampleDiscount.getUpperAge()>visitor.getAge() && sampleDiscount.getLowerAge()<visitor.getAge()){
                                                                        System.out.println(sampleDiscount);
                                                                        discountsVisitor.put(sampleDiscount.getCode(), sampleDiscount.getPercentage());
                                                                        flag2 = 1;
                                                                    }
                                                                }
                                                            }
                                                            if (sampleDiscount != null && flag2 == 1) {
                                                                System.out.println("Discount Percentage: 0% ; Coupon-Code: NONE");
                                                                while (true) {
                                                                    System.out.println("Enter Coupon Code");
                                                                    String couponInput = sc.nextLine();
                                                                    if (discountsVisitor.containsKey(couponInput)) {
                                                                        discountPercentage = discountsVisitor.get(couponInput);
                                                                        break;
                                                                    } else if (couponInput.equals("NONE")) {
                                                                        discountPercentage = 0;
                                                                        break;
                                                                    } else {
                                                                        System.out.println("Enter Correct Coupon Code");
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                discountPercentage = 0;
                                                                System.out.println("There Are No Valid Coupons for You");
                                                            }
                                                            price = (price - (price*((discountPercentage)/100)));
                                                            /////////////

                                                            if (visitor.getBalance() >= price) {
                                                                visitor.setMembership(2);
                                                                float balanceV = visitor.getBalance();
                                                                visitor.setBalance(balanceV - price);
                                                                System.out.println("You have Successfully Upgraded to Premium Membership");
                                                                System.out.println("Your balance is: ₹" + visitor.getBalance());
                                                                revenue += price;
                                                                break;
                                                            } else {
                                                                System.out.println("Low Balance Recharge Your Balance");
                                                                System.out.println("Your balance is: ₹" + visitor.getBalance());
                                                                break;
                                                            }
                                                        } else if (fourthChoiceV == 2) {
                                                            break;
                                                        } else {
                                                            System.out.println("Wrong Command Try Again");
                                                        }
                                                    } else if (visitor.getMembership() == 2) {
                                                        System.out.println("--------------");
                                                        System.out.println("You Already have Premium Membership");
                                                        break;
                                                    }
                                                }
                                            } else if (thirdChoiceV == 3) {
                                                if (visitor.getMembership() == 2) {
                                                    System.out.println("--------------");
                                                    System.out.println("You Don't need to buy Tickets for Attraction, As you are Premium Member");
                                                } else if (visitor.getMembership() == 1) {
                                                    System.out.println("--------------");
                                                    System.out.println("Buy Tickets");
                                                    System.out.println("Enter the number of tickets");
                                                    int numberTicket = sc.nextInt();
                                                    sc.nextLine();
                                                    System.out.println("Select the Attraction You Want to Buy (Price will be multiplied by Number of tickets)");
                                                    Attraction maxKey = null;
                                                    int flag1 = 0;
                                                    Map<Integer, Attraction> attractionMap = zoo.getAttractions();
                                                    HashMap<Integer, Attraction> attractions = zoo.getAttractions();
                                                    for (Map.Entry<Integer, Attraction> entry : attractionMap.entrySet()) {
                                                        maxKey = entry.getValue();
                                                        if (maxKey != null && maxKey.isOpen() == 1) {
                                                            System.out.println(maxKey + " ; Price: ₹" + maxKey.getPrice());
                                                            flag1 = 1;
                                                        }
                                                    }

                                                    if (maxKey != null && flag1 == 1) {
                                                        System.out.println("Enter The ID You Want to Choose");
                                                        int fourthChoiceV;
                                                        while (true){
                                                            fourthChoiceV = sc.nextInt();
                                                            sc.nextLine();
                                                            if (attractions.containsKey(fourthChoiceV) && attractions.get(fourthChoiceV).isOpen() == 1){
                                                                break;
                                                            }
                                                            else {
                                                                if (attractions.containsKey(fourthChoiceV)) {
                                                                    System.out.println("The Attraction with ID " + fourthChoiceV + " is Closed Choose Another One which is Open");
                                                                }
                                                                else {
                                                                    System.out.println("The Attraction with ID " + fourthChoiceV + " Doesn't Exist");
                                                                }
                                                            }
                                                        }


                                                        ////////// Discount Coupon Section
                                                        float price = numberTicket * attractions.get(fourthChoiceV).getPrice();
                                                        float discountPercentage;
                                                        int flag2 = 0;
                                                        Discount sampleDiscount = null;
                                                        System.out.println("--------------");
                                                        System.out.println("These Are The Valid Coupons Available for You Choose Any One of Them (CASE-SENSITIVE)");
                                                        Map<String, Discount> discountMap = zoo.getDiscounts();
                                                        HashMap<String, Discount> discounts = zoo.getDiscounts();
                                                        HashMap<String, Float> discountsVisitor = new HashMap<>();
                                                        for (Map.Entry<String, Discount> entry : discountMap.entrySet()) {
                                                            sampleDiscount = entry.getValue();
                                                            if (sampleDiscount != null) {
                                                                if (sampleDiscount.getIsOpen() == 1 && sampleDiscount.getUpperAge()>visitor.getAge() && sampleDiscount.getLowerAge()<visitor.getAge()){
                                                                    System.out.println(sampleDiscount);
                                                                    discountsVisitor.put(sampleDiscount.getCode(), sampleDiscount.getPercentage());
                                                                    flag = 1;
                                                                }
                                                            }
                                                        }
                                                        if (sampleDiscount != null && flag2 == 1) {
                                                            System.out.println("Discount Percentage: 0% ; Coupon-Code: NONE");
                                                            while (true) {
                                                                System.out.println("Enter Coupon Code");
                                                                String couponInput = sc.nextLine();
                                                                if (discountsVisitor.containsKey(couponInput)) {
                                                                    discountPercentage = discountsVisitor.get(couponInput);
                                                                    break;
                                                                } else if (couponInput.equals("NONE")) {
                                                                    discountPercentage = 0;
                                                                    break;
                                                                } else {
                                                                    System.out.println("Enter Correct Coupon Code");
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            discountPercentage = 0;
                                                            System.out.println("There Are No Valid Coupons for You");
                                                        }


                                                        price = (price - (price*((discountPercentage)/100)));
                                                        /////////////

                                                        ////////// Deal Section
                                                        float dealPercentage = 0;
                                                        HashMap<Integer, Deal> deals = zoo.getDeals();
                                                        TreeSet<Integer> sortedKeys = new TreeSet<>(deals.keySet());
                                                        Integer smallerKey = sortedKeys.lower(numberTicket);
                                                        System.out.println("--------------");
                                                        if (smallerKey == null) {
                                                            System.out.println("No Deal is Applied To Your Purchase");
                                                        }
                                                        else if (!deals.containsKey(numberTicket) && smallerKey!=null){
                                                            dealPercentage = deals.get(smallerKey).getPercentage();
                                                            System.out.println(deals.get(smallerKey) + " Has been Applied To Your Purchase");
                                                        }
                                                        else {
                                                            dealPercentage = deals.get(numberTicket).getPercentage();
                                                            System.out.println(deals.get(numberTicket) + " Has been Applied To Your Purchase");
                                                        }

                                                        //////////

                                                        price = ((price) - (price*(dealPercentage/100))); // after the individual discount of coupon the special deal is applied
                                                        if (visitor.getBalance() >= price) {
                                                            for (int i = 0; i < numberTicket; i++) {
                                                                visitor.addAttractionsPurchased(attractions.get(fourthChoiceV));
                                                            }
                                                            revenue += price;
                                                            float balanceV = visitor.getBalance();
                                                            visitor.setBalance(balanceV - price);
                                                            System.out.println("You have Successfully Purchased " + numberTicket + " Tickets of ₹" + price);
                                                            System.out.println("Your balance is: " + visitor.getBalance());
                                                        } else {
                                                            System.out.println("Low balance Recharge First");
                                                            System.out.println("Your balance is: ₹" + visitor.getBalance());
                                                        }
                                                    } else {
                                                        if (maxKey != null && flag1 == 0) {
                                                            System.out.println("All Attractions are Closed now Wait till it gets Open");
                                                        }
                                                        else {
                                                            System.out.println("There are No Attractions in the Zoo");
                                                        }

                                                    }
                                                } else {
                                                    System.out.println("Go and First Buy Membership, Then come here to Buy Tickets for Attraction");
                                                }
                                            } else if (thirdChoiceV == 4) {
                                                System.out.println("--------------");
                                                System.out.println("View Discounts");
                                                System.out.println("The Discount which are Active Now are Given As Follows");
                                                Discount maxKey;
                                                Map<String, Discount> discountMap = zoo.getDiscounts();
                                                HashMap<String, Discount> discounts = zoo.getDiscounts();
                                                for (Map.Entry<String, Discount> entry : discountMap.entrySet()) {
                                                    maxKey = entry.getValue();
                                                    if (maxKey != null) {
                                                        if (maxKey.getIsOpen() == 1){
                                                            System.out.println(maxKey + " ; Age-Range: [" + maxKey.getLowerAge() + " to " + maxKey.getUpperAge() + "]");
                                                        }
                                                    }
                                                }
                                            } else if (thirdChoiceV == 5) {
                                                System.out.println("--------------");
                                                System.out.println("View Special Deals");
                                                System.out.println("The Deals which are Active Now are Given As Follows");
                                                Deal maxKey;
                                                Map<Integer, Deal> dealMap = zoo.getDeals();
                                                HashMap<Integer, Deal> deals = zoo.getDeals();
                                                for (Map.Entry<Integer, Deal> entry : dealMap.entrySet()) {
                                                    maxKey = entry.getValue();
                                                    if (maxKey != null) {
                                                        if (maxKey.getIsOpen() == 1){
                                                            System.out.println("ID: " + maxKey.getId() + " ; " + maxKey);
                                                        }
                                                    }
                                                }
                                            } else if (thirdChoiceV == 6) {
                                                System.out.println("--------------");
                                                System.out.println("Visiting Animals");
                                                while (true) {
                                                    if (visitor.getMembership() != 0) {
                                                        System.out.println("Animals in the Zoo are as follows");
                                                        Animal maxKey = null;
                                                        Map<Integer, Animal> animalMap = zoo.getAnimals();
                                                        HashMap<Integer, Animal> animals = zoo.getAnimals();
                                                        HashMap<Integer, Mammal> mammals = zoo.getMammals();
                                                        HashMap<Integer, Reptile> reptiles = zoo.getReptiles();
                                                        HashMap<Integer, Amphibian> amphibians = zoo.getAmphibians();
                                                        for (Map.Entry<Integer, Animal> entry : animalMap.entrySet()) {
                                                            maxKey = entry.getValue();
                                                            if (maxKey != null) {
                                                                System.out.println(entry.getKey() + ". " + (entry.getValue()).getName());
                                                            }
                                                        }
                                                        if (maxKey != null) {
                                                            System.out.println("Which Animal Do You Want to Visit, Enter the ID of Animal (To Exit this section, Enter Number other than the ID's mentioned)");
                                                            int fourthChoiceV = sc.nextInt();
                                                            if (animals.containsKey(fourthChoiceV)) {
                                                                while (true) {
                                                                    System.out.println("What you want to do with " + animals.get(fourthChoiceV).getName());
                                                                    System.out.println("1. Feed " + animals.get(fourthChoiceV).getName());
                                                                    System.out.println("2. Read about " + animals.get(fourthChoiceV).getName());
                                                                    System.out.println("3. Exit");
                                                                    int fifthChoiceV = sc.nextInt();
                                                                    if (fifthChoiceV == 1) {
                                                                        System.out.println(animals.get(fourthChoiceV).getFeed());
                                                                    } else if (fifthChoiceV == 2) {
                                                                        animals.get(fourthChoiceV).description();
                                                                    } else if (fifthChoiceV == 3) {
                                                                        System.out.println("Going Back Successfully");
                                                                        totalVisitorsVisitedAnimalsIncluded++;
                                                                        break;
                                                                    } else {
                                                                        System.out.println("--------------");
                                                                        System.out.println("You Entered Wrong Command, Hence Exited");
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("--------------");
                                                                System.out.println("You Entered Wrong Command, Hence Exited");
                                                                break;
                                                            }
                                                        } else {
                                                            System.out.println("There are no Animals in the Zoo");
                                                        }
                                                    } else {
                                                        System.out.println("Go and First Buy Membership, Then come here To Visit Animals");
                                                        break;
                                                    }
                                                }
                                            } else if (thirdChoiceV == 7) {
                                                while (true) {
                                                    if (visitor.getMembership() != 0) {
                                                        System.out.println("--------------");
                                                        System.out.println("Visiting Attraction");
                                                        Attraction maxKey = null;
                                                        Map<Integer, Attraction> attractionMap = zoo.getAttractions();
                                                        HashMap<Integer, Attraction> attractions = zoo.getAttractions();
                                                        for (Map.Entry<Integer, Attraction> entry : attractionMap.entrySet()) {
                                                            maxKey = entry.getValue();
                                                            if (maxKey != null) {
                                                                if (maxKey.isOpen() == 1) {
                                                                    System.out.println(maxKey + " ; Open");
                                                                } else if (maxKey.isOpen() == 0) {
                                                                    System.out.println(maxKey + " ; Closed");
                                                                }
                                                            }
                                                        }
                                                        if (maxKey != null) {
                                                            System.out.println("Enter The Attraction ID You Want To Visit, Enter the ID of Attraction (To Exit this section, Enter Number other than the ID's mentioned)");
                                                            int fourthChoiceV = sc.nextInt();
                                                            sc.nextLine();
                                                            if (attractions.containsKey(fourthChoiceV)) {
                                                                if (attractions.get(fourthChoiceV).isOpen() == 1) {
                                                                    if ((visitor.getAttractionsPurchased()).contains(attractions.get(fourthChoiceV)) || visitor.getMembership() == 2) {
                                                                        if (visitor.getMembership() == 2) {
                                                                            System.out.println("Hi, " + visitor.getName() + " Sir, Welcome to " + attractions.get(fourthChoiceV).getName() + "! Thank you for being Premium Member");
                                                                        } else {
                                                                            System.out.println("Hi, " + visitor.getName() + " Sir, Welcome to " + attractions.get(fourthChoiceV).getName() + "! Your 1 Ticket is Used for " + attractions.get(fourthChoiceV).getName() + " Please buy the Premium Subscription Sir for Better Service");
                                                                            (visitor.getAttractionsPurchased()).remove(attractions.get(fourthChoiceV));
                                                                            int ticketedVisitors = attractions.get(fourthChoiceV).getNumberOfVisitors();
                                                                            ticketedVisitors++;
                                                                            attractions.get(fourthChoiceV).setNumberOfVisitors(ticketedVisitors);
                                                                            // System.out.println(visitor.getAttractionsPurchased());
                                                                        }
                                                                        totalVisitorsVisited++;
                                                                        totalVisitorsVisitedAnimalsIncluded++;

                                                                    } else {
                                                                        System.out.println("Go and First Buy Ticket, Then Come and Visit Any Attraction");
                                                                        break;
                                                                    }
                                                                } else {
                                                                    System.out.println("--------------");
                                                                    System.out.println("Attraction is Closed, Please Come After It Gets Open");
                                                                    System.out.println("Write 1 for Choosing Another Attraction");
                                                                    System.out.println("Write 2 for Exiting");
                                                                    System.out.println("Enter The Your Choice");
                                                                    int fifthChoiceV = sc.nextInt();
                                                                    sc.nextLine();
                                                                    if (fifthChoiceV == 1) {
                                                                        System.out.println("Try to Choose the Attraction which is open");
                                                                    } else if (fifthChoiceV == 2) {
                                                                        break;
                                                                    } else {
                                                                        System.out.println("--------------");
                                                                        System.out.println("Wrong Command Try Again");
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("--------------");
                                                                System.out.println("You Entered Wrong Command, Hence Exited");
                                                                break;
                                                            }
                                                        } else {
                                                            System.out.println("There are no Attraction in the Zoo");
                                                            break;
                                                        }
                                                    }
                                                    else {
                                                        System.out.println("Go and First Buy Membership, Then come here To Visit Attraction");
                                                        break;
                                                    }
                                                }
                                            } else if (thirdChoiceV == 8) {
                                                System.out.println("--------------");
                                                System.out.println("Enter Your Feedback");
                                                String feedback = sc.nextLine();
                                                zoo.addFeedback(feedbackId, feedback);
                                                System.out.println("Your Feedback is Added with ID : " + feedbackId);
                                                feedbackId++;
                                            } else if (thirdChoiceV == 9) {
                                                System.out.println("--------------");
                                                System.out.println("Recharge Your Balance:");
                                                System.out.println("Your Current Balance is : " + visitor.getBalance());
                                                System.out.println("Enter the Amount");
                                                float recharge = sc.nextInt();
                                                sc.nextLine();
                                                recharge += visitor.getBalance();
                                                visitor.setBalance(recharge);
                                            } else if (thirdChoiceV == 10) {
                                                System.out.println("--------------");
                                                System.out.println("Exited Successfully");
                                                break;
                                            } else {
                                                System.out.println("--------------");
                                                System.out.println("Wrong Command Try Again");
                                            }
                                        }
                                    }
                                }
                                if (flag == 0) {
                                    if (tryLogin > 0) {
                                        System.out.println("--------------");
                                        System.out.println("Either Username or Password is Wrong, Try Again");
                                        System.out.println("Tries Left : " + tryLogin);
                                        tryLogin--;
                                        continue;
                                    } else {
                                        System.out.println("--------------");
                                        System.out.println("You Don't Know Either Username or Password");
                                        System.out.println("Therefore Exited");
                                        break;
                                    }
                                }
                                break;
                            }

                        }
                        break;
                    }
                    else if (secondChoiceV == 3) {
                        break;
                    }
                    else {
                        System.out.println("--------------");
                        System.out.println("Entered Wrong Command Try Again");
                    }
                }

            }
            else if (firstChoice == 3){
                System.out.println("--------------");
                System.out.println("Thanks for Visiting");
                break;
            }
            else {
                System.out.println("Wrong Command Try Again");
            }

        }
    }

}