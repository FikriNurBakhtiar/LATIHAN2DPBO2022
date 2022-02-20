#include <bits/stdc++.h>
#include "Memory.cpp"
#include "Product.cpp"
#include "Hardware.cpp"
using namespace std;

int main()
{
    Memory PC;

    PC.setPrice(200);
    PC.setIdPRoduct(1412);
    PC.setBrand("Asus");
    PC.setModel("K-14");
    PC.setFrequency(100);
    PC.setMemory(512);
    PC.setCUDA("Yes");


    cout<<"Price            : " << PC.getPrice() << endl;
    cout<<"ID Product       : " << PC.getIdProduct() << endl;
    cout<<"Brand            : " << PC.getBrand() << endl;
    cout<<"Model            : " << PC.getModel() << endl;
    cout<<"Frequency        : " << PC.getFrequency() << endl;
    cout<<"Memory Size      : " << PC.getMemory() << endl;
    cout<<"Support CUDA     : " << PC.getCUDA() << endl;

    return 0;
}