#include "child_animal.h"

#include <iostream>
#include <string>

Dog::Dog(std::string n, COLOR c, std::string o) : Mammal(n, c), owner(o) {
    std::cout << "constructing " << o << "'s Dog object " << n << " with color "
              << color_to_string(c) << std::endl;
}

Dog::~Dog() { std::cout << "destructing Dog object" << std::endl; }

void Dog::speak() const { std::cout << "Dog woofs" << std::endl; }

void Dog::move() const { std::cout << "Dog moves" << std::endl; }

void Dog::eat() const { std::cout << "Dog eats" << std::endl; }

Cat::Cat(std::string n, COLOR c, std::string o) : Mammal(n, c), owner(o) {
    std::cout << "constructing " << o << "'s Cat object " << n << " with color "
              << color_to_string(c) << std::endl;
}

Cat::~Cat() { std::cout << "destructing Cat object" << std::endl; }

void Cat::speak() const { std::cout << "Cat meows" << std::endl; }

void Cat::move() const { std::cout << "Cat moves" << std::endl; }

void Cat::eat() const { std::cout << "Cat eats" << std::endl; }

Lion::Lion(std::string n, COLOR c, std::string o) : Mammal(n, c), owner(o) {
    std::cout << "constructing " << o << "'s Lion object " << n
              << " with color " << color_to_string(c) << std::endl;
}

Lion::~Lion() { std::cout << "destructing Lion object" << std::endl; }

void Lion::speak() const { std::cout << "Lion roars" << std::endl; }

void Lion::move() const { std::cout << "Lion moves" << std::endl; }

void Lion::eat() const { std::cout << "Lion eats" << std::endl; }
