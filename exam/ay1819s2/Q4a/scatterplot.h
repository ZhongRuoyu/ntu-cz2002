#ifndef SCATTERPLOT_H_
#define SCATTERPLOT_H_

#include <string>
#include <vector>

#include "Data.h"
#include "IDrawable.h"
#include "IPlottable.h"

class ScatterPlot : public IDrawable, public IPlottable {
   private:
    std::string desc;
    std::vector<Data> data;
    Axes axes;

   public:
    ScatterPlot(std::string desc, std::string title, std::string x,
                std::string y, const std::vector<Data> &d)
        : desc(desc), data(d), axes(title, x, y) {}

    void plot();

    void draw();
};

#endif /* SCATTERPLOT_H_ */
