public class SecondLargest1 {
    public static void main(String[] args)
    {
      int[] a={6,8,2,4,5,7};
      int temp;
      for(int i=0; i<a.length; i++)
      {
        for( int j=i+1; j<a.length;j++)
        {
if(a[i]<a[j])
//for smallest element we just change the sign
{
    temp = a[i];
    a[i] = a[j];
    a[j] = temp;

        }
      }
    }
    System.out.println("second largest element is"+a[1]);
}
}
