#include<bits/stdc++.h>
using namespace std;

int sumOfNumber(int n, int sum) {
  if (n<1) {
    return sum;
  }
  return sumOfNumber(n-1, sum + n);
}

int main() {
    int n = 6;
    cout << sumOfNumber(n, 0);
}