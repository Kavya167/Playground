#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
 int max;
  cout<<"Enter the size of the array"<<endl;
  cin>>n;
   int a[n];
  cout<<"Enter "<<n<<" elements of an array"<<endl;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  max=a[0];
  for(int i=1;i<n;i++)
  {
    if(max<a[i])
    {
      max=a[i];
    }
  }
  cout<<"Maximum element in the array is "<<max;
}