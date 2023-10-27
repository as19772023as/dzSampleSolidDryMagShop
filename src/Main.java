import Taxes.TaxesShopFood;
import Taxes.TaxesShopSport;
import Taxes.TaxesSum;
import ruShop.Shop;
import ruShop.ShopFood;
import ruShop.ShopSport;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Проверка продаж в магазинах и расчет разных налоговых ставок");

        Shop shopSport = new ShopSport();
        System.out.println(shopSport);
        int sumSport = shopSport.calculationPrice(shopSport);
        shopSport.showIncome();
        TaxesShopSport taxesShopSport = new TaxesShopSport();
        taxesShopSport.calculationTaxes(sumSport);

        Shop shopFood = new ShopFood();
        System.out.println(shopFood);
        int sumFood = shopFood.calculationPrice(shopFood);
        shopFood.showIncome();
        TaxesShopFood taxesSum = new TaxesShopFood();
        taxesSum.calculationTaxes(sumFood);

    }
}
