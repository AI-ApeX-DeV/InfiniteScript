#include <iostream>

int add_num(int a,int b)
{
    return a+b;
}

int main()
{
    int a{5};
    int b{6};

    std::cout<<add_num(a,b)<<std::endl;
    return 0;
}