#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=0;
 
  cout<<"Enter the value of n"<<endl;
  cin>>n;
   int n1=n;
  while(n!=0)
  {
    n=n/10;
    sum=sum+1;
  }
  cout<<"The number of digits in "<<n1<<" is "<<sum;
}