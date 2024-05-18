package org.example;

import java.util.HashMap;


public class Zoo{
    private final HashMap<Integer, Animal> animals;
    private final HashMap<Integer, Mammal> mammals ;
    private final HashMap<Integer, Reptile> reptiles;
    private final HashMap<Integer, Amphibian> amphibians ;
    private final HashMap<Integer, Attraction> attractions;
    private final HashMap<Integer, Visitor> visitors;
    private final HashMap<Integer, String> feedbacks;
    private final HashMap<String, Discount> discounts;
    private final HashMap<Integer, Deal> deals;

    public Zoo() {
        animals = new HashMap<>();
        mammals = new HashMap<>();
        reptiles = new HashMap<>();
        amphibians = new HashMap<>();
        visitors = new HashMap<>();
        feedbacks = new HashMap<>();
        attractions = new HashMap<>();
        deals = new HashMap<>();
        discounts = new HashMap<>();
    }


    public HashMap<Integer, Animal> getAnimals() {
        return animals;
    }
    public HashMap<Integer, Mammal> getMammals() {
        return mammals;
    }
    public HashMap<Integer, Reptile> getReptiles() {
        return reptiles;
    }
    public HashMap<Integer, Amphibian> getAmphibians() {
        return amphibians;
    }

    public HashMap<Integer, Attraction> getAttractions() {
        return attractions;
    }

    public HashMap<Integer, Visitor> getVisitors() {
        return visitors;
    }

    public HashMap<Integer, String> getFeedbacks() {
        return feedbacks;
    }

    public void addVisitor(Visitor visitor) {
        visitors.put(visitor.getId(), visitor);
    }

    public void addFeedback(Integer feedbackId, String abc) {
        feedbacks.put(feedbackId, abc);
    }

    public HashMap<String, Discount> getDiscounts() {
        return discounts;
    }

    public HashMap<Integer, Deal> getDeals() {
        return deals;
    }

    public void addAttraction(Attraction attraction) {
        attractions.put(attraction.getId(), attraction);
    }

    public void addMammal(Mammal mammal) {
        mammals.put(mammal.getId(), mammal);
        animals.put(mammal.getId(), mammal);
    }
    public void addReptile(Reptile reptile) {
        reptiles.put(reptile.getId(),reptile);
        animals.put(reptile.getId(), reptile);
    }
    public void addAmphibian(Amphibian amphibian) {
        amphibians.put(amphibian.getId(), amphibian);
        animals.put(amphibian.getId(), amphibian);
    }

    public void addDiscount(Discount discount) {
        discounts.put(discount.getCode(), discount);
    }

    public void addDeal(Deal deal) {
        deals.put(deal.getId(), deal);
    }

    public boolean isValidPhoneNumber(String phoneNumber) {
        // Define a regular expression for a valid phone number format.
        String regex = "^[0-9]{10}$"; // For a 10-digit phone number

        if (phoneNumber.matches(regex)) {
            return true;
        }
        else {
            System.out.println("InValid Phone Number Try Again");
            return false;
        }
    }

    public boolean isValidEmail(String email) {
        // Define a regular expression for a valid email address format.
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        if (email.matches(regex)) {
            return true;
        }
        System.out.println("InValid Email ID Try Again");
        return false;
    }

    public void updateAttractionName(int idInput, String nameNewAtt) {

        if (!attractions.containsKey(idInput)){
            System.out.println("Error in Updating Name of Animal as ID " + idInput + " Doesn't Exist");
            return;
        }
        Attraction attraction = attractions.get(idInput);

        if (attraction.getId() == idInput){
            attraction.setName(nameNewAtt);
            System.out.println("Name of Attraction has been updated to " + nameNewAtt);
        }
    }
        public void updateAttractionDescription(int idInput, String descriptionNewAtt) {
            if (!attractions.containsKey(idInput)){
                System.out.println("Error in Updating Description of Attraction as ID " + idInput + " Doesn't Exist");
                return;
            }
            Attraction attraction = attractions.get(idInput);

            if (attraction.getId() == idInput){
                attraction.setDescription(descriptionNewAtt);
                System.out.println("Description of Attraction has been updated to " + descriptionNewAtt);
            }
        }
        public void updateAttractionPrice(int idInput, int priceNewAtt) {
            if (!attractions.containsKey(idInput)){
                System.out.println("Error in Updating Price of Attraction as ID " + idInput + " Doesn't Exist");
                return;
            }
            Attraction attraction = attractions.get(idInput);

            if (attraction.getId() == idInput){
                attraction.setPrice(priceNewAtt);
                System.out.println("Price of Attraction has been updated to " + priceNewAtt);
            }
        }
        public void updateAttractionOpen(int idInput, int openNewAtt) {
            if (!attractions.containsKey(idInput)){
                System.out.println("Error in Updating Availability of Attraction as ID " + idInput + " Doesn't Exist");
                return;
            }
            Attraction attraction = attractions.get(idInput);

            if (attraction.getId() == idInput){
                attraction.setAvailability(openNewAtt);
                if (openNewAtt == 1){
                System.out.println("Availability of Attraction with ID " + idInput + " has been updated to open : " + openNewAtt);
                }
                else {
                    System.out.println("Availability of Attraction with ID " + idInput + " has been updated to closed : " + openNewAtt);
                }
            }

        }

