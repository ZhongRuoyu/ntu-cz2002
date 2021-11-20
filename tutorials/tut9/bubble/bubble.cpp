#include "bubble.h"

#include <cstring>
#include <string>

Bubble::Bubble(int a[], int n) : a_(new int[n]), n_(n) {
    std::memcpy(a_, a, n * sizeof(int));
}

void Bubble::Sort() {
    for (int i = n_ - 2; i >= 0; i--) {
        for (int j = 0; j <= i; j++) {
            if (a_[j] > a_[j + 1]) {
                int t = a_[j];
                a_[j] = a_[j + 1];
                a_[j + 1] = t;
            }
        }
    }
}

std::string Bubble::ToString() const {
    std::string result;
    for (int i = 0; i <= n_ - 1; i++) {
        result.append(std::to_string(a_[i]) + " ");
    }
    return result;
}
