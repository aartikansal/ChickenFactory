public class AsianHen extends Hen {
    @Override
    String getDescription() {
        return super.getDescription() + String.format(" I come from %s. I lay %d eggs a month.", Continent.NORTHAMERICA, getMonthlyEggCount());
    }


    int getMonthlyEggCount() {
        return 12;
    }
}