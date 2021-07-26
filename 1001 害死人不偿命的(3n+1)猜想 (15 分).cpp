#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int findN(int n){
    int count=0;
    if(n<1){
        return false;
    }
    while(n!=1){
        if(n%2 == 0){
            n=n/2;
            count++;
        }
        else{
            n=(3*n+1)/2;
            count++;
        }
        
    }
    return count;
}
int main()
{
    int n;
     cin>>n;
    cout<<findN(n);
    return 0;
}
//Í¨¹ý£¬Âú·Ö  
