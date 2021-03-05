/**
 * 
 */
package babysitter.main;

/**
 * @author maulikparikh
 *
 */
public class babySitter {

	/**
	 * @param args
	 */
	
	
	private static int Payfromstarttobed = 12;
    private static int payfrombedtomidnight = 8;
    private static int payfrommidnighttoend = 16;
    private static int MIDNIGHT = 12;
    
    //below method is to calculate the pay from start time to bed time
    
    private static int pay_from_Starttime_to_bedtime(int start, int bed, int end) {
        int pay = 0;

        if (start < bed) {
            if (bed < MIDNIGHT) {
                pay += (bed - start) * Payfromstarttobed;
            } else {
                pay += (MIDNIGHT - start) * Payfromstarttobed;
            }
        }
        System.out.println("This is the pay for start time to bed time => $ "+pay);
        return pay;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pay_from_Starttime_to_bedtime(5,8,4);

	}

}
