package Workshop2Banking;

public class Banking {

    private static double SavingInterest;
    private static double savingBalance;

    public Banking(double savingsBalance){
        setSavingsBalance(savingsBalance);
    }
    public void setSavingsBalance(double savingsBalance){
        savingBalance = savingsBalance;
    }
    public static void addInterestRate(double newInterestRate){
        if(newInterestRate >= 0.0f)
            SavingInterest = newInterestRate;
        else
            System.out.println("interest rate must be >= 0.0f");
    }
    public double getSavingsBalance(){
        return savingBalance;
    }
    public void calculateMonthlyInterest(){
        savingBalance += (savingBalance * SavingInterest) / 12;
    }
    public String toString(){
        return String.format("%.2f", getSavingsBalance());
    }

}
