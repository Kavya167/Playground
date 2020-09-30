#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int a[n],sum=0;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    sum=sum+a[i];
  }
  cout<<sum;
}