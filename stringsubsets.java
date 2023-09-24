public class stringsubsets {
    public static void main(String[] args) {
        String s = "abc";
        solve(s, "",0);

    }
    //subset of string
    public static void solve(String s,String curr,int i ){
    if(i==s.length()){
        System.out.println(curr+="");
        return;
    }
    // this is for exclude
    solve(s,curr,i+1);
    // this for include 
    solve(s,curr+s.charAt(i),i+1);
}
}
