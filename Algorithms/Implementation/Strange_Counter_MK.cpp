#include <bits/stdc++.h>

using namespace std;

// Complete the strangeCounter function below.
long strangeCounter(long t) {
    long a = 1;
    long temp;
    while(t >= a) {
        temp = a;
        a = (2*a) + 2;
    }
    long topcount = a - temp;
    long reduce = t - temp;
    long answer = topcount - reduce;
    return answer;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    long t;
    cin >> t;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    long result = strangeCounter(t);
    cout << result;
    fout << result << "\n";

    fout.close();

    return 0;
}
