#include <stdio.h>

int main(){
    char str[7] = "string";
    char *str_1 = &str[0];
    printf("%s",str_1);
}
