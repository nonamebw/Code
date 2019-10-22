/*
include <iostream>
#include <cstdio>
#include <algorithm>
#include <map>
#include <set>
#include <cmath>
#include <vector>
#include <string.h>
        #include <stack>
#include <queue>
#include <unordered_map>
#include <string>
#define X first
        #define Y second
        #define forn(i,n) for(int i=0;i<n;i++)
        #define pb push_back
        using namespace std;
        typedef long long ll;
        typedef pair<int, int> pii;
        const int INF = 0x3f3f3f3f;
        const long long MOD = 1e9+7;
        const long long MAXN = 5010;
        using namespace std;

        string ans, s;
        int n, k;
        int main(){
        cin>>n>>k>>ans;
        s.append(n, '0');
        cout<<s<<endl;

        for(int i=0;i<n;i++) {
        if(i == 0){
        s[0] = ans[0];
        continue;
        }

        int p = 0;
        for(int j=i-1;j>=0 && i-j+1<=k;j--) {
        p ^= (s[j]=='0'?0:1);
        }
        int k = p ^ (ans[i]=='0'?0:1);
        s[i] = (k==0)?'0':'1';
        }
        cout<<s<<endl;
        }




        #include <iostream>
#include <cstdio>
#include <algorithm>
#include <map>
#include <set>
#include <cmath>
#include <vector>
#include <string.h>
        #include <stack>
#include <queue>
#include <unordered_map>
#include <string>
#define X first
        #define Y second
        #define forn(i,n) for(int i=0;i<n;i++)
        #define pb push_back
        using namespace std;
        typedef long long ll;
        typedef pair<int, int> pii;
        const int INF = 0x3f3f3f3f;
        const long long MOD = 1e9+7;
        const long long MAXN = 5010;
        using namespace std;

        int n, a[MAXN], ans[MAXN];
        int main(){
        cin>>n;
        for(int i=1;i<=n;i++) {
        cin>>a[i];
        ans[i] = 100;
        }

        if(n == 1) {
        cout<<100<<endl;
        return 0;
        }

        vector<int> low;
        for(int i=1;i<=n;i++) {
        if(i == 1 && a[i] <= a[i+1]){
        low.pb(i);
        continue;
        }
        if(i == n && a[n] <= a[n-1]){
        low.pb(i);
        continue;
        }

        if(a[i] <= a[i-1] && a[i]<=a[i+1]) {
        low.pb(i);
        }
        }

        bool vis[MAXN];
        queue<int> q;
        memset(vis, false, sizeof(vis));
        for(auto x: low) {
        q.push(x);
        }

        while(!q.empty()) {
        int top = q.front(); q.pop();


        if(vis[top]) continue;
        else vis[top] = true;

        if(top+1<=n && a[top+1] > a[top]) {
        ans[top+1] = ans[top]+100;
        if(!vis[top+1])
        q.push(top+1);
        }
        if(top-1>=1 && a[top-1] > a[top]) {
        ans[top-1] = ans[top]+100;
        if(!vis[top-1])
        q.push(top-1);
        }
        }

        ll tot = 0;
        for(int i=1;i<=n;i++) {
        tot += ans[i];
        }
        cout<<tot<<endl;


        }*/
