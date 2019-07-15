import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class FraudulentActivityNotifications {
	private static double computeAverage(int num1, int num2)
	{
		return ((double)num1 + (double)num2) / 2;
	}

	private static boolean check(int expenditure, double median)
	{
		if(expenditure >= (2 * median))
			return true;

		return false;
	}
	private static double getMedian(int[] medianArray)
	{
		int d = medianArray.length;
		double median;

		if(d % 2 == 1) // odd
		{
			int medianPosition = (d + 1) / 2;
			int medianIndex = medianPosition - 1;

			median = (double) medianArray[medianIndex];
		}
		else // even
		{
			int medianPosition1 = d/2;
			int medianPosition2 = d/2 + 1;

			int medianIndex1 = medianPosition1 - 1;
			int medianIndex2 = medianPosition2 - 1;

			median = computeAverage(medianArray[medianIndex1],medianArray[medianIndex2]);
		}
		return median;
	}
	public static void main(String[] args) {
		
		  int [] expenditure = {2, 3, 4, 2, 3, 6, 8, 4, 5}; int d=5;
		 

		/*
		 * int[] expenditure = { 1, 2, 3, 4, 4 }; int d = 4;
		 */
		int a= computeNotifications(expenditure,d);
		System.out.println(a);

	}
	
	public static int computeNotifications(int[] expenditures, int d)
	{
		int n = expenditures.length;
		int notifications = 0;

		Queue<Integer> medianArray = new LinkedList<Integer>();

		int i = 0;
		while(i < n)
		{
			if(medianArray.size() < d)
				medianArray.add(expenditures[i]);
			
			else
			{
				int[] medianSortedArray = sortMedianArray(medianArray);
				double median = getMedian(medianSortedArray);

				boolean toNotify = check(expenditures[i],median);
				if(toNotify)
					notifications++;

				medianArray.remove();
				medianArray.add(expenditures[i]);
			}

			i++;
		}

		return notifications;
	}
	private static int[] sortMedianArray(Queue<Integer> subArray)
	{
		int maxIndex = (Integer) Collections.max(subArray,null);
		int[] countArray = new int[maxIndex+1];

		int d = subArray.size();
		ArrayList<Integer> subArrayAsList = new ArrayList<Integer>(subArray);

		for(int elem : subArrayAsList)
			countArray[elem]++;

		int[] sortedMedianArray = new int[d];
		int index = 0;

		for(int i = 0; i < countArray.length; i++)
		{
			int repeat = countArray[i];
			while(repeat > 0)
			{
				sortedMedianArray[index++] = i;
				repeat--;
			}
		}

		return sortedMedianArray;
	}
}
