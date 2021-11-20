#ifndef BUBBLE_H_
#define BUBBLE_H_

#include <string>

class Bubble {
   private:
    int *const a_;
    const int n_;

   public:
    Bubble(int a[], int n);

    void Sort();

    std::string ToString() const;
};

#endif /* BUBBLE_H_ */
