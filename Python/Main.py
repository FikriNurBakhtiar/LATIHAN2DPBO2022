from Memory import Memory
from Hardware import Hardware
from Product import Product

Laptop = Memory()
Laptop.setPrice(200)
Laptop.setIdProduct(1412)
Laptop.setBrand("Asus")
Laptop.setModel("K-14")
Laptop.setFrequency(20)
Laptop.setMemory(512)
Laptop.setCUDA("Yes")

print("Spesifikasi Laptop")

Laptop.printProduct()
Laptop.printHardware()
Laptop.printMemory()

