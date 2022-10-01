#include<iostream>
#include <bits/stdc++.h>
using namespace std;
void zero(int a[],int n){
    int i,j,count=0;
    for(i=0;i<n;i++){
       if(a[i]!=0){
        swap(a[i],a[count]);
        count++;
       }
        }
    
    for(i=0;i<n;i++)
    {
        cout<<"\n"<<a[i];
    }
}
int main(){
    int i,n,a[100];
    cin>>n;
    for(i=0;i<n;i++){
        cin>>a[i];
    }
    cout<<"new array is";
    zero(a,n);
    return 0;
}