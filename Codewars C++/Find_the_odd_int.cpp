#include <vector>

int findOdd(const std::vector<int>& numbers) {
    int result = 0;
    for (int x : numbers) {
        result ^= x;
    }
    return result;
}