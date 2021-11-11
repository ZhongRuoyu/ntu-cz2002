#ifndef CHILD_ANIMAL_H_
#define CHILD_ANIMAL_H_

#include <string>

#include "animal.h"

class Dog : public Mammal {
   public:
    Dog(std::string n, COLOR c, std::string o);

    ~Dog();

    void eat() const;

    void move() const;

    void speak() const;

   private:
    std::string owner;
};

class Cat : public Mammal {
   public:
    Cat(std::string n, COLOR c, std::string o);

    ~Cat();

    void eat() const;

    void move() const;

    void speak() const;

   private:
    std::string owner;
};

class Lion : public Mammal {
   public:
    Lion(std::string n, COLOR c, std::string o);

    ~Lion();

    void eat() const;

    void move() const;

    void speak() const;

   private:
    std::string owner;
};

#endif /** CHILD_ANIMAL_H_ **/