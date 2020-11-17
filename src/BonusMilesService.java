public class BonusMilesService {
    // создан класс BonusMilesService
    public int calculate(int cost) {
        // создан класс calculate, с параметром cost типа int
        int distance = 1;
        int price = 63581;
        int miles = price / cost * distance;
        return miles;
        // возвращает miles типа int
    }
}
