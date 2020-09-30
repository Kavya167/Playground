#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,temp,i=0;
  cin>>n;
  int a[20];
  while(n!=0)
  {
    temp=n%2;
    n=n/2;
    a[i]=temp;
    i++;
  }
  i=i-1;
  for(int j=i;j>=0;j--)
  {
    cout<<a[j];
  }
}