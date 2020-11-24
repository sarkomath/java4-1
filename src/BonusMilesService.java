public class BonusMilesService {
    // создан класс BonusMilesService
    public int calculate(int cost) {
        // создан класс calculate, с параметром cost типа int
        int TicketMiles = 20;
        int distance = 1;
        int miles = cost / TicketMiles * distance;
        return miles;
        // возвращает miles типа int
    }
}
