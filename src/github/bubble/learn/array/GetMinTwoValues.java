package github.bubble.learn.array;

public class GetMinTwoValues {
	
	public int[] GetMinTwoValuesBySort(int[] array)
	{
		if(array==null)
		{
			return null;
		}
		else if(array.length<3)
		{
			return array;
		}
		int[] minValuesList=new int[2];
		
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		minValuesList[0]=array[0];
		minValuesList[1]=array[1];
		return minValuesList;
	}
	
	
	public int[] GetMinTwoValuesToCompare(int[] array)
	{
		if(array==null)
		{
			return null;
		}
		else if(array.length<3)
		{
			return array;
		}
		int a=array[0];
		int b=array[1];
		if(a>b)
		{
			int temp=a;
			a=b;
			b=temp;
		}
		
		for(int i=2;i<array.length;i++)
		{
			if(a>array[i])
			{
				b=a;
				a=array[i];
			}else
			{
				if(b>array[i])
				{
					b=array[i];
				}
			}
		}
		int[] minValuesList=new int[]{a,b};
		return minValuesList;
	}
}
