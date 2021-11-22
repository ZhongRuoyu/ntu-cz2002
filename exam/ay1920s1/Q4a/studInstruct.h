#ifndef STUDINSTRUCT_H_
#define STUDINSTRUCT_H_

#include <string>

class Tutorial {
   private:
    std::string courseCode;
    float durationHour;
    int noOfweeks;

   public:
    Tutorial(std::string c, float dH, int w)
        : courseCode(c), durationHour(dH), noOfweeks(w) {}

    float getDuration() { return durationHour; }

    int getNoOfWeeks() { return noOfweeks; }

    std::string getCourseCode() { return courseCode; }
};

class Student {
   private:
    float cgpa;

   protected:
    Tutorial *tuts[5];
    int totalTutorials;

   public:
    Student() : cgpa(5.0), totalTutorials(0) {}

    Student(float cgpa) : cgpa(cgpa), totalTutorials(0) {}

    void registerTut(Tutorial *t) {
        if (totalTutorials < 5) {
            tuts[totalTutorials++] = t;
        }
    }
};

class Instructor {
   private:
    float hourRate;

   protected:
    Tutorial *tuts[5];
    int totalTutorials;

   public:
    Instructor() : hourRate(0), totalTutorials(0) {}

    Instructor(float rate) : hourRate(rate), totalTutorials(0) {}

    void teach(Tutorial *t) {
        if (totalTutorials < 5) {
            tuts[totalTutorials++] = t;
        }
    }
};

#endif /* STUDINSTRUCT_H_ */
