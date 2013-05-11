
public class Elements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] kiosk_q1 = {42, 48, 50};
		int[] kiosk_q2 = {52, 58, 60};
		int[] kiosk_q3 = {46, 49, 58};
		int[] kiosk_q4 = {50, 51, 61};
		
		int[] outlet_q1 = {57, 63, 60};
		int[] outlet_q2 = {70, 67, 73};
		int[] outlet_q3 = {67, 65, 62};
		int[] outlet_q4 = {72, 69, 75};
		
		int[] sum = new int[12];
		int total = 0;
		
		for(int i = 0; i < kiosk_q1.length; i++) {
			sum[i] = kiosk_q1[i] + outlet_q1[i];
			sum[i+3] = kiosk_q2[i] + outlet_q2[i];
			sum[i+6] = kiosk_q3[i] + outlet_q3[i];
			sum[i+9] = kiosk_q4[i] + outlet_q4[i];
		}
		
		for (int i = 0; i < sum.length; i++) {
			System.out.println("Month " + (i+1) + " sales:\t" + sum[i]);
			total += sum[i];
		}
		
		System.out.println("TOTAL YEAR SALES\t" + total);
		
	}

}
