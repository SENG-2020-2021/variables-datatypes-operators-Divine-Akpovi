class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   int x=30;  //x=days paid
   int y= 1;  //y= days defaulted
   // declare variables days the debtor defaulted, amount the debtor is to pay per day,amount the debtor paid and assign values to them
   int sum =0;
   int sum1=0;
   int i=0;
   //Declare the variable of the total amount the debtor is to pay, the days the debtor paid for, amount the debtor is left to pay, days the debtor has not payed for
    for (i=0;i<=x; i++)
   // calculate and print total amount the debtor is to pay
      {
        if(i=30)
   // calculate and print the days the debtor paid for
          {
            continue;sum=sum+i;
          }
  // calculate and print the amount whose day was not captured because the amount was incomplete
           system.out.println(sum)
   // calculate and print amount the debtor is left to pay
       else if (i=30)
   // calculate and print days the debtor has not payed for
       {
         break;
         sum1=sum-y;
       }
   //kindly remove the statement below when you are done with the assignment

    System.out.println("Hello world!");
  }
}