/**
 * 
 */
package package1;

/**
 * @author chiran
 *
 */
public class Advert {
	private final double unit_time=15;	
	private final double cost=20;

	
	//declare the number of ads the user wants to run
	private int numOfAds=0;

	
	public Advert(int numOfAds) {
		this.numOfAds = numOfAds;

	}
	//the logic to compute the cost of preparing the campaign
	public double GetCost() {
		double price=0;

		price = numOfAds*(cost*unit_time);
		return price;
	}
	
	public int getSize() {
		return numOfAds;
	}
	
	public void setnumOfAds(int numOfAds1) {
		numOfAds = numOfAds1;
	}
//	public String getCrustType() {
//		return CrustType;
//	}
//	public void setCrustType(String crustType) {
//		CrustType = crustType;
//	}
	
	

	public String toString() {
		return "Hello World";
	}
}
