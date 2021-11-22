#ifndef DATA_H_
#define DATA_H_

#include <string>

class Data {
   private:
    double x;
    double y;

   public:
    Data(double x, double y) : x(x), y(y) {}
};

class Axes {
   private:
    std::string title;
    std::string xAxis;
    std::string yAxis;

   public:
    Axes(std::string title, std::string x, std::string y)
        : title(title), xAxis(x), yAxis(y) {}

    void draw() {}
};

#endif /* DATA_H */
