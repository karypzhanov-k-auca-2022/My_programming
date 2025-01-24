#include <string>
#include<iostream>

using namespace std;

string string_expansion(const string& s) {
    string res = "";
    int num = 0;
    bool has_num = false;
    
    for(char letter : s){
        if(isdigit(letter)){
            num = letter - '0';
            has_num = true;
        }else{
            if(has_num){
                res += string(num, letter); // letter NUM times
            }else{
                res+= letter; // add if no number
            }
        }
    }

    return res;
}