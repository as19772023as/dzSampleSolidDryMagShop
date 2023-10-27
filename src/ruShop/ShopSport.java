package ruShop;

public class ShopSport extends Shop {


    public ShopSport() {
        super("Победа",
                "спорт-товары",
                new String[]{"Футбольный мяч", "Волейбольный мяч", "Теннисный мяч"},
                new int[]{950, 600, 250}
        );
    }

    public String getShopName() {
        return this.shopName;
    }

    public void giveList(ShopSport shopSport) {
        super.giveList(shopSport);
    }


    public int calculationPrice(ShopSport shopSport) {
        return super.calculationPrice(shopSport);
    }

    @Override
    public void showIncome() {
        System.out.println("Общая сумма дохода:  " + this.shopName
                + " составляет:   " + sumProducts + " рублей");
    }
}
