#include <stdio.h>
#include <math.h>

int isArmstrong(int num);

int main() {
    int number;
    printf("Enter a number: ");
    scanf("%d", &number);

    // if (isArmstrong(number)) {
    //     printf("%d is an Armstrong number.\n", number);
    // } else {
    //     printf("%d is not an Armstrong number.\n", number);
    // }
    isArmstrong(number);

    return 0;
}

int isArmstrong(int num) {
    int originalNum, remainder, result = 0, n = 0;
    originalNum = num;

    // store the number of digits in n
    while (originalNum != 0) {
        originalNum /= 10;
        ++n;
    }

    // originalNum = num;
  printf("%d",n);
    // calculate the sum of nth power of individual digits
    // while (originalNum != 0) {
    //     remainder = originalNum % 10;
    //     result += pow(remainder, n);
    //     originalNum /= 10;
    // }

    // if (result == num)
    //     return 1;
    // else
    //     return 0;
}
