package Taxes;

import ruShop.Shop;
import ruShop.ShopFood;

import java.util.Arrays;

public class TaxesShopFood implements TaxesShop, TaxesSum, SalesRate {
    protected int taxesTotalShopFood;

    @Override
    public int calculationTaxes(int sum) {
        if (sum == 0) {
            return 0;
        }
        calculationSale(sum);
        sum = sum * 15 / 100;
        System.out.println("Налог на прибыль составляет " + sum + " рублей");
        return sum;

    }


    @Override
    public int sumTaxes(int taxesDay) {
        return taxesTotalShopFood += taxesDay;
    }

    @Override
    public void calculationSale(int sales) {

        Shop shopFood = new ShopFood();
        // shopFood.getPrices();
//        for (int i = 0; i < shopFood.getPrices().length; i++) {
        System.out.println(sales > Arrays.stream(shopFood.getPrices()).sum() ? "Отличная работа" :
                "Низкая продажа, продукты могут испортиться");
        // }


    }
}
