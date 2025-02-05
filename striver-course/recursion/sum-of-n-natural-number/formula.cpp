#include<bits/stdc++.h>
using namespace std;

int sumOfNumber(int n) {
  int sum = n * (n+1) / 2;
  return sum;
}

int main() {
    int n = 5;
    cout << sumOfNumber(n);
}