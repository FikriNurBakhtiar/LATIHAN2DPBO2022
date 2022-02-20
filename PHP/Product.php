<?php

    class Product 
    {
        private $Price = 0;
        private $IdProduct = 0;

        function __construct(){
        }

        function setPrice($Price)
        {
            $this->Price = $Price;
        }

        function getPrice()
        {
            return $this->Price;
        }

        function setIdProduct($IdProduct)
        {
            $this->IdProduct = $IdProduct;
        }

        function getIdProduct()
        {
            return $this->IdProduct;
        }

        function __destruct(){
        }
    }
?>