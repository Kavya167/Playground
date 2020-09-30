#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  int a[n],sum=0;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    if(a[i]%2==1)
    {
      sum=sum+a[i];
    }
    
 }
  cout<<"The sum of the odd elements in the array is "<<sum;
  return 0;
}