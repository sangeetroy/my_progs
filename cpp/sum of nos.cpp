#include<iostream>
using namespace std;
int main ()
{
    int N,d,s=0;
    cin>>N;
    while(N>0)
    {
        d=N%10;
        s=s+d;
        N=N/10;
    }
    cout<<"sum="<<s;
}
