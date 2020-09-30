#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m;
  cin>>n;
  int a[n],flag=1;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cin>>m;
  for(int i=0;i<n;i++)
  {
    if(a[i]==m)
    {
      cout<<m<<endl;
      flag=1;
      break;
      
    }
    else
    {
      flag=0;
    }
  }
  if(!flag)
  {
    cout<<"The number is not present in the list";
  }
  return 0;
}
      