    public void removeAttraction(int idInput) {
        if (attractions.containsKey(idInput)){
            attractions.remove(idInput);
            System.out.println("Attraction with ID " + idInput + " has been removed");
        }
        else {
            System.out.println("Attraction can't be removed as ID " + idInput + " Doesn't Exist");
        }
    }


    public void updateAnimalName(int idInput, String nameNewAnimal) {

        if (!animals.containsKey(idInput)) {
            System.out.println("Error in Updating Name of Animal as ID "+ idInput +" Doesn't Exist");
            return;
        }
        Animal animal = animals.get(idInput);

        if (animal.getId() == idInput) {
            animal.setName(nameNewAnimal);
            System.out.println("Name of Animal has been updated to " + nameNewAnimal);
        }
    }
    public void updateAnimalDescription(int idInput, String descriptionNewAnimal) {

        if (!animals.containsKey(idInput)) {
            System.out.println("Error in Updating Description of Animal as ID "+ idInput +" Doesn't Exist");
            return;
        }
        Animal animal = animals.get(idInput);

        if (animal.getId() == idInput) {
            animal.setDescription(descriptionNewAnimal);
            System.out.println("Description of Animal has been updated to " + descriptionNewAnimal);
        }
    }
    public void updateAnimalSound(int idInput, String feedNewAnimal) {

        if (!animals.containsKey(idInput)) {
            System.out.println("Error in Updating Sound of Animal as ID "+ idInput +" Doesn't Exist");
            return;
        }
        Animal animal = animals.get(idInput);

        if (animal.getId() == idInput) {
            animal.setFeed(feedNewAnimal);
            System.out.println("Sound of Animal has been updated to " + feedNewAnimal);
        }
    }


    public void updateLowerLimitDiscount(String couponCode, int lowerNewAge) {
        if (!discounts.containsKey(couponCode)) {
            System.out.println("Error in Updating Lower Age Limit as Coupon-Code \"" + couponCode + "\" Doesn't Exist");
            return;
        }
        Discount discount = discounts.get(couponCode);
        if (discount.getCode().equals(couponCode)) {
            discount.setLowerAge(lowerNewAge);
            System.out.println("The Lower Age Limit of Coupon \"" + couponCode + "\" is set to " + lowerNewAge);
        }
    }
    public void updateUpperLimitDiscount(String couponCode, int upperNewAge) {
        if (!discounts.containsKey(couponCode)) {
            System.out.println("Error in Updating Upper Age Limit as Coupon-Code \"" + couponCode + "\" Doesn't Exist");
            return;
        }
        Discount discount = discounts.get(couponCode);
        if (discount.getCode().equals(couponCode)) {
            discount.setUpperAge(upperNewAge);
            System.out.println("The Upper Age Limit of Coupon-Code \"" + couponCode + "\" is set to " + upperNewAge);
        }
    }
    public void updatePercentageDiscount(String couponCode, int percentage) {
        if (!discounts.containsKey(couponCode)) {
            System.out.println("Error in Updating Percentage Discount as Coupon-Code \"" + couponCode + "\" Doesn't Exist");
            return;
        }
        Discount discount = discounts.get(couponCode);
        if (discount.getCode().equals(couponCode)) {
            discount.setPercentage(percentage);
            System.out.println("The Percentage Discount of Coupon-Code \"" + couponCode + "\" is set to " + percentage);
        }
    }
    public void updateValidityDiscount(String couponCode, int isOpen) {
        if (!discounts.containsKey(couponCode)) {
            System.out.println("Error in Updating Validity as Coupon-Code \"" + couponCode + "\" Doesn't Exist");
            return;
        }
        Discount discount = discounts.get(couponCode);
        if (discount.getCode().equals(couponCode)) {
            discount.setIsOpen(isOpen);
            if (isOpen == 1){
                System.out.println("The Validity of Coupon-Code \"" + couponCode + "\" is set to Valid : " + isOpen);
            }
            else {
                System.out.println("The Validity of Coupon-Code \"" + couponCode + "\" is set to In-Valid : " + isOpen);
            }
        }
    }

