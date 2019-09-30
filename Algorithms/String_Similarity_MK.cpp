#include <bits/stdc++.h>

using namespace std;

int main()
{

    int t;
    cin >> t;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    ofstream fout(getenv("OUTPUT_PATH"));
    for (int t_itr = 0; t_itr < t; t_itr++) {
        string s;
        long long int i;
        long long int ctr = 0;
        getline(cin, s);
        for(i = 0; i < s.length(); i++){
            if(s[i]==s[i+1])
                ctr++;
            else break;
        }
        long long int similarity=s.length() + ((ctr*ctr)+ctr)/2;
        //long long int result = stringSimilarity(s);
        for(i=ctr+1;i<s.length();i++){
            int j=0;
            while(s[j]==s[i+j]){
                similarity++;
                j++;
            }       
        }
        fout << similarity << "\n";
    }

    fout.close();

    return 0;
}

