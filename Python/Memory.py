from Hardware import Hardware


class Memory(Hardware):
    __Frequency = ""
    __MemorySize = 0
    __CUDA = ""
    
    def __init__(self, Frequency = "", MemorySize = 0, CUDA = ""):
        self.__Frequency = Frequency
        self.__MemorySize = MemorySize
        self.__CUDA = CUDA
        
    def setFrequency(self, Frequency):
        self.__Frequency = Frequency
        
    def getFrequency(self):
        return self.__Frequency
    
    def setMemory(self, MemorySize):
        self.__MemorySize = MemorySize
        
    def getMemory(self):
        return self.__MemorySize
    
    def setCUDA(self, CUDA):
        self.__CUDA = CUDA
        
    def getCUDA(self):
        return self.__CUDA


    def printMemory(self):
        print("Frequency        : " + str(self.__Frequency))
        print("Memory Size      : " + str(self.__MemorySize))
        print("Support CUDA     : " + str(self.__CUDA))
        