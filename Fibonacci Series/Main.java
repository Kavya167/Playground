#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a=0,b=1,c=0;
  cin>>n;
  if(n==1)
    cout<<a;
  else if(n==2)
    cout<<b;
  else
  {
    for(int i=2;i<n;i++)
    {
      c=a+b;
      a=b;
      b=c;
    }
    cout<<"The term "<<n<<" in the fibonacci series is "<<c;
  }
}