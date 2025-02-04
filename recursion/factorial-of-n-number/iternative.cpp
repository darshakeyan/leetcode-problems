#include<bits/stdc++.h>
using namespace std;

int factorial(int n) {
 int fact = 1;
 if (n == 1) return fact;
 for (int i=1; i<=n; i++) {
   fact *= i;
 }
 return fact;
}

int main() {
    int n = 0;
    cout << factorial(n);
}