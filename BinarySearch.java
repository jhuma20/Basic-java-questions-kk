public class BinarySearch {
    public static void main(String[] args)
    {
           int[] a={2,3,4,5,6,7,8,9};
           int srch=4;
           int l=0;
           int h=a.length-1;
           int mid=(l+h)/2;

           while(l<=h)
           {
            if(a[mid]==srch)
            {
                System.out.println("element is at"+mid+"index position");
                break;
            }
            else if(a[mid]<srch)
            {
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
            mid=(l+h)/2;
        }
        if(l>h)
        {
            System.out.println("element not found");
        }

    }
}
