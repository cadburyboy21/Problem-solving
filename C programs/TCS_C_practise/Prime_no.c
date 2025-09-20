#include <stdio.h>
#include <stdbool.h>

int main() {
    int n = 29;
    bool isPrime = true;

    for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0) {
            isPrime = false;
            break;
        }
    }

    if (isPrime)
        printf("Prime");
    else
        printf("Not Prime");

    return 0;
}
