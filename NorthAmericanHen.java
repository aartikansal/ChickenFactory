public class NorthAmericanHen extends Hen {
    @Override
    String getDescription() {
        return super.getDescription() + String.format(" I come from %s. I lay %d eggs a month.", Continent.NORTHAMERICA, getMonthlyEggCount());
    }

    @Override
    int getMonthlyEggCount() {
        return 5;
    }
}
