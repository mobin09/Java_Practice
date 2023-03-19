package opps;

class Loan {
	// Common loan logics
	private float interest;
	private float duation;
	private int priciple;

	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
	}

	public float getDuation() {
		return duation;
	}

	public void setDuation(float duation) {
		this.duation = duation;
	}

	public int getPriciple() {
		return priciple;
	}

	public void setPriciple(int priciple) {
		this.priciple = priciple;
	}

}

class EducationLoan extends Loan {
	private float eduInterest = super.getInterest();

	public float getEduInterest() {
		if (eduInterest <= 10.0) {
			eduInterest = 10.5f;
		}
		return eduInterest;
	}

	public void setEduInterest(float eduInterest) {
		this.eduInterest = eduInterest;
	}

	public void disPlayInterest() {
		System.out.println("Your Interest is:" + eduInterest);
	}

}

public class LaunchInh {

	public static void main(String[] args) {
		EducationLoan ed1 = new EducationLoan();
		ed1.setEduInterest(9.5f);

		System.out.println(ed1.getEduInterest());

	}

}
