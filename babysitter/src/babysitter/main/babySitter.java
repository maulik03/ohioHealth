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

    // below method is to calculate the pay from the bedtime  to midnight
    private static int pay_from_badtime_to_midnight(int start, int bed, int end) {
        int pay = 0;

        if (bed <= MIDNIGHT) {
        	pay += (MIDNIGHT - bed) * payfrombedtomidnight;
        }
        else if (start <= bed) {
        	pay += (MIDNIGHT - bed) * payfrombedtomidnight;
        }
        else {
            pay += (MIDNIGHT - start) * payfrombedtomidnight;
        }
        System.out.println("This is the pay for bed time to midnight => $ "+pay);
        return pay;
    }

    //below method is to calculate the pay from the midnight to end time
    private static int pay_from_midnight_to_endtime (int start,int bed ,int end) {
        int pay = 0;

        if (end < MIDNIGHT) {
            if (start <= MIDNIGHT) {
                pay += (end)* payfrommidnighttoend;
            } else {
                pay += (end - MIDNIGHT) * payfrommidnighttoend;
            }
        }
        else if (end == MIDNIGHT) {
        	pay += (0) * payfrommidnighttoend;
        }
        System.out.println("This is the pay for midnight to end time => $ "+pay);
        return pay;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int total_pay = 0;
		total_pay +=pay_from_Starttime_to_bedtime(5,8,4);
        total_pay +=pay_from_badtime_to_midnight(5,8,4);
        total_pay += pay_from_midnight_to_endtime(5,8,4);
        

	}

}
