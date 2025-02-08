#include <bits/stdc++.h>
using namespace std;

void selectionSort(int arr[], int n) {
  for (int i=0; i<n-1; i++) { // loop start from first element
    for (int j=i+1; j<n; j++) { // comparing rest elements with first
      if (arr[j] < arr[i]) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
  }
  cout << "Selection Sorted Array" << endl;
  for (int i=0; i<n; i++) {
    cout << arr[i] << " ";
  }
}

int main() 
{
    int arr[] = {13,46,24,52,20,9};
    int n = sizeof(arr)/sizeof(arr[0]); 
    selectionSort(arr, n);
    return 0;
}