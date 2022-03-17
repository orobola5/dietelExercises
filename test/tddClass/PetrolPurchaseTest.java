package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetrolPurchaseTest {
    
    @Test
    public void testThatPetrolPurchaseHaveALocation(){
        PetrolPurchase myPetrolPurchase = new PetrolPurchase("lagos","diesel",50,288.09,0.05);
        myPetrolPurchase.setLocation("lagos");
        assertEquals("lagos",myPetrolPurchase.getLocation());
    }
    @Test
    public void testThatPetrolPurchaseHaveAType(){
        PetrolPurchase myPetrolPurchase = new PetrolPurchase("lagos","diesel",50,288.09,0.05);
        myPetrolPurchase.setPetrolType("diesel");
        assertEquals("diesel",myPetrolPurchase.getPetrolType());
    }


    @Test
    public void testForTheQuantityOfPetrolPurchase(){
        PetrolPurchase myPetrolPurchase = new PetrolPurchase("lagos","diesel",50,288.09,0.05);
        myPetrolPurchase.setPetrolQuantity(50);
        assertEquals(50,myPetrolPurchase.getPetrolQuantity());
    }
    @Test
    public void testForThePricePerLitreOfPetrolPurchase(){
        PetrolPurchase myPetrolPurchase = new PetrolPurchase("lagos","diesel",50,288.09,0.05);
        myPetrolPurchase.setPetrolPrice(288.09);
        assertEquals(288.09,myPetrolPurchase.getPetrolPrice());

    }
    @Test
    public void testFor5PercentageDiscountOfPetrolPurchase(){
        PetrolPurchase myPetrolPurchase = new PetrolPurchase("lagos","diesel",50,288.09,0.05);
        myPetrolPurchase.setDiscount(5);
        assertEquals(14.404499999999999,myPetrolPurchase.getDiscount());

    }
    @Test
    public void testFor15PercentageDiscountOfPetrolPurchase(){
        PetrolPurchase myPetrolPurchase = new PetrolPurchase("lagos","diesel",50,288.09,0.05);
        myPetrolPurchase.setDiscount(15);
        assertEquals(43.213499999999996,myPetrolPurchase.getDiscount());

    }
    @Test
    public void testForThePetrolPurchaseAmount(){
        PetrolPurchase myPetrolPurchase = new PetrolPurchase("lagos","diesel",50,288.09,0.05);
        assertEquals(14404.499999999998,myPetrolPurchase.getPurchaseAmount());
    }

    @Test
    public void testForThePetrolPurchaseNetAmount(){
        PetrolPurchase myPetrolPurchase = new PetrolPurchase("lagos","diesel",50,288.09,0.05);
        myPetrolPurchase.getPurchaseAmount();
        myPetrolPurchase.setDiscount(5);
        assertEquals(14390.095499999998,myPetrolPurchase.getNetAmount());

    }
    @Test
    public void testForThePetrolPurchaseNetAmountUsing15Discount(){
        PetrolPurchase myPetrolPurchase = new PetrolPurchase("lagos","diesel",50,288.09,0.05);
        myPetrolPurchase.getPurchaseAmount();
        myPetrolPurchase.setDiscount(15);
        assertEquals(14361.286499999998,myPetrolPurchase.getNetAmount());

    }


}

