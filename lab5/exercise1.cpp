#include <stdio.h>
#include <stdlib.h>

struct b{
    unsigned int data: 5;
    unsigned int mounth : 4;
    unsigned int year:7;
};

int main(){
    struct b birthday = {30,1,7};
    printf("%d\n",birthday.data);
    printf("%d\n",birthday.mounth);
    printf("%d\n",birthday.year);
    return 0;
}
