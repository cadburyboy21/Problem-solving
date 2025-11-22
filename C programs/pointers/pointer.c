#include <stdio.h>
// int main(){
    // int k;
    // k=5;
    // int *ptr=&k;
    // printf("%d\n",ptr);
    // printf("%d",*ptr);

struct Student {
    int id;
    char name[20];
};

int main() {
    struct Student s1 = {101, "Poovarasan"};
    struct Student *ptr = &s1;

    // Accessing members using ->
    printf("ID: %d\n", ptr->id);
    printf("Name: %s\n", ptr->name);

    return 0;
}

