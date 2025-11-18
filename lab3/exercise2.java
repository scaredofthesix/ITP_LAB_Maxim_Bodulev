#include <stdio.h>

int how_many(int *array,int before_element,int element){//how many times this element met before
    int count = 0;
    for (int i = 0;i <= before_element;i++){
        if (element == array[i]){
            count++;
        }
    }
    return count;
}

int main(){
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int j = 0;j < n;j++){
        scanf("%d", &arr[j]);
    }
    for(int j = 0;j < n;j++){
        if (how_many(arr,j,arr[j]) == 1){//if element met only 1 time we get it
            printf("%d ",arr[j]);
        }
    }
    return 0;
}
