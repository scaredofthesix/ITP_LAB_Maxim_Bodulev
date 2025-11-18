#include <stdio.h>

enum a{
    monday = 1,tuesday,wednesday,thursday,friday,saturday,sunday
};


int main(){
    int n;
    scanf("%d",&n);
    switch(n){
        case monday:printf("Monday");break;
        case tuesday:printf("Tuesday");break;
        case wednesday:printf("Wednesday");break;
        case thursday:printf("Thursday");break;
        case friday:printf("Friday");break;
        case saturday:printf("Satsurday");break;
        case sunday:printf("Sunday");break;
    return 0;

    }
}
