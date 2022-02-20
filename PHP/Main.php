<?php
    include "Product.php";
    include "Hardware.php";
    include "Memory.php";

    $laptop = new Memory();
    $laptop->setPrice(200);
    $laptop->setIdProduct(1412);
    $laptop->setBrand("Asus");
    $laptop->setModel("K-14");
    $laptop->setFrequency(200);
    $laptop->setMemory(512);
    $laptop->setCUDA("Yes");

    echo "Spesifikasi Laptop". "<br>". "<br>";

    echo "Price             : " . $laptop->getPrice(). "<br>";
    echo "ID Product        : " . $laptop->getIdProduct(). "<br>";
    echo "Brand             : " . $laptop->getBrand(). "<br>";
    echo "Model             : " . $laptop->getModel(). "<br>";
    echo "Frequency         : " . $laptop->getFrequency(). "<br>";
    echo "Memory Size       : " . $laptop->getMemory(). "<br>";
    echo "Support Cuda      : " . $laptop->getCUDA(). "<br>";

?>