#include <stdio.h>
struct student{
    int rollno;
    char name[20];
};
int main() {
   struct student std1={01,"Vishva"};
   struct student *ptr=&std1;
   printf("Roll num: %d\n",(*ptr).rollno);
   printf("Name: %s",ptr->name);

    return 0;
}