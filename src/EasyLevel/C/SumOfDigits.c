#include <stdio.h>
#include <string.h>

void printSum(char[]);

int main(int argC, char ** argV) {
	FILE *fPointer = fopen(argV[1], "r");
	char number[255];

	while(fgets(number, 255, fPointer))
	{
		printSum(number);
	}
	return 0;
}

void printSum(char number[]) {
	int count = 0;
	int sum = 0;
	for(int i = 0; i < strlen(number); i++)
	{
		if(number[count] != '\n' && number[count] - '0' >= 0)
		{	
			sum += number[count] - '0';
		}
		count++;
	}
	printf("%d\n", sum);
}