#include <stdio.h>

int main(){
    int n,k = 1,y = 0;
    scanf("%d",&n);
    for (int i = n; i >= 0 ;i--){     // made upside-down triangle of " "
        for (int j = 0; j < i ;j++){
            printf(" ");
        }
        for (int g = 0;g < y;g++){ // called for(...) with g < y where y = number of string
            printf("%d ",k);
            k = k + 1;
        }
        y = y + 1;
        printf("\n");
    } 
}
