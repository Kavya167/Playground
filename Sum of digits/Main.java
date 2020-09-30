#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,temp,sum=0;
 
  cout<<"Enter the value of n"<<endl;
  cin>>n;
   int n1=n;
  while(n!=0)
  {
    
    temp=n%10;
    n=n/10;
    sum=sum+temp;
  }
  cout<<"The sum of digits in "<<n1<<" is "<<sum;
}