#ifndef ACCOUNT_H_
#define ACCOUNT_H_

#include <iostream>
#include <string>

class Account {
   private:
    std::string name;
    std::string accountNo;
    float amount;

   public:
    Account(std::string name, std::string accountNo, float amount)
        : name(name), accountNo(accountNo), amount(amount) {}

    float getAmount() { return amount; }

    void deposit(float amount) { this->amount += amount; }

    virtual void withdraw(float amount) {
        if (this->amount >= amount) {
            this->amount -= amount;
        } else {
            std::cerr << "Over Limit!" << std::endl;
        }
    }
};

class PrivilegedAccount : public Account {
   private:
    float limit;

   public:
    PrivilegedAccount(std::string name, std::string accountNo, float amount,
                      float limit)
        : Account(name, accountNo, amount), limit(limit) {}

    void withdraw(float amount) {
        if (amount <= this->getAmount() && amount <= limit) {
            Account::withdraw(amount);
        } else {
            std::cerr << "Over Limit!" << std::endl;
        }
    }
};

#endif /* ACCOUNT_H_ */
