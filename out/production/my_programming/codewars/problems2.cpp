#include <string>
#include <vector>

using namespace std;

string likes(const vector<string> &names)
{
    string ans = "";
    if (names.size() == 0)
    {
        ans = "no one likes this";
    }
    else if (names.size() == 1)
    {
        ans = names[0] + " likes this";
    }
    else if (names.size() == 2)
    {
        ans = names[0] + " and " + names[1] + " like this";
    }
    else if (names.size() == 3)
    {
        ans = names[0] + ", " + names[1] + " and " + names[2] + " like this";
    }
    else if (names.size() >= 4)
    {
        ans = names[0] + ", " + names[1] + " and " + to_string(names.size() - 2) + " others like this";
    }
    return ans;
}