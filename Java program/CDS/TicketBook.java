package CDS;
abstract class Transport{
    abstract void ticketbook();
    void CheckAvailablity(){
        System.out.println("Checking availablity");
    }
}
class Bus extends Transport{
    void ticketbook(){
        System.out.println("Bus ticket booked");
    }
}

public class TicketBook {
    public static void main(String[] args) {
        Bus t=new Bus();
        t.CheckAvailablity();
        t.ticketbook();
    }
}
