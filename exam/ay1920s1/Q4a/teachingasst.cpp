#include <iostream>
#include <string>

#include "studInstruct.h"

class TeachingAsst : public Student, public Instructor {
   private:
    int minReqHours;

   public:
    TeachingAsst(int mhours, float cgpa, float r)
        : minReqHours(mhours), Student(cgpa), Instructor(r) {}

    bool checkConflict() {
        for (size_t i = 0; i < Student::totalTutorials; ++i) {
            for (size_t j = 0; j < Instructor::totalTutorials; ++j) {
                if (Student::tuts[i]->getCourseCode() ==
                    Instructor::tuts[j]->getCourseCode()) {
                    return true;
                }
            }
        }
        return false;
    }
};

int main() {
    TeachingAsst *ta = new TeachingAsst(100, 4.9, 100);  // add your code
    Tutorial *t1 = new Tutorial("CZ2002", 1, 13);        // add your code
    Tutorial *t2 = new Tutorial("CZ2005", 1, 13);        // add your code
    // .....

    ta->registerTut(t1);
    ta->teach(t1);
    ta->teach(t2);
    std::cout << (ta->checkConflict() ? "true" : "false") << std::endl;

    delete ta;
    delete t1;
    delete t2;
}
