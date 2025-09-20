#include <stdio.h>
int main(){
    int num;
    printf("Enter the value: ");
    scanf("%d",&num);

    if(num > 0){
        printf("It's a Positive Number");
    }
    else if(num < 0){
        printf("It's a Negative Number");
    }
    else{
        printf("It's Zero");
    }
    return 0;
}
