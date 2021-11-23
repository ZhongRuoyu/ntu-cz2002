#include <iostream>
#include <string>

class iLivingthing {
   public:
    virtual void grow() = 0;
};

class Animal : public iLivingthing {
   private:
    int age;

   public:
    Animal() : age(0) {}

    Animal(int age) : age(age) {}

    int getAge() { return age; }

    void grow() { std::cout << "Eat well to grow" << std::endl; }

    virtual void speak() { std::cout << "Sound" << std::endl; }
};

class Cat : public Animal {
   private:
    std::string name;

   public:
    Cat(int age, std::string name) : Animal(age), name(name) {}

    void speak() { std::cout << "Meow" << std::endl; }
};

class Dog : public Animal {};

int main() {
    Animal *a1 = new Cat(2, "Snow");
    std::cout << a1->getAge() << std::endl;
    a1->grow();
    a1->speak();
    Animal *a2 = new Dog();
    std::cout << a2->getAge() << std::endl;
    a2->grow();
    a2->speak();
}
