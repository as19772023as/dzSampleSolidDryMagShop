package ruShop;

import java.util.Scanner;

public abstract class Shop {
    protected String shopName;
    protected String specialization;

    protected int[] basket;
    protected int[] prices;
    protected String[] products;

    protected static int sumProducts = 0;

    public Shop(String shopName, String specialization, String[] products, int[] prices) {
        this.shopName = "Магазин - " + shopName;
        this.specialization = specialization;
        this.products = products;
        this.prices = prices;
    }

    public String getShopName() {
        return shopName;
    }

    public int[] getPrices() {
        return prices;
    }

    public void giveList(Shop shop) {
        System.out.println("\nВведите проданные товары в магазине:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + " " + products[i] + " " + prices[i] + " руб/штука");
        }
        System.out.println();
    }

    public int calculationPrice(Shop shop) {
        giveList(shop);
        basket = new int[products.length];
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Укажите товар и сколько было продано. Или введите 'end':");
            int productNumber = 0;
            int productCount = 0;

            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            String[] choise = input.split(" ");
            try {
                productNumber = Integer.parseInt(choise[0]) - 1;
                productCount = Integer.parseInt(choise[1]);

                basket[productNumber] += productCount;

            } catch (NumberFormatException ex) {
                System.out.println("Введите номер товара или  - end");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Такого товара нет, попробуйте еще раз ");
            }
        }
        System.out.println("\nСписок продаж:");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " " + basket[i] + " шт, " + prices[i] + " руб/шт, " +
                    (basket[i] * prices[i]) + " рублей в сумме");
            sumProducts += (basket[i] * prices[i]);
        }
        System.out.println("итого: " + sumProducts + " рублей\n");
        return sumProducts;
    }

    public abstract void showIncome();

    @Override
    public String toString() {
        return "\n\n(______________" + shopName + " , " + specialization + "_______________)";
    }
}
