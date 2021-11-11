#include "animal.h"

#include <iostream>
#include <string>

#include "child_animal.h"

std::string color_to_string(COLOR color) {
    switch (color) {
        case Green: {
            return "Green";
        }
        case Blue: {
            return "Blue";
        }
        case White: {
            return "White";
        }
        case Black: {
            return "Black";
        }
        case Brown: {
            return "Brown";
        }
    }
}

Animal::Animal() : _name("unknown") {
    std::cout << "constructing Animal object " << _name << std::endl;
}

Animal::Animal(std::string n, COLOR c) : _name(n), _color(c) {
    std::cout << "constructing Animal object " << n << " with color "
              << color_to_string(c) << std::endl;
}

Mammal::Mammal(std::string n, COLOR c) : Animal(n, c) {
    std::cout << "constructing Mammal object " << n << " with color "
              << color_to_string(c) << std::endl;
}

Mammal::~Mammal() { std::cout << "destructing Mammal object" << std::endl; }

void Mammal::move() const { std::cout << "Mammal moves" << std::endl; }