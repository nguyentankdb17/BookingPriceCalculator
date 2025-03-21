public class BookingPriceCalculator {
    public static double calculateBookingPrice(int infants, int children, int adults, double basePrice) {
        int totalPassengers = infants + children + adults;

        if (infants < 0 || children < 0 || adults < 0 || basePrice < 0) {
            return -1; //Invalid input
        }

        if (totalPassengers == 0 || totalPassengers > 10) {
            return -1; //Outside valid range of total passengers
        }

        if (infants > adults) {
            return -1; //Each Infant must be accompanied with at least one adult
        }

        // Total Price
        double totalPrice = (adults * basePrice) + (children * 0.8 * basePrice) + (infants * 0.2 * basePrice);

        // Discount
        if (totalPrice > 7 * basePrice) {
            totalPrice = totalPrice * 0.9; // Discount 10%
        } else if (totalPrice > 5 * basePrice) {
            totalPrice = totalPrice * 0.95; // Discount 5%
        }

        // Additional fee for infants
        if (infants >= 3) {
            totalPrice = totalPrice + infants * 0.05 * basePrice;
        }

        return totalPrice;
    }
}
