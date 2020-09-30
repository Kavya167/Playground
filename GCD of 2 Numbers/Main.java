#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,gcd;
  cin>>n>>m;
  int max=n>m?n:m;
  while(1)
  {
    if(n%max==0 && m%max==0)
    {
      gcd=max; 
      break;
    }
    else
      max--;
  }
  cout<<"G.C.D of "<<n<<" and "<<m<<" = "<<gcd;	
  return 0;
}