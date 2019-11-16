#include<stdio.h>
int main()
{
	int a;
	scanf("%d",&a);
if(a%3200==0||a%100==0&&a%400!=0)
printf("N\n");

else if(a%4==0)
	printf("Y\n");
else
printf("N\n");
	return 0;
}
