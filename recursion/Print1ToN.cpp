#include<bits/stdc++.h>
using namespace std;


// forwarding recursion technique where it print and move ahead
void printName(int i,int n) {
    if (i>n) return;
    cout<<i<<endl;
    printName(i+1,n);
}

int main() {
    int n = 5;
    printName(1,n);
}