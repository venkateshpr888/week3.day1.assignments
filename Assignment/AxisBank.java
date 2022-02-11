package week3.day1.Assignment;

public class AxisBank extends BankInfo {
	public void deposit()
	{
		System.out.println("Maximum Deposit Amount is anything greater than 1000");
		
		}
	public static void main(String[] args) {
		BankInfo info = new BankInfo();
		AxisBank bank = new AxisBank();
		info.deposit();
		info.fixed();
		info.saving();
		bank.deposit();
		
	}

}
class BankInfo
{
	void saving()
{
	System.out.println("Using Savings Account");
	
	}
void fixed()
{
	System.out.println("Using Fixed Deposit");
	
	}
void deposit()
{
	System.out.println("Minimum Deposit Amount is 1000");
	
	}
	}
