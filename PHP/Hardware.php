<?php
    
    class Hardware extends Product
    {
        private $Brand = "";
        private $Model = "";

        function __construct(){
        }

        function setBrand($Brand)
        {
            $this->Brand = $Brand;
        }

        function getBrand()
        {
            return $this->Brand;
        }

        function setModel($Model)
        {
            $this->Model = $Model;
        }

        function getModel()
        {
            return $this->Model;
        }

        function __destruct(){
        }
    }

?>