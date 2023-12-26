#include <iostream>
using namespace std;

int main()
{
    int age;
    string name;
    string fullname;

    cout << "Enter your name: ";
    cin >> name;

    cout << "Enter your full name: ";
    getline(cin, fullname);

    cout << "Enter your age: ";
    cin >> age;

    cout << "Welcome " << name << ", your full name is " << fullname << " and your age is " << age << endl;
    return 0;
}
