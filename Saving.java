package Workshop2Banking;

public class Saving{
    public static void main(String[] args) {

        Banking.addInterestRate (0.04);

        Banking saver1 = new Banking(2000.0);
        saver1.calculateMonthlyInterest();
        System.out.println("This month:\nSaver 1 balance= "+ saver1.getSavingsBalance());

        Banking saver2 = new Banking (3000.0);
        saver2.calculateMonthlyInterest();
        System.out.println("Saver 2 balance= "+ saver2.getSavingsBalance());


        Banking.addInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        System.out.println("Next month:\nSaver 1 balance= "+ saver1.getSavingsBalance());

        saver2.calculateMonthlyInterest();
        System.out.println("Saver 2 balance= "+ saver2.getSavingsBalance());

    }
}
