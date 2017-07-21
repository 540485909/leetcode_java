package easy;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
        	return -1;
        }
        int count = 1;
        int curValue = nums[0];
        for (int i = 1; i < nums.length; ++i) {
        	if (count == 0) {
        		curValue = nums[i];
        		count = 1;
        	}
        	else if (nums[i] == curValue) {
        		count++;
        	} else {
        		count--;
        	}
        }
        return curValue;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
