#include<bits/stdc++.h>
using namespace std;

int sumOfNumber(int n) {
  int sum = 0;
  for (int i=1; i<=n; i++) {
    sum += i;
  }
  return sum;
}

int main() {
    int n = 6;
    cout << sumOfNumber(n);
}

// Time Complexity: O(N)
// Space Complexity: O(1)