#include <bits/stdc++.h>
#include <algorithm>
#include <cmath>
#include <string>

using namespace std;

// Complete the encryption function below.
/*string encryption(string s) {


}*/

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string str;
    getline(cin, str);
    std::string::iterator end_pos = std::remove(str.begin(), str.end(), ' ');
    str.erase(end_pos, str.end());
    int a, b, row, col;
    float z;
    int L = str.length();
    z = sqrt(str.length());
    b = ceil(z);
    a = b - 1;
    if((a * a) >= L) {
        row = a;
        col = a;
    }
    else if((a * b) >= L) {
        row = a;
        col = b;
    }
    else {
        row = b;
        col = b;
    }
    int ctr = L;
    int m = 0;
    char carray[row][col];
    for(int i = 0; i < row; i++) {
        if(ctr == 0)
            break;
        for(int j = 0; j < col; j++) {
            carray[i][j] = str[m];
            m++;
            ctr--;
        }
    }
    string result;
    int index = 0;
    for(int i = 0; i < col; i++) {
        for(int j = 0; j < row; j++) {
            if(carray[j][i] == '\0')
                break;
            else {
                fout << carray[j][i];
                cout << carray[j][i];
            }
        }
        fout << " ";
        cout << " ";
    }
    cout << result;

    //string result = encryption(s);

    //fout << result << "\n";

    fout.close();

    return 0;
}
