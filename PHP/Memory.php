<?php

    class Memory extends Hardware
    {
        private $memorySize = 0;
        private $frequency = 0;
        private $supportCUDA = "";

        function __construct(){
        }

        function setMemory($memorySize)
        {
            $this->memorySize = $memorySize;
        }

        function getMemory()
        {
            return $this->memorySize;
        }

        function setFrequency($frequency)
        {
            $this->frequency = $frequency;
        }

        function getFrequency()
        {
            return $this->frequency;
        }

        function setCUDA($supportCUDA)
        {
            $this->supportCUDA = $supportCUDA;
        }

        function getCUDA()
        {
            return $this->supportCUDA;
        }

        function __destruct(){
        }
    }

?>