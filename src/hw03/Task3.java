package hw03;

public class Task3 {
    public static void main(String[] args) {

        float productPriceA;
        float productPriceB;
        float discount;
        float orderPrice;
        float totalOrderPrice;

        productPriceA = 1000;
        productPriceB = 500;
        discount = 100;

        orderPrice = Float.sum(productPriceA, productPriceB);
        totalOrderPrice = orderPrice - discount;

        System.out.println("Цена товара A: " + productPriceA + " руб");
        System.out.println("Цена товара B: " + productPriceB + " руб");
        System.out.println("Стоимость покупки: " + totalOrderPrice + " руб");
        System.out.println("Скидка на данную покупку составила: " + discount + " руб");
        System.out.println("Спасибо за покупку в нашем магазине!");

    }


}
