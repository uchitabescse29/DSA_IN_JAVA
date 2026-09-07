package Arrays;

public class merge2sortarray {
    public static void main(String[] args) {
        int []a={2,5,6,9};
        int []b={1,3,4,5,10,11};
        int c[]=new int[a.length+b.length];
        merge(c,a,b);
      for(int ele:c) System.out.println(ele+" ");
      System.out.println();
    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i=0,j=0,k=0;
        while(i<a.length&&j<b.length){
            if(a[i]<b[j]){
               c[k]=a[i];
               i++;
               k++;

            }else{
                c[k]=b[j];
                j++;
                k++;
            }
        
        }
        if(i==a.length){
           while(j<b.length){
              c[k]=b[j];
                j++;
                k++;
            }
        }
      if(b.length==j){
        while(i<a.length){
        c[k]=a[i];
               i++;
               k++;
      }
      }
    
       
        
      }
    }

