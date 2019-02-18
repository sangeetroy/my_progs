#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    double a,b,c,s;
    //a=2,b=2,c=1;
    cout<<"enter the value of a:";
    cin>>a;
    cout<<"enter the value of b:";
    cin>>b;
    cout<<"enter the value of c:";
    cin>>c;
    s=double(a*pow(b*c))/(b+c);
    cout<<"value of s"<<s;
}
