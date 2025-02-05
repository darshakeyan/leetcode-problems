#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n; // total size of array 
    cin >> n;
    
    int array[n]; // give array
    for (int i=0; i<n; i++) {
      cin >> array[i]; // taking input from the user for each array elements
    }
    
    // precompute the hash or pre storing 
    int hash[13] = {0};
    
    for (int i=0; i<n; i++) {
      hash[array[i]] += 1;
    }
    
    int q; // total size of queries number
    cin >> q;
    
    while (q--) {
      int number;
      cin >> number; // taking query from user
      // fetching
      cout << number << "->" << hash[number] << endl;
    }
    

    
    return 0;
}