#include <iostream>

using namespace std;

int main() {
    // // sum of the value from 1 to 10
    // int sum = 0, val = 1;
    // while (val <= 10) {
    //     sum += val;
    //     val++;
    // }
    // return sum;
    // //rewrite using for loop
    // int sum = 0;
    // for (int val = 1; val <= 10; val++) {
    //     sum += val;
    // }
    // return sum;
    // //exercise
    // int sum = 0, val = 50;
    // while (val <= 100) {
    //     sum += val;
    //     val++;
    // }
    // return sum;
    // //Exercise 1.11
    // cout << "Please enter two integers" << endl;
    // int i, j;
    // cin >> i >> j;
    // for (int v = i; v <= j; v++) {
    //     cout << v << endl;
    // }
    // rewrite using while loop;
    // cout << "Please enter two integers" << endl;
    // int i , j;
    // cin >> i >> j;
    // int val = i;
    // while (val <= j) {
    //     cout << val << endl;
    // }
    // int sum = 0, val = 0;
    // while (cin >> val) {
    //     sum += val;
    // }
    // cout << sum << endl;
    // return sum;

    int a = 10;
    // int &b; //error: declaration of reference variable 'b' requires an initializer
    int &b = a;
    b = 2;
    a--;
    cout << b << endl;
    int c = b;

    b = c; //不能rebind,不会显示语法错误，但是b还是refer to a
    c++;
    cout << a << endl;
    cout << c << endl;
    cout << b << endl;

    int *p = &a;
    int *q = p;
    cout << p << endl;
    cout << q << endl;  


    

}