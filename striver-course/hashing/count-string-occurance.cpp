#include <bits/stdc++.h>
using namespace std;

int main() 
{
    string s;
    cin >> s;
    
    // precompute the hash 
    int charOfHash[26] = {0};
    
    for (int i=0; i<s.size(); i++) {
      charOfHash[s[i]-'a']++;
    }

    int q;
    cin >> q;
    
    while (q--) {
      char ch;
      cin >> ch;
      
      // fetching
      cout << ch << "->" << charOfHash[ch-'a'] << endl;;
    }
    
    return 0;
}