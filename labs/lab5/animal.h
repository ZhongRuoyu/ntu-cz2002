#ifndef ANIMAL_H_
#define ANIMAL_H_

#include <iostream>
#include <string>

enum COLOR { Green, Blue, White, Black, Brown };

std::string color_to_string(COLOR color);

class Animal {
   public:
    Animal();

    Animal(std::string n, COLOR c);

    virtual ~Animal() {
        std::cout << "destructing Animal object " << _name << std::endl;
    }

    virtual void speak() const { std::cout << "Animal speaks" << std::endl; }

    virtual void move() const = 0;

   private:
    std::string _name;
    COLOR _color;
};

class Mammal : public Animal {
   public:
    Mammal(std::string n, COLOR c);

    ~Mammal();

    void move() const;

    virtual void eat() const { std::cout << "Mammal eats" << std::endl; }
};

#endif /** ANIMAL_H_ */
