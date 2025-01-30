#include <stdio.h>
int main() {
    int Age = 40;
    double gpa = 3.6;
    char grade = 'A';
    char Name[] = "Freecode Academy";

    printf("%d \n", Age);  // %d for integers
    printf("%.2f \n", gpa);  // %.2f for doubles with 2 decimal places
    printf("%c \n", grade);  // %c for characters
    printf("%s", Name);  // %s for strings

    return 0;
}