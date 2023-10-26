#include<bits/stdc++.h>
using namespace std;
void solve(){
	    stack<int> st;
     	vector<int> ans;
     	vector<int> arr={100, 4, 23, 7, 5, 90, 27};
     	for(int val:arr){
     	    if(st.empty()){
     	        st.push(val);
     	        ans.push_back(-1);
     	    }
     		else if(st.top()>val){
     			ans.push_back(st.top());
     			st.push(val);
     		}else{
     			while(!st.empty() &&st.top()<val){
     				st.pop();
     			}
     			if(st.empty())ans.push_back(-1);
     			else ans.push_back(st.top());
     			st.push(val);
     		}
     	}
     	for(int val:ans){
             cout<<val<<" ";
     	}
     
}
int main(){
    #ifndef ONLINE_JUDGE
       freopen("input1.txt","r",stdin);
       freopen("output1.txt","w",stdout);
    #endif
       int t=1;
       while(t--){
       	solve();
       	cout<<endl;
       }	
 
}
