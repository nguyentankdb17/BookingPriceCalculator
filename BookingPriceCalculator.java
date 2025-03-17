public class BookingPriceCalculator {
    public static double calculateBookingPrice(int infants, int children, int adults, double basePrice) {
        int totalPassengers = infants + children + adults;

        if (adults < 0 || children < 0 || adults < 0 || basePrice < 0) {
            return -1; //Invalid input
        }

        if (totalPassengers > 10) {
            return -1; //Exceeding number of total passengers
        }

        if (infants > adults) {
            return -1; //Each Infant must be accompanied with at least one adult
        }

        // Total Price
        double totalPrice = (adults * basePrice) + (children * 0.8 * basePrice) + (infants * 0.2 * basePrice);

        // Discount
        if (totalPrice > 8 * basePrice) {
            totalPrice = totalPrice * 0.9; // Discount 10%
        } else if (totalPrice > 5 * basePrice) {
            totalPrice = totalPrice * 0.95; // Discount 5%
        }

        // Additional fee for infants
        if (infants >= 4) {
            totalPrice = totalPrice * 1.1;
        }

        return totalPrice;
    }
}
