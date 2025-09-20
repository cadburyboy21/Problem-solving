#include<stdio.h>
int main(){
    int N;
    printf("Enter the N Value: ");
    scanf("%d",&N);
    // int sum=(N*(N+1))/2;
    // printf("The Sum of %d",sum);

    // using loop
    int sum=0;
    for(int i=0;i<=N;i++){
        sum+=i;
    }
    printf("The Sum of %d",sum);
}