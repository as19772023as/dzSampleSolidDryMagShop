package ruShop;

public class ShopFood extends Shop {

    public ShopFood() {
        super("Из Сада",
                "овощи и фрукты",
                new String[]{"Яблоки", "Картофель", "Капуста", "Арбуз", "Дыня"},
                new int[]{50, 40, 250, 500, 600}
        );
    }

    public String getShopName() {
        return this.shopName;
    }


    public int[] getPrices() {
        return this.prices;
    }

    public String[] getProducts() {
        return products;
    }

    public void giveList(ShopFood shopFood) {
        super.giveList(shopFood);
    }


    public int calculationPrice(ShopFood shopFood) {
        return super.calculationPrice(shopFood);
    }

    @Override
    public void showIncome() {
        System.out.println("Общая сумма дохода в магазине" + this.shopName
                + " составляет:   " + sumProducts + " рублей");

    }
}
