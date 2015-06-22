#include<iostream>
#include<sstream>

int main(int argc, char** argv)
{
    if ( argc < 2 ){
        std::cout << "Need to have an argument!" << std::endl;
        return 0;
    }

    std::istringstream ss(argv[1]);
    int x;
    if(ss >> x && x < 2){
        std::cerr << "Invalid number" << argv[1] << '\n';
        return 0;
    }

    std::cout << x << std::endl;


    return 0;
}
