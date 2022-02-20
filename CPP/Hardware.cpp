#include <bits/stdc++.h>
#include "Product.cpp"
using namespace std;

class Hardware : public Product
{
    private: 
        string Brand;
        string Model;

    public:
        Hardware(){
        }

        //GetSet untuk Brand
        void setBrand(string Brand)
        {
            this->Brand = Brand;
        }

        string getBrand()
        {
            return this->Brand;
        }

        //GetSet untuk Model
        void setModel(string Model)
        {
            this->Model = Model;
        }

        string getModel()
        {
            return this->Model;
        }


        ~Hardware(){}

};