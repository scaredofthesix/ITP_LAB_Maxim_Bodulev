#include <stdio.h>

int main(){
    int n,m;
    scanf("%d%d", &n,&m);
    int array[n][n];
    for (int i = 0;i < n;i++){
        for (int j = 0;j < m;j++){
            scanf("%d",&array[i][j]);
        }
    }
    for (int i = 0;i < n;i++){
        for (int j = 0;j < m;j++){
            printf("%d ",array[i][j]);
        }
        printf("\n");
    }
    return 0;

}
