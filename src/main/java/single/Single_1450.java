package single;

/**
 * 1450. 在既定时间做作业的学生人数
 * @author ca1m
 */
public class Single_1450 {

	public static void main(String[] args) {
		
		int[] startTime = new int[] {4};
		int[] endTime = new int[] {4};
		int queryTime = 4;
		
		System.out.println(busyStudent(startTime, endTime, queryTime));
	}

	public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {

		int count = 0;
		for (int i = 0; i < startTime.length; i++) {
			count += queryTime >= startTime[i] && queryTime <= endTime[i] ? 1 : 0;
		}
		return count;
    }
	
}
