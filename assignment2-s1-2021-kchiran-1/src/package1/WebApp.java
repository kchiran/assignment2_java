/**
 * 
 */
package package1;

/**
 * @author chiran
 *
 */
public class WebApp extends Advert {
	private final double unit_time=15;	
	private final double cost=20;
	private int numOfAds=0;

	/**
	 * @param numOfAds
	 */
	
	public WebApp(int numOfAds) {
		super(numOfAds);
		// TODO Auto-generated constructor stub
	}
	public double GetCost() {
		double price=0;

		price = numOfAds*(cost*unit_time);
		return price;
	}

}
