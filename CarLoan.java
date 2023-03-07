/*
 * Program that calculates a car payment using parameters
 */
public class CarLoan 
{
  int carLoan;
  int loanLength;
  int interestRate;
  int downPayment;

  public CarLoan(int loanAmount, int loanDuration, int interestPer, int downPay)
  {
    carLoan = loanAmount;
    loanLength = loanDuration;
    interestRate = interestPer;
    downPayment = downPay;
  }

	public static void main(String[] args)
  {
    CarLoan loan = new CarLoan(10000,3,5,2000);
    loan.checkLoan();
   
	}
  public void checkLoan()
  {
    if(loanLength <= 0)
    {
      System.out.println("Error! You must take out a valid car loan.");
    }
    else if(downPayment >= carLoan)
    {
      System.out.println("The car can be paid in full.");
    }
    else
    {
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance/months;
      int interest = (monthlyBalance * interestRate)/100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.println(monthlyPayment);
    }
  }
}