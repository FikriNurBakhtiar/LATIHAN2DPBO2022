#include <bits/stdc++.h>
#include "Hardware.cpp"
using namespace std;

class Memory : public Hardware
{
    private:
        int memorySize;
        int frequency;
        string supportCuda;

    public:
        Memory(){}

        //GetSet untuk MemorySize
        void setMemory(int memorySize)
        {
            this->memorySize = memorySize;
        }

        int getMemory()
        {
            return this->memorySize;    
        }

        //Getset untuk Frequency
        void setFrequency(int frequency)
        {
            this->frequency = frequency;
        }

        int getFrequency()
        {
            return this->frequency;
        }

        //GetSet untuk SupportCUDA
        void setCUDA(string supportCuda)
        {
            this->supportCuda = supportCuda;
        }

        string getCUDA()
        {
            return this->supportCuda;
        }


        ~Memory(){}

};