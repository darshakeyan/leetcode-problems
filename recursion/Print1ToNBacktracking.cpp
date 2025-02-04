#include<bits/stdc++.h>
using namespace std;


// backtracking recursion technique where it print and move ahead
void printName(int i,int n) {
    if (i<1) return; // base condition where you have to stopped...
    printName(i-1,n);
    cout<<i<<endl;
}

int main() {
    int n = 5;
    printName(n,n);
}