from Product import Product



class Hardware(Product):
    __Brand = ""
    __Model = ""
    
    def __init__(self, Brand = "", Model = ""):
        self.__Brand = Brand
        self.__Model = Model
        
    def setBrand(self, Brand):
        self.__Brand = Brand
        
    def getBrand(self):
        return self.__Brand
    
    def setModel(self, Model):
        self.__Model = Model
    
    def getModel(self):
        return self.__Model
    
    def printHardware(self):
        print("Brand            : " + str(self.__Brand))
        print("Model            : " + str(self.__Model))