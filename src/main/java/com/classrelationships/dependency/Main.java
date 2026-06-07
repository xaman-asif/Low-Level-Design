package com.classrelationships.dependency;

public class Main {
  public static void main(String[] args) {
    TicketBookingService bookingService = new TicketBookingService();

    // All dependencies are created externally and passed in
    SeatValidator validator = new SeatValidator();
    PaymentProcessor payment = new PaymentProcessor();
    QRCodeGenerator qrGenerator = new QRCodeGenerator();
    EmailService emailService = new EmailService();

    bookingService.bookTicket("CONF-2025", "A12", "alice@example.com",
        99.99, validator, payment, qrGenerator, emailService);
  }
}
