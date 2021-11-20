#include "polygon.h"

#include <iostream>
#include <string>

Polygon::Polygon(std::string name, float width, float height)
    : name_(name), width_(width), height_(height), type_(POLY_PLAIN) {}

PolygonType Polygon::GetType() const { return type_; }

std::string Polygon::GetName() const { return name_; }

void Polygon::PrintWidthHeight() const {
    std::cout << "Width = " << width_ << " Height = " << height_ << std::endl;
}

Rectangle::Rectangle(std::string name, float width, float height)
    : Polygon(name, width, height) {
    type_ = POLY_RECT;
}

float Rectangle::CalculateArea() const { return width_ * height_; }

Triangle::Triangle(std::string name, float width, float height)
    : Polygon(name, width, height) {
    type_ = POLY_TRIANG;
}

float Triangle::CalculateArea() const { return width_ * height_ / 2.0f; }
