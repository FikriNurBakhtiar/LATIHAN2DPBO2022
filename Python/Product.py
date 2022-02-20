class Product():
    __Price = 0
    __IdProduct = 0
    
    
    def __init__(self, Price = 0, IdProduct = 0):
        self.__Price = Price
        self.__IdProduct = IdProduct
        
        
    def setPrice(self, Price):
        self.__Price = Price
        
    def getPrice(self):
        return self.__Price
    
    def setIdProduct(self, IdProduct):
        self.__IdProduct = IdProduct
        
    def getIdProduct(self):
        return self.__IdProduct
    
    def printProduct(self):
        print("Price            : " + str(self.__Price))
        print("Id Product       : " + str(self.__IdProduct))