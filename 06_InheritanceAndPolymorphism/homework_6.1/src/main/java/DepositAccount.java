import java.time.LocalDate;

public class DepositAccount extends BankAccount {
  LocalDate lastIncome;
  @Override
  public void take(double amountToTake) {
    if (balance >= amountToTake){
      super.take(amountToTake);
      lastIncome = LocalDate.now();
    }

  }
}