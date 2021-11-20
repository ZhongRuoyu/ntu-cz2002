#ifndef POLYGON_H_
#define POLYGON_H_

#include <iostream>
#include <string>

enum PolygonType { POLY_PLAIN, POLY_RECT, POLY_TRIANG };

class Polygon {
   protected:
    std::string name_;
    float width_;
    float height_;
    PolygonType type_;

   public:
    Polygon(std::string name, float width, float height);

    PolygonType GetType() const;

    std::string GetName() const;

    virtual float CalculateArea() const = 0;

    void PrintWidthHeight() const;
};

class Rectangle : public Polygon {
   public:
    Rectangle(std::string name, float width, float height);

    float CalculateArea() const;
};

class Triangle : public Polygon {
   public:
    Triangle(std::string name, float width, float height);

    float CalculateArea() const;
};

#endif /* POLYGON_H_ */
