#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,flag=0;
  cin>>n;
  for(int i=2;i<n/2;i++)
  {
    if(n%i==0)
    {
      flag=1;
      break;
    }
    else
    {
      flag=0;
    }
  }
  if(flag)
  {
    cout<<"Not a Prime Number";
  }
  else
  {
    cout<<"Prime Number";
  }
    return 0;
}