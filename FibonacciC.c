
int main() {
    int n,i,j;
    printf("Inserte un n \n");
    scanf("%d",&n);
    printf("Serie de Fibonacci hasta n es: ");
    j = 0;
    for (i = 1 ; i <= n ; i++)
    {
        printf("%d ", fibonacci(j));
        j++;
    }
    
}


int fibonacci(int n)
{
    int i;
    int f1 = 0;
    int f2 = 1;
    int fibo;
 
    if(n == 0)
        return 0;
    if(n == 1)
        return 1;
 
    for(i = 2 ; i <= n ; i++ )
    {
        fibo = f1 + f2;
        f1 = f2;
        f2 = fibo;
    }
    return fibo;
}
