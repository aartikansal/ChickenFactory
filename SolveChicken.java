public class SolveChicken {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.AFRICA);
        hen.getMonthlyEggCount();
    }

    static class HenFactory {

        static Hen getHen(String continent) {
            Hen hen = null;

            switch (continent) {
                case Continent.AFRICA:
                    hen = new AfricanHen();
                    break;
                case Continent.NORTHAMERICA:
                    hen = new NorthAmericanHen();
                    break;
                case Continent.EUROPE:
                    hen = new EuropeanHen();
                    break;
                case Continent.ASIA:
                    hen = new AsianHen();
                    break;
            }
            return hen;
        }
    }
}


