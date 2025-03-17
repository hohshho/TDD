package chap03;

import java.time.LocalDate;

public class ExpiryDateCalculator {
    public LocalDate calculateExpiryDate(PayData payData) {
//        return billingDate.plusMonths(1);
        return payData.getBillingDate().plusMonths(1);
    }
}
