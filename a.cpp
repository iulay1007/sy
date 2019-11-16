#include<stdio.h>
int main(){
	int a,b,c,d,e,f,g,h,i;
	int K;//Çó|A| 
	int A,B,C,D,E,F,G,H,I;
	scanf("%d%d%d%d%d%d%d%d%d",&a,&b,&c,&d,&e,&f,&g,&h,&i);
	K=a*e*i+d*h*c+b*f*g-(c*e*g+b*d*i+f*h*a);
	A=e*i-h*f;
	B=-(d*i-f*g);
	C=d*h-e*g;
	D=-(b*i-c*h);
	E=a*i-c*g;
	F=-(a*h-b*g);
	G=b*f-c*e;
	H=-(a*f-c*d);
	I=a*e-b*d; 
	printf("|A|=%d\n",K); 
	printf("%d  %d  %d\n",A,B,C);
	printf("%d  %d  %d\n",D,E,F);
	printf("%d  %d  %d\n",G,H,I);
	
//	1 2 -1 2 1 3 -3 0 1
	
	return 0;
}
