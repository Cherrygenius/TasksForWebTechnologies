#include <bitset>
#include <iostream>
#include <algorithm>

unsigned int countBits(unsigned long long n){
    std::string x = std::bitset<64>(n).to_string();
    int count = std::count(x.begin(), x.end(), '1');
    return count;
}