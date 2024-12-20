public interface LoyaltyProgram {
    void awardPoints(Customer customer, int points);
    int getCustomerPoints(Customer customer);
}

