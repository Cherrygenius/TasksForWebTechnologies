#include <string>
#include <sstream>
#include <iomanip>

std::string rgb_to_hex(int r, int g, int b)
{
    if (r < 0)   r = 0;
    if (r > 255) r = 255;
    if (g < 0)   g = 0;
    if (g > 255) g = 255;
    if (b < 0)   b = 0;
    if (b > 255) b = 255;

    std::ostringstream oss;
    oss << std::hex << std::uppercase
        << std::setfill('0') << std::setw(2) << r
        << std::setfill('0') << std::setw(2) << g
        << std::setfill('0') << std::setw(2) << b;

    return oss.str();
}