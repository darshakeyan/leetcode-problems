#include<bits/stdc++.h>
using namespace std;

int sumOfNumber(int n) {
  if (n==0) return 0;
  return n + sumOfNumber(n-1);
}

int main() {
    int n = 5;
    cout << sumOfNumber(n);
}

// sumOfNaturalNumbers(N) = N + sumOfNaturalNumbers(N-1);
