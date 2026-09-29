package _oop_test.ch11;

public class TicketService {
    private PricePolicy pricePolicy;

    public TicketService(PricePolicy pricePolicy) {
        this.pricePolicy = pricePolicy;
    }
    public void reserve(String movieTitle, int price){
        Ticket newticket = new Ticket(movieTitle, price);

        int finalPrice = pricePolicy.calculate(newticket.getPrice());
        System.out.println("[" + newticket.getMovieTitle() + "] 예약 완료 | " + finalPrice + "원");
    }
}
