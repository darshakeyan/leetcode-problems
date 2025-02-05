
#include <cmath>

bool checkArmstrong(int n){
	if (n < 0) return false;

	int originalNumber = n;
	int sum = 0;

	int numDigit = (n == 0) ? 1 : (int)log10(n) + 1;

	while (n > 0) {
		int lastDigit = n % 10;
		sum += pow(lastDigit, numDigit);
		n = n/10;
	}
	return sum == originalNumber;
}



