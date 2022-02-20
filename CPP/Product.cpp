class Product
{
    private:
        int Price;
        int IdProduct;

    public:

        Product(){}

        //GetSet untuk Price
        void setPrice(int Price)
        {
            this->Price = Price;
        }

        int getPrice()
        {
            return this->Price;
        }

        //GetSet untuk IdProduct
        void setIdPRoduct(int IdProduct)
        {
            this->IdProduct = IdProduct;
        }

        int getIdProduct()
        {
            return this->IdProduct;
        }

        ~Product(){}
    
};