    public void removeAnimal(int idInput) {
        if (animals.containsKey(idInput)){
            if (mammals.containsKey(idInput)){
                if (mammals.size()>2){
                    animals.remove(idInput);
                    mammals.remove(idInput);
                    System.out.println("Animal with ID " + idInput + " Removed Successfully");
                }
                else {
                    System.out.println("Animal with ID " + idInput + " Not Removed because number of Mammals should be strictly greater or equal to 2");
                }
            }
            else if (reptiles.containsKey(idInput)){
                if (reptiles.size()>2){
                    animals.remove(idInput);
                    reptiles.remove(idInput);
                    System.out.println("Animal with ID " + idInput + " Removed Successfully");
                }
                else {
                    System.out.println("Animal with ID " + idInput + " Not Removed because Number of Reptiles should be strictly greater or equal to 2");
                }
            }
            else if (amphibians.containsKey(idInput)){
                if (amphibians.size()>2){
                    animals.remove(idInput);
                    amphibians.remove(idInput);
                    System.out.println("Animal with ID " + idInput + " Removed Successfully");
                }
                else {
                    System.out.println("Animal with ID " + idInput + " Not Removed because number of Amphibians should be strictly greater or equal to 2");
                }
            }

        }
        else {
            System.out.println("Animal can't be removed as ID " + idInput + " Doesn't Exist");
        }
    }
    public void removeDiscount(String couponCode) {
        if (discounts.containsKey(couponCode)){
            discounts.remove(couponCode);
            System.out.println("Discount with Coupon-Code \"" + couponCode + "\" has been removed");
        }
        else {
            System.out.println("Discount can't be removed as Coupon-Code \"" + couponCode + "\" Doesn't Exist");
        }
    }


    public void updateMinTicketDeal(int idInput, int minimumNewTicket) {
        if (!deals.containsKey(idInput)){
            System.out.println("Error in Updating Minimum Number of Tickets of Deal as ID " + idInput + " Doesn't Exist");
            return;
        }
        Deal deal = deals.get(idInput);
        if (deal.getId() == idInput){
            deal.setMinimumTicket(minimumNewTicket);
            System.out.println("The Minimum No. of Tickets for Deal with ID " + idInput + " is Updated to " + minimumNewTicket);
        }
    }
    public void updatePercentageDeal(int idInput, int percentage) {
        if (!deals.containsKey(idInput)){
            System.out.println("Error in Updating Discount Percentage for Deal as ID " + idInput + " Doesn't Exist");
            return;
        }
        Deal deal = deals.get(idInput);
        if (deal.getId() == idInput){
            deal.setPercentage(percentage);
            System.out.println("The Discount Percentage for Deal with ID " + idInput + " is Updated to " + percentage);
        }
    }
    public void updateValidityDeal(int idInput, int isOpen) {
        if (!deals.containsKey(idInput)){
            System.out.println("Error in Updating Validity of Tickets of Deal as ID " + idInput + " Doesn't Exist");
            return;
        }
        Deal deal = deals.get(idInput);
        if (deal.getId() == idInput){
            deal.setIsOpen(isOpen);
        }
        if (isOpen == 1){
            System.out.println("The Validity of Deal with ID " + idInput + " is set to Valid : " + isOpen);
        }
        else {
            System.out.println("The Validity of Deal with ID " + idInput + " is set to In-Valid : " + isOpen);
        }
    }

    public void removeDeal(int idInput) {
        if (deals.containsKey(idInput)){
            deals.remove(idInput);
            System.out.println("Deal with ID " + idInput + " has been removed");
        }
        else {
            System.out.println("Deal can't be removed as ID" + idInput + " Doesn't Exist");
        }
    }

    public void removeAnimalUpdateType(int idInput) {
        String type = animals.get(idInput).getType();
        if (type.equals("Mammal")){
            mammals.remove(idInput);
        } else if (type.equals("Reptile")) {
            reptiles.remove(idInput);
        } else if (type.equals("Amphibian")) {
            amphibians.remove(idInput);
        }
        animals.remove(idInput);
    }

}
