#include <iostream>

#include "bubble.h"

int main() {
    std::cout << "\n\n Enter number of Integer elements to be sorted: ";

    int n;
    std::cin >> n;

    int a[n];
    for (int i = 0; i <= n - 1; i++) {
        std::cout << "\n\n Enter integer value for element no." << i + 1
                  << " : ";
        std::cin >> a[i];
    }

    Bubble bubble(a, n);
    bubble.Sort();

    std::cout << "\n\n Finally sorted array is: " << bubble.ToString()
              << std::endl;
}
