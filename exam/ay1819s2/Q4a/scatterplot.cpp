#include "scatterplot.h"

#include <iostream>

void ScatterPlot::plot() { std::cout << "plotting..." << std::endl; }

void ScatterPlot::draw() {
    axes.draw();
    std::cout << "drawing..." << std::endl;
}

int main() {
    ScatterPlot s("hello", "title", "x", "y", std::vector<Data>());
    s.draw();
    s.plot();
}
