#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    double s,r,w,p;
    //r=3,w=2,p=4;
    cout<<"enter the value of r: "<<endl;
    cin>>r;
    cout<<"enter the value of w:"<<endl;
    cin>>w;
    cout<<"enter the value of p:"<<endl;
    cin>>p;
    s=(double)(r*r+r*pow(w,p))/(r+w);
    cout<<"value of s = "<< s;
}
