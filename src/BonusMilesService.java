public class BonusMilesService {
    // создан класс BonusMilesService
    public int calculate(int cost) {
        // создан класс calculate, с параметром cost типа int
        int ticket_miles = 20;
        int distance = 1;
        int miles = cost / ticket_miles * distance;
        return miles;
        // возвращает miles типа int
    }
}
