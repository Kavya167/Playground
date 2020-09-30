#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,res=1;
	cin>>n;
  for(int i=n;i>0;i--)
  {
    res=res*i;
  }
  cout<<"The factorial of "<<n<<" is "<<res;
}