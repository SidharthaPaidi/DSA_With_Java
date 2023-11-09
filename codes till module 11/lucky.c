#include <stdio.h>

int main(int argc, char const *argv[])
{
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);

    if (num == 5 || num == 6 || num == 3)
    {
        printf("Lottery\n");
    }
    else
    {
        printf("Bad luck\n");
    }
    
    return 0;
}
