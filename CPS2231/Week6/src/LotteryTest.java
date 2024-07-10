class LotteryTicket {
  private int ticketNumber;


  public LotteryTicket(int ticketNumber) {
    this.ticketNumber = ticketNumber;
  }
  public int getTicketNumber() {
    return ticketNumber;
  }
}

class LotteryWinner{
  private String name;
  private LotteryTicket[] tickets; // composition

  public LotteryWinner(String name, LotteryTicket[] tickets) {
    this.name = name;
    this.tickets = tickets;
  }


  public String getName() {
    return name;
  }

  public LotteryTicket[] getTickets() {
    return tickets;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Winner name: ").append(name).append("\n");

    for (LotteryTicket t : tickets) {
      sb.append(t.getTicketNumber()).append("\n");
    }
    return sb.toString();
  }
}
public class LotteryTest {
  public static void main(String[] args) {
    LotteryTicket ticket1 = new LotteryTicket(12345);
    LotteryTicket ticket2 = new LotteryTicket(67890);
    LotteryTicket[] tickets = {ticket1, ticket2};
    LotteryWinner winner = new LotteryWinner("John Doe", tickets);
    System.out.println(winner);
  }
}

