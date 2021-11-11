#include <iostream>
#include <string>

#include "animal.h"
#include "child_animal.h"

COLOR get_color(std::string prompt) {
    std::cout << "(1) Green (2) Blue (3) White (4) Black (5) Brown"
              << std::endl;
    while (true) {
        int choice;
        std::cout << prompt << std::flush;
        std::cin >> choice;
        if (choice < 1 || choice > 5) {
            std::cerr << "Choice unknown." << std::endl;
            continue;
        }
        switch (choice) {
            case 1: {
                return Green;
            }
            case 2: {
                return Blue;
            }
            case 3: {
                return White;
            }
            case 4: {
                return Black;
            }
            case 5: {
                return Brown;
            }
        }
    }
}

int main(void) {
    const int ZOO_SIZE = 10;
    Mammal **const zoo = new Mammal *[ZOO_SIZE];
    // Animal **const zoo = new Animal *[ZOO_SIZE];
    // This does not work because eat() is from Mammal
    size_t animal_count = 0;
    while (true) {
        std::cout << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit"
                  << std::endl;
        std::cout << "Select the animal to send to Zoo: " << std::flush;
        int choice;
        std::cin >> choice;
        if (choice < 1 || choice > 5) {
            std::cerr << "Choice unknown." << std::endl;
            continue;
        }
        if (choice == 5) {
            break;
        }
        switch (choice) {
            case 1: {
                if (animal_count == ZOO_SIZE) {
                    std::cerr << "Zoo is full." << std::endl;
                    continue;
                }
                std::cout << "Enter the dog's name: " << std::flush;
                std::string name;
                std::getline(std::cin >> std::ws, name);

                COLOR color = get_color("Enter the dog's color: ");

                std::cout << "Enter the dog's owner: " << std::flush;
                std::string owner;
                std::getline(std::cin >> std::ws, owner);

                zoo[animal_count++] = new Dog(name, color, owner);
                break;
            }
            case 2: {
                if (animal_count == ZOO_SIZE) {
                    std::cerr << "Zoo is full." << std::endl;
                    continue;
                }
                std::cout << "Enter the cat's name: " << std::flush;
                std::string name;
                std::getline(std::cin >> std::ws, name);

                COLOR color = get_color("Enter the cat's color: ");

                std::cout << "Enter the cat's owner: " << std::flush;
                std::string owner;
                std::getline(std::cin >> std::ws, owner);

                zoo[animal_count++] = new Cat(name, color, owner);
                break;
            }
            case 3: {
                if (animal_count == ZOO_SIZE) {
                    std::cerr << "Zoo is full." << std::endl;
                    continue;
                }
                std::cout << "Enter the lion's name: " << std::flush;
                std::string name;
                std::getline(std::cin >> std::ws, name);

                COLOR color = get_color("Enter the lion's color: ");

                std::cout << "Enter the lion's owner: " << std::flush;
                std::string owner;
                std::getline(std::cin >> std::ws, owner);

                zoo[animal_count++] = new Lion(name, color, owner);
                break;
            }
            case 4: {
                for (size_t i = 0; i < animal_count; ++i) {
                    zoo[i]->move();
                    zoo[i]->speak();
                    zoo[i]->eat();
                }
                break;
            }
        }
    }
    for (size_t i = 0; i < animal_count; ++i) {
        delete zoo[i];
    }
    delete[] zoo;
}
