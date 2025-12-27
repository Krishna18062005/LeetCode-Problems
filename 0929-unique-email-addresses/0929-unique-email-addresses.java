class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set=new HashSet<>();
	for(String i:emails) {
		String email="";
		int j=0;
		for(;j<i.length();j++) {
			if(i.charAt(j)=='+'||i.charAt(j)=='@') break;
			else if(i.charAt(j)=='.') continue;
			else email+=i.charAt(j);
		}
		while(j<i.length()&&i.charAt(j)!='@') {
			j++;
		}
		boolean f=false;
		while(j<i.length()) {
			email+=i.charAt(j++);
			f=true;
		}
		if(f)
		set.add(email);
	}
    return set.size();
    }
}