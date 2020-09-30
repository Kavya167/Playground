#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,base,i=0,temp,b[100];
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  cout<<"Enter the base to which you want to convert"<<endl;
    cin>>base;
  while(n!=0)
  {
   temp=n%base;
    n=n/base;
    b[i]=temp;
    i=i+1;
  }
  i=i-1;
  cout<<"The number in base "<<base<<" is ";
  for(int j=i;j>=0;j--){
    cout<<b[j];}
}