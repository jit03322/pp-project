#include <stdio.h>
int amicable(int a){
    int sum=0;
    for(int i=1;i<a;i++){
        if(a%i==0){
sum+=i;
        }
    }
    return sum;
}
void check(int a,int b){
    if(amicable(a)==b&&amicable(b)==a){
        printf("given pairs of numbers are amicable ");
    }else{
        printf("given pairs of numbers are not amicable");
    }
    return ;
}
int main(){int a,b;
printf("enter the numbers\t");
scanf("%d %d",&a,&b);
check(a,b);
    return 0;
}