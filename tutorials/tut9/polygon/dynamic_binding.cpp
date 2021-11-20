#include <iostream>
#include <memory>

#include "polygon.h"

void PrintArea(Polygon &polygon) {
    std::cout << "Area = " << polygon.CalculateArea() << std::endl;
}

int main(void) {
    std::shared_ptr<Rectangle> rectangle =
        std::make_shared<Rectangle>("Rectangle", 1.0f, 1.0f);
    std::shared_ptr<Triangle> triangle =
        std::make_shared<Triangle>("Triangle", 1.0f, 1.0f);
    PrintArea(*rectangle);
    PrintArea(*triangle);
}
