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

    virtual ~Animal();

    virtual void move() const = 0;

    virtual void speak() const;

   private:
    std::string _name;
    COLOR _color;
};

class Mammal : public Animal {
   public:
    Mammal(std::string n, COLOR c);

    ~Mammal();

    virtual void eat() const;

    void move() const;
};

#endif /** ANIMAL_H_ */
