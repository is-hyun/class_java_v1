package _oop_test.ch11;

public class Main {
    public static void main(String[] args) {
        PricePolicy pricePolicy = new WeekendPricePolicy();
        TicketService ticketService = new TicketService(pricePolicy);

        ticketService.reserve("오디세이", 10000);
    }
}
