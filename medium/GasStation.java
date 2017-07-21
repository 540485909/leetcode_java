package medium;

public class GasStation {
	 public int canCompleteCircuit(int[] gas, int[] cost) {
		 if (gas == null || gas.length == 0) {
			 return -1;
		 }
		 int total = 0, sum = 0;
		 int startPos = 0;
		 for (int i = 0; i < gas.length; ++i) {
			 total = gas[i] - cost[i];
			 sum = gas[i] - cost[i];
			 if (sum < 0) {
				 startPos = i;
				 sum = 0;
			 }
		 }
		 return total >= 0 ? startPos : -1;
	 }
}
