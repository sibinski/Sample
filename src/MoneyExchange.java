public static void main(String[] args) {
    double doubleAmountInUSD = 100;
    double exchangeRateUSDToEUR = 0.85;// (1 USD equals 0.85 EUR)
    System.out.println("Money amount in USD: $" + doubleAmountInUSD);
    doubleAmountInUSD *= exchangeRateUSDToEUR;
    double doubleAmountInEuro = doubleAmountInUSD;
    System.out.println("Money amount in Euro after exchange: " + doubleAmountInEuro + " Euro.");
    double remainingBalance = doubleAmountInEuro - 55;
    remainingBalance /= exchangeRateUSDToEUR;
    double remainingBalanceInUSD = remainingBalance;
    System.out.printf("Remaining balance in USD is: $%.2f", remainingBalanceInUSD);
}
