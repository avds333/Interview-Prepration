//Program of seive of eratosthenes
class SeiveOfEratosthenes
{
    SeiveOfEratosthenes()
    {
        //displaying prime number
        int num=100;
        //num+1 because we are considering nth element also, if num+1 is removed
        // ArrayIndexOutOfBound will occur
        boolean[] prime=new boolean[num+1];
        for(int i=2;i<=num;i++)
        {
          prime[i]=true;
        }
        // If we remove i*i condition from below , program will work fine , it will
        //impact the performance of the code.
        for(int i=2;i*i<=num;i++)
        {
              //Value of i will not be impacted because of i*i condition.
              System.out.println("Value of i ="+i);
              if(prime[i]==true)
              {

                  for(int j=i*2;j<=num;j+=i)
                  {
                      prime[j]=false;
                  }
              }
        }
        for(int i=2;i<=num;i++)
        {
            if(prime[i]==true)
            {
                System.out.print("| "+i+" || ");
            }
        }
    }
    public static void main(String...a)
    {
      new SeiveOfEratosthenes();
    }
